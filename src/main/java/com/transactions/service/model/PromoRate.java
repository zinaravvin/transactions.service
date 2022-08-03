package com.transactions.service.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.ZonedDateTime;

@Data
@Component
@Entity
@Table(name = "promo_rate")
@NoArgsConstructor
public class PromoRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;
    private String promoCode;
    private String promoDescription;
    private String rateCard;
    private String productCode;
    private LocalDate promoStartDate;
    private LocalDate promoEndDate;
    private Double dailyRate1;
    private Double sundayRate1;
    private Double cycleCost1;
    private int promoDuration1;
    private Double dailyRate2;
    private Double sundayRate2;
    private Double cycleCost2;
    private int promoDuration2;
    private Double dailyRate3;
    private Double sundayRate3;
    private Double cycleCost3;
    private int promoDuration3;
    private int numberOfTiers;
    private ZonedDateTime createDate;
    private String createdBy;
}
