package com.transactions.service.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateProductChangeCommand
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-07-26T00:09:39.498Z")


public class CreateProductChangeCommand   {
  @JsonProperty("meta")
  private RequestMetaImpl meta = null;

  @JsonProperty("data")
  private CreateProductChangeCommandData data = null;

  public CreateProductChangeCommand meta(RequestMetaImpl meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/

  @Valid

  public RequestMetaImpl getMeta() {
    return meta;
  }

  public void setMeta(RequestMetaImpl meta) {
    this.meta = meta;
  }

  public CreateProductChangeCommand data(CreateProductChangeCommandData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @Valid

  public CreateProductChangeCommandData getData() {
    return data;
  }

  public void setData(CreateProductChangeCommandData data) {
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
    CreateProductChangeCommand createProductChangeCommand = (CreateProductChangeCommand) o;
    return Objects.equals(this.meta, createProductChangeCommand.meta) &&
        Objects.equals(this.data, createProductChangeCommand.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProductChangeCommand {\n");
    
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

