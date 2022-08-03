package com.transactions.service.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateProductChangeResponseData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-01T22:35:49.667Z")


public class CreateProductChangeResponseData   {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("oldProduct")
  private String oldProduct = null;

  @JsonProperty("newProduct")
  private String newProduct = null;

  @JsonProperty("productStartDate")
  private String productStartDate = null;

  @JsonProperty("promoCode")
  private String promoCode = null;

  @JsonProperty("billingFrequency")
  private String billingFrequency = null;

  @JsonProperty("numberOfCopies")
  private String numberOfCopies = null;

  @JsonProperty("serialNumber")
  private String serialNumber = null;

  @JsonProperty("dailySundayRates")
  @Valid
  private List<DailySunday> dailySundayRates = null;

  public CreateProductChangeResponseData accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public CreateProductChangeResponseData oldProduct(String oldProduct) {
    this.oldProduct = oldProduct;
    return this;
  }

  /**
   * Get oldProduct
   * @return oldProduct
  **/


  public String getOldProduct() {
    return oldProduct;
  }

  public void setOldProduct(String oldProduct) {
    this.oldProduct = oldProduct;
  }

  public CreateProductChangeResponseData newProduct(String newProduct) {
    this.newProduct = newProduct;
    return this;
  }

  /**
   * Get newProduct
   * @return newProduct
  **/

  public String getNewProduct() {
    return newProduct;
  }

  public void setNewProduct(String newProduct) {
    this.newProduct = newProduct;
  }

  public CreateProductChangeResponseData productStartDate(String productStartDate) {
    this.productStartDate = productStartDate;
    return this;
  }

  /**
   * Get productStartDate
   * @return productStartDate
  **/

  public String getProductStartDate() {
    return productStartDate;
  }

  public void setProductStartDate(String productStartDate) {
    this.productStartDate = productStartDate;
  }

  public CreateProductChangeResponseData promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

  /**
   * Get promoCode
   * @return promoCode
  **/

  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public CreateProductChangeResponseData billingFrequency(String billingFrequency) {
    this.billingFrequency = billingFrequency;
    return this;
  }

  /**
   * Get billingFrequency
   * @return billingFrequency
  **/

  public String getBillingFrequency() {
    return billingFrequency;
  }

  public void setBillingFrequency(String billingFrequency) {
    this.billingFrequency = billingFrequency;
  }

  public CreateProductChangeResponseData numberOfCopies(String numberOfCopies) {
    this.numberOfCopies = numberOfCopies;
    return this;
  }

  /**
   * Get numberOfCopies
   * @return numberOfCopies
  **/

  public String getNumberOfCopies() {
    return numberOfCopies;
  }

  public void setNumberOfCopies(String numberOfCopies) {
    this.numberOfCopies = numberOfCopies;
  }

  public CreateProductChangeResponseData serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
  **/

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public CreateProductChangeResponseData dailySundayRates(List<DailySunday> dailySundayRates) {
    this.dailySundayRates = dailySundayRates;
    return this;
  }

  public CreateProductChangeResponseData addDailySundayRatesItem(DailySunday dailySundayRatesItem) {
    if (this.dailySundayRates == null) {
      this.dailySundayRates = new ArrayList<DailySunday>();
    }
    this.dailySundayRates.add(dailySundayRatesItem);
    return this;
  }

  /**
   * Get dailySundayRates
   * @return dailySundayRates
  **/
  @Valid

  public List<DailySunday> getDailySundayRates() {
    return dailySundayRates;
  }

  public void setDailySundayRates(List<DailySunday> dailySundayRates) {
    this.dailySundayRates = dailySundayRates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProductChangeResponseData createProductChangeResponseData = (CreateProductChangeResponseData) o;
    return Objects.equals(this.accountId, createProductChangeResponseData.accountId) &&
        Objects.equals(this.oldProduct, createProductChangeResponseData.oldProduct) &&
        Objects.equals(this.newProduct, createProductChangeResponseData.newProduct) &&
        Objects.equals(this.productStartDate, createProductChangeResponseData.productStartDate) &&
        Objects.equals(this.promoCode, createProductChangeResponseData.promoCode) &&
        Objects.equals(this.billingFrequency, createProductChangeResponseData.billingFrequency) &&
        Objects.equals(this.numberOfCopies, createProductChangeResponseData.numberOfCopies) &&
        Objects.equals(this.serialNumber, createProductChangeResponseData.serialNumber) &&
        Objects.equals(this.dailySundayRates, createProductChangeResponseData.dailySundayRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, oldProduct, newProduct, productStartDate, promoCode, billingFrequency, numberOfCopies, serialNumber, dailySundayRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProductChangeResponseData {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    oldProduct: ").append(toIndentedString(oldProduct)).append("\n");
    sb.append("    newProduct: ").append(toIndentedString(newProduct)).append("\n");
    sb.append("    productStartDate: ").append(toIndentedString(productStartDate)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    billingFrequency: ").append(toIndentedString(billingFrequency)).append("\n");
    sb.append("    numberOfCopies: ").append(toIndentedString(numberOfCopies)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    dailySundayRates: ").append(toIndentedString(dailySundayRates)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

