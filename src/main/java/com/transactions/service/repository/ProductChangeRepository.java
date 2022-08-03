package com.transactions.service.repository;

import com.transactions.service.model.ProductChangeTransaction;
import com.transactions.service.model.SuspendTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductChangeRepository extends JpaRepository<ProductChangeTransaction, Long> {

    List<ProductChangeTransaction> findAllByAccountId(String accountId);
    ProductChangeTransaction findByTxnSerialNumber(String serNumber);

}
