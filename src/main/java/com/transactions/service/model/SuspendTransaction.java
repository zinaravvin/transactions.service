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
@Table(name = "suspend_transactions")
@NoArgsConstructor
public class SuspendTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;
    private String accountId;
    private LocalDate effectiveDate;
    private LocalDate restartDate;
    private String txnType;
    private String appliedUnappliedFlag;
    private String operatorId;
    private String createdBy;
    private ZonedDateTime createDate;
    private String txnSerialNumber;
    private Boolean vacationDonation;
    private String vacationReason;

}
