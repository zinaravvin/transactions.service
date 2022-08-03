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
@Table(name = "product_change")
@NoArgsConstructor
public class ProductChangeTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;
    private String accountId;
    private LocalDate effectiveDate;
    private String txnType;
    private String appliedUnappliedFlag;
    private String productCode;
    private String promoCode;
    private String operatorId;
    private String createdBy;
    private ZonedDateTime createDate;
    private String oldProduct;
    private String billType;
    private Integer billFrequency;
    private String area;
    private String district;
    private String depot;
    private String route;
    private LocalDate promoExpDate1;
    private LocalDate promoExpDate2;
    private LocalDate promoExpDate3;
    private Double unitCostDaily1;
    private Double unitCostDaily2;
    private Double unitCostDaily3;
    private Double unitCostSunday1;
    private Double unitCostSunday2;
    private Double unitCostSunday3;
    private String pcReason;
    private Integer numberOfCopies;
    private String txnSerialNumber;

}
