package com.transactions.service.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateTempSuspenseResponseData
 */
@Component
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-06-29T17:30:09.917Z")


public class CreateTempSuspenseResponseData   {
    @JsonProperty("accountId")
    private String accountId = null;

    @JsonProperty("suspenseReason")
    private String suspenseReason = null;

    @JsonProperty("donationFlag")
    private Boolean donationFlag = null;

    @JsonProperty("suspenseStartDate")
    private String suspenseStartDate = null;

    @JsonProperty("suspenseEndDate")
    private String suspenseEndDate = null;

    @JsonProperty("serialNumber")
    private String serialNumber = null;

    public CreateTempSuspenseResponseData accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     * @return accountId
     **/
   // @ApiModelProperty(value = "")


    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public CreateTempSuspenseResponseData suspenseReason(String suspenseReason) {
        this.suspenseReason = suspenseReason;
        return this;
    }
    public CreateTempSuspenseResponseData serialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    /**
     * Get suspenseReason
     * @return suspenseReason
     **/
   // @ApiModelProperty(value = "")


    public String getSuspenseReason() {
        return suspenseReason;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSuspenseReason(String suspenseReason) {
        this.suspenseReason = suspenseReason;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public CreateTempSuspenseResponseData donationFlag(Boolean donationFlag) {
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

    public CreateTempSuspenseResponseData suspenseStartDate(String suspenseStartDate) {
        this.suspenseStartDate = suspenseStartDate;
        return this;
    }

    /**
     * Get suspenseStartDate
     * @return suspenseStartDate
     **/
   // @ApiModelProperty(example = "2022-01-01", value = "")


    public String getSuspenseStartDate() {
        return suspenseStartDate;
    }

    public void setSuspenseStartDate(String suspenseStartDate) {
        this.suspenseStartDate = suspenseStartDate;
    }

    public CreateTempSuspenseResponseData suspenseEndDate(String suspenseEndDate) {
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
        CreateTempSuspenseResponseData createTempSuspenseResponseData = (CreateTempSuspenseResponseData) o;
        return Objects.equals(this.accountId, createTempSuspenseResponseData.accountId) &&
                Objects.equals(this.suspenseReason, createTempSuspenseResponseData.suspenseReason) &&
                Objects.equals(this.donationFlag, createTempSuspenseResponseData.donationFlag) &&
                Objects.equals(this.suspenseStartDate, createTempSuspenseResponseData.suspenseStartDate) &&
                Objects.equals(this.suspenseEndDate, createTempSuspenseResponseData.suspenseEndDate) &&
                Objects.equals(this.serialNumber, createTempSuspenseResponseData.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, suspenseReason, donationFlag, suspenseStartDate, suspenseEndDate,serialNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTempSuspenseResponseData {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    suspenseReason: ").append(toIndentedString(suspenseReason)).append("\n");
        sb.append("    donationFlag: ").append(toIndentedString(donationFlag)).append("\n");
        sb.append("    suspenseStartDate: ").append(toIndentedString(suspenseStartDate)).append("\n");
        sb.append("    suspenseEndDate: ").append(toIndentedString(suspenseEndDate)).append("\n");
        sb.append("    suspenseEndDate: ").append(toIndentedString(serialNumber)).append("\n");

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

