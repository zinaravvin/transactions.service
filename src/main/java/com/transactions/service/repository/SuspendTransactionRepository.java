package com.transactions.service.repository;

import com.transactions.service.model.SuspendTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface SuspendTransactionRepository  extends JpaRepository<SuspendTransaction, Long> {

    List<SuspendTransaction> findAllByAccountId(String accountId);
    SuspendTransaction findByTxnSerialNumber(String serNumber);
    SuspendTransaction findAllByAccountIdAndRestartDateAfter(String accountId,LocalDate now);
}
