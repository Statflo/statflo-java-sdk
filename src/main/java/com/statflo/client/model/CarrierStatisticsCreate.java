/*
 * Statflo API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4.1.149
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.statflo.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
/**
 * CarrierStatisticsCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-24T20:30:11.489899882Z[Etc/UTC]")

public class CarrierStatisticsCreate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("callListId")
  private Integer callListId = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("clientName")
  private String clientName = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("dateAdded")
  private OffsetDateTime dateAdded = null;

  @SerializedName("callListName")
  private String callListName = null;

  @SerializedName("approach")
  private String approach = null;

  public CarrierStatisticsCreate id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CarrierStatisticsCreate callListId(Integer callListId) {
    this.callListId = callListId;
    return this;
  }

   /**
   * Get callListId
   * @return callListId
  **/
  @Schema(description = "")
  public Integer getCallListId() {
    return callListId;
  }

  public void setCallListId(Integer callListId) {
    this.callListId = callListId;
  }

  public CarrierStatisticsCreate accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public CarrierStatisticsCreate clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @Schema(description = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public CarrierStatisticsCreate phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @Schema(description = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CarrierStatisticsCreate dateAdded(OffsetDateTime dateAdded) {
    this.dateAdded = dateAdded;
    return this;
  }

   /**
   * Get dateAdded
   * @return dateAdded
  **/
  @Schema(description = "")
  public OffsetDateTime getDateAdded() {
    return dateAdded;
  }

  public void setDateAdded(OffsetDateTime dateAdded) {
    this.dateAdded = dateAdded;
  }

  public CarrierStatisticsCreate callListName(String callListName) {
    this.callListName = callListName;
    return this;
  }

   /**
   * Get callListName
   * @return callListName
  **/
  @Schema(description = "")
  public String getCallListName() {
    return callListName;
  }

  public void setCallListName(String callListName) {
    this.callListName = callListName;
  }

  public CarrierStatisticsCreate approach(String approach) {
    this.approach = approach;
    return this;
  }

   /**
   * Get approach
   * @return approach
  **/
  @Schema(description = "")
  public String getApproach() {
    return approach;
  }

  public void setApproach(String approach) {
    this.approach = approach;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrierStatisticsCreate carrierStatisticsCreate = (CarrierStatisticsCreate) o;
    return Objects.equals(this.id, carrierStatisticsCreate.id) &&
        Objects.equals(this.callListId, carrierStatisticsCreate.callListId) &&
        Objects.equals(this.accountId, carrierStatisticsCreate.accountId) &&
        Objects.equals(this.clientName, carrierStatisticsCreate.clientName) &&
        Objects.equals(this.phoneNumber, carrierStatisticsCreate.phoneNumber) &&
        Objects.equals(this.dateAdded, carrierStatisticsCreate.dateAdded) &&
        Objects.equals(this.callListName, carrierStatisticsCreate.callListName) &&
        Objects.equals(this.approach, carrierStatisticsCreate.approach);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, callListId, accountId, clientName, phoneNumber, dateAdded, callListName, approach);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierStatisticsCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    callListId: ").append(toIndentedString(callListId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    callListName: ").append(toIndentedString(callListName)).append("\n");
    sb.append("    approach: ").append(toIndentedString(approach)).append("\n");
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
