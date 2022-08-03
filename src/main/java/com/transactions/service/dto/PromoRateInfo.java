package com.transactions.service.dto;

import com.transactions.service.model.PromoRate;
import com.transactions.service.repository.PromoRateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class PromoRateInfo {
    @Autowired
    PromoRateRepository repository;
    @Autowired
    PromoRate promoRate;

    static final Logger log = LoggerFactory.getLogger(PromoRateInfo.class);

    public PromoRate getPromoRateInfo(String promoCode,String productCode, String rateCard) throws SQLException {

        try {
            promoRate = repository.findPromoRateByPromoCodeAndProductCodeAndRateCard(promoCode,productCode,rateCard);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("Problem extracting Promo code");
        }
        return promoRate;

    }
}
