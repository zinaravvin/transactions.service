package com.transactions.service.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetProductChangeResponse
 */
@Component
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-07-26T00:09:39.498Z")


public class GetProductChangeResponse   {
  @JsonProperty("meta")
  private ResponseMetaImpl meta = null;

  @JsonProperty("data")
  private CreateProductChangeResponseData data = null;

  public GetProductChangeResponse meta(ResponseMetaImpl meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/
  @Valid

  public ResponseMetaImpl getMeta() {
    return meta;
  }

  public void setMeta(ResponseMetaImpl meta) {
    this.meta = meta;
  }

  public GetProductChangeResponse data(CreateProductChangeResponseData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @Valid

  public CreateProductChangeResponseData getData() {
    return data;
  }

  public void setData(CreateProductChangeResponseData data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProductChangeResponse getProductChangeResponse = (GetProductChangeResponse) o;
    return Objects.equals(this.meta, getProductChangeResponse.meta) &&
        Objects.equals(this.data, getProductChangeResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProductChangeResponse {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

