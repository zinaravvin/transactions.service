package com.transactions.service.request;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * CreateTempSuspenseCommandData
 */
@Validated
@Component
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T17:30:09.917Z")


public class CreateTempSuspenseCommandData {
    @JsonProperty(value = "suspenseReason",required = true)
    private String suspenseReason = null;

    @JsonProperty("donationFlag")
    private Boolean donationFlag = false;

    @JsonProperty("suspenseStartDate")
    private String suspenseStartDate = null;

    @JsonProperty("suspenseEndDate")
    private String suspenseEndDate = null;
    @JsonProperty(value = "operatorId" , required = true)
    private String operatorId = null;

    public CreateTempSuspenseCommandData suspenseReason(String suspenseReason) {
        this.suspenseReason = suspenseReason;
        return this;
    }

    /**
     * Get suspenseReason
     * @return suspenseReason
     **/
   //  @ApiModelProperty(value = "")


    public String getSuspenseReason() {
        return suspenseReason;
    }
    public String getOperatorId() {
        return operatorId;
    }

    public void setSuspenseReason(String suspenseReason) {
        this.suspenseReason = suspenseReason;
    }
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public CreateTempSuspenseCommandData donationFlag(Boolean donationFlag) {
        this.donationFlag = donationFlag;
        return this;
    }

    /**
     * Get donationFlag
     * @return donationFlag
     **/
   // @ApiModelProperty(value = "")


    public Boolean getDonationFlag() {
        return donationFlag;
    }

    public void setDonationFlag(Boolean donationFlag) {
        this.donationFlag = donationFlag;
    }

    public CreateTempSuspenseCommandData suspenseStartDate(String suspenseStartDate) {
        this.suspenseStartDate = suspenseStartDate;
        return this;
    }

    /**
     * Get suspenseStartDate
     * @return suspenseStartDate
     **/
  //  @ApiModelProperty(example = "2022-01-01", value = "")

    public String getSuspenseStartDate() {
        return suspenseStartDate;
    }

    public void setSuspenseStartDate(String suspenseStartDate) {
        this.suspenseStartDate = suspenseStartDate;
    }

    public CreateTempSuspenseCommandData suspenseEndDate(String suspenseEndDate) {
        this.suspenseEndDate = suspenseEndDate;
        return this;
    }

    /**
     * Get suspenseEndDate
     * @return suspenseEndDate
     **/
  //  @ApiModelProperty(example = "2022-01-01", value = "")


    public String getSuspenseEndDate() {
        return suspenseEndDate;
    }

    public void setSuspenseEndDate(String suspenseEndDate) {
        this.suspenseEndDate = suspenseEndDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTempSuspenseCommandData createTempSuspenseCommanData = (CreateTempSuspenseCommandData) o;
        return Objects.equals(this.suspenseReason, createTempSuspenseCommanData.suspenseReason) &&
                Objects.equals(this.donationFlag, createTempSuspenseCommanData.donationFlag) &&
                Objects.equals(this.suspenseStartDate, createTempSuspenseCommanData.suspenseStartDate) &&
                Objects.equals(this.suspenseEndDate, createTempSuspenseCommanData.suspenseEndDate)  &&
                Objects.equals(this.operatorId, createTempSuspenseCommanData.operatorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suspenseReason, donationFlag, suspenseStartDate, suspenseEndDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTempSuspenseCommandData {\n");

        sb.append("    suspenseReason: ").append(toIndentedString(suspenseReason)).append("\n");
        sb.append("    donationFlag: ").append(toIndentedString(donationFlag)).append("\n");
        sb.append("    suspenseStartDate: ").append(toIndentedString(suspenseStartDate)).append("\n");
        sb.append("    suspenseEndDate: ").append(toIndentedString(suspenseEndDate)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");

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

