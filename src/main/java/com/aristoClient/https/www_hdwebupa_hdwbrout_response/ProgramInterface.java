
package https.www_hdwebupa_hdwbrout_response;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgramInterface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramInterface"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rout_rec"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="rout_request_identification"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="rout_h_order_id"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="12"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_h_sr_trans_type"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="12"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_h_function"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_h_trans_id"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_h_operator_id"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="rout_q_request_info"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="rout_q_delivery_type"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_q_street_no"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_q_pfx"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_q_street"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="16"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_q_sfx"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_q_dir_sfx"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_q_apt"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="6"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_q_city"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="21"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_q_st"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_q_zip"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="5"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_q_country_cd_5"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="rout_q_country_cd_zero"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="rout_q_country_cd"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_q_prod_code"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="rout_s_response_info"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="rout_s_rout_num"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="6"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_s_daily_route"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="6"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_s_sunday_route"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="6"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_s_rout_type"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_s_rout_area"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_s_rout_region"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_s_rout_district"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_s_rout_depot"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_s_products_available"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="150"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_s_access_code"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_s_nr_street_list"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="rout_s_nr_street_entry" maxOccurs="14" minOccurs="14"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="rout_s_nr_prefix"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="2"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="rout_s_nr_street"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="16"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="rout_s_nr_suffix"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="3"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="rout_s_nr_dirsfx"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="2"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="rout_s_nr_zip"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="5"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="rout_s_nr_low_range"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="9"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="rout_s_nr_high_range"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="9"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="rout_s_nr_city"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="12"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="rout_s_nr_cnty"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="2"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="rout_s_nr_route"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="6"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_s_error_code"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="6"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="rout_s_error_message"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="80"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramInterface", propOrder = {
    "routRec"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
public class ProgramInterface {

