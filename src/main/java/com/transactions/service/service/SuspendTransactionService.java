package com.transactions.service.service;

import com.sun.xml.ws.client.ClientTransportException;
import com.transactions.service.AristoApis.AristoAccountInfoClient;
import com.transactions.service.dto.AristoAccountInformation;
import com.transactions.service.dto.CreateSuspenseTransaction;
import com.transactions.service.dto.FormatResponse;
import com.transactions.service.dto.ValidateSuspenseInputData;
import com.transactions.service.model.SuspendTransaction;
import com.transactions.service.request.CreateTempSusupenseCommand;
import com.transactions.service.response.CreateTempSuspenseResponseData;
import com.transactions.service.response.GetTempSuspenseResponse;
import com.transactions.service.response.ResponseMetaImpl;
import com.transactions.service.transactionEnum.SuspenseErrorsEnum;
import com.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class SuspendTransactionService {
    static final Logger log = LoggerFactory.getLogger(SuspendTransactionService.class);
    private AristoAccountInformation aristoLeadTime;
    private final CreateSuspenseTransaction createSuspenseTransaction;
    private final ResponseMetaImpl responseMeta;
    private GetTempSuspenseResponse response;
    private CreateTempSuspenseResponseData responseData;
    private final ValidateSuspenseInputData validateInputData;
    private final FormatResponse formatSuspenseResponse;
    private AristoAccountInfoClient aristoAccountInfoClient;

    SuspendTransactionService(ResponseMetaImpl responseMeta,
                              GetTempSuspenseResponse response, ValidateSuspenseInputData validateInputData,
                              AristoAccountInformation aristoLeadTime,
                              CreateSuspenseTransaction createSuspenseTransaction,
                              FormatResponse formatSuspenseResponse,
                              AristoAccountInfoClient aristoAccountInfoClient,
                              CreateTempSuspenseResponseData responseData) {
        this.responseMeta = responseMeta;
        this.response = response;
        this.validateInputData = validateInputData;
        this.aristoLeadTime = aristoLeadTime;
        this.createSuspenseTransaction = createSuspenseTransaction;
        this.formatSuspenseResponse = formatSuspenseResponse;
        this.aristoAccountInfoClient = aristoAccountInfoClient;
        this.responseData = responseData;
    }

    public GetTempSuspenseResponse processSuspendData(CreateTempSusupenseCommand input, String accountId) {

        try {
            validateInputData.validateRequiredFields(input.getData());
            aristoLeadTime = aristoAccountInfoClient.getAristoAcctInfo(accountId, input.getData().getOperatorId());
            createSuspenseTxn(accountId,input);

        } catch (IllegalArgumentException e) {
            response = formatSuspenseResponse.formatErrorResponse(e.getMessage());
            e.printStackTrace();
        } catch (DateTimeException e) {
           response = formatSuspenseResponse.formatErrorResponse(e.getMessage());
            e.printStackTrace();

        } catch (ClientTransportException e) {
            response = formatSuspenseResponse.formatErrorResponse(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }

    private void createSuspenseTxn(String accountId, CreateTempSusupenseCommand data) throws SQLException {

        String operatorId = data.getData().getOperatorId();
        String userAgent = data.getMeta().getUserAgent();

        LocalDate endDateFmt = !data.getData().getSuspenseEndDate().isEmpty() ? LocalDate.parse(data.getData().getSuspenseEndDate()) : null;
        LocalDate startDateFmt = LocalDate.parse(data.getData().getSuspenseStartDate());
        LocalDate adjustedEffectiveDate = DateUtils.adjustStartEndDates(startDateFmt, aristoLeadTime.getStopLeadTime());
        LocalDate adjustedEndDate = DateUtils.adjustStartEndDates(endDateFmt, aristoLeadTime.getRestartLeadTime());

        List<SuspendTransaction> allTempStops = createSuspenseTransaction.getAllTempStops(accountId);
        if (DateUtils.datesOverlap(adjustedEffectiveDate, adjustedEndDate, allTempStops)) {
            throw new DateTimeException(SuspenseErrorsEnum.ARISTO_DATES_OVERLAP.getName());
        }

        responseData.setAccountId(accountId);
        responseData.setSuspenseReason(data.getData().getSuspenseReason());
        responseData.setSuspenseEndDate(adjustedEndDate.toString());
        responseData.setSuspenseStartDate(adjustedEffectiveDate.toString());
        responseData.setDonationFlag(data.getData().getDonationFlag());
        responseData.setSerialNumber(UUID.randomUUID().toString());
        response.setData(responseData);

        try {
            createSuspenseTransaction.insertSuspenseTransaction(response,operatorId,userAgent);
            formatSuccessfulResponse();
        } catch (Exception e) {
            throw new SQLException("Transaction failed to insert");
        }
    }

    private void formatSuccessfulResponse() {
        ResponseMetaImpl responseMeta = new ResponseMetaImpl();
        responseMeta.setMsg(SuspenseErrorsEnum.ARISTO_SUSCESS.getName());
        responseMeta.setCode(200);
        response.setMeta(responseMeta);
    }

}
