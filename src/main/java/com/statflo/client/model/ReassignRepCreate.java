/*
 * Statflo API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0.0
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
import org.threeten.bp.OffsetDateTime;
/**
 * ReassignRepCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-02T20:03:55.393689Z[Etc/UTC]")

public class ReassignRepCreate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("newExternalUserId")
  private String newExternalUserId = null;

  @SerializedName("oldExternalUserId")
  private String oldExternalUserId = null;

  @SerializedName("newExternalLocationId")
  private String newExternalLocationId = null;

  @SerializedName("oldExternalLocationId")
  private String oldExternalLocationId = null;

  @SerializedName("accountName")
  private String accountName = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("dateChanged")
  private OffsetDateTime dateChanged = null;

  @SerializedName("reason")
  private String reason = "api";

  @SerializedName("oldBan")
  private String oldBan = null;

  public ReassignRepCreate id(Integer id) {
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

  public ReassignRepCreate newExternalUserId(String newExternalUserId) {
    this.newExternalUserId = newExternalUserId;
    return this;
  }

   /**
   * Get newExternalUserId
   * @return newExternalUserId
  **/
  @Schema(description = "")
  public String getNewExternalUserId() {
    return newExternalUserId;
  }

  public void setNewExternalUserId(String newExternalUserId) {
    this.newExternalUserId = newExternalUserId;
  }

  public ReassignRepCreate oldExternalUserId(String oldExternalUserId) {
    this.oldExternalUserId = oldExternalUserId;
    return this;
  }

   /**
   * Get oldExternalUserId
   * @return oldExternalUserId
  **/
  @Schema(description = "")
  public String getOldExternalUserId() {
    return oldExternalUserId;
  }

  public void setOldExternalUserId(String oldExternalUserId) {
    this.oldExternalUserId = oldExternalUserId;
  }

  public ReassignRepCreate newExternalLocationId(String newExternalLocationId) {
    this.newExternalLocationId = newExternalLocationId;
    return this;
  }

   /**
   * Get newExternalLocationId
   * @return newExternalLocationId
  **/
  @Schema(description = "")
  public String getNewExternalLocationId() {
    return newExternalLocationId;
  }

  public void setNewExternalLocationId(String newExternalLocationId) {
    this.newExternalLocationId = newExternalLocationId;
  }

  public ReassignRepCreate oldExternalLocationId(String oldExternalLocationId) {
    this.oldExternalLocationId = oldExternalLocationId;
    return this;
  }

   /**
   * Get oldExternalLocationId
   * @return oldExternalLocationId
  **/
  @Schema(description = "")
  public String getOldExternalLocationId() {
    return oldExternalLocationId;
  }

  public void setOldExternalLocationId(String oldExternalLocationId) {
    this.oldExternalLocationId = oldExternalLocationId;
  }

  public ReassignRepCreate accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @Schema(required = true, description = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public ReassignRepCreate accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(required = true, description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public ReassignRepCreate dateChanged(OffsetDateTime dateChanged) {
    this.dateChanged = dateChanged;
    return this;
  }

   /**
   * Get dateChanged
   * @return dateChanged
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getDateChanged() {
    return dateChanged;
  }

  public void setDateChanged(OffsetDateTime dateChanged) {
    this.dateChanged = dateChanged;
  }

  public ReassignRepCreate reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @Schema(description = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ReassignRepCreate oldBan(String oldBan) {
    this.oldBan = oldBan;
    return this;
  }

   /**
   * Get oldBan
   * @return oldBan
  **/
  @Schema(description = "")
  public String getOldBan() {
    return oldBan;
  }

  public void setOldBan(String oldBan) {
    this.oldBan = oldBan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReassignRepCreate reassignRepCreate = (ReassignRepCreate) o;
    return Objects.equals(this.id, reassignRepCreate.id) &&
        Objects.equals(this.newExternalUserId, reassignRepCreate.newExternalUserId) &&
        Objects.equals(this.oldExternalUserId, reassignRepCreate.oldExternalUserId) &&
        Objects.equals(this.newExternalLocationId, reassignRepCreate.newExternalLocationId) &&
        Objects.equals(this.oldExternalLocationId, reassignRepCreate.oldExternalLocationId) &&
        Objects.equals(this.accountName, reassignRepCreate.accountName) &&
        Objects.equals(this.accountId, reassignRepCreate.accountId) &&
        Objects.equals(this.dateChanged, reassignRepCreate.dateChanged) &&
        Objects.equals(this.reason, reassignRepCreate.reason) &&
        Objects.equals(this.oldBan, reassignRepCreate.oldBan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, newExternalUserId, oldExternalUserId, newExternalLocationId, oldExternalLocationId, accountName, accountId, dateChanged, reason, oldBan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReassignRepCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    newExternalUserId: ").append(toIndentedString(newExternalUserId)).append("\n");
    sb.append("    oldExternalUserId: ").append(toIndentedString(oldExternalUserId)).append("\n");
    sb.append("    newExternalLocationId: ").append(toIndentedString(newExternalLocationId)).append("\n");
    sb.append("    oldExternalLocationId: ").append(toIndentedString(oldExternalLocationId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    dateChanged: ").append(toIndentedString(dateChanged)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    oldBan: ").append(toIndentedString(oldBan)).append("\n");
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
