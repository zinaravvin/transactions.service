package com.transactions.service.service;

import com.sun.xml.ws.client.ClientTransportException;
import com.transactions.service.AristoApis.AristoAccountInfoClient;
import com.transactions.service.AristoApis.AristoRouteClient;
import com.transactions.service.dto.*;
import com.transactions.service.model.ProductChangeTransaction;
import com.transactions.service.model.PromoRate;
import com.transactions.service.request.*;
import com.transactions.service.response.CreateProductChangeResponseData;
import com.transactions.service.response.DailySunday;
import com.transactions.service.response.GetProductChangeResponse;
import com.transactions.service.response.ResponseMetaImpl;
import com.transactions.service.transactionEnum.SuspenseErrorsEnum;
import com.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductChangeService {
    static final Logger log = LoggerFactory.getLogger(ProductChangeService.class);

    private AristoAccountInformation aristoAccountInformation;
    private GetProductChangeResponse response;
    private ValidateProductChangeInputData validateInputData;
    private AristoAccountInfoClient aristoAccountInfoClient;
    private AristoRouteClient aristoRouteClient;
    private PromoRateInfo promoRateInfo;
    private CreateProductChangeTransaction createProductChangeTransaction;
    private FormatResponse pcResponse;

    ProductChangeService(
                         GetProductChangeResponse response, ValidateProductChangeInputData validateInputData,
                         AristoAccountInformation aristoLeadTime,
                         AristoAccountInfoClient aristoAccountInfoClient,
                         CreateProductChangeTransaction createProductChangeTransaction,
                         FormatResponse pcResponse,
                         PromoRateInfo promoRateInfo,
                         AristoRouteClient aristoRouteClient) {
        this.response = response;
        this.validateInputData = validateInputData;
        this.aristoAccountInformation = aristoLeadTime;
        this.aristoAccountInfoClient = aristoAccountInfoClient;
        this.createProductChangeTransaction = createProductChangeTransaction;
        this.pcResponse = pcResponse;
        this.promoRateInfo = promoRateInfo;
        this.aristoRouteClient = aristoRouteClient;
    }

    public GetProductChangeResponse processProductChangeData(CreateProductChangeCommand input, String accountId) throws Exception {

        String operatorId = input.getData().getOperatorId();
        String userAgent = input.getMeta().getUserAgent();
        String availableProducts;

        try {
            validateInputData.validateRequiredFields(input.getData());
            aristoAccountInformation = aristoAccountInfoClient.getAristoAcctInfo(accountId, operatorId);
            availableProducts = aristoRouteClient.getAristoRouteInfo(aristoAccountInformation,operatorId);
            createProductChangeTxn(accountId, userAgent, input.getData(),aristoAccountInformation,availableProducts);

        } catch (IllegalArgumentException e) {
            response = pcResponse.formatPcErrorResponse(e.getMessage());
            e.printStackTrace();
        } catch (DateTimeException e) {
            response = pcResponse.formatPcErrorResponse(e.getMessage());
            e.printStackTrace();

        } catch (Exception e) {
            response = pcResponse.formatPcErrorResponse(e.getMessage());
            e.printStackTrace();
        }


        return response;
 }

    private void createProductChangeTxn(String accountId, String userAgent, CreateProductChangeCommandData data, AristoAccountInformation aristoAccountInformation,String availablePProducts)
            throws Exception {

        if(!(isProductAvailable(availablePProducts,data.getProductCode()))){
            throw new Exception("Product is not available");
        }

        CreateProductChangeResponseData responseData = new CreateProductChangeResponseData();
        List<DailySunday> dailySundayList = new ArrayList<>();

        PromoRate promoRate ;
        LocalDate startDateFmt = LocalDate.parse(data.getProductChangeStartDate());
        LocalDate adjustedEffectiveDate = DateUtils.adjustStartEndDates(startDateFmt, this.aristoAccountInformation.getStopLeadTime());

        List<ProductChangeTransaction> allProductChange = createProductChangeTransaction.getAllProductChange(accountId);
        if (DateUtils.futureDatedPCs(adjustedEffectiveDate, allProductChange)) {
            throw new DateTimeException(SuspenseErrorsEnum.ARISTO_FUTURE_PC.getName());
        }
        try {
           promoRate = validatePromoCode(data.getProductCode(),data.getPromoCode());
            if(promoRate == null){
                throw new UnexpectedInputException("Promo Code is not found") ;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException(e.getMessage());
        }
        DailySunday dailySunday1 = new DailySunday();
        dailySunday1.setDailyRate(promoRate.getDailyRate1().toString());
        dailySunday1.setSundayRate(promoRate.getSundayRate1().toString());
        dailySunday1.setCycleCost(promoRate.getCycleCost1().toString());
        dailySunday1.setPromoDuration(Integer.toString(promoRate.getPromoDuration1()));
        dailySundayList.add(dailySunday1);
        DailySunday dailySunday2 = new DailySunday();
        dailySunday2.setDailyRate(promoRate.getDailyRate2().toString());
        dailySunday2.setSundayRate(promoRate.getSundayRate2().toString());
        dailySunday2.setCycleCost(promoRate.getCycleCost2().toString());
        dailySunday2.setPromoDuration(Integer.toString(promoRate.getPromoDuration2()));
        dailySundayList.add(dailySunday2);
        DailySunday dailySunday3 = new DailySunday();
        dailySunday3.setDailyRate(promoRate.getDailyRate3().toString());
        dailySunday3.setSundayRate(promoRate.getSundayRate3().toString());
        dailySunday3.setCycleCost(promoRate.getCycleCost3().toString());
        dailySunday3.setPromoDuration(Integer.toString(promoRate.getPromoDuration3()));
        dailySundayList.add(dailySunday3);
        responseData.setNewProduct(data.getProductCode());
        responseData.setOldProduct(aristoAccountInformation.getProductInfo().getProductCode());
        responseData.accountId(accountId);
        responseData.setPromoCode(data.getPromoCode());
        responseData.setProductStartDate(adjustedEffectiveDate.toString());
        responseData.setSerialNumber(UUID.randomUUID().toString());
        responseData.setNewProduct(data.getProductCode());
        responseData.setDailySundayRates(dailySundayList);
        responseData.setOldProduct(aristoAccountInformation.getProductInfo().getProductCode());
        responseData.setNumberOfCopies(aristoAccountInformation.getProductInfo().getNumOfCopies());
        responseData.setBillingFrequency(data.getBillFrequency().isEmpty() ? aristoAccountInformation.getBillingInfo().getBillFrequency() : data.getBillFrequency());
        responseData.setNumberOfCopies(data.getNumberOfCopies().isEmpty() ? aristoAccountInformation.getProductInfo().getNumOfCopies() : data.getNumberOfCopies());

        response.setData(responseData);

        try {
            createProductChangeTransaction.insertProductChangeTransaction(response, aristoAccountInformation,userAgent);
            formatSuccessfulResponse();

        } catch (Exception e) {
            throw new SQLException("Transaction failed to insert");
        }
    }

    private boolean isProductAvailable(String availablePProducts, String productCode) {
        return availablePProducts.contains(productCode);

    }

    private PromoRate validatePromoCode(String productCode, String promoCode) throws SQLException {
        PromoRate promoRate;
        try {
           promoRate =  promoRateInfo.getPromoRateInfo(promoCode,productCode,"1");
        } catch (Exception e) {
            log.info(e.getMessage());
            throw new SQLException(e.getMessage());
        }

        return promoRate;
    }

    private void formatSuccessfulResponse() {
        ResponseMetaImpl responseMeta = new ResponseMetaImpl();
        responseMeta.setMsg(SuspenseErrorsEnum.ARISTO_SUSCESS.getName());
        responseMeta.setCode(200);

    }
    }


