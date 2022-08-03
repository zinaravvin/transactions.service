package com.transactions.service.request;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestMetaImpl
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T17:30:09.917Z")

@Component
public class RequestMetaImpl   {
    @JsonProperty("is_cs")
    private Boolean isCs = false;

    @JsonProperty("user_agent")
    private String userAgent = null;

    public RequestMetaImpl isCs(Boolean isCs) {
        this.isCs = isCs;
        return this;
    }

    /**
     * Get isCs
     * @return isCs
     **/
    //@Apiroperty(required = true, value = "")
    @NotNull


    public Boolean isIsCs() {
        return isCs;
    }

    public void setIsCs(Boolean isCs) {
        this.isCs = isCs;
    }

    public RequestMetaImpl userAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    /**
     * Get userAgent
     * @return userAgent
     **/
    //@ApiModelProperty(required = true, value = "")
    @NotNull


    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequestMetaImpl requestMetaImpl = (RequestMetaImpl) o;
        return Objects.equals(this.isCs, requestMetaImpl.isCs) &&
                Objects.equals(this.userAgent, requestMetaImpl.userAgent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isCs, userAgent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestMetaImpl {\n");

        sb.append("    isCs: ").append(toIndentedString(isCs)).append("\n");
        sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

