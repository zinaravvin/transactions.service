
package https.www_hdwebupa_hdwbrout_response;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_hdwebupa_hdwbrout_response package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
public class ObjectFactory {

    private final static QName _HDWEBUPAOperationResponse_QNAME = new QName("https://www.HDWEBUPA.HDWBROUT.Response.com", "HDWEBUPAOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.www_hdwebupa_hdwbrout_response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProgramInterface }
     * 
     */
    public ProgramInterface createProgramInterface() {
        return new ProgramInterface();
    }

    /**
     * Create an instance of {@link ProgramInterface.RoutRec }
     * 
     */
    public ProgramInterface.RoutRec createProgramInterfaceRoutRec() {
        return new ProgramInterface.RoutRec();
    }

    /**
     * Create an instance of {@link ProgramInterface.RoutRec.RoutSResponseInfo }
     * 
     */
    public ProgramInterface.RoutRec.RoutSResponseInfo createProgramInterfaceRoutRecRoutSResponseInfo() {
        return new ProgramInterface.RoutRec.RoutSResponseInfo();
    }

    /**
     * Create an instance of {@link ProgramInterface.RoutRec.RoutSResponseInfo.RoutSNrStreetList }
     * 
     */
    public ProgramInterface.RoutRec.RoutSResponseInfo.RoutSNrStreetList createProgramInterfaceRoutRecRoutSResponseInfoRoutSNrStreetList() {
        return new ProgramInterface.RoutRec.RoutSResponseInfo.RoutSNrStreetList();
    }

    /**
     * Create an instance of {@link ProgramInterface.RoutRec.RoutQRequestInfo }
     * 
     */
    public ProgramInterface.RoutRec.RoutQRequestInfo createProgramInterfaceRoutRecRoutQRequestInfo() {
        return new ProgramInterface.RoutRec.RoutQRequestInfo();
    }

    /**
     * Create an instance of {@link ProgramInterface.RoutRec.RoutRequestIdentification }
     * 
     */
    public ProgramInterface.RoutRec.RoutRequestIdentification createProgramInterfaceRoutRecRoutRequestIdentification() {
        return new ProgramInterface.RoutRec.RoutRequestIdentification();
    }

    /**
     * Create an instance of {@link ProgramInterface.RoutRec.RoutSResponseInfo.RoutSNrStreetList.RoutSNrStreetEntry }
     * 
     */
    public ProgramInterface.RoutRec.RoutSResponseInfo.RoutSNrStreetList.RoutSNrStreetEntry createProgramInterfaceRoutRecRoutSResponseInfoRoutSNrStreetListRoutSNrStreetEntry() {
        return new ProgramInterface.RoutRec.RoutSResponseInfo.RoutSNrStreetList.RoutSNrStreetEntry();
    }

    /**
     * Create an instance of {@link ProgramInterface.RoutRec.RoutQRequestInfo.RoutQCountryCd5 }
     * 
     */
    public ProgramInterface.RoutRec.RoutQRequestInfo.RoutQCountryCd5 createProgramInterfaceRoutRecRoutQRequestInfoRoutQCountryCd5() {
        return new ProgramInterface.RoutRec.RoutQRequestInfo.RoutQCountryCd5();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.HDWEBUPA.HDWBROUT.Response.com", name = "HDWEBUPAOperationResponse")
    public JAXBElement<ProgramInterface> createHDWEBUPAOperationResponse(ProgramInterface value) {
        return new JAXBElement<ProgramInterface>(_HDWEBUPAOperationResponse_QNAME, ProgramInterface.class, null, value);
    }

}
