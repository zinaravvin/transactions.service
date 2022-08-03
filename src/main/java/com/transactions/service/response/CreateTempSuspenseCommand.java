package com.transactions.service.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.transactions.service.request.CreateTempSuspenseCommandData;
import com.transactions.service.request.RequestMetaImpl;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateTempSuspenseCommand
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-07-26T00:09:39.498Z")


public class CreateTempSuspenseCommand   {
  @JsonProperty("meta")
  private RequestMetaImpl meta = null;

  @JsonProperty("data")
  private CreateTempSuspenseCommandData data = null;

  public CreateTempSuspenseCommand meta(RequestMetaImpl meta) {
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

  public CreateTempSuspenseCommand data(CreateTempSuspenseCommandData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @Valid

  public CreateTempSuspenseCommandData getData() {
    return data;
  }

  public void setData(CreateTempSuspenseCommandData data) {
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
    CreateTempSuspenseCommand createTempSuspenseCommand = (CreateTempSuspenseCommand) o;
    return Objects.equals(this.meta, createTempSuspenseCommand.meta) &&
        Objects.equals(this.data, createTempSuspenseCommand.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTempSuspenseCommand {\n");
    
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

