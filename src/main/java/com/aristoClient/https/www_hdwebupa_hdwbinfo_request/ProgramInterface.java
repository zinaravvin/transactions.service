
package https.www_hdwebupa_hdwbinfo_request;

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
 *         &lt;element name="info_rec"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="info_h_identification"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="info_h_sr_trans_type"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="info_h_operator_id"&gt;
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
 *                   &lt;element name="info_request_info"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="info_q_account_number"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="info_q_account_phone"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                   &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="info_response_info"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="account_info"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="start_dt"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="account_nbr"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="9"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="account_stat"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="curr_balance"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="hd_dgt_tot_bal"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="last_pmt_date"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="last_payment_amt"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="dunn_level"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="1"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="dunn_lst_dun_dt"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="dunn_nxt_dun_dt"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="last_bill_date"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="next_bill_date"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="bill_freq"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="last_bill_amt"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="subs_type"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="cust_type"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="grp_acct_flg"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="1"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="parent_acct_nbr"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="9"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="sub_region"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="sub_area"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="sub_district"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="sub_depot"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="bill_type"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="1"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="print_inv_ind"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="1"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="nief_amt"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="7"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="nief_flag"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="1"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="bypass_dunn_days"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="max_bypass_days"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="bill_imm_flg"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="1"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="cost_center"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="4"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="digital_flag"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="1"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="digital_prod_table" maxOccurs="3" minOccurs="3"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="dgtl_prod_cd"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="2"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="dgtl_status"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="2"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="dgtl_promo_cd"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="4"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="dgtl_promo_code_desc"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="35"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="dgtl_promo_exp_dt"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="6"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="dgtl_curr_bal"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="9"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="dgtl_bill_from_dt"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="9"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="dgtl_bill_last_amt"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="9"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="dgtl_last_pmt_dt"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="6"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="dgtl_last_pmt_amt"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="9"/&gt;
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
 *                             &lt;element name="route_info"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="route_mon"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="route_tue"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="route_wed"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="route_thu"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="route_fri"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="route_sat"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="route_sun"&gt;
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
 *                             &lt;element name="address_info"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="spec_inst"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="50"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="last_name"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="20"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="first_name"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="20"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="care_of"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="22"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="street_no"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="9"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="prefix"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="street"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="16"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="suffix"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="dir_suffix"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="apt_no"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="building_no"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="5"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="build_accs_code"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="city"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="21"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="state"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="postal_cd"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="5"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="zip_extn"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="4"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="country_code_5"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="country_cd_zero"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="2"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="country_cd"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="3"/&gt;
 *                                                       &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="pobox"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="other_info"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="for_other_tag_ms"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="7"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="for_building_ms"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="for_floor_ms"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="for_postal_code_ms"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="9"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="for_address1"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="25"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="for_address2"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="25"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="home_phone"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="email_addr"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="38"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="optin"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="1"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="bus_phone"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="alt_address_info"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="alt_su_state"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_st_name"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="16"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_sufx"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_dir_sufx"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_zip_cd_5"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="5"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_zip_4"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="4"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_prfx"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_st_num"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="9"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_apt"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_building"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_building_access_code"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_city"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="21"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_cnty"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_country_cd"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_sub_tel_num"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_from_date"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_thru_date"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="alt_su_product"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="bill_address_info"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="bill_last_nme"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="20"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="bill_first_nme"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="20"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="bill_care_of"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="30"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="bill_city"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="22"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="bill_state"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="bill_for_postal_cd"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="9"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="bill_postal_zip_cd"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="5"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="bill_zip_extn"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="4"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="bill_cntry_cd"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="5"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="bill_address1"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="30"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="credit_card_info"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="cc_type"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="cc_number"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="16"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="cc_exp_month"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="cc_exp_year"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="pay_by_cc_flg"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="1"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="bank_account_info"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="bank_acct_no"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="17"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="bank_rout_no"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="9"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="product_info"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="promo_code"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="5"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="promo_rate_ind"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="1"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="promo_code_desc"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="35"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="promo_exp_dt"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="media_code"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="source_code"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="prod_code"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="nbr_copies"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="solic_id"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="4"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ref_no"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="9"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="delivery_type"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="prod_status"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="prod_start_dt"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="prod_stop_dt"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="prod_rstr_dt"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="prod_stop_reason"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="prod_stop_comment"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="30"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="prod_fut_stop_date"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="prod_fut_rstr_date"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="prod_campaign_code_p"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="5"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="prod_campaign_occ_code_p"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="5"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="prod_data_warehouse_id_p"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="prod_offer_code_p"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="5"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="additional_delivery_info"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="recovery_time"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="4"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="recovery_route_ind"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="1"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="stop_lead_days"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="restart_lead_days"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="start_lead_days"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="stop_asap_date"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="delivery_time"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="4"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="rte_depot_alert_time"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="13"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="rte_depot_alert_msg"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="50"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="info_response_cd_msg"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="info_s_error_code"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="10"/&gt;
 *                                             &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="info_s_error_message"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="80"/&gt;
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
    "infoRec"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
public class ProgramInterface {

