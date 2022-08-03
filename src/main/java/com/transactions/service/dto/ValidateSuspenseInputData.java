package com.transactions.service.dto;

import com.transactions.service.request.CreateTempSuspenseCommandData;
import com.transactions.service.transactionEnum.OperatorIdEnum;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@Component
public class ValidateSuspenseInputData {

     public void validateRequiredFields(CreateTempSuspenseCommandData data) throws IllegalArgumentException, DateTimeParseException {
         String suspenseStartDate = data.getSuspenseStartDate();
         String suspenseEndDate = data.getSuspenseEndDate();
         String operatorId = data.getOperatorId();
         String stopReason = data.getSuspenseReason();
         LocalDate endDateFmt;
         LocalDate startDateFmt;
         try {
             endDateFmt = suspenseEndDate.isEmpty() == false ? LocalDate.parse(suspenseEndDate) : null;
         } catch (DateTimeParseException e) {
             throw new IllegalArgumentException("Restart date is in invalid format");
         }

         try {
             startDateFmt = suspenseStartDate.isEmpty() == false ? LocalDate.parse(suspenseStartDate) : null;
         } catch (DateTimeParseException e) {
             throw new IllegalArgumentException("Start date is in invalid format");
         }

         if(startDateFmt == null){
             throw new IllegalArgumentException("Start date is null");
         }

         if(startDateFmt != null && startDateFmt.isBefore(LocalDate.now())){
             throw new IllegalArgumentException("Start date cannot be in the past");
         }
         if(endDateFmt != null && endDateFmt.isBefore(LocalDate.now())){
             throw new IllegalArgumentException("Restart date cannot be in the past");
         }
         if((startDateFmt != null && endDateFmt!=null) && (endDateFmt.isBefore(startDateFmt))){
             throw new IllegalArgumentException("Restart date cannot be less than Start date");
         }

         if(operatorId.isEmpty()){
             throw new IllegalArgumentException("Operator id cannot be null");
        }else{
             if(OperatorIdEnum.getByName(operatorId) == null){
               throw new IllegalArgumentException("Operator id is not valid");
             }
         }
         if(stopReason.isEmpty()){
             throw new IllegalArgumentException("Suspense Reason cannot be null");
         }
     }


}
