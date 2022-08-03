package com.transactions.service.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;*/
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseMetaImpl
 */
@Component
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T17:30:09.917Z")


public class ResponseMetaImpl   {
    @JsonProperty("msg")
    private String msg = null;

    @JsonProperty("code")
    private Object code = null;

    public ResponseMetaImpl msg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * Get msg
     * @return msg
     **/
   // @ApiModelProperty(value = "")


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResponseMetaImpl code(Object code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     * @return code
     **/
   // @ApiModelProperty(value = "")


    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseMetaImpl responseMetaImpl = (ResponseMetaImpl) o;
        return Objects.equals(this.msg, responseMetaImpl.msg) &&
                Objects.equals(this.code, responseMetaImpl.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msg, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseMetaImpl {\n");

        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