    @XmlElement(name = "rout_rec", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
    protected ProgramInterface.RoutRec routRec;

    /**
     * Gets the value of the routRec property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.RoutRec }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
    public ProgramInterface.RoutRec getRoutRec() {
        return routRec;
    }

    /**
     * Sets the value of the routRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.RoutRec }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
    public void setRoutRec(ProgramInterface.RoutRec value) {
        this.routRec = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="rout_request_identification"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="rout_h_order_id"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="12"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_h_sr_trans_type"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="12"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_h_function"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_h_trans_id"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_h_operator_id"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="rout_q_request_info"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="rout_q_delivery_type"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_q_street_no"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_q_pfx"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_q_street"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="16"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_q_sfx"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_q_dir_sfx"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_q_apt"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="6"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_q_city"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="21"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_q_st"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_q_zip"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="5"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_q_country_cd_5"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="rout_q_country_cd_zero"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="rout_q_country_cd"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_q_prod_code"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="rout_s_response_info"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="rout_s_rout_num"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="6"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_s_daily_route"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="6"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_s_sunday_route"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="6"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_s_rout_type"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_s_rout_area"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_s_rout_region"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_s_rout_district"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_s_rout_depot"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_s_products_available"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="150"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_s_access_code"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_s_nr_street_list"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="rout_s_nr_street_entry" maxOccurs="14" minOccurs="14"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="rout_s_nr_prefix"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="2"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="rout_s_nr_street"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="16"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="rout_s_nr_suffix"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="3"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="rout_s_nr_dirsfx"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="2"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="rout_s_nr_zip"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="5"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="rout_s_nr_low_range"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="9"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="rout_s_nr_high_range"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="9"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="rout_s_nr_city"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="12"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="rout_s_nr_cnty"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="2"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="rout_s_nr_route"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="6"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_s_error_code"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="6"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="rout_s_error_message"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="80"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "routRequestIdentification",
        "routQRequestInfo",
        "routSResponseInfo"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
    public static class RoutRec {

        @XmlElement(name = "rout_request_identification", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
        protected ProgramInterface.RoutRec.RoutRequestIdentification routRequestIdentification;
        @XmlElement(name = "rout_q_request_info", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
        protected ProgramInterface.RoutRec.RoutQRequestInfo routQRequestInfo;
        @XmlElement(name = "rout_s_response_info", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
        protected ProgramInterface.RoutRec.RoutSResponseInfo routSResponseInfo;

        /**
         * Gets the value of the routRequestIdentification property.
         * 
         * @return
         *     possible object is
         *     {@link ProgramInterface.RoutRec.RoutRequestIdentification }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
        public ProgramInterface.RoutRec.RoutRequestIdentification getRoutRequestIdentification() {
            return routRequestIdentification;
        }

        /**
         * Sets the value of the routRequestIdentification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProgramInterface.RoutRec.RoutRequestIdentification }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
        public void setRoutRequestIdentification(ProgramInterface.RoutRec.RoutRequestIdentification value) {
            this.routRequestIdentification = value;
        }

        /**
         * Gets the value of the routQRequestInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ProgramInterface.RoutRec.RoutQRequestInfo }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
        public ProgramInterface.RoutRec.RoutQRequestInfo getRoutQRequestInfo() {
            return routQRequestInfo;
        }

        /**
         * Sets the value of the routQRequestInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProgramInterface.RoutRec.RoutQRequestInfo }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
        public void setRoutQRequestInfo(ProgramInterface.RoutRec.RoutQRequestInfo value) {
            this.routQRequestInfo = value;
        }

        /**
         * Gets the value of the routSResponseInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ProgramInterface.RoutRec.RoutSResponseInfo }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
        public ProgramInterface.RoutRec.RoutSResponseInfo getRoutSResponseInfo() {
            return routSResponseInfo;
        }

        /**
         * Sets the value of the routSResponseInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProgramInterface.RoutRec.RoutSResponseInfo }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
        public void setRoutSResponseInfo(ProgramInterface.RoutRec.RoutSResponseInfo value) {
            this.routSResponseInfo = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="rout_q_delivery_type"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_q_street_no"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_q_pfx"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_q_street"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="16"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_q_sfx"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_q_dir_sfx"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_q_apt"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="6"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_q_city"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="21"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_q_st"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_q_zip"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="5"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_q_country_cd_5"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="rout_q_country_cd_zero"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="rout_q_country_cd"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_q_prod_code"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "routQDeliveryType",
            "routQStreetNo",
            "routQPfx",
            "routQStreet",
            "routQSfx",
            "routQDirSfx",
            "routQApt",
            "routQCity",
            "routQSt",
            "routQZip",
            "routQCountryCd5",
            "routQProdCode"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
        public static class RoutQRequestInfo {

            @XmlElement(name = "rout_q_delivery_type", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routQDeliveryType;
            @XmlElement(name = "rout_q_street_no", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routQStreetNo;
            @XmlElement(name = "rout_q_pfx", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routQPfx;
            @XmlElement(name = "rout_q_street", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routQStreet;
            @XmlElement(name = "rout_q_sfx", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routQSfx;
            @XmlElement(name = "rout_q_dir_sfx", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routQDirSfx;
            @XmlElement(name = "rout_q_apt", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routQApt;
            @XmlElement(name = "rout_q_city", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routQCity;
            @XmlElement(name = "rout_q_st", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routQSt;
            @XmlElement(name = "rout_q_zip", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routQZip;
            @XmlElement(name = "rout_q_country_cd_5", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected ProgramInterface.RoutRec.RoutQRequestInfo.RoutQCountryCd5 routQCountryCd5;
            @XmlElement(name = "rout_q_prod_code", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routQProdCode;

            /**
             * Gets the value of the routQDeliveryType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutQDeliveryType() {
                return routQDeliveryType;
            }

            /**
             * Sets the value of the routQDeliveryType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutQDeliveryType(String value) {
                this.routQDeliveryType = value;
            }

            /**
             * Gets the value of the routQStreetNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutQStreetNo() {
                return routQStreetNo;
            }

            /**
             * Sets the value of the routQStreetNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutQStreetNo(String value) {
                this.routQStreetNo = value;
            }

            /**
             * Gets the value of the routQPfx property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutQPfx() {
                return routQPfx;
            }

            /**
             * Sets the value of the routQPfx property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutQPfx(String value) {
                this.routQPfx = value;
            }

            /**
             * Gets the value of the routQStreet property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutQStreet() {
                return routQStreet;
            }

            /**
             * Sets the value of the routQStreet property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutQStreet(String value) {
                this.routQStreet = value;
            }

            /**
             * Gets the value of the routQSfx property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutQSfx() {
                return routQSfx;
            }

            /**
             * Sets the value of the routQSfx property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutQSfx(String value) {
                this.routQSfx = value;
            }

            /**
             * Gets the value of the routQDirSfx property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutQDirSfx() {
                return routQDirSfx;
            }

            /**
             * Sets the value of the routQDirSfx property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutQDirSfx(String value) {
                this.routQDirSfx = value;
            }

            /**
             * Gets the value of the routQApt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutQApt() {
                return routQApt;
            }

            /**
             * Sets the value of the routQApt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutQApt(String value) {
                this.routQApt = value;
            }

            /**
             * Gets the value of the routQCity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutQCity() {
                return routQCity;
            }

            /**
             * Sets the value of the routQCity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutQCity(String value) {
                this.routQCity = value;
            }

            /**
             * Gets the value of the routQSt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutQSt() {
                return routQSt;
            }

            /**
             * Sets the value of the routQSt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutQSt(String value) {
                this.routQSt = value;
            }

            /**
             * Gets the value of the routQZip property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutQZip() {
                return routQZip;
            }

            /**
             * Sets the value of the routQZip property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutQZip(String value) {
                this.routQZip = value;
            }

            /**
             * Gets the value of the routQCountryCd5 property.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.RoutRec.RoutQRequestInfo.RoutQCountryCd5 }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public ProgramInterface.RoutRec.RoutQRequestInfo.RoutQCountryCd5 getRoutQCountryCd5() {
                return routQCountryCd5;
            }

            /**
             * Sets the value of the routQCountryCd5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.RoutRec.RoutQRequestInfo.RoutQCountryCd5 }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutQCountryCd5(ProgramInterface.RoutRec.RoutQRequestInfo.RoutQCountryCd5 value) {
                this.routQCountryCd5 = value;
            }

            /**
             * Gets the value of the routQProdCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutQProdCode() {
                return routQProdCode;
            }

            /**
             * Sets the value of the routQProdCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutQProdCode(String value) {
                this.routQProdCode = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="rout_q_country_cd_zero"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="rout_q_country_cd"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "routQCountryCdZero",
                "routQCountryCd"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public static class RoutQCountryCd5 {

                @XmlElement(name = "rout_q_country_cd_zero", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                protected String routQCountryCdZero;
                @XmlElement(name = "rout_q_country_cd", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                protected String routQCountryCd;

                /**
                 * Gets the value of the routQCountryCdZero property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                public String getRoutQCountryCdZero() {
                    return routQCountryCdZero;
                }

                /**
                 * Sets the value of the routQCountryCdZero property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                public void setRoutQCountryCdZero(String value) {
                    this.routQCountryCdZero = value;
                }

                /**
                 * Gets the value of the routQCountryCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                public String getRoutQCountryCd() {
                    return routQCountryCd;
                }

                /**
                 * Sets the value of the routQCountryCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                public void setRoutQCountryCd(String value) {
                    this.routQCountryCd = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="rout_h_order_id"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="12"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_h_sr_trans_type"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="12"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_h_function"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_h_trans_id"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_h_operator_id"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "routHOrderId",
            "routHSrTransType",
            "routHFunction",
            "routHTransId",
            "routHOperatorId"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
        public static class RoutRequestIdentification {

            @XmlElement(name = "rout_h_order_id", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routHOrderId;
            @XmlElement(name = "rout_h_sr_trans_type", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routHSrTransType;
            @XmlElement(name = "rout_h_function", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routHFunction;
            @XmlElement(name = "rout_h_trans_id", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routHTransId;
            @XmlElement(name = "rout_h_operator_id", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routHOperatorId;

            /**
             * Gets the value of the routHOrderId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutHOrderId() {
                return routHOrderId;
            }

            /**
             * Sets the value of the routHOrderId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutHOrderId(String value) {
                this.routHOrderId = value;
            }

            /**
             * Gets the value of the routHSrTransType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutHSrTransType() {
                return routHSrTransType;
            }

            /**
             * Sets the value of the routHSrTransType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutHSrTransType(String value) {
                this.routHSrTransType = value;
            }

            /**
             * Gets the value of the routHFunction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutHFunction() {
                return routHFunction;
            }

            /**
             * Sets the value of the routHFunction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutHFunction(String value) {
                this.routHFunction = value;
            }

            /**
             * Gets the value of the routHTransId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutHTransId() {
                return routHTransId;
            }

            /**
             * Sets the value of the routHTransId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutHTransId(String value) {
                this.routHTransId = value;
            }

            /**
             * Gets the value of the routHOperatorId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutHOperatorId() {
                return routHOperatorId;
            }

            /**
             * Sets the value of the routHOperatorId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutHOperatorId(String value) {
                this.routHOperatorId = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="rout_s_rout_num"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="6"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_s_daily_route"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="6"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_s_sunday_route"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="6"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_s_rout_type"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_s_rout_area"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_s_rout_region"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_s_rout_district"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_s_rout_depot"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_s_products_available"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="150"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_s_access_code"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_s_nr_street_list"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="rout_s_nr_street_entry" maxOccurs="14" minOccurs="14"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="rout_s_nr_prefix"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="2"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="rout_s_nr_street"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="16"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="rout_s_nr_suffix"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="3"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="rout_s_nr_dirsfx"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="2"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="rout_s_nr_zip"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="5"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="rout_s_nr_low_range"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="9"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="rout_s_nr_high_range"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="9"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="rout_s_nr_city"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="12"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="rout_s_nr_cnty"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="2"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="rout_s_nr_route"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="6"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_s_error_code"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="6"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="rout_s_error_message"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="80"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "routSRoutNum",
            "routSDailyRoute",
            "routSSundayRoute",
            "routSRoutType",
            "routSRoutArea",
            "routSRoutRegion",
            "routSRoutDistrict",
            "routSRoutDepot",
            "routSProductsAvailable",
            "routSAccessCode",
            "routSNrStreetList",
            "routSErrorCode",
            "routSErrorMessage"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
        public static class RoutSResponseInfo {

            @XmlElement(name = "rout_s_rout_num", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routSRoutNum;
            @XmlElement(name = "rout_s_daily_route", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routSDailyRoute;
            @XmlElement(name = "rout_s_sunday_route", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routSSundayRoute;
            @XmlElement(name = "rout_s_rout_type", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routSRoutType;
            @XmlElement(name = "rout_s_rout_area", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routSRoutArea;
            @XmlElement(name = "rout_s_rout_region", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routSRoutRegion;
            @XmlElement(name = "rout_s_rout_district", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routSRoutDistrict;
            @XmlElement(name = "rout_s_rout_depot", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routSRoutDepot;
            @XmlElement(name = "rout_s_products_available", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routSProductsAvailable;
            @XmlElement(name = "rout_s_access_code", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routSAccessCode;
            @XmlElement(name = "rout_s_nr_street_list", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected ProgramInterface.RoutRec.RoutSResponseInfo.RoutSNrStreetList routSNrStreetList;
            @XmlElement(name = "rout_s_error_code", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routSErrorCode;
            @XmlElement(name = "rout_s_error_message", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            protected String routSErrorMessage;

            /**
             * Gets the value of the routSRoutNum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutSRoutNum() {
                return routSRoutNum;
            }

            /**
             * Sets the value of the routSRoutNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutSRoutNum(String value) {
                this.routSRoutNum = value;
            }

            /**
             * Gets the value of the routSDailyRoute property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutSDailyRoute() {
                return routSDailyRoute;
            }

            /**
             * Sets the value of the routSDailyRoute property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutSDailyRoute(String value) {
                this.routSDailyRoute = value;
            }

            /**
             * Gets the value of the routSSundayRoute property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutSSundayRoute() {
                return routSSundayRoute;
            }

            /**
             * Sets the value of the routSSundayRoute property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutSSundayRoute(String value) {
                this.routSSundayRoute = value;
            }

            /**
             * Gets the value of the routSRoutType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutSRoutType() {
                return routSRoutType;
            }

            /**
             * Sets the value of the routSRoutType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutSRoutType(String value) {
                this.routSRoutType = value;
            }

            /**
             * Gets the value of the routSRoutArea property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutSRoutArea() {
                return routSRoutArea;
            }

            /**
             * Sets the value of the routSRoutArea property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutSRoutArea(String value) {
                this.routSRoutArea = value;
            }

            /**
             * Gets the value of the routSRoutRegion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutSRoutRegion() {
                return routSRoutRegion;
            }

            /**
             * Sets the value of the routSRoutRegion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutSRoutRegion(String value) {
                this.routSRoutRegion = value;
            }

            /**
             * Gets the value of the routSRoutDistrict property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutSRoutDistrict() {
                return routSRoutDistrict;
            }

            /**
             * Sets the value of the routSRoutDistrict property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutSRoutDistrict(String value) {
                this.routSRoutDistrict = value;
            }

            /**
             * Gets the value of the routSRoutDepot property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutSRoutDepot() {
                return routSRoutDepot;
            }

            /**
             * Sets the value of the routSRoutDepot property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutSRoutDepot(String value) {
                this.routSRoutDepot = value;
            }

            /**
             * Gets the value of the routSProductsAvailable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutSProductsAvailable() {
                return routSProductsAvailable;
            }

            /**
             * Sets the value of the routSProductsAvailable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutSProductsAvailable(String value) {
                this.routSProductsAvailable = value;
            }

            /**
             * Gets the value of the routSAccessCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutSAccessCode() {
                return routSAccessCode;
            }

            /**
             * Sets the value of the routSAccessCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutSAccessCode(String value) {
                this.routSAccessCode = value;
            }

            /**
             * Gets the value of the routSNrStreetList property.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.RoutRec.RoutSResponseInfo.RoutSNrStreetList }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public ProgramInterface.RoutRec.RoutSResponseInfo.RoutSNrStreetList getRoutSNrStreetList() {
                return routSNrStreetList;
            }

            /**
             * Sets the value of the routSNrStreetList property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.RoutRec.RoutSResponseInfo.RoutSNrStreetList }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutSNrStreetList(ProgramInterface.RoutRec.RoutSResponseInfo.RoutSNrStreetList value) {
                this.routSNrStreetList = value;
            }

            /**
             * Gets the value of the routSErrorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutSErrorCode() {
                return routSErrorCode;
            }

            /**
             * Sets the value of the routSErrorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutSErrorCode(String value) {
                this.routSErrorCode = value;
            }

            /**
             * Gets the value of the routSErrorMessage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public String getRoutSErrorMessage() {
                return routSErrorMessage;
            }

            /**
             * Sets the value of the routSErrorMessage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public void setRoutSErrorMessage(String value) {
                this.routSErrorMessage = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="rout_s_nr_street_entry" maxOccurs="14" minOccurs="14"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="rout_s_nr_prefix"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="2"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="rout_s_nr_street"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="16"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="rout_s_nr_suffix"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="3"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="rout_s_nr_dirsfx"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="2"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="rout_s_nr_zip"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="5"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="rout_s_nr_low_range"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="9"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="rout_s_nr_high_range"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="9"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="rout_s_nr_city"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="12"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="rout_s_nr_cnty"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="2"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="rout_s_nr_route"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="6"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "routSNrStreetEntry"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
            public static class RoutSNrStreetList {

                @XmlElement(name = "rout_s_nr_street_entry", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                protected List<ProgramInterface.RoutRec.RoutSResponseInfo.RoutSNrStreetList.RoutSNrStreetEntry> routSNrStreetEntry;

                /**
                 * Gets the value of the routSNrStreetEntry property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the routSNrStreetEntry property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRoutSNrStreetEntry().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ProgramInterface.RoutRec.RoutSResponseInfo.RoutSNrStreetList.RoutSNrStreetEntry }
                 * 
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                public List<ProgramInterface.RoutRec.RoutSResponseInfo.RoutSNrStreetList.RoutSNrStreetEntry> getRoutSNrStreetEntry() {
                    if (routSNrStreetEntry == null) {
                        routSNrStreetEntry = new ArrayList<ProgramInterface.RoutRec.RoutSResponseInfo.RoutSNrStreetList.RoutSNrStreetEntry>();
                    }
                    return this.routSNrStreetEntry;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="rout_s_nr_prefix"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="2"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="rout_s_nr_street"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="16"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="rout_s_nr_suffix"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="3"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="rout_s_nr_dirsfx"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="2"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="rout_s_nr_zip"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="5"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="rout_s_nr_low_range"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="9"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="rout_s_nr_high_range"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="9"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="rout_s_nr_city"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="12"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="rout_s_nr_cnty"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="2"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="rout_s_nr_route"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="6"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "routSNrPrefix",
                    "routSNrStreet",
                    "routSNrSuffix",
                    "routSNrDirsfx",
                    "routSNrZip",
                    "routSNrLowRange",
                    "routSNrHighRange",
                    "routSNrCity",
                    "routSNrCnty",
                    "routSNrRoute"
                })
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                public static class RoutSNrStreetEntry {

                    @XmlElement(name = "rout_s_nr_prefix", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    protected String routSNrPrefix;
                    @XmlElement(name = "rout_s_nr_street", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    protected String routSNrStreet;
                    @XmlElement(name = "rout_s_nr_suffix", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    protected String routSNrSuffix;
                    @XmlElement(name = "rout_s_nr_dirsfx", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    protected String routSNrDirsfx;
                    @XmlElement(name = "rout_s_nr_zip", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    protected String routSNrZip;
                    @XmlElement(name = "rout_s_nr_low_range", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    protected String routSNrLowRange;
                    @XmlElement(name = "rout_s_nr_high_range", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    protected String routSNrHighRange;
                    @XmlElement(name = "rout_s_nr_city", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    protected String routSNrCity;
                    @XmlElement(name = "rout_s_nr_cnty", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    protected String routSNrCnty;
                    @XmlElement(name = "rout_s_nr_route", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    protected String routSNrRoute;

                    /**
                     * Gets the value of the routSNrPrefix property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public String getRoutSNrPrefix() {
                        return routSNrPrefix;
                    }

                    /**
                     * Sets the value of the routSNrPrefix property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public void setRoutSNrPrefix(String value) {
                        this.routSNrPrefix = value;
                    }

                    /**
                     * Gets the value of the routSNrStreet property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public String getRoutSNrStreet() {
                        return routSNrStreet;
                    }

                    /**
                     * Sets the value of the routSNrStreet property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public void setRoutSNrStreet(String value) {
                        this.routSNrStreet = value;
                    }

                    /**
                     * Gets the value of the routSNrSuffix property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public String getRoutSNrSuffix() {
                        return routSNrSuffix;
                    }

                    /**
                     * Sets the value of the routSNrSuffix property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public void setRoutSNrSuffix(String value) {
                        this.routSNrSuffix = value;
                    }

                    /**
                     * Gets the value of the routSNrDirsfx property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public String getRoutSNrDirsfx() {
                        return routSNrDirsfx;
                    }

                    /**
                     * Sets the value of the routSNrDirsfx property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public void setRoutSNrDirsfx(String value) {
                        this.routSNrDirsfx = value;
                    }

                    /**
                     * Gets the value of the routSNrZip property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public String getRoutSNrZip() {
                        return routSNrZip;
                    }

                    /**
                     * Sets the value of the routSNrZip property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public void setRoutSNrZip(String value) {
                        this.routSNrZip = value;
                    }

                    /**
                     * Gets the value of the routSNrLowRange property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public String getRoutSNrLowRange() {
                        return routSNrLowRange;
                    }

                    /**
                     * Sets the value of the routSNrLowRange property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public void setRoutSNrLowRange(String value) {
                        this.routSNrLowRange = value;
                    }

                    /**
                     * Gets the value of the routSNrHighRange property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public String getRoutSNrHighRange() {
                        return routSNrHighRange;
                    }

                    /**
                     * Sets the value of the routSNrHighRange property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public void setRoutSNrHighRange(String value) {
                        this.routSNrHighRange = value;
                    }

                    /**
                     * Gets the value of the routSNrCity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public String getRoutSNrCity() {
                        return routSNrCity;
                    }

                    /**
                     * Sets the value of the routSNrCity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public void setRoutSNrCity(String value) {
                        this.routSNrCity = value;
                    }

                    /**
                     * Gets the value of the routSNrCnty property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public String getRoutSNrCnty() {
                        return routSNrCnty;
                    }

                    /**
                     * Sets the value of the routSNrCnty property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public void setRoutSNrCnty(String value) {
                        this.routSNrCnty = value;
                    }

                    /**
                     * Gets the value of the routSNrRoute property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public String getRoutSNrRoute() {
                        return routSNrRoute;
                    }

                    /**
                     * Sets the value of the routSNrRoute property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-28T15:47:36-04:00")
                    public void setRoutSNrRoute(String value) {
                        this.routSNrRoute = value;
                    }

                }

            }

        }

    }

}
