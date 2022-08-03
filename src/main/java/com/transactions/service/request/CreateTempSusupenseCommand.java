package com.transactions.service.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * CreateTempSusupenseCommand
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T17:30:09.917Z")


public class CreateTempSusupenseCommand   {
    @JsonProperty("meta")
    private RequestMetaImpl meta = null;

    @JsonProperty("data")
    private CreateTempSuspenseCommandData data = null;

    public CreateTempSusupenseCommand meta(RequestMetaImpl meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Get meta
     * @return meta
     **/
   // @ApiModelProperty(value = "")

    @Valid

    public RequestMetaImpl getMeta() {
        return meta;
    }

    public void setMeta(RequestMetaImpl meta) {
        this.meta = meta;
    }

    public CreateTempSusupenseCommand data(CreateTempSuspenseCommandData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     * @return data
     **/
  //  @ApiModelProperty(value = "")

    @Valid

    public CreateTempSuspenseCommandData getData() {
        return data;
    }

    public void setData(CreateTempSuspenseCommandData data) {
        this.data = data;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTempSusupenseCommand createTempSusupenseCommand = (CreateTempSusupenseCommand) o;
        return Objects.equals(this.meta, createTempSusupenseCommand.meta) &&
                Objects.equals(this.data, createTempSusupenseCommand.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meta, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTempSusupenseCommand {\n");

        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

