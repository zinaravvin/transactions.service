package com.transactions.service.dto;

import com.transactions.service.model.ProductChangeTransaction;
import com.transactions.service.model.SuspendTransaction;
import com.transactions.service.repository.ProductChangeRepository;
import com.transactions.service.repository.SuspendTransactionRepository;
import com.transactions.service.response.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FormatResponse {
    @Autowired
    ProductChangeRepository repository;
    static final Logger log = LoggerFactory.getLogger(FormatResponse.class);

    public GetTempSuspenseResponse formatSuspenseResponse(String serialNumber, ResponseMetaImpl responseMeta, String suspendAccountId) {
        GetTempSuspenseResponse response = new GetTempSuspenseResponse();
        CreateTempSuspenseResponseData responseData = new CreateTempSuspenseResponseData();
        ProductChangeTransaction insertedTxn = null;
        try {
            insertedTxn = repository.findByTxnSerialNumber(serialNumber);
        } catch (Exception e) {
            log.error("Error finding transaction in the database");
            e.printStackTrace();
        }
        responseData.accountId(suspendAccountId);
        responseData.setSuspenseStartDate(insertedTxn.getEffectiveDate().toString());

        responseData.setSerialNumber(insertedTxn.getTxnSerialNumber());
        response.setMeta(responseMeta);
        response.setData(responseData);

        return response;
    }


    public GetTempSuspenseResponse formatErrorResponse( String s) {
        GetTempSuspenseResponse response = new GetTempSuspenseResponse();
        ResponseMetaImpl responseMeta = new ResponseMetaImpl();
        responseMeta.setMsg(s);
        responseMeta.setCode(418);
        response.setMeta(responseMeta);
        return response;
    }

    public GetProductChangeResponse formatPcErrorResponse( String s) {
        GetProductChangeResponse response = new GetProductChangeResponse();
        ResponseMetaImpl responseMeta = new ResponseMetaImpl();
        responseMeta.setMsg(s);
        responseMeta.setCode(418);
        response.setMeta(responseMeta);
        return response;
    }
    public GetProductChangeResponse formatProductChangeResponse(GetProductChangeResponse response) {
        CreateProductChangeResponseData responseData = new CreateProductChangeResponseData();
        ResponseMetaImpl responseMeta = new ResponseMetaImpl();
        List<DailySunday> dailySundayList = new ArrayList<>();
        ProductChangeTransaction insertedTxn = null;

        responseData.accountId(response.getData().getAccountId());
        responseData.setProductStartDate(insertedTxn.getEffectiveDate().toString());
        responseData.setSerialNumber(insertedTxn.getTxnSerialNumber());
        responseData.setOldProduct("");
        responseData.setNewProduct("");
        responseData.setDailySundayRates(dailySundayList);
        response.setMeta(responseMeta);
        response.setData(responseData);

        return response;
    }

}
