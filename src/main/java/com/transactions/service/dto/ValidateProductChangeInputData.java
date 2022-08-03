package com.transactions.service.dto;

import com.transactions.service.request.CreateProductChangeCommandData;
import com.transactions.service.request.CreateTempSuspenseCommandData;
import com.transactions.service.transactionEnum.OperatorIdEnum;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@Component
public class ValidateProductChangeInputData {

     public void validateRequiredFields(CreateProductChangeCommandData data) throws IllegalArgumentException, DateTimeParseException {
         String effectiveDate = data.getProductChangeStartDate();
         String operatorId = data.getOperatorId();
         LocalDate startDateFmt;

         try {
             startDateFmt = effectiveDate.isEmpty() == false ? LocalDate.parse(effectiveDate) : null;
         } catch (DateTimeParseException e) {
             throw new IllegalArgumentException("Start date is in invalid format");
         }

         if(startDateFmt == null){
             throw new IllegalArgumentException("Start date is null");
         }

         if(startDateFmt != null && startDateFmt.isBefore(LocalDate.now())){
             throw new IllegalArgumentException("Start date cannot be in the past");
         }
         if(data.getProductCode().isEmpty()){
             throw new IllegalArgumentException("Product code cannot be null");
         }

         if(operatorId.isEmpty()){
             throw new IllegalArgumentException("Operator id cannot be null");
        }else{
             if(OperatorIdEnum.getByName(operatorId) == null){
               throw new IllegalArgumentException("Operator id is not valid");
             }
         }

     }


}
