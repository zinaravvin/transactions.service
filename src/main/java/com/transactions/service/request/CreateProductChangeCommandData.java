package com.transactions.service.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateProductChangeCommandData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-02T16:10:38.124Z")


public class CreateProductChangeCommandData   {
  @JsonProperty("productCode")
  private String productCode = null;

  @JsonProperty("promoCode")
  private String promoCode = null;

  @JsonProperty("billFrequency")
  private String billFrequency = null;

  @JsonProperty("numberOfCopies")
  private String numberOfCopies = null;

  @JsonProperty("mediaCode")
  private String mediaCode = null;

  @JsonProperty("productChangeStartDate")
  private String productChangeStartDate = null;

  @JsonProperty("operatorId")
  private String operatorId = null;

  public CreateProductChangeCommandData productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

  /**
   * Get productCode
   * @return productCode
  **/

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public CreateProductChangeCommandData promoCode(String promoCode) {
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

  public CreateProductChangeCommandData billFrequency(String billFrequency) {
    this.billFrequency = billFrequency;
    return this;
  }

  /**
   * Get billFrequency
   * @return billFrequency
  **/


  public String getBillFrequency() {
    return billFrequency;
  }

  public void setBillFrequency(String billFrequency) {
    this.billFrequency = billFrequency;
  }

  public CreateProductChangeCommandData numberOfCopies(String numberOfCopies) {
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

  public CreateProductChangeCommandData mediaCode(String mediaCode) {
    this.mediaCode = mediaCode;
    return this;
  }

  /**
   * Get mediaCode
   * @return mediaCode
  **/


  public String getMediaCode() {
    return mediaCode;
  }

  public void setMediaCode(String mediaCode) {
    this.mediaCode = mediaCode;
  }

  public CreateProductChangeCommandData productChangeStartDate(String productChangeStartDate) {
    this.productChangeStartDate = productChangeStartDate;
    return this;
  }

  /**
   * Get productChangeStartDate
   * @return productChangeStartDate
  **/

  public String getProductChangeStartDate() {
    return productChangeStartDate;
  }

  public void setProductChangeStartDate(String productChangeStartDate) {
    this.productChangeStartDate = productChangeStartDate;
  }

  public CreateProductChangeCommandData operatorId(String operatorId) {
    this.operatorId = operatorId;
    return this;
  }

  /**
   * Get operatorId
   * @return operatorId
  **/


  public String getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(String operatorId) {
    this.operatorId = operatorId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProductChangeCommandData createProductChangeCommandData = (CreateProductChangeCommandData) o;
    return Objects.equals(this.productCode, createProductChangeCommandData.productCode) &&
        Objects.equals(this.promoCode, createProductChangeCommandData.promoCode) &&
        Objects.equals(this.billFrequency, createProductChangeCommandData.billFrequency) &&
        Objects.equals(this.numberOfCopies, createProductChangeCommandData.numberOfCopies) &&
        Objects.equals(this.mediaCode, createProductChangeCommandData.mediaCode) &&
        Objects.equals(this.productChangeStartDate, createProductChangeCommandData.productChangeStartDate) &&
        Objects.equals(this.operatorId, createProductChangeCommandData.operatorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, promoCode, billFrequency, numberOfCopies, mediaCode, productChangeStartDate, operatorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProductChangeCommandData {\n");
    
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    billFrequency: ").append(toIndentedString(billFrequency)).append("\n");
    sb.append("    numberOfCopies: ").append(toIndentedString(numberOfCopies)).append("\n");
    sb.append("    mediaCode: ").append(toIndentedString(mediaCode)).append("\n");
    sb.append("    productChangeStartDate: ").append(toIndentedString(productChangeStartDate)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
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

