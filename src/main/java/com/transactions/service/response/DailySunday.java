package com.transactions.service.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DailySunday
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-08-01T22:35:49.667Z")


public class DailySunday   {
  @JsonProperty("dailyRate")
  private String dailyRate = null;

  @JsonProperty("sundayRate")
  private String sundayRate = null;

  @JsonProperty("cycleCost")
  private String cycleCost = null;

  @JsonProperty("promoDuration")
  private String promoDuration = null;

  public DailySunday dailyRate(String dailyRate) {
    this.dailyRate = dailyRate;
    return this;
  }

  /**
   * Get dailyRate
   * @return dailyRate
  **/

  public String getDailyRate() {
    return dailyRate;
  }

  public void setDailyRate(String dailyRate) {
    this.dailyRate = dailyRate;
  }

  public DailySunday sundayRate(String sundayRate) {
    this.sundayRate = sundayRate;
    return this;
  }

  /**
   * Get sundayRate
   * @return sundayRate
  **/

  public String getSundayRate() {
    return sundayRate;
  }

  public void setSundayRate(String sundayRate) {
    this.sundayRate = sundayRate;
  }

  public DailySunday cycleCost(String cycleCost) {
    this.cycleCost = cycleCost;
    return this;
  }

  /**
   * Get cycleCost
   * @return cycleCost
  **/

  public String getCycleCost() {
    return cycleCost;
  }

  public void setCycleCost(String cycleCost) {
    this.cycleCost = cycleCost;
  }

  public DailySunday promoDuration(String promoDuration) {
    this.promoDuration = promoDuration;
    return this;
  }

  /**
   * Get promoDuration
   * @return promoDuration
  **/

  public String getPromoDuration() {
    return promoDuration;
  }

  public void setPromoDuration(String promoDuration) {
    this.promoDuration = promoDuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailySunday dailySunday = (DailySunday) o;
    return Objects.equals(this.dailyRate, dailySunday.dailyRate) &&
        Objects.equals(this.sundayRate, dailySunday.sundayRate) &&
        Objects.equals(this.cycleCost, dailySunday.cycleCost) &&
        Objects.equals(this.promoDuration, dailySunday.promoDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyRate, sundayRate, cycleCost, promoDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailySunday {\n");
    
    sb.append("    dailyRate: ").append(toIndentedString(dailyRate)).append("\n");
    sb.append("    sundayRate: ").append(toIndentedString(sundayRate)).append("\n");
    sb.append("    cycleCost: ").append(toIndentedString(cycleCost)).append("\n");
    sb.append("    promoDuration: ").append(toIndentedString(promoDuration)).append("\n");
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

