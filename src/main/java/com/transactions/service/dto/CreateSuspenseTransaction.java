package com.transactions.service.dto;

import com.transactions.service.model.SuspendTransaction;
import com.transactions.service.repository.SuspendTransactionRepository;
import com.transactions.service.request.CreateTempSuspenseCommandData;
import com.transactions.service.response.GetTempSuspenseResponse;
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
public class CreateSuspenseTransaction {
    @Autowired
    SuspendTransaction transaction;
    @Autowired
    SuspendTransactionRepository repository;
    static final Logger log = LoggerFactory.getLogger(CreateSuspenseTransaction.class);


    public void insertSuspenseTransaction(GetTempSuspenseResponse response,String operatorId,String userAgent) {
        String serialNumber = UUID.randomUUID().toString();
        transaction.setAccountId(response.getData().getAccountId());
        transaction.setEffectiveDate(LocalDate.parse(response.getData().getSuspenseStartDate()));
        transaction.setRestartDate(LocalDate.parse(response.getData().getSuspenseEndDate()));
        transaction.setOperatorId(operatorId);
        transaction.setTxnType(TransactionTypeEnum.TEMP_STOP.getName());
        transaction.setAppliedUnappliedFlag(TransactionStatusEnum.UNAPPLIED.getName());
        transaction.setCreatedBy(userAgent);
        transaction.setCreateDate(ZonedDateTime.now());
        transaction.setTxnSerialNumber(serialNumber);
        transaction.setVacationDonation(response.getData().getDonationFlag());
        transaction.setVacationReason(response.getData().getSuspenseReason());

        try {
            repository.save(transaction);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("Successful insert");

    }

    public List<SuspendTransaction> getAllTempStops(String accountId){

        List<SuspendTransaction> allTempStops = repository.findAllByAccountId(accountId);
        return allTempStops;

    }
}