    @XmlElement(name = "info_rec", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
    protected ProgramInterface.InfoRec infoRec;

    /**
     * Gets the value of the infoRec property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.InfoRec }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
    public ProgramInterface.InfoRec getInfoRec() {
        return infoRec;
    }

    /**
     * Sets the value of the infoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.InfoRec }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
    public void setInfoRec(ProgramInterface.InfoRec value) {
        this.infoRec = value;
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
     *         &lt;element name="info_h_identification"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="info_h_sr_trans_type"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="info_h_operator_id"&gt;
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
     *         &lt;element name="info_request_info"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="info_q_account_number"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="info_q_account_phone"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                         &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="info_response_info"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="account_info"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="start_dt"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="account_nbr"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="9"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="account_stat"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="curr_balance"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="hd_dgt_tot_bal"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="last_pmt_date"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="last_payment_amt"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="dunn_level"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="1"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="dunn_lst_dun_dt"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="dunn_nxt_dun_dt"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="last_bill_date"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="next_bill_date"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="bill_freq"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="last_bill_amt"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="subs_type"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="cust_type"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="grp_acct_flg"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="1"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="parent_acct_nbr"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="9"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="sub_region"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="sub_area"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="sub_district"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="sub_depot"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="bill_type"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="1"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="print_inv_ind"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="1"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="nief_amt"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="7"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="nief_flag"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="1"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="bypass_dunn_days"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="max_bypass_days"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="bill_imm_flg"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="1"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="cost_center"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="4"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="digital_flag"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="1"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="digital_prod_table" maxOccurs="3" minOccurs="3"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="dgtl_prod_cd"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="2"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="dgtl_status"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="2"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="dgtl_promo_cd"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="4"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="dgtl_promo_code_desc"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="35"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="dgtl_promo_exp_dt"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="6"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="dgtl_curr_bal"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="9"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="dgtl_bill_from_dt"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="9"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="dgtl_bill_last_amt"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="9"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="dgtl_last_pmt_dt"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="6"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="dgtl_last_pmt_amt"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="9"/&gt;
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
     *                   &lt;element name="route_info"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="route_mon"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="route_tue"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="route_wed"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="route_thu"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="route_fri"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="route_sat"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="route_sun"&gt;
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
     *                   &lt;element name="address_info"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="spec_inst"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="50"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="last_name"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="20"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="first_name"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="20"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="care_of"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="22"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="street_no"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="9"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="prefix"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="street"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="16"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="suffix"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="dir_suffix"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="apt_no"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="building_no"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="5"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="build_accs_code"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="city"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="21"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="state"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="postal_cd"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="5"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="zip_extn"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="4"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="country_code_5"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="country_cd_zero"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="2"/&gt;
     *                                             &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="country_cd"&gt;
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
     *                             &lt;element name="pobox"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="other_info"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="for_other_tag_ms"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="7"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="for_building_ms"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="for_floor_ms"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="for_postal_code_ms"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="9"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="for_address1"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="25"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="for_address2"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="25"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="home_phone"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="email_addr"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="38"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="optin"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="1"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="bus_phone"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="alt_address_info"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="alt_su_state"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_st_name"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="16"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_sufx"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_dir_sufx"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_zip_cd_5"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="5"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_zip_4"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="4"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_prfx"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_st_num"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="9"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_apt"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_building"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_building_access_code"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_city"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="21"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_cnty"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_country_cd"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_sub_tel_num"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_from_date"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_thru_date"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="alt_su_product"&gt;
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
     *                   &lt;element name="bill_address_info"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="bill_last_nme"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="20"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="bill_first_nme"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="20"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="bill_care_of"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="30"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="bill_city"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="22"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="bill_state"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="bill_for_postal_cd"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="9"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="bill_postal_zip_cd"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="5"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="bill_zip_extn"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="4"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="bill_cntry_cd"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="5"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="bill_address1"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="30"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="credit_card_info"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="cc_type"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="cc_number"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="16"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="cc_exp_month"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="cc_exp_year"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="pay_by_cc_flg"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="1"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="bank_account_info"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="bank_acct_no"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="17"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="bank_rout_no"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="9"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="product_info"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="promo_code"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="5"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="promo_rate_ind"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="1"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="promo_code_desc"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="35"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="promo_exp_dt"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="media_code"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="source_code"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="prod_code"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="nbr_copies"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="solic_id"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="4"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ref_no"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="9"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="delivery_type"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="prod_status"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="prod_start_dt"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="prod_stop_dt"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="prod_rstr_dt"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="prod_stop_reason"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="prod_stop_comment"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="30"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="prod_fut_stop_date"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="prod_fut_rstr_date"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="prod_campaign_code_p"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="5"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="prod_campaign_occ_code_p"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="5"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="prod_data_warehouse_id_p"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="prod_offer_code_p"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="5"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="additional_delivery_info"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="recovery_time"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="4"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="recovery_route_ind"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="1"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="stop_lead_days"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="restart_lead_days"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="start_lead_days"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="stop_asap_date"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="delivery_time"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="4"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="rte_depot_alert_time"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="13"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="rte_depot_alert_msg"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="50"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="info_response_cd_msg"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="info_s_error_code"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="10"/&gt;
     *                                   &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="info_s_error_message"&gt;
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
    @XmlType(name = "", propOrder = {
        "infoHIdentification",
        "infoRequestInfo",
        "infoResponseInfo"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
    public static class InfoRec {

        @XmlElement(name = "info_h_identification", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
        protected ProgramInterface.InfoRec.InfoHIdentification infoHIdentification;
        @XmlElement(name = "info_request_info", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
        protected ProgramInterface.InfoRec.InfoRequestInfo infoRequestInfo;
        @XmlElement(name = "info_response_info", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
        protected ProgramInterface.InfoRec.InfoResponseInfo infoResponseInfo;

        /**
         * Gets the value of the infoHIdentification property.
         * 
         * @return
         *     possible object is
         *     {@link ProgramInterface.InfoRec.InfoHIdentification }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
        public ProgramInterface.InfoRec.InfoHIdentification getInfoHIdentification() {
            return infoHIdentification;
        }

        /**
         * Sets the value of the infoHIdentification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProgramInterface.InfoRec.InfoHIdentification }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
        public void setInfoHIdentification(ProgramInterface.InfoRec.InfoHIdentification value) {
            this.infoHIdentification = value;
        }

        /**
         * Gets the value of the infoRequestInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ProgramInterface.InfoRec.InfoRequestInfo }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
        public ProgramInterface.InfoRec.InfoRequestInfo getInfoRequestInfo() {
            return infoRequestInfo;
        }

        /**
         * Sets the value of the infoRequestInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProgramInterface.InfoRec.InfoRequestInfo }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
        public void setInfoRequestInfo(ProgramInterface.InfoRec.InfoRequestInfo value) {
            this.infoRequestInfo = value;
        }

        /**
         * Gets the value of the infoResponseInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ProgramInterface.InfoRec.InfoResponseInfo }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
        public ProgramInterface.InfoRec.InfoResponseInfo getInfoResponseInfo() {
            return infoResponseInfo;
        }

        /**
         * Sets the value of the infoResponseInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProgramInterface.InfoRec.InfoResponseInfo }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
        public void setInfoResponseInfo(ProgramInterface.InfoRec.InfoResponseInfo value) {
            this.infoResponseInfo = value;
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
         *         &lt;element name="info_h_sr_trans_type"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="info_h_operator_id"&gt;
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
            "infoHSrTransType",
            "infoHOperatorId"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
        public static class InfoHIdentification {

            @XmlElement(name = "info_h_sr_trans_type", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            protected String infoHSrTransType;
            @XmlElement(name = "info_h_operator_id", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            protected String infoHOperatorId;

            /**
             * Gets the value of the infoHSrTransType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public String getInfoHSrTransType() {
                return infoHSrTransType;
            }

            /**
             * Sets the value of the infoHSrTransType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public void setInfoHSrTransType(String value) {
                this.infoHSrTransType = value;
            }

            /**
             * Gets the value of the infoHOperatorId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public String getInfoHOperatorId() {
                return infoHOperatorId;
            }

            /**
             * Sets the value of the infoHOperatorId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public void setInfoHOperatorId(String value) {
                this.infoHOperatorId = value;
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
         *         &lt;element name="info_q_account_number"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="collapse"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="info_q_account_phone"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
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
            "infoQAccountNumber",
            "infoQAccountPhone"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
        public static class InfoRequestInfo {

            @XmlElement(name = "info_q_account_number", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            protected String infoQAccountNumber;
            @XmlElement(name = "info_q_account_phone", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            protected String infoQAccountPhone;

            /**
             * Gets the value of the infoQAccountNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public String getInfoQAccountNumber() {
                return infoQAccountNumber;
            }

            /**
             * Sets the value of the infoQAccountNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public void setInfoQAccountNumber(String value) {
                this.infoQAccountNumber = value;
            }

            /**
             * Gets the value of the infoQAccountPhone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public String getInfoQAccountPhone() {
                return infoQAccountPhone;
            }

            /**
             * Sets the value of the infoQAccountPhone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public void setInfoQAccountPhone(String value) {
                this.infoQAccountPhone = value;
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
         *         &lt;element name="account_info"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="start_dt"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="account_nbr"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="9"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="account_stat"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="curr_balance"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="hd_dgt_tot_bal"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="last_pmt_date"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="last_payment_amt"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="dunn_level"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="1"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="dunn_lst_dun_dt"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="dunn_nxt_dun_dt"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="last_bill_date"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="next_bill_date"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="bill_freq"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="last_bill_amt"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="subs_type"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="cust_type"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="grp_acct_flg"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="1"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="parent_acct_nbr"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="9"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="sub_region"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="sub_area"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="sub_district"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="sub_depot"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="bill_type"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="1"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="print_inv_ind"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="1"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="nief_amt"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="7"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="nief_flag"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="1"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="bypass_dunn_days"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="max_bypass_days"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="bill_imm_flg"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="1"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="cost_center"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="4"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="digital_flag"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="1"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="digital_prod_table" maxOccurs="3" minOccurs="3"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="dgtl_prod_cd"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="2"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="dgtl_status"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="2"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="dgtl_promo_cd"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="4"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="dgtl_promo_code_desc"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="35"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="dgtl_promo_exp_dt"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="6"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="dgtl_curr_bal"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="9"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="dgtl_bill_from_dt"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="9"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="dgtl_bill_last_amt"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="9"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="dgtl_last_pmt_dt"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="6"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="dgtl_last_pmt_amt"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="9"/&gt;
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
         *         &lt;element name="route_info"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="route_mon"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="route_tue"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="route_wed"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="route_thu"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="route_fri"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="route_sat"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="route_sun"&gt;
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
         *         &lt;element name="address_info"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="spec_inst"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="50"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="last_name"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="20"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="first_name"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="20"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="care_of"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="22"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="street_no"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="9"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="prefix"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="street"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="16"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="suffix"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="dir_suffix"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="apt_no"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="building_no"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="5"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="build_accs_code"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="city"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="21"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="state"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="postal_cd"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="5"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="zip_extn"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="4"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="country_code_5"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="country_cd_zero"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="2"/&gt;
         *                                   &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="country_cd"&gt;
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
         *                   &lt;element name="pobox"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="other_info"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="for_other_tag_ms"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="7"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="for_building_ms"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="for_floor_ms"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="for_postal_code_ms"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="9"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="for_address1"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="25"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="for_address2"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="25"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="home_phone"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="email_addr"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="38"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="optin"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="1"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="bus_phone"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="alt_address_info"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="alt_su_state"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_st_name"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="16"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_sufx"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_dir_sufx"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_zip_cd_5"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="5"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_zip_4"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="4"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_prfx"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_st_num"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="9"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_apt"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_building"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_building_access_code"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_city"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="21"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_cnty"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_country_cd"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_sub_tel_num"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_from_date"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_thru_date"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="alt_su_product"&gt;
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
         *         &lt;element name="bill_address_info"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="bill_last_nme"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="20"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="bill_first_nme"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="20"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="bill_care_of"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="30"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="bill_city"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="22"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="bill_state"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="bill_for_postal_cd"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="9"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="bill_postal_zip_cd"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="5"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="bill_zip_extn"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="4"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="bill_cntry_cd"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="5"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="bill_address1"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="30"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="credit_card_info"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="cc_type"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="cc_number"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="16"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="cc_exp_month"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="cc_exp_year"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="pay_by_cc_flg"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="1"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="bank_account_info"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="bank_acct_no"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="17"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="bank_rout_no"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="9"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="product_info"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="promo_code"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="5"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="promo_rate_ind"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="1"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="promo_code_desc"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="35"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="promo_exp_dt"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="media_code"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="source_code"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="prod_code"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="nbr_copies"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="solic_id"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="4"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ref_no"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="9"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="delivery_type"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="prod_status"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="prod_start_dt"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="prod_stop_dt"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="prod_rstr_dt"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="prod_stop_reason"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="prod_stop_comment"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="30"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="prod_fut_stop_date"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="prod_fut_rstr_date"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="prod_campaign_code_p"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="5"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="prod_campaign_occ_code_p"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="5"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="prod_data_warehouse_id_p"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="prod_offer_code_p"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="5"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="additional_delivery_info"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="recovery_time"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="4"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="recovery_route_ind"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="1"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="stop_lead_days"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="restart_lead_days"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="start_lead_days"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="stop_asap_date"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="delivery_time"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="4"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="rte_depot_alert_time"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="13"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="rte_depot_alert_msg"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="50"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="info_response_cd_msg"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="info_s_error_code"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="10"/&gt;
         *                         &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="info_s_error_message"&gt;
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
            "accountInfo",
            "routeInfo",
            "addressInfo",
            "altAddressInfo",
            "billAddressInfo",
            "creditCardInfo",
            "bankAccountInfo",
            "productInfo",
            "additionalDeliveryInfo",
            "infoResponseCdMsg"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
        public static class InfoResponseInfo {

            @XmlElement(name = "account_info", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            protected ProgramInterface.InfoRec.InfoResponseInfo.AccountInfo accountInfo;
            @XmlElement(name = "route_info", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            protected ProgramInterface.InfoRec.InfoResponseInfo.RouteInfo routeInfo;
            @XmlElement(name = "address_info", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            protected ProgramInterface.InfoRec.InfoResponseInfo.AddressInfo addressInfo;
            @XmlElement(name = "alt_address_info", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            protected ProgramInterface.InfoRec.InfoResponseInfo.AltAddressInfo altAddressInfo;
            @XmlElement(name = "bill_address_info", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            protected ProgramInterface.InfoRec.InfoResponseInfo.BillAddressInfo billAddressInfo;
            @XmlElement(name = "credit_card_info", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            protected ProgramInterface.InfoRec.InfoResponseInfo.CreditCardInfo creditCardInfo;
            @XmlElement(name = "bank_account_info", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            protected ProgramInterface.InfoRec.InfoResponseInfo.BankAccountInfo bankAccountInfo;
            @XmlElement(name = "product_info", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            protected ProgramInterface.InfoRec.InfoResponseInfo.ProductInfo productInfo;
            @XmlElement(name = "additional_delivery_info", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            protected ProgramInterface.InfoRec.InfoResponseInfo.AdditionalDeliveryInfo additionalDeliveryInfo;
            @XmlElement(name = "info_response_cd_msg", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            protected ProgramInterface.InfoRec.InfoResponseInfo.InfoResponseCdMsg infoResponseCdMsg;

            /**
             * Gets the value of the accountInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.AccountInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public ProgramInterface.InfoRec.InfoResponseInfo.AccountInfo getAccountInfo() {
                return accountInfo;
            }

            /**
             * Sets the value of the accountInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.AccountInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public void setAccountInfo(ProgramInterface.InfoRec.InfoResponseInfo.AccountInfo value) {
                this.accountInfo = value;
            }

            /**
             * Gets the value of the routeInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.RouteInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public ProgramInterface.InfoRec.InfoResponseInfo.RouteInfo getRouteInfo() {
                return routeInfo;
            }

            /**
             * Sets the value of the routeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.RouteInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public void setRouteInfo(ProgramInterface.InfoRec.InfoResponseInfo.RouteInfo value) {
                this.routeInfo = value;
            }

            /**
             * Gets the value of the addressInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.AddressInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public ProgramInterface.InfoRec.InfoResponseInfo.AddressInfo getAddressInfo() {
                return addressInfo;
            }

            /**
             * Sets the value of the addressInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.AddressInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public void setAddressInfo(ProgramInterface.InfoRec.InfoResponseInfo.AddressInfo value) {
                this.addressInfo = value;
            }

            /**
             * Gets the value of the altAddressInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.AltAddressInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public ProgramInterface.InfoRec.InfoResponseInfo.AltAddressInfo getAltAddressInfo() {
                return altAddressInfo;
            }

            /**
             * Sets the value of the altAddressInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.AltAddressInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public void setAltAddressInfo(ProgramInterface.InfoRec.InfoResponseInfo.AltAddressInfo value) {
                this.altAddressInfo = value;
            }

            /**
             * Gets the value of the billAddressInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.BillAddressInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public ProgramInterface.InfoRec.InfoResponseInfo.BillAddressInfo getBillAddressInfo() {
                return billAddressInfo;
            }

            /**
             * Sets the value of the billAddressInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.BillAddressInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public void setBillAddressInfo(ProgramInterface.InfoRec.InfoResponseInfo.BillAddressInfo value) {
                this.billAddressInfo = value;
            }

            /**
             * Gets the value of the creditCardInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.CreditCardInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public ProgramInterface.InfoRec.InfoResponseInfo.CreditCardInfo getCreditCardInfo() {
                return creditCardInfo;
            }

            /**
             * Sets the value of the creditCardInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.CreditCardInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public void setCreditCardInfo(ProgramInterface.InfoRec.InfoResponseInfo.CreditCardInfo value) {
                this.creditCardInfo = value;
            }

            /**
             * Gets the value of the bankAccountInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.BankAccountInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public ProgramInterface.InfoRec.InfoResponseInfo.BankAccountInfo getBankAccountInfo() {
                return bankAccountInfo;
            }

            /**
             * Sets the value of the bankAccountInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.BankAccountInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public void setBankAccountInfo(ProgramInterface.InfoRec.InfoResponseInfo.BankAccountInfo value) {
                this.bankAccountInfo = value;
            }

            /**
             * Gets the value of the productInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.ProductInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public ProgramInterface.InfoRec.InfoResponseInfo.ProductInfo getProductInfo() {
                return productInfo;
            }

            /**
             * Sets the value of the productInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.ProductInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public void setProductInfo(ProgramInterface.InfoRec.InfoResponseInfo.ProductInfo value) {
                this.productInfo = value;
            }

            /**
             * Gets the value of the additionalDeliveryInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.AdditionalDeliveryInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public ProgramInterface.InfoRec.InfoResponseInfo.AdditionalDeliveryInfo getAdditionalDeliveryInfo() {
                return additionalDeliveryInfo;
            }

            /**
             * Sets the value of the additionalDeliveryInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.AdditionalDeliveryInfo }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public void setAdditionalDeliveryInfo(ProgramInterface.InfoRec.InfoResponseInfo.AdditionalDeliveryInfo value) {
                this.additionalDeliveryInfo = value;
            }

            /**
             * Gets the value of the infoResponseCdMsg property.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.InfoResponseCdMsg }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public ProgramInterface.InfoRec.InfoResponseInfo.InfoResponseCdMsg getInfoResponseCdMsg() {
                return infoResponseCdMsg;
            }

            /**
             * Sets the value of the infoResponseCdMsg property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.InfoRec.InfoResponseInfo.InfoResponseCdMsg }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public void setInfoResponseCdMsg(ProgramInterface.InfoRec.InfoResponseInfo.InfoResponseCdMsg value) {
                this.infoResponseCdMsg = value;
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
             *         &lt;element name="start_dt"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="account_nbr"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="9"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="account_stat"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="curr_balance"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="12"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="hd_dgt_tot_bal"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="12"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="last_pmt_date"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="last_payment_amt"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="12"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="dunn_level"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="1"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="dunn_lst_dun_dt"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="dunn_nxt_dun_dt"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="last_bill_date"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="next_bill_date"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="bill_freq"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="last_bill_amt"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="12"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="subs_type"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="cust_type"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="grp_acct_flg"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="1"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="parent_acct_nbr"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="9"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="sub_region"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="sub_area"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="sub_district"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="sub_depot"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="bill_type"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="1"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="print_inv_ind"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="1"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="nief_amt"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="7"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="nief_flag"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="1"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="bypass_dunn_days"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="max_bypass_days"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="bill_imm_flg"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="1"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="cost_center"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="4"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="digital_flag"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="1"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="digital_prod_table" maxOccurs="3" minOccurs="3"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="dgtl_prod_cd"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="2"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="dgtl_status"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="2"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="dgtl_promo_cd"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="4"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="dgtl_promo_code_desc"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="35"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="dgtl_promo_exp_dt"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="6"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="dgtl_curr_bal"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="9"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="dgtl_bill_from_dt"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="9"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="dgtl_bill_last_amt"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="9"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="dgtl_last_pmt_dt"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="6"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="dgtl_last_pmt_amt"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="9"/&gt;
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
                "startDt",
                "accountNbr",
                "accountStat",
                "currBalance",
                "hdDgtTotBal",
                "lastPmtDate",
                "lastPaymentAmt",
                "dunnLevel",
                "dunnLstDunDt",
                "dunnNxtDunDt",
                "lastBillDate",
                "nextBillDate",
                "billFreq",
                "lastBillAmt",
                "subsType",
                "custType",
                "grpAcctFlg",
                "parentAcctNbr",
                "subRegion",
                "subArea",
                "subDistrict",
                "subDepot",
                "billType",
                "printInvInd",
                "niefAmt",
                "niefFlag",
                "bypassDunnDays",
                "maxBypassDays",
                "billImmFlg",
                "costCenter",
                "digitalFlag",
                "digitalProdTable"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public static class AccountInfo {

                @XmlElement(name = "start_dt", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String startDt;
                @XmlElement(name = "account_nbr", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String accountNbr;
                @XmlElement(name = "account_stat", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String accountStat;
                @XmlElement(name = "curr_balance", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String currBalance;
                @XmlElement(name = "hd_dgt_tot_bal", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String hdDgtTotBal;
                @XmlElement(name = "last_pmt_date", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String lastPmtDate;
                @XmlElement(name = "last_payment_amt", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String lastPaymentAmt;
                @XmlElement(name = "dunn_level", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String dunnLevel;
                @XmlElement(name = "dunn_lst_dun_dt", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String dunnLstDunDt;
                @XmlElement(name = "dunn_nxt_dun_dt", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String dunnNxtDunDt;
                @XmlElement(name = "last_bill_date", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String lastBillDate;
                @XmlElement(name = "next_bill_date", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String nextBillDate;
                @XmlElement(name = "bill_freq", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String billFreq;
                @XmlElement(name = "last_bill_amt", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String lastBillAmt;
                @XmlElement(name = "subs_type", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String subsType;
                @XmlElement(name = "cust_type", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String custType;
                @XmlElement(name = "grp_acct_flg", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String grpAcctFlg;
                @XmlElement(name = "parent_acct_nbr", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String parentAcctNbr;
                @XmlElement(name = "sub_region", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String subRegion;
                @XmlElement(name = "sub_area", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String subArea;
                @XmlElement(name = "sub_district", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String subDistrict;
                @XmlElement(name = "sub_depot", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String subDepot;
                @XmlElement(name = "bill_type", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String billType;
                @XmlElement(name = "print_inv_ind", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String printInvInd;
                @XmlElement(name = "nief_amt", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String niefAmt;
                @XmlElement(name = "nief_flag", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String niefFlag;
                @XmlElement(name = "bypass_dunn_days", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String bypassDunnDays;
                @XmlElement(name = "max_bypass_days", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String maxBypassDays;
                @XmlElement(name = "bill_imm_flg", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String billImmFlg;
                @XmlElement(name = "cost_center", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String costCenter;
                @XmlElement(name = "digital_flag", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String digitalFlag;
                @XmlElement(name = "digital_prod_table", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected List<ProgramInterface.InfoRec.InfoResponseInfo.AccountInfo.DigitalProdTable> digitalProdTable;

                /**
                 * Gets the value of the startDt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getStartDt() {
                    return startDt;
                }

                /**
                 * Sets the value of the startDt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setStartDt(String value) {
                    this.startDt = value;
                }

                /**
                 * Gets the value of the accountNbr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAccountNbr() {
                    return accountNbr;
                }

                /**
                 * Sets the value of the accountNbr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAccountNbr(String value) {
                    this.accountNbr = value;
                }

                /**
                 * Gets the value of the accountStat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAccountStat() {
                    return accountStat;
                }

                /**
                 * Sets the value of the accountStat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAccountStat(String value) {
                    this.accountStat = value;
                }

                /**
                 * Gets the value of the currBalance property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getCurrBalance() {
                    return currBalance;
                }

                /**
                 * Sets the value of the currBalance property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setCurrBalance(String value) {
                    this.currBalance = value;
                }

                /**
                 * Gets the value of the hdDgtTotBal property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getHdDgtTotBal() {
                    return hdDgtTotBal;
                }

                /**
                 * Sets the value of the hdDgtTotBal property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setHdDgtTotBal(String value) {
                    this.hdDgtTotBal = value;
                }

                /**
                 * Gets the value of the lastPmtDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getLastPmtDate() {
                    return lastPmtDate;
                }

                /**
                 * Sets the value of the lastPmtDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setLastPmtDate(String value) {
                    this.lastPmtDate = value;
                }

                /**
                 * Gets the value of the lastPaymentAmt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getLastPaymentAmt() {
                    return lastPaymentAmt;
                }

                /**
                 * Sets the value of the lastPaymentAmt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setLastPaymentAmt(String value) {
                    this.lastPaymentAmt = value;
                }

                /**
                 * Gets the value of the dunnLevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getDunnLevel() {
                    return dunnLevel;
                }

                /**
                 * Sets the value of the dunnLevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setDunnLevel(String value) {
                    this.dunnLevel = value;
                }

                /**
                 * Gets the value of the dunnLstDunDt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getDunnLstDunDt() {
                    return dunnLstDunDt;
                }

                /**
                 * Sets the value of the dunnLstDunDt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setDunnLstDunDt(String value) {
                    this.dunnLstDunDt = value;
                }

                /**
                 * Gets the value of the dunnNxtDunDt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getDunnNxtDunDt() {
                    return dunnNxtDunDt;
                }

                /**
                 * Sets the value of the dunnNxtDunDt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setDunnNxtDunDt(String value) {
                    this.dunnNxtDunDt = value;
                }

                /**
                 * Gets the value of the lastBillDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getLastBillDate() {
                    return lastBillDate;
                }

                /**
                 * Sets the value of the lastBillDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setLastBillDate(String value) {
                    this.lastBillDate = value;
                }

                /**
                 * Gets the value of the nextBillDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getNextBillDate() {
                    return nextBillDate;
                }

                /**
                 * Sets the value of the nextBillDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setNextBillDate(String value) {
                    this.nextBillDate = value;
                }

                /**
                 * Gets the value of the billFreq property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBillFreq() {
                    return billFreq;
                }

                /**
                 * Sets the value of the billFreq property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBillFreq(String value) {
                    this.billFreq = value;
                }

                /**
                 * Gets the value of the lastBillAmt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getLastBillAmt() {
                    return lastBillAmt;
                }

                /**
                 * Sets the value of the lastBillAmt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setLastBillAmt(String value) {
                    this.lastBillAmt = value;
                }

                /**
                 * Gets the value of the subsType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getSubsType() {
                    return subsType;
                }

                /**
                 * Sets the value of the subsType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setSubsType(String value) {
                    this.subsType = value;
                }

                /**
                 * Gets the value of the custType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getCustType() {
                    return custType;
                }

                /**
                 * Sets the value of the custType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setCustType(String value) {
                    this.custType = value;
                }

                /**
                 * Gets the value of the grpAcctFlg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getGrpAcctFlg() {
                    return grpAcctFlg;
                }

                /**
                 * Sets the value of the grpAcctFlg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setGrpAcctFlg(String value) {
                    this.grpAcctFlg = value;
                }

                /**
                 * Gets the value of the parentAcctNbr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getParentAcctNbr() {
                    return parentAcctNbr;
                }

                /**
                 * Sets the value of the parentAcctNbr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setParentAcctNbr(String value) {
                    this.parentAcctNbr = value;
                }

                /**
                 * Gets the value of the subRegion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getSubRegion() {
                    return subRegion;
                }

                /**
                 * Sets the value of the subRegion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setSubRegion(String value) {
                    this.subRegion = value;
                }

                /**
                 * Gets the value of the subArea property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getSubArea() {
                    return subArea;
                }

                /**
                 * Sets the value of the subArea property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setSubArea(String value) {
                    this.subArea = value;
                }

                /**
                 * Gets the value of the subDistrict property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getSubDistrict() {
                    return subDistrict;
                }

                /**
                 * Sets the value of the subDistrict property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setSubDistrict(String value) {
                    this.subDistrict = value;
                }

                /**
                 * Gets the value of the subDepot property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getSubDepot() {
                    return subDepot;
                }

                /**
                 * Sets the value of the subDepot property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setSubDepot(String value) {
                    this.subDepot = value;
                }

                /**
                 * Gets the value of the billType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBillType() {
                    return billType;
                }

                /**
                 * Sets the value of the billType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBillType(String value) {
                    this.billType = value;
                }

                /**
                 * Gets the value of the printInvInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getPrintInvInd() {
                    return printInvInd;
                }

                /**
                 * Sets the value of the printInvInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setPrintInvInd(String value) {
                    this.printInvInd = value;
                }

                /**
                 * Gets the value of the niefAmt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getNiefAmt() {
                    return niefAmt;
                }

                /**
                 * Sets the value of the niefAmt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setNiefAmt(String value) {
                    this.niefAmt = value;
                }

                /**
                 * Gets the value of the niefFlag property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getNiefFlag() {
                    return niefFlag;
                }

                /**
                 * Sets the value of the niefFlag property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setNiefFlag(String value) {
                    this.niefFlag = value;
                }

                /**
                 * Gets the value of the bypassDunnDays property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBypassDunnDays() {
                    return bypassDunnDays;
                }

                /**
                 * Sets the value of the bypassDunnDays property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBypassDunnDays(String value) {
                    this.bypassDunnDays = value;
                }

                /**
                 * Gets the value of the maxBypassDays property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getMaxBypassDays() {
                    return maxBypassDays;
                }

                /**
                 * Sets the value of the maxBypassDays property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setMaxBypassDays(String value) {
                    this.maxBypassDays = value;
                }

                /**
                 * Gets the value of the billImmFlg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBillImmFlg() {
                    return billImmFlg;
                }

                /**
                 * Sets the value of the billImmFlg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBillImmFlg(String value) {
                    this.billImmFlg = value;
                }

                /**
                 * Gets the value of the costCenter property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getCostCenter() {
                    return costCenter;
                }

                /**
                 * Sets the value of the costCenter property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setCostCenter(String value) {
                    this.costCenter = value;
                }

                /**
                 * Gets the value of the digitalFlag property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getDigitalFlag() {
                    return digitalFlag;
                }

                /**
                 * Sets the value of the digitalFlag property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setDigitalFlag(String value) {
                    this.digitalFlag = value;
                }

                /**
                 * Gets the value of the digitalProdTable property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the digitalProdTable property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDigitalProdTable().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ProgramInterface.InfoRec.InfoResponseInfo.AccountInfo.DigitalProdTable }
                 * 
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public List<ProgramInterface.InfoRec.InfoResponseInfo.AccountInfo.DigitalProdTable> getDigitalProdTable() {
                    if (digitalProdTable == null) {
                        digitalProdTable = new ArrayList<ProgramInterface.InfoRec.InfoResponseInfo.AccountInfo.DigitalProdTable>();
                    }
                    return this.digitalProdTable;
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
                 *         &lt;element name="dgtl_prod_cd"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="2"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="dgtl_status"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="2"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="dgtl_promo_cd"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="4"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="dgtl_promo_code_desc"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="35"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="dgtl_promo_exp_dt"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="6"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="dgtl_curr_bal"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="9"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="dgtl_bill_from_dt"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="9"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="dgtl_bill_last_amt"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="9"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="dgtl_last_pmt_dt"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="6"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="dgtl_last_pmt_amt"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="9"/&gt;
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
                    "dgtlProdCd",
                    "dgtlStatus",
                    "dgtlPromoCd",
                    "dgtlPromoCodeDesc",
                    "dgtlPromoExpDt",
                    "dgtlCurrBal",
                    "dgtlBillFromDt",
                    "dgtlBillLastAmt",
                    "dgtlLastPmtDt",
                    "dgtlLastPmtAmt"
                })
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public static class DigitalProdTable {

                    @XmlElement(name = "dgtl_prod_cd", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    protected String dgtlProdCd;
                    @XmlElement(name = "dgtl_status", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    protected String dgtlStatus;
                    @XmlElement(name = "dgtl_promo_cd", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    protected String dgtlPromoCd;
                    @XmlElement(name = "dgtl_promo_code_desc", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    protected String dgtlPromoCodeDesc;
                    @XmlElement(name = "dgtl_promo_exp_dt", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    protected String dgtlPromoExpDt;
                    @XmlElement(name = "dgtl_curr_bal", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    protected String dgtlCurrBal;
                    @XmlElement(name = "dgtl_bill_from_dt", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    protected String dgtlBillFromDt;
                    @XmlElement(name = "dgtl_bill_last_amt", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    protected String dgtlBillLastAmt;
                    @XmlElement(name = "dgtl_last_pmt_dt", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    protected String dgtlLastPmtDt;
                    @XmlElement(name = "dgtl_last_pmt_amt", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    protected String dgtlLastPmtAmt;

                    /**
                     * Gets the value of the dgtlProdCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public String getDgtlProdCd() {
                        return dgtlProdCd;
                    }

                    /**
                     * Sets the value of the dgtlProdCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public void setDgtlProdCd(String value) {
                        this.dgtlProdCd = value;
                    }

                    /**
                     * Gets the value of the dgtlStatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public String getDgtlStatus() {
                        return dgtlStatus;
                    }

                    /**
                     * Sets the value of the dgtlStatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public void setDgtlStatus(String value) {
                        this.dgtlStatus = value;
                    }

                    /**
                     * Gets the value of the dgtlPromoCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public String getDgtlPromoCd() {
                        return dgtlPromoCd;
                    }

                    /**
                     * Sets the value of the dgtlPromoCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public void setDgtlPromoCd(String value) {
                        this.dgtlPromoCd = value;
                    }

                    /**
                     * Gets the value of the dgtlPromoCodeDesc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public String getDgtlPromoCodeDesc() {
                        return dgtlPromoCodeDesc;
                    }

                    /**
                     * Sets the value of the dgtlPromoCodeDesc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public void setDgtlPromoCodeDesc(String value) {
                        this.dgtlPromoCodeDesc = value;
                    }

                    /**
                     * Gets the value of the dgtlPromoExpDt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public String getDgtlPromoExpDt() {
                        return dgtlPromoExpDt;
                    }

                    /**
                     * Sets the value of the dgtlPromoExpDt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public void setDgtlPromoExpDt(String value) {
                        this.dgtlPromoExpDt = value;
                    }

                    /**
                     * Gets the value of the dgtlCurrBal property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public String getDgtlCurrBal() {
                        return dgtlCurrBal;
                    }

                    /**
                     * Sets the value of the dgtlCurrBal property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public void setDgtlCurrBal(String value) {
                        this.dgtlCurrBal = value;
                    }

                    /**
                     * Gets the value of the dgtlBillFromDt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public String getDgtlBillFromDt() {
                        return dgtlBillFromDt;
                    }

                    /**
                     * Sets the value of the dgtlBillFromDt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public void setDgtlBillFromDt(String value) {
                        this.dgtlBillFromDt = value;
                    }

                    /**
                     * Gets the value of the dgtlBillLastAmt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public String getDgtlBillLastAmt() {
                        return dgtlBillLastAmt;
                    }

                    /**
                     * Sets the value of the dgtlBillLastAmt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public void setDgtlBillLastAmt(String value) {
                        this.dgtlBillLastAmt = value;
                    }

                    /**
                     * Gets the value of the dgtlLastPmtDt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public String getDgtlLastPmtDt() {
                        return dgtlLastPmtDt;
                    }

                    /**
                     * Sets the value of the dgtlLastPmtDt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public void setDgtlLastPmtDt(String value) {
                        this.dgtlLastPmtDt = value;
                    }

                    /**
                     * Gets the value of the dgtlLastPmtAmt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public String getDgtlLastPmtAmt() {
                        return dgtlLastPmtAmt;
                    }

                    /**
                     * Sets the value of the dgtlLastPmtAmt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public void setDgtlLastPmtAmt(String value) {
                        this.dgtlLastPmtAmt = value;
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
             *         &lt;element name="recovery_time"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="4"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="recovery_route_ind"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="1"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="stop_lead_days"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="restart_lead_days"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="start_lead_days"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="stop_asap_date"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="delivery_time"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="4"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="rte_depot_alert_time"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="13"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="rte_depot_alert_msg"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="50"/&gt;
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
                "recoveryTime",
                "recoveryRouteInd",
                "stopLeadDays",
                "restartLeadDays",
                "startLeadDays",
                "stopAsapDate",
                "deliveryTime",
                "rteDepotAlertTime",
                "rteDepotAlertMsg"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public static class AdditionalDeliveryInfo {

                @XmlElement(name = "recovery_time", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String recoveryTime;
                @XmlElement(name = "recovery_route_ind", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String recoveryRouteInd;
                @XmlElement(name = "stop_lead_days", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String stopLeadDays;
                @XmlElement(name = "restart_lead_days", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String restartLeadDays;
                @XmlElement(name = "start_lead_days", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String startLeadDays;
                @XmlElement(name = "stop_asap_date", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String stopAsapDate;
                @XmlElement(name = "delivery_time", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String deliveryTime;
                @XmlElement(name = "rte_depot_alert_time", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String rteDepotAlertTime;
                @XmlElement(name = "rte_depot_alert_msg", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String rteDepotAlertMsg;

                /**
                 * Gets the value of the recoveryTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getRecoveryTime() {
                    return recoveryTime;
                }

                /**
                 * Sets the value of the recoveryTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setRecoveryTime(String value) {
                    this.recoveryTime = value;
                }

                /**
                 * Gets the value of the recoveryRouteInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getRecoveryRouteInd() {
                    return recoveryRouteInd;
                }

                /**
                 * Sets the value of the recoveryRouteInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setRecoveryRouteInd(String value) {
                    this.recoveryRouteInd = value;
                }

                /**
                 * Gets the value of the stopLeadDays property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getStopLeadDays() {
                    return stopLeadDays;
                }

                /**
                 * Sets the value of the stopLeadDays property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setStopLeadDays(String value) {
                    this.stopLeadDays = value;
                }

                /**
                 * Gets the value of the restartLeadDays property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getRestartLeadDays() {
                    return restartLeadDays;
                }

                /**
                 * Sets the value of the restartLeadDays property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setRestartLeadDays(String value) {
                    this.restartLeadDays = value;
                }

                /**
                 * Gets the value of the startLeadDays property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getStartLeadDays() {
                    return startLeadDays;
                }

                /**
                 * Sets the value of the startLeadDays property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setStartLeadDays(String value) {
                    this.startLeadDays = value;
                }

                /**
                 * Gets the value of the stopAsapDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getStopAsapDate() {
                    return stopAsapDate;
                }

                /**
                 * Sets the value of the stopAsapDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setStopAsapDate(String value) {
                    this.stopAsapDate = value;
                }

                /**
                 * Gets the value of the deliveryTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getDeliveryTime() {
                    return deliveryTime;
                }

                /**
                 * Sets the value of the deliveryTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setDeliveryTime(String value) {
                    this.deliveryTime = value;
                }

                /**
                 * Gets the value of the rteDepotAlertTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getRteDepotAlertTime() {
                    return rteDepotAlertTime;
                }

                /**
                 * Sets the value of the rteDepotAlertTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setRteDepotAlertTime(String value) {
                    this.rteDepotAlertTime = value;
                }

                /**
                 * Gets the value of the rteDepotAlertMsg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getRteDepotAlertMsg() {
                    return rteDepotAlertMsg;
                }

                /**
                 * Sets the value of the rteDepotAlertMsg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setRteDepotAlertMsg(String value) {
                    this.rteDepotAlertMsg = value;
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
             *         &lt;element name="spec_inst"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="50"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="last_name"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="20"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="first_name"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="20"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="care_of"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="22"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="street_no"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="9"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="prefix"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="street"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="16"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="suffix"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="dir_suffix"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="apt_no"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="building_no"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="5"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="build_accs_code"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="city"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="21"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="state"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="postal_cd"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="5"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="zip_extn"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="4"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="country_code_5"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="country_cd_zero"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="2"/&gt;
             *                         &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="country_cd"&gt;
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
             *         &lt;element name="pobox"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="10"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="other_info"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="10"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="for_other_tag_ms"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="7"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="for_building_ms"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="10"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="for_floor_ms"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="10"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="for_postal_code_ms"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="9"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="for_address1"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="25"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="for_address2"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="25"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="home_phone"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="10"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="email_addr"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="38"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="optin"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="1"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="bus_phone"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="10"/&gt;
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
                "specInst",
                "lastName",
                "firstName",
                "careOf",
                "streetNo",
                "prefix",
                "street",
                "suffix",
                "dirSuffix",
                "aptNo",
                "buildingNo",
                "buildAccsCode",
                "city",
                "state",
                "postalCd",
                "zipExtn",
                "countryCode5",
                "pobox",
                "otherInfo",
                "forOtherTagMs",
                "forBuildingMs",
                "forFloorMs",
                "forPostalCodeMs",
                "forAddress1",
                "forAddress2",
                "homePhone",
                "emailAddr",
                "optin",
                "busPhone"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public static class AddressInfo {

                @XmlElement(name = "spec_inst", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String specInst;
                @XmlElement(name = "last_name", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String lastName;
                @XmlElement(name = "first_name", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String firstName;
                @XmlElement(name = "care_of", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String careOf;
                @XmlElement(name = "street_no", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String streetNo;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String prefix;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String street;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String suffix;
                @XmlElement(name = "dir_suffix", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String dirSuffix;
                @XmlElement(name = "apt_no", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String aptNo;
                @XmlElement(name = "building_no", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String buildingNo;
                @XmlElement(name = "build_accs_code", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String buildAccsCode;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String city;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String state;
                @XmlElement(name = "postal_cd", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String postalCd;
                @XmlElement(name = "zip_extn", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String zipExtn;
                @XmlElement(name = "country_code_5", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected ProgramInterface.InfoRec.InfoResponseInfo.AddressInfo.CountryCode5 countryCode5;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String pobox;
                @XmlElement(name = "other_info", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String otherInfo;
                @XmlElement(name = "for_other_tag_ms", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String forOtherTagMs;
                @XmlElement(name = "for_building_ms", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String forBuildingMs;
                @XmlElement(name = "for_floor_ms", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String forFloorMs;
                @XmlElement(name = "for_postal_code_ms", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String forPostalCodeMs;
                @XmlElement(name = "for_address1", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String forAddress1;
                @XmlElement(name = "for_address2", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String forAddress2;
                @XmlElement(name = "home_phone", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String homePhone;
                @XmlElement(name = "email_addr", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String emailAddr;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String optin;
                @XmlElement(name = "bus_phone", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String busPhone;

                /**
                 * Gets the value of the specInst property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getSpecInst() {
                    return specInst;
                }

                /**
                 * Sets the value of the specInst property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setSpecInst(String value) {
                    this.specInst = value;
                }

                /**
                 * Gets the value of the lastName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getLastName() {
                    return lastName;
                }

                /**
                 * Sets the value of the lastName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setLastName(String value) {
                    this.lastName = value;
                }

                /**
                 * Gets the value of the firstName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getFirstName() {
                    return firstName;
                }

                /**
                 * Sets the value of the firstName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setFirstName(String value) {
                    this.firstName = value;
                }

                /**
                 * Gets the value of the careOf property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getCareOf() {
                    return careOf;
                }

                /**
                 * Sets the value of the careOf property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setCareOf(String value) {
                    this.careOf = value;
                }

                /**
                 * Gets the value of the streetNo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getStreetNo() {
                    return streetNo;
                }

                /**
                 * Sets the value of the streetNo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setStreetNo(String value) {
                    this.streetNo = value;
                }

                /**
                 * Gets the value of the prefix property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getPrefix() {
                    return prefix;
                }

                /**
                 * Sets the value of the prefix property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setPrefix(String value) {
                    this.prefix = value;
                }

                /**
                 * Gets the value of the street property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getStreet() {
                    return street;
                }

                /**
                 * Sets the value of the street property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setStreet(String value) {
                    this.street = value;
                }

                /**
                 * Gets the value of the suffix property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getSuffix() {
                    return suffix;
                }

                /**
                 * Sets the value of the suffix property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setSuffix(String value) {
                    this.suffix = value;
                }

                /**
                 * Gets the value of the dirSuffix property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getDirSuffix() {
                    return dirSuffix;
                }

                /**
                 * Sets the value of the dirSuffix property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setDirSuffix(String value) {
                    this.dirSuffix = value;
                }

                /**
                 * Gets the value of the aptNo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAptNo() {
                    return aptNo;
                }

                /**
                 * Sets the value of the aptNo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAptNo(String value) {
                    this.aptNo = value;
                }

                /**
                 * Gets the value of the buildingNo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBuildingNo() {
                    return buildingNo;
                }

                /**
                 * Sets the value of the buildingNo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBuildingNo(String value) {
                    this.buildingNo = value;
                }

                /**
                 * Gets the value of the buildAccsCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBuildAccsCode() {
                    return buildAccsCode;
                }

                /**
                 * Sets the value of the buildAccsCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBuildAccsCode(String value) {
                    this.buildAccsCode = value;
                }

                /**
                 * Gets the value of the city property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getCity() {
                    return city;
                }

                /**
                 * Sets the value of the city property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setCity(String value) {
                    this.city = value;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setState(String value) {
                    this.state = value;
                }

                /**
                 * Gets the value of the postalCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getPostalCd() {
                    return postalCd;
                }

                /**
                 * Sets the value of the postalCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setPostalCd(String value) {
                    this.postalCd = value;
                }

                /**
                 * Gets the value of the zipExtn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getZipExtn() {
                    return zipExtn;
                }

                /**
                 * Sets the value of the zipExtn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setZipExtn(String value) {
                    this.zipExtn = value;
                }

                /**
                 * Gets the value of the countryCode5 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProgramInterface.InfoRec.InfoResponseInfo.AddressInfo.CountryCode5 }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public ProgramInterface.InfoRec.InfoResponseInfo.AddressInfo.CountryCode5 getCountryCode5() {
                    return countryCode5;
                }

                /**
                 * Sets the value of the countryCode5 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProgramInterface.InfoRec.InfoResponseInfo.AddressInfo.CountryCode5 }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setCountryCode5(ProgramInterface.InfoRec.InfoResponseInfo.AddressInfo.CountryCode5 value) {
                    this.countryCode5 = value;
                }

                /**
                 * Gets the value of the pobox property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getPobox() {
                    return pobox;
                }

                /**
                 * Sets the value of the pobox property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setPobox(String value) {
                    this.pobox = value;
                }

                /**
                 * Gets the value of the otherInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getOtherInfo() {
                    return otherInfo;
                }

                /**
                 * Sets the value of the otherInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setOtherInfo(String value) {
                    this.otherInfo = value;
                }

                /**
                 * Gets the value of the forOtherTagMs property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getForOtherTagMs() {
                    return forOtherTagMs;
                }

                /**
                 * Sets the value of the forOtherTagMs property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setForOtherTagMs(String value) {
                    this.forOtherTagMs = value;
                }

                /**
                 * Gets the value of the forBuildingMs property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getForBuildingMs() {
                    return forBuildingMs;
                }

                /**
                 * Sets the value of the forBuildingMs property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setForBuildingMs(String value) {
                    this.forBuildingMs = value;
                }

                /**
                 * Gets the value of the forFloorMs property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getForFloorMs() {
                    return forFloorMs;
                }

                /**
                 * Sets the value of the forFloorMs property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setForFloorMs(String value) {
                    this.forFloorMs = value;
                }

                /**
                 * Gets the value of the forPostalCodeMs property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getForPostalCodeMs() {
                    return forPostalCodeMs;
                }

                /**
                 * Sets the value of the forPostalCodeMs property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setForPostalCodeMs(String value) {
                    this.forPostalCodeMs = value;
                }

                /**
                 * Gets the value of the forAddress1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getForAddress1() {
                    return forAddress1;
                }

                /**
                 * Sets the value of the forAddress1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setForAddress1(String value) {
                    this.forAddress1 = value;
                }

                /**
                 * Gets the value of the forAddress2 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getForAddress2() {
                    return forAddress2;
                }

                /**
                 * Sets the value of the forAddress2 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setForAddress2(String value) {
                    this.forAddress2 = value;
                }

                /**
                 * Gets the value of the homePhone property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getHomePhone() {
                    return homePhone;
                }

                /**
                 * Sets the value of the homePhone property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setHomePhone(String value) {
                    this.homePhone = value;
                }

                /**
                 * Gets the value of the emailAddr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getEmailAddr() {
                    return emailAddr;
                }

                /**
                 * Sets the value of the emailAddr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setEmailAddr(String value) {
                    this.emailAddr = value;
                }

                /**
                 * Gets the value of the optin property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getOptin() {
                    return optin;
                }

                /**
                 * Sets the value of the optin property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setOptin(String value) {
                    this.optin = value;
                }

                /**
                 * Gets the value of the busPhone property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBusPhone() {
                    return busPhone;
                }

                /**
                 * Sets the value of the busPhone property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBusPhone(String value) {
                    this.busPhone = value;
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
                 *         &lt;element name="country_cd_zero"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="2"/&gt;
                 *               &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="country_cd"&gt;
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
                    "countryCdZero",
                    "countryCd"
                })
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public static class CountryCode5 {

                    @XmlElement(name = "country_cd_zero", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    protected String countryCdZero;
                    @XmlElement(name = "country_cd", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    protected String countryCd;

                    /**
                     * Gets the value of the countryCdZero property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public String getCountryCdZero() {
                        return countryCdZero;
                    }

                    /**
                     * Sets the value of the countryCdZero property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public void setCountryCdZero(String value) {
                        this.countryCdZero = value;
                    }

                    /**
                     * Gets the value of the countryCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public String getCountryCd() {
                        return countryCd;
                    }

                    /**
                     * Sets the value of the countryCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                    public void setCountryCd(String value) {
                        this.countryCd = value;
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
             *         &lt;element name="alt_su_state"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_st_name"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="16"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_sufx"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_dir_sufx"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_zip_cd_5"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="5"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_zip_4"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="4"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_prfx"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_st_num"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="9"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_apt"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_building"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_building_access_code"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_city"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="21"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_cnty"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_country_cd"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_sub_tel_num"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="10"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_from_date"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_thru_date"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="alt_su_product"&gt;
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
                "altSuState",
                "altSuStName",
                "altSuSufx",
                "altSuDirSufx",
                "altSuZipCd5",
                "altSuZip4",
                "altSuPrfx",
                "altSuStNum",
                "altSuApt",
                "altSuBuilding",
                "altSuBuildingAccessCode",
                "altSuCity",
                "altSuCnty",
                "altSuCountryCd",
                "altSuSubTelNum",
                "altSuFromDate",
                "altSuThruDate",
                "altSuProduct"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public static class AltAddressInfo {

                @XmlElement(name = "alt_su_state", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuState;
                @XmlElement(name = "alt_su_st_name", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuStName;
                @XmlElement(name = "alt_su_sufx", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuSufx;
                @XmlElement(name = "alt_su_dir_sufx", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuDirSufx;
                @XmlElement(name = "alt_su_zip_cd_5", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuZipCd5;
                @XmlElement(name = "alt_su_zip_4", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuZip4;
                @XmlElement(name = "alt_su_prfx", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuPrfx;
                @XmlElement(name = "alt_su_st_num", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuStNum;
                @XmlElement(name = "alt_su_apt", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuApt;
                @XmlElement(name = "alt_su_building", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuBuilding;
                @XmlElement(name = "alt_su_building_access_code", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuBuildingAccessCode;
                @XmlElement(name = "alt_su_city", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuCity;
                @XmlElement(name = "alt_su_cnty", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuCnty;
                @XmlElement(name = "alt_su_country_cd", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuCountryCd;
                @XmlElement(name = "alt_su_sub_tel_num", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuSubTelNum;
                @XmlElement(name = "alt_su_from_date", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuFromDate;
                @XmlElement(name = "alt_su_thru_date", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuThruDate;
                @XmlElement(name = "alt_su_product", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String altSuProduct;

                /**
                 * Gets the value of the altSuState property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuState() {
                    return altSuState;
                }

                /**
                 * Sets the value of the altSuState property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuState(String value) {
                    this.altSuState = value;
                }

                /**
                 * Gets the value of the altSuStName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuStName() {
                    return altSuStName;
                }

                /**
                 * Sets the value of the altSuStName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuStName(String value) {
                    this.altSuStName = value;
                }

                /**
                 * Gets the value of the altSuSufx property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuSufx() {
                    return altSuSufx;
                }

                /**
                 * Sets the value of the altSuSufx property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuSufx(String value) {
                    this.altSuSufx = value;
                }

                /**
                 * Gets the value of the altSuDirSufx property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuDirSufx() {
                    return altSuDirSufx;
                }

                /**
                 * Sets the value of the altSuDirSufx property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuDirSufx(String value) {
                    this.altSuDirSufx = value;
                }

                /**
                 * Gets the value of the altSuZipCd5 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuZipCd5() {
                    return altSuZipCd5;
                }

                /**
                 * Sets the value of the altSuZipCd5 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuZipCd5(String value) {
                    this.altSuZipCd5 = value;
                }

                /**
                 * Gets the value of the altSuZip4 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuZip4() {
                    return altSuZip4;
                }

                /**
                 * Sets the value of the altSuZip4 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuZip4(String value) {
                    this.altSuZip4 = value;
                }

                /**
                 * Gets the value of the altSuPrfx property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuPrfx() {
                    return altSuPrfx;
                }

                /**
                 * Sets the value of the altSuPrfx property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuPrfx(String value) {
                    this.altSuPrfx = value;
                }

                /**
                 * Gets the value of the altSuStNum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuStNum() {
                    return altSuStNum;
                }

                /**
                 * Sets the value of the altSuStNum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuStNum(String value) {
                    this.altSuStNum = value;
                }

                /**
                 * Gets the value of the altSuApt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuApt() {
                    return altSuApt;
                }

                /**
                 * Sets the value of the altSuApt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuApt(String value) {
                    this.altSuApt = value;
                }

                /**
                 * Gets the value of the altSuBuilding property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuBuilding() {
                    return altSuBuilding;
                }

                /**
                 * Sets the value of the altSuBuilding property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuBuilding(String value) {
                    this.altSuBuilding = value;
                }

                /**
                 * Gets the value of the altSuBuildingAccessCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuBuildingAccessCode() {
                    return altSuBuildingAccessCode;
                }

                /**
                 * Sets the value of the altSuBuildingAccessCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuBuildingAccessCode(String value) {
                    this.altSuBuildingAccessCode = value;
                }

                /**
                 * Gets the value of the altSuCity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuCity() {
                    return altSuCity;
                }

                /**
                 * Sets the value of the altSuCity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuCity(String value) {
                    this.altSuCity = value;
                }

                /**
                 * Gets the value of the altSuCnty property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuCnty() {
                    return altSuCnty;
                }

                /**
                 * Sets the value of the altSuCnty property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuCnty(String value) {
                    this.altSuCnty = value;
                }

                /**
                 * Gets the value of the altSuCountryCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuCountryCd() {
                    return altSuCountryCd;
                }

                /**
                 * Sets the value of the altSuCountryCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuCountryCd(String value) {
                    this.altSuCountryCd = value;
                }

                /**
                 * Gets the value of the altSuSubTelNum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuSubTelNum() {
                    return altSuSubTelNum;
                }

                /**
                 * Sets the value of the altSuSubTelNum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuSubTelNum(String value) {
                    this.altSuSubTelNum = value;
                }

                /**
                 * Gets the value of the altSuFromDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuFromDate() {
                    return altSuFromDate;
                }

                /**
                 * Sets the value of the altSuFromDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuFromDate(String value) {
                    this.altSuFromDate = value;
                }

                /**
                 * Gets the value of the altSuThruDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuThruDate() {
                    return altSuThruDate;
                }

                /**
                 * Sets the value of the altSuThruDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuThruDate(String value) {
                    this.altSuThruDate = value;
                }

                /**
                 * Gets the value of the altSuProduct property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getAltSuProduct() {
                    return altSuProduct;
                }

                /**
                 * Sets the value of the altSuProduct property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setAltSuProduct(String value) {
                    this.altSuProduct = value;
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
             *         &lt;element name="bank_acct_no"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="17"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="bank_rout_no"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="9"/&gt;
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
                "bankAcctNo",
                "bankRoutNo"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public static class BankAccountInfo {

                @XmlElement(name = "bank_acct_no", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String bankAcctNo;
                @XmlElement(name = "bank_rout_no", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String bankRoutNo;

                /**
                 * Gets the value of the bankAcctNo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBankAcctNo() {
                    return bankAcctNo;
                }

                /**
                 * Sets the value of the bankAcctNo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBankAcctNo(String value) {
                    this.bankAcctNo = value;
                }

                /**
                 * Gets the value of the bankRoutNo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBankRoutNo() {
                    return bankRoutNo;
                }

                /**
                 * Sets the value of the bankRoutNo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBankRoutNo(String value) {
                    this.bankRoutNo = value;
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
             *         &lt;element name="bill_last_nme"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="20"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="bill_first_nme"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="20"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="bill_care_of"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="30"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="bill_city"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="22"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="bill_state"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="bill_for_postal_cd"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="9"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="bill_postal_zip_cd"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="5"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="bill_zip_extn"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="4"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="bill_cntry_cd"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="5"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="bill_address1"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="30"/&gt;
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
                "billLastNme",
                "billFirstNme",
                "billCareOf",
                "billCity",
                "billState",
                "billForPostalCd",
                "billPostalZipCd",
                "billZipExtn",
                "billCntryCd",
                "billAddress1"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public static class BillAddressInfo {

                @XmlElement(name = "bill_last_nme", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String billLastNme;
                @XmlElement(name = "bill_first_nme", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String billFirstNme;
                @XmlElement(name = "bill_care_of", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String billCareOf;
                @XmlElement(name = "bill_city", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String billCity;
                @XmlElement(name = "bill_state", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String billState;
                @XmlElement(name = "bill_for_postal_cd", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String billForPostalCd;
                @XmlElement(name = "bill_postal_zip_cd", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String billPostalZipCd;
                @XmlElement(name = "bill_zip_extn", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String billZipExtn;
                @XmlElement(name = "bill_cntry_cd", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String billCntryCd;
                @XmlElement(name = "bill_address1", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String billAddress1;

                /**
                 * Gets the value of the billLastNme property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBillLastNme() {
                    return billLastNme;
                }

                /**
                 * Sets the value of the billLastNme property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBillLastNme(String value) {
                    this.billLastNme = value;
                }

                /**
                 * Gets the value of the billFirstNme property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBillFirstNme() {
                    return billFirstNme;
                }

                /**
                 * Sets the value of the billFirstNme property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBillFirstNme(String value) {
                    this.billFirstNme = value;
                }

                /**
                 * Gets the value of the billCareOf property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBillCareOf() {
                    return billCareOf;
                }

                /**
                 * Sets the value of the billCareOf property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBillCareOf(String value) {
                    this.billCareOf = value;
                }

                /**
                 * Gets the value of the billCity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBillCity() {
                    return billCity;
                }

                /**
                 * Sets the value of the billCity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBillCity(String value) {
                    this.billCity = value;
                }

                /**
                 * Gets the value of the billState property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBillState() {
                    return billState;
                }

                /**
                 * Sets the value of the billState property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBillState(String value) {
                    this.billState = value;
                }

                /**
                 * Gets the value of the billForPostalCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBillForPostalCd() {
                    return billForPostalCd;
                }

                /**
                 * Sets the value of the billForPostalCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBillForPostalCd(String value) {
                    this.billForPostalCd = value;
                }

                /**
                 * Gets the value of the billPostalZipCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBillPostalZipCd() {
                    return billPostalZipCd;
                }

                /**
                 * Sets the value of the billPostalZipCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBillPostalZipCd(String value) {
                    this.billPostalZipCd = value;
                }

                /**
                 * Gets the value of the billZipExtn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBillZipExtn() {
                    return billZipExtn;
                }

                /**
                 * Sets the value of the billZipExtn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBillZipExtn(String value) {
                    this.billZipExtn = value;
                }

                /**
                 * Gets the value of the billCntryCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBillCntryCd() {
                    return billCntryCd;
                }

                /**
                 * Sets the value of the billCntryCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBillCntryCd(String value) {
                    this.billCntryCd = value;
                }

                /**
                 * Gets the value of the billAddress1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getBillAddress1() {
                    return billAddress1;
                }

                /**
                 * Sets the value of the billAddress1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setBillAddress1(String value) {
                    this.billAddress1 = value;
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
             *         &lt;element name="cc_type"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="cc_number"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="16"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="cc_exp_month"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="cc_exp_year"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="pay_by_cc_flg"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="1"/&gt;
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
                "ccType",
                "ccNumber",
                "ccExpMonth",
                "ccExpYear",
                "payByCcFlg"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public static class CreditCardInfo {

                @XmlElement(name = "cc_type", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String ccType;
                @XmlElement(name = "cc_number", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String ccNumber;
                @XmlElement(name = "cc_exp_month", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String ccExpMonth;
                @XmlElement(name = "cc_exp_year", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String ccExpYear;
                @XmlElement(name = "pay_by_cc_flg", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String payByCcFlg;

                /**
                 * Gets the value of the ccType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getCcType() {
                    return ccType;
                }

                /**
                 * Sets the value of the ccType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setCcType(String value) {
                    this.ccType = value;
                }

                /**
                 * Gets the value of the ccNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getCcNumber() {
                    return ccNumber;
                }

                /**
                 * Sets the value of the ccNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setCcNumber(String value) {
                    this.ccNumber = value;
                }

                /**
                 * Gets the value of the ccExpMonth property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getCcExpMonth() {
                    return ccExpMonth;
                }

                /**
                 * Sets the value of the ccExpMonth property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setCcExpMonth(String value) {
                    this.ccExpMonth = value;
                }

                /**
                 * Gets the value of the ccExpYear property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getCcExpYear() {
                    return ccExpYear;
                }

                /**
                 * Sets the value of the ccExpYear property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setCcExpYear(String value) {
                    this.ccExpYear = value;
                }

                /**
                 * Gets the value of the payByCcFlg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getPayByCcFlg() {
                    return payByCcFlg;
                }

                /**
                 * Sets the value of the payByCcFlg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setPayByCcFlg(String value) {
                    this.payByCcFlg = value;
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
             *         &lt;element name="info_s_error_code"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="10"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="info_s_error_message"&gt;
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
                "infoSErrorCode",
                "infoSErrorMessage"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public static class InfoResponseCdMsg {

                @XmlElement(name = "info_s_error_code", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String infoSErrorCode;
                @XmlElement(name = "info_s_error_message", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String infoSErrorMessage;

                /**
                 * Gets the value of the infoSErrorCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getInfoSErrorCode() {
                    return infoSErrorCode;
                }

                /**
                 * Sets the value of the infoSErrorCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setInfoSErrorCode(String value) {
                    this.infoSErrorCode = value;
                }

                /**
                 * Gets the value of the infoSErrorMessage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getInfoSErrorMessage() {
                    return infoSErrorMessage;
                }

                /**
                 * Sets the value of the infoSErrorMessage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setInfoSErrorMessage(String value) {
                    this.infoSErrorMessage = value;
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
             *         &lt;element name="promo_code"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="5"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="promo_rate_ind"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="1"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="promo_code_desc"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="35"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="promo_exp_dt"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="media_code"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="source_code"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="prod_code"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="nbr_copies"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="solic_id"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="4"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ref_no"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="9"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="delivery_type"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="prod_status"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="prod_start_dt"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="prod_stop_dt"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="prod_rstr_dt"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="prod_stop_reason"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="prod_stop_comment"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="30"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="prod_fut_stop_date"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="prod_fut_rstr_date"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="prod_campaign_code_p"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="5"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="prod_campaign_occ_code_p"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="5"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="prod_data_warehouse_id_p"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="10"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="prod_offer_code_p"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="5"/&gt;
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
                "promoCode",
                "promoRateInd",
                "promoCodeDesc",
                "promoExpDt",
                "mediaCode",
                "sourceCode",
                "prodCode",
                "nbrCopies",
                "solicId",
                "refNo",
                "deliveryType",
                "prodStatus",
                "prodStartDt",
                "prodStopDt",
                "prodRstrDt",
                "prodStopReason",
                "prodStopComment",
                "prodFutStopDate",
                "prodFutRstrDate",
                "prodCampaignCodeP",
                "prodCampaignOccCodeP",
                "prodDataWarehouseIdP",
                "prodOfferCodeP"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public static class ProductInfo {

                @XmlElement(name = "promo_code", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String promoCode;
                @XmlElement(name = "promo_rate_ind", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String promoRateInd;
                @XmlElement(name = "promo_code_desc", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String promoCodeDesc;
                @XmlElement(name = "promo_exp_dt", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String promoExpDt;
                @XmlElement(name = "media_code", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String mediaCode;
                @XmlElement(name = "source_code", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String sourceCode;
                @XmlElement(name = "prod_code", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String prodCode;
                @XmlElement(name = "nbr_copies", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String nbrCopies;
                @XmlElement(name = "solic_id", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String solicId;
                @XmlElement(name = "ref_no", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String refNo;
                @XmlElement(name = "delivery_type", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String deliveryType;
                @XmlElement(name = "prod_status", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String prodStatus;
                @XmlElement(name = "prod_start_dt", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String prodStartDt;
                @XmlElement(name = "prod_stop_dt", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String prodStopDt;
                @XmlElement(name = "prod_rstr_dt", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String prodRstrDt;
                @XmlElement(name = "prod_stop_reason", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String prodStopReason;
                @XmlElement(name = "prod_stop_comment", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String prodStopComment;
                @XmlElement(name = "prod_fut_stop_date", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String prodFutStopDate;
                @XmlElement(name = "prod_fut_rstr_date", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String prodFutRstrDate;
                @XmlElement(name = "prod_campaign_code_p", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String prodCampaignCodeP;
                @XmlElement(name = "prod_campaign_occ_code_p", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String prodCampaignOccCodeP;
                @XmlElement(name = "prod_data_warehouse_id_p", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String prodDataWarehouseIdP;
                @XmlElement(name = "prod_offer_code_p", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String prodOfferCodeP;

                /**
                 * Gets the value of the promoCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getPromoCode() {
                    return promoCode;
                }

                /**
                 * Sets the value of the promoCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setPromoCode(String value) {
                    this.promoCode = value;
                }

                /**
                 * Gets the value of the promoRateInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getPromoRateInd() {
                    return promoRateInd;
                }

                /**
                 * Sets the value of the promoRateInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setPromoRateInd(String value) {
                    this.promoRateInd = value;
                }

                /**
                 * Gets the value of the promoCodeDesc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getPromoCodeDesc() {
                    return promoCodeDesc;
                }

                /**
                 * Sets the value of the promoCodeDesc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setPromoCodeDesc(String value) {
                    this.promoCodeDesc = value;
                }

                /**
                 * Gets the value of the promoExpDt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getPromoExpDt() {
                    return promoExpDt;
                }

                /**
                 * Sets the value of the promoExpDt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setPromoExpDt(String value) {
                    this.promoExpDt = value;
                }

                /**
                 * Gets the value of the mediaCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getMediaCode() {
                    return mediaCode;
                }

                /**
                 * Sets the value of the mediaCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setMediaCode(String value) {
                    this.mediaCode = value;
                }

                /**
                 * Gets the value of the sourceCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getSourceCode() {
                    return sourceCode;
                }

                /**
                 * Sets the value of the sourceCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setSourceCode(String value) {
                    this.sourceCode = value;
                }

                /**
                 * Gets the value of the prodCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getProdCode() {
                    return prodCode;
                }

                /**
                 * Sets the value of the prodCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setProdCode(String value) {
                    this.prodCode = value;
                }

                /**
                 * Gets the value of the nbrCopies property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getNbrCopies() {
                    return nbrCopies;
                }

                /**
                 * Sets the value of the nbrCopies property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setNbrCopies(String value) {
                    this.nbrCopies = value;
                }

                /**
                 * Gets the value of the solicId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getSolicId() {
                    return solicId;
                }

                /**
                 * Sets the value of the solicId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setSolicId(String value) {
                    this.solicId = value;
                }

                /**
                 * Gets the value of the refNo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getRefNo() {
                    return refNo;
                }

                /**
                 * Sets the value of the refNo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setRefNo(String value) {
                    this.refNo = value;
                }

                /**
                 * Gets the value of the deliveryType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getDeliveryType() {
                    return deliveryType;
                }

                /**
                 * Sets the value of the deliveryType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setDeliveryType(String value) {
                    this.deliveryType = value;
                }

                /**
                 * Gets the value of the prodStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getProdStatus() {
                    return prodStatus;
                }

                /**
                 * Sets the value of the prodStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setProdStatus(String value) {
                    this.prodStatus = value;
                }

                /**
                 * Gets the value of the prodStartDt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getProdStartDt() {
                    return prodStartDt;
                }

                /**
                 * Sets the value of the prodStartDt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setProdStartDt(String value) {
                    this.prodStartDt = value;
                }

                /**
                 * Gets the value of the prodStopDt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getProdStopDt() {
                    return prodStopDt;
                }

                /**
                 * Sets the value of the prodStopDt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setProdStopDt(String value) {
                    this.prodStopDt = value;
                }

                /**
                 * Gets the value of the prodRstrDt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getProdRstrDt() {
                    return prodRstrDt;
                }

                /**
                 * Sets the value of the prodRstrDt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setProdRstrDt(String value) {
                    this.prodRstrDt = value;
                }

                /**
                 * Gets the value of the prodStopReason property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getProdStopReason() {
                    return prodStopReason;
                }

                /**
                 * Sets the value of the prodStopReason property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setProdStopReason(String value) {
                    this.prodStopReason = value;
                }

                /**
                 * Gets the value of the prodStopComment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getProdStopComment() {
                    return prodStopComment;
                }

                /**
                 * Sets the value of the prodStopComment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setProdStopComment(String value) {
                    this.prodStopComment = value;
                }

                /**
                 * Gets the value of the prodFutStopDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getProdFutStopDate() {
                    return prodFutStopDate;
                }

                /**
                 * Sets the value of the prodFutStopDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setProdFutStopDate(String value) {
                    this.prodFutStopDate = value;
                }

                /**
                 * Gets the value of the prodFutRstrDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getProdFutRstrDate() {
                    return prodFutRstrDate;
                }

                /**
                 * Sets the value of the prodFutRstrDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setProdFutRstrDate(String value) {
                    this.prodFutRstrDate = value;
                }

                /**
                 * Gets the value of the prodCampaignCodeP property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getProdCampaignCodeP() {
                    return prodCampaignCodeP;
                }

                /**
                 * Sets the value of the prodCampaignCodeP property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setProdCampaignCodeP(String value) {
                    this.prodCampaignCodeP = value;
                }

                /**
                 * Gets the value of the prodCampaignOccCodeP property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getProdCampaignOccCodeP() {
                    return prodCampaignOccCodeP;
                }

                /**
                 * Sets the value of the prodCampaignOccCodeP property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setProdCampaignOccCodeP(String value) {
                    this.prodCampaignOccCodeP = value;
                }

                /**
                 * Gets the value of the prodDataWarehouseIdP property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getProdDataWarehouseIdP() {
                    return prodDataWarehouseIdP;
                }

                /**
                 * Sets the value of the prodDataWarehouseIdP property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setProdDataWarehouseIdP(String value) {
                    this.prodDataWarehouseIdP = value;
                }

                /**
                 * Gets the value of the prodOfferCodeP property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getProdOfferCodeP() {
                    return prodOfferCodeP;
                }

                /**
                 * Sets the value of the prodOfferCodeP property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setProdOfferCodeP(String value) {
                    this.prodOfferCodeP = value;
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
             *         &lt;element name="route_mon"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="route_tue"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="route_wed"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="route_thu"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="route_fri"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="route_sat"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="collapse"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="route_sun"&gt;
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
                "routeMon",
                "routeTue",
                "routeWed",
                "routeThu",
                "routeFri",
                "routeSat",
                "routeSun"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
            public static class RouteInfo {

                @XmlElement(name = "route_mon", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String routeMon;
                @XmlElement(name = "route_tue", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String routeTue;
                @XmlElement(name = "route_wed", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String routeWed;
                @XmlElement(name = "route_thu", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String routeThu;
                @XmlElement(name = "route_fri", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String routeFri;
                @XmlElement(name = "route_sat", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String routeSat;
                @XmlElement(name = "route_sun", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                protected String routeSun;

                /**
                 * Gets the value of the routeMon property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getRouteMon() {
                    return routeMon;
                }

                /**
                 * Sets the value of the routeMon property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setRouteMon(String value) {
                    this.routeMon = value;
                }

                /**
                 * Gets the value of the routeTue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getRouteTue() {
                    return routeTue;
                }

                /**
                 * Sets the value of the routeTue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setRouteTue(String value) {
                    this.routeTue = value;
                }

                /**
                 * Gets the value of the routeWed property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getRouteWed() {
                    return routeWed;
                }

                /**
                 * Sets the value of the routeWed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setRouteWed(String value) {
                    this.routeWed = value;
                }

                /**
                 * Gets the value of the routeThu property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getRouteThu() {
                    return routeThu;
                }

                /**
                 * Sets the value of the routeThu property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setRouteThu(String value) {
                    this.routeThu = value;
                }

                /**
                 * Gets the value of the routeFri property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getRouteFri() {
                    return routeFri;
                }

                /**
                 * Sets the value of the routeFri property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setRouteFri(String value) {
                    this.routeFri = value;
                }

                /**
                 * Gets the value of the routeSat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getRouteSat() {
                    return routeSat;
                }

                /**
                 * Sets the value of the routeSat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setRouteSat(String value) {
                    this.routeSat = value;
                }

                /**
                 * Gets the value of the routeSun property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public String getRouteSun() {
                    return routeSun;
                }

                /**
                 * Sets the value of the routeSun property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.6", date = "2022-07-10T00:19:38-04:00")
                public void setRouteSun(String value) {
                    this.routeSun = value;
                }

            }

        }

    }

}
