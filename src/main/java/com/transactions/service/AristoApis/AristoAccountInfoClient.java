package com.transactions.service.AristoApis;

import com.transactions.service.dto.AristoAccountInformation;
import com.transactions.service.service.AristoService;
import com.transactions.service.transactionEnum.AristoResponseCodeEnum;
import https.www_hdwebupa_hdwbinfo_response.ProgramInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AristoAccountInfoClient {
    static final Logger log = LoggerFactory.getLogger(AristoService.class);
    @Autowired
    AristoService aristoService;

    public AristoAccountInformation getAristoAcctInfo(String accountId, String operatorId) throws Exception {
        AristoAccountInformation aristoAccountInformation;
        https.www_hdwebupa_hdwbinfo_response.ProgramInterface.InfoRec response = null;
        try {
            response = aristoService.getAcctInfoResponse(accountId, operatorId);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Problem when attempting to get account info from Aristo (HDWBINFO service)", e);
            throw e;
        }

        if (response.getInfoResponseInfo().getInfoResponseCdMsg().getInfoSErrorCode().equals(AristoResponseCodeEnum.SUCCESS.getName())) {

            aristoAccountInformation = populateAristoResponse(response);

        } else {
            log.error(response.getInfoResponseInfo().getInfoResponseCdMsg().getInfoSErrorCode());
            log.error(response.getInfoResponseInfo().getInfoResponseCdMsg().getInfoSErrorMessage());
            throw new RuntimeException(response.getInfoResponseInfo().getInfoResponseCdMsg().getInfoSErrorMessage());
        }
        return aristoAccountInformation;
    }

    private AristoAccountInformation populateAristoResponse(ProgramInterface.InfoRec response) {
        AristoAccountInformation aristoAccountInfo = new AristoAccountInformation();
        AristoAccountInformation.AristoRespCodeMessage aristoRespCodeMessage = aristoAccountInfo.new AristoRespCodeMessage();
        AristoAccountInformation.AristoRespAddressInfo aristoRespAddressInfo = aristoAccountInfo.new AristoRespAddressInfo();
        AristoAccountInformation.AristoRespBillingInfo aristoRespBillingInfo = aristoAccountInfo.new AristoRespBillingInfo();
        AristoAccountInformation.AristoRespProductInfo aristoRespProductInfo = aristoAccountInfo.new AristoRespProductInfo();


        aristoRespAddressInfo.setArea(response.getInfoResponseInfo().getAccountInfo().getSubArea());

        aristoRespAddressInfo.setDistrict(response.getInfoResponseInfo().getAccountInfo().getSubDistrict());
        aristoRespAddressInfo.setDepot(response.getInfoResponseInfo().getAccountInfo().getSubDepot());
        aristoRespAddressInfo.setRegion(response.getInfoResponseInfo().getAccountInfo().getSubRegion());
        aristoRespAddressInfo.setRoute(response.getInfoResponseInfo().getRouteInfo().getRouteMon());
        aristoRespAddressInfo.setCity(response.getInfoResponseInfo().getAddressInfo().getCity());
        aristoRespAddressInfo.setZipCode(response.getInfoResponseInfo().getAddressInfo().getPostalCd());
        aristoRespAddressInfo.setDirSuffix(response.getInfoResponseInfo().getAddressInfo().getDirSuffix());
        aristoRespAddressInfo.setPreffix(response.getInfoResponseInfo().getAddressInfo().getPrefix());
        aristoRespAddressInfo.setSuffix(response.getInfoResponseInfo().getAddressInfo().getSuffix());
        aristoRespAddressInfo.setState(response.getInfoResponseInfo().getAddressInfo().getState());
        aristoRespAddressInfo.setStreetName(response.getInfoResponseInfo().getAddressInfo().getStreet());
        aristoRespAddressInfo.setBuildingNumber(response.getInfoResponseInfo().getAddressInfo().getStreetNo());

        aristoAccountInfo.setStopLeadTime(response.getInfoResponseInfo().getAdditionalDeliveryInfo().getStopLeadDays());
        aristoAccountInfo.setRestartLeadTime(response.getInfoResponseInfo().getAdditionalDeliveryInfo().getRestartLeadDays());
        aristoAccountInfo.setStartLeadTime(response.getInfoResponseInfo().getAdditionalDeliveryInfo().getStartLeadDays());

        aristoRespBillingInfo.setBiilType(response.getInfoResponseInfo().getAccountInfo().getBillType());
        aristoRespBillingInfo.setCurrBalance(response.getInfoResponseInfo().getAccountInfo().getCurrBalance());
        aristoRespBillingInfo.setLastPaymentDate(response.getInfoResponseInfo().getAccountInfo().getLastPmtDate());
        aristoRespBillingInfo.setBillFrequency(response.getInfoResponseInfo().getAccountInfo().getBillFreq());

        aristoRespProductInfo.setNumOfCopies(response.getInfoResponseInfo().getProductInfo().getNbrCopies());
        aristoRespProductInfo.setProductCode(response.getInfoResponseInfo().getProductInfo().getProdCode());
        aristoRespProductInfo.setCampaignCode(response.getInfoResponseInfo().getProductInfo().getProdCampaignCodeP());
        aristoRespProductInfo.setMediaCode(response.getInfoResponseInfo().getProductInfo().getMediaCode());
        aristoRespProductInfo.setPromoCode(response.getInfoResponseInfo().getProductInfo().getPromoCode());
        aristoRespProductInfo.setPromoCard(response.getInfoResponseInfo().getProductInfo().getPromoRateInd());
        aristoRespProductInfo.setProductCode(response.getInfoResponseInfo().getProductInfo().getProdCode());
        aristoRespProductInfo.setPromoExpDate(response.getInfoResponseInfo().getProductInfo().getPromoExpDt());
        aristoRespProductInfo.setNumOfCopies(response.getInfoResponseInfo().getProductInfo().getNbrCopies());
        aristoRespProductInfo.setDeliveryType(response.getInfoResponseInfo().getProductInfo().getDeliveryType());

        aristoAccountInfo.setAddressInfo(aristoRespAddressInfo);
        aristoAccountInfo.setBillingInfo(aristoRespBillingInfo);
        aristoAccountInfo.setCodeMessage(aristoRespCodeMessage);
        aristoAccountInfo.setProductInfo(aristoRespProductInfo);
        return aristoAccountInfo;
    }
}

