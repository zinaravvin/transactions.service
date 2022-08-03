package com.transactions.service.AristoApis;

import com.transactions.service.dto.AristoAccountInformation;
import com.transactions.service.service.AristoService;
import com.transactions.service.transactionEnum.AristoResponseCodeEnum;
import https.www_hdwebupa_hdwbrout_response.ProgramInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class AristoRouteClient {
    static final Logger log = LoggerFactory.getLogger(AristoService.class);
    @Autowired
    AristoService aristoService;

    public String getAristoRouteInfo(AristoAccountInformation aristoAccountInformation, String operatorId) throws Exception {

        ProgramInterface.RoutRec response;
        String availableProducts;
        try {
            response = aristoService.getRouteResponse(aristoAccountInformation, operatorId);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Problem when attempting to get account info from Aristo (HDWBINFO service)", e);
            throw e;
        }

        if (response.getRoutSResponseInfo().getRoutSErrorCode().equals(AristoResponseCodeEnum.SUCCESS.getName())) {

             availableProducts = response.getRoutSResponseInfo().getRoutSProductsAvailable();

        } else {
            log.error(response.getRoutSResponseInfo().getRoutSErrorCode());
            log.error(response.getRoutSResponseInfo().getRoutSErrorMessage());
            throw new RuntimeException(response.getRoutSResponseInfo().getRoutSErrorMessage());
        }
        return availableProducts;
    }

}

