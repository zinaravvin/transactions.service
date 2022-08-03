package com.transactions.service.service;

import com.transactions.service.dto.AristoAccountInformation;
import com.transactions.service.transactionEnum.AristoEndpointsEnum;

//import javax.annotation.Resources;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import com.google.common.io.Resources;
import https.www_hdwebupa_hdwbrout_response.ProgramInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:/application.properties")
public class AristoService {

    @Value("${aristo.stg.url}")
    private String aristoBaseurl;
    @Value("${aristo.stg.user}")
    private String userName;
    @Value("${aristo.stg.password}")
    private String password;

    static final Logger log = LoggerFactory.getLogger(AristoService.class);
    private com.hdwbinfo.hdwebupa.HDWEBUPAPort hdwebupaInfoPort = null;
    private com.hdwbrout.hdwebupa.HDWEBUPAPort hdwebupaRoutePort = null;

    public com.hdwbinfo.hdwebupa.HDWEBUPAPort initializeAristoAcctInfoService(AristoEndpointsEnum webService) {
        com.hdwbinfo.hdwebupa.HDWEBUPAPort returnValue;
        URL url;
        BindingProvider bp;
        HashMap<String, List<String>> headers = new HashMap<>();

        log.info("Initializing AccountInfo wsdl");
        com.hdwbinfo.hdwebupa.HDWEBUPAService hdwebupaInfoService = null;

        url = Resources.getResource("wsdl/" + webService + ".xml");
        log.info("AccountInfo wsdl url" + url);
        hdwebupaInfoService = new com.hdwbinfo.hdwebupa.HDWEBUPAService(url, new QName("http://www.HDWEBUPA." + AristoEndpointsEnum.ACCOUNT_INFO + ".com", "HDWEBUPAService"));
        log.info("AccountInfo created service for endpoint " + webService );
        returnValue = hdwebupaInfoService.getHDWEBUPAPort();
        log.info("AccountInfo created get port " + webService );

        bp = (BindingProvider) returnValue;
        setEndpointAddressProperty(webService, bp);

        setAuthorizationHeaders(bp, headers);
        log.info("AccountInfo returnValue " + webService + returnValue);

        return returnValue;
    }
    public com.hdwbrout.hdwebupa.HDWEBUPAPort initializeAristoRouteService(AristoEndpointsEnum webService) {
        com.hdwbrout.hdwebupa.HDWEBUPAPort returnValue;
        URL url;
        BindingProvider bp;
        HashMap<String, List<String>> headers = new HashMap<>();

        log.info("Initializing AccountInfo wsdl");
        com.hdwbrout.hdwebupa.HDWEBUPAService hdwebupaRouteService = null;

        url = Resources.getResource("wsdl/" + webService + ".xml");
        log.info("AccountInfo wsdl url" + url);
        hdwebupaRouteService = new com.hdwbrout.hdwebupa.HDWEBUPAService(url, new QName("http://www.HDWEBUPA." + webService + ".com", "HDWEBUPAService"));
        log.info("AccountInfo created service for endpoint " + webService );
        returnValue = hdwebupaRouteService.getHDWEBUPAPort();
        log.info("AccountInfo created get port " + webService );

        bp = (BindingProvider) returnValue;
        setEndpointAddressProperty(webService, bp);

        setAuthorizationHeaders(bp, headers);
        log.info("AccountInfo returnValue " + webService + returnValue);

        return returnValue;
    }
    private void setEndpointAddressProperty(AristoEndpointsEnum endpoint, BindingProvider bp) {
        String remoteUrl;
        remoteUrl = aristoBaseurl + "/" + endpoint;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, remoteUrl);
    }

    private void setAuthorizationHeaders(BindingProvider bp, HashMap<String, List<String>> headers) {
        bp.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);
        bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, userName);
        bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);
    }
    public https.www_hdwebupa_hdwbinfo_response.ProgramInterface.InfoRec getAcctInfoResponse(String accountNumber, String operId) throws Exception {
        hdwebupaInfoPort = initializeAristoAcctInfoService(AristoEndpointsEnum.ACCOUNT_INFO);
        https.www_hdwebupa_hdwbinfo_request.ProgramInterface.InfoRec.InfoRequestInfo wsdlReq = new https.www_hdwebupa_hdwbinfo_request.ProgramInterface.InfoRec.InfoRequestInfo();
        https.www_hdwebupa_hdwbinfo_request.ProgramInterface.InfoRec.InfoHIdentification acctInfoHeaderReq = new https.www_hdwebupa_hdwbinfo_request.ProgramInterface.InfoRec.InfoHIdentification();
        https.www_hdwebupa_hdwbinfo_request.ProgramInterface.InfoRec infoRec = new https.www_hdwebupa_hdwbinfo_request.ProgramInterface.InfoRec();

        acctInfoHeaderReq.setInfoHOperatorId(operId);
        wsdlReq.setInfoQAccountNumber(accountNumber);
        wsdlReq.setInfoQAccountPhone("");

        infoRec.setInfoRequestInfo(wsdlReq);
        infoRec.setInfoHIdentification(acctInfoHeaderReq);

        https.www_hdwebupa_hdwbinfo_response.ProgramInterface.InfoRec response = null;

        try {
            response=hdwebupaInfoPort.hdwebupaOperation(infoRec);
        } catch (Exception e) {
            log.error("Problem when attempting to get account info from Aristo (HDWBINFO service)", e);
            throw e;
        }

        return response;
    }
    public ProgramInterface.RoutRec getRouteResponse(AristoAccountInformation accountAddr, String operId) throws Exception {
        hdwebupaRoutePort = initializeAristoRouteService(AristoEndpointsEnum.ROUTE_INFO);

        https.www_hdwebupa_hdwbrout_request.ProgramInterface.RoutRec.RoutQRequestInfo wsdlReq = new https.www_hdwebupa_hdwbrout_request.ProgramInterface.RoutRec.RoutQRequestInfo();
        https.www_hdwebupa_hdwbrout_request.ProgramInterface.RoutRec.RoutRequestIdentification routeHeaderReq = new https.www_hdwebupa_hdwbrout_request.ProgramInterface.RoutRec.RoutRequestIdentification();
        https.www_hdwebupa_hdwbrout_request.ProgramInterface.RoutRec routeRec = new https.www_hdwebupa_hdwbrout_request.ProgramInterface.RoutRec();
        AristoAccountInformation.AristoRespAddressInfo addressInfo = accountAddr.getAddressInfo();
        AristoAccountInformation.AristoRespProductInfo productInfo = accountAddr.getProductInfo();

        routeHeaderReq.setRoutHOperatorId(operId);
        wsdlReq.setRoutQStreetNo(addressInfo.getBuildingNumber());
        wsdlReq.setRoutQStreet(addressInfo.getStreetName());
        wsdlReq.setRoutQSt(addressInfo.getState());
        wsdlReq.setRoutQCity(addressInfo.getCity());
        wsdlReq.setRoutQDirSfx(addressInfo.getDirSuffix());
        wsdlReq.setRoutQPfx(addressInfo.getPreffix());
        wsdlReq.setRoutQSfx(addressInfo.getSuffix());
        wsdlReq.setRoutQZip(addressInfo.getZipCode());
        wsdlReq.setRoutQDeliveryType(productInfo.getDeliveryType());
        wsdlReq.setRoutQProdCode(productInfo.getProductCode());

        routeRec.setRoutQRequestInfo(wsdlReq);
        routeRec.setRoutRequestIdentification(routeHeaderReq);

        ProgramInterface.RoutRec response = null;

        try {
            response=hdwebupaRoutePort.hdwebupaOperation(routeRec);
        } catch (Exception e) {
            log.error("Problem when attempting to get account info from Aristo (HDWBINFO service)", e);
            throw e;
        }

        return response;
    }

}
