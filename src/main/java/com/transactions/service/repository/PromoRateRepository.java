package com.transactions.service.repository;

import com.transactions.service.model.ProductChangeTransaction;
import com.transactions.service.model.PromoRate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PromoRateRepository extends JpaRepository<PromoRate, Long> {

    PromoRate findPromoRateByPromoCodeAndProductCodeAndRateCard(String accountId,String productCode,String rateCard);


}
