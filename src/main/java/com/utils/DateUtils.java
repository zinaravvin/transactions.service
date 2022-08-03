package com.utils;

import com.transactions.service.model.ProductChangeTransaction;
import com.transactions.service.model.SuspendTransaction;
import com.transactions.service.repository.SuspendTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class DateUtils {
    @Autowired
    SuspendTransactionRepository repository;


    public static boolean datesOverlap(LocalDate adjustedEffectiveDate, LocalDate adjustedEndDate,
                                       List<SuspendTransaction> allTempStops) {
        AtomicBoolean atomicOverlap = new AtomicBoolean(false);
        boolean overlap = false;
        allTempStops.stream().forEach(txn -> {
            if (adjustedEffectiveDate.isBefore(txn.getRestartDate()) && adjustedEndDate.isAfter(txn.getEffectiveDate())) {
                atomicOverlap.set(true);
            }
        });
        if (atomicOverlap.get() == true) {
            overlap = true;
        }else{
            if(adjustedEffectiveDate.isAfter(adjustedEndDate) || adjustedEndDate.equals(adjustedEffectiveDate)){
                throw new DateTimeException("Restart date should be greater than Effective date");
            }
        }
        return overlap;
    }

    public static boolean futureDatedPCs(LocalDate adjustedEffectiveDate,
                                       List<ProductChangeTransaction> allTempStops) {
        AtomicBoolean atomicFuturePc = new AtomicBoolean(false);
        boolean futurePc = false;
        allTempStops.stream().forEach(txn -> {
            if (adjustedEffectiveDate.isBefore(txn.getEffectiveDate()) || adjustedEffectiveDate.equals(txn.getEffectiveDate())) {
                atomicFuturePc.set(true);
            }
        });
        if (atomicFuturePc.get() == true) {
            futurePc = true;
        }else{
            if(adjustedEffectiveDate.isBefore(LocalDate.now()) || adjustedEffectiveDate.equals(LocalDate.now())){
                throw new DateTimeException("Effective date shoud bew greater than today");
            }
        }
        return futurePc;
    }

    public static LocalDate adjustStartEndDates(LocalDate date, String leadDays) {
        LocalDate adjustedDate = date.plusDays(Integer.valueOf(leadDays));
        LocalDate currDatePlusLeadTime = LocalDate.now().plusDays(Integer.valueOf(leadDays));
        if (!(date == null) && (date.isBefore(currDatePlusLeadTime))) {
            date = adjustedDate;
        }

        /* 0. get account iformation
           1. check table08 -  based on Product Code get Prouct Id wich is always NYT
        *  2. Based on Area code and Prod Id id not found
        *  3. Based on Area if not found
        *  4. Based on just SP or ST -defualt
        HDDTEY2K
        * */
        return date;
    }
}
