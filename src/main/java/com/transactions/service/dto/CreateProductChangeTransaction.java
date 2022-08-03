package com.transactions.service.dto;

import com.transactions.service.model.ProductChangeTransaction;
import com.transactions.service.model.SuspendTransaction;
import com.transactions.service.repository.ProductChangeRepository;
import com.transactions.service.repository.SuspendTransactionRepository;
import com.transactions.service.request.CreateProductChangeCommand;
import com.transactions.service.request.CreateProductChangeCommandData;
import com.transactions.service.request.CreateTempSuspenseCommandData;
import com.transactions.service.response.CreateProductChangeResponseData;
import com.transactions.service.response.CreateTempSuspenseResponseData;
import com.transactions.service.response.GetProductChangeResponse;
import com.transactions.service.transactionEnum.TransactionStatusEnum;
import com.transactions.service.transactionEnum.TransactionTypeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Component
public class CreateProductChangeTransaction {
    public static final String ENDLESS_PROMO = "2069-12-31";
    @Autowired
    ProductChangeTransaction transaction;
    @Autowired
    ProductChangeRepository repository;
    static final Logger log = LoggerFactory.getLogger(CreateProductChangeTransaction.class);


    public void insertProductChangeTransaction(GetProductChangeResponse response,AristoAccountInformation aristoAccountInformation, String userAgent
                                                    ) {
        Double dailyRate1 = Double.parseDouble(response.getData().getDailySundayRates().get(0).getDailyRate());
        Double dailyRate2 = Double.parseDouble(response.getData().getDailySundayRates().get(1).getDailyRate());
        Double dailyRate3 = Double.parseDouble(response.getData().getDailySundayRates().get(2).getDailyRate());

        Double sundayRate1 = Double.parseDouble(response.getData().getDailySundayRates().get(0).getSundayRate());
        Double sundayRate2 = Double.parseDouble(response.getData().getDailySundayRates().get(1).getSundayRate());
        Double sundayRate3 = Double.parseDouble(response.getData().getDailySundayRates().get(2).getSundayRate());

        String promoDuration1 = response.getData().getDailySundayRates().get(0).getPromoDuration();
        String promoDuration2 = response.getData().getDailySundayRates().get(1).getPromoDuration();
        String promoDuration3 = response.getData().getDailySundayRates().get(2).getPromoDuration();

        transaction.setPromoExpDate1(promoDuration1 == "999" ? LocalDate.parse(ENDLESS_PROMO): calculateExpDate(LocalDate.parse(response.getData().getProductStartDate()),promoDuration1));
        if (promoDuration2 != "0") {
            transaction.setPromoExpDate2(promoDuration2 == "999" ? LocalDate.parse(ENDLESS_PROMO) : calculateExpDate(transaction.getPromoExpDate1(), promoDuration2));
        }else{
            transaction.setPromoExpDate2(null);
        }
        if (promoDuration2 != "0") {
            transaction.setPromoExpDate2(promoDuration3 == "999" ? LocalDate.parse(ENDLESS_PROMO) : calculateExpDate(transaction.getPromoExpDate2(), promoDuration3));
        }else{
            transaction.setPromoExpDate3(null);
        }
        transaction.setAccountId(response.getData().getAccountId());
        transaction.setOldProduct(response.getData().getOldProduct());
        transaction.setProductCode(response.getData().getNewProduct());
        transaction.setPromoCode(response.getData().getPromoCode());
        transaction.setEffectiveDate(LocalDate.parse(response.getData().getProductStartDate()));
        transaction.setTxnType(TransactionTypeEnum.PRODUCT_CHANGE.getName());
        transaction.setAppliedUnappliedFlag(TransactionStatusEnum.UNAPPLIED.getName());
        transaction.setCreatedBy(userAgent);
        transaction.setCreateDate(ZonedDateTime.now());
        transaction.setTxnSerialNumber(response.getData().getSerialNumber());
        transaction.setBillFrequency(Integer.valueOf(response.getData().getBillingFrequency()));
        transaction.setNumberOfCopies(Integer.valueOf(response.getData().getNumberOfCopies()));
        transaction.setBillFrequency(Integer.valueOf(response.getData().getBillingFrequency()));
        transaction.setUnitCostDaily1(dailyRate1);
        transaction.setUnitCostDaily2(dailyRate2);
        transaction.setUnitCostDaily3(dailyRate3);
        transaction.setUnitCostSunday1(sundayRate1);
        transaction.setUnitCostSunday2(sundayRate2);
        transaction.setUnitCostSunday3(sundayRate3);
        transaction.setArea(aristoAccountInformation.getAddressInfo().getArea());
        transaction.setDepot(aristoAccountInformation.getAddressInfo().getDepot());
        transaction.setRoute(aristoAccountInformation.getAddressInfo().getRoute());
        transaction.setDistrict(aristoAccountInformation.getAddressInfo().getDistrict());


        repository.save(transaction);
        log.info("Successful insert");

    }

    private LocalDate calculateExpDate(LocalDate productStartDate, String promoDuration) {

           return productStartDate.plusDays(Integer.valueOf(promoDuration));
    }

    public List<ProductChangeTransaction> getAllProductChange(String accountId){

        List<ProductChangeTransaction> productChangeList = repository.findAllByAccountId(accountId);
        return productChangeList;

    }
}
