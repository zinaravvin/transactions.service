package com.transactions.service.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AristoAccountInformation {

    String stopLeadTime;
    String restartLeadTime;
    String startLeadTime;

    AristoRespCodeMessage codeMessage;
    AristoRespAddressInfo addressInfo;
    AristoRespBillingInfo billingInfo;
    AristoRespProductInfo productInfo;

    public AristoAccountInformation data(AristoRespCodeMessage codeMessage,AristoRespAddressInfo addressInfo,
                                         AristoRespBillingInfo billingInfo,AristoRespProductInfo productInfo) {
        this.codeMessage = codeMessage;
        this.addressInfo = addressInfo;
        this.billingInfo = billingInfo;
        this.productInfo = productInfo;
        return this;
    }
    @Data
  public class AristoRespCodeMessage {
        String Code;
        String message;
    }
    @Data
    public class AristoRespAddressInfo{
        String buildingNumber;
        String streetName;
        String suffix;
        String dirSuffix;
        String preffix;
        String state;
        String city;
        String area;
        String district;
        String depot;
        String route;
        String region;
        String zipCode;

    }
    @Data
    public class AristoRespBillingInfo{
        String currBalance;
        String lastPaymentDate;
        String billFrequency;
        String biilType;
    }

    @Data
    public class AristoRespProductInfo{
        String productCode;
        String promoCard;
        String numOfCopies;
        String promoCode;
        String promoExpDate;
        String mediaCode;
        String campaignCode;
        String deliveryType;
    }
}
