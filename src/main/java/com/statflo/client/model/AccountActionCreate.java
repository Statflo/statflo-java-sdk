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
 * AccountActionCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-16T03:54:20.683408-04:00[America/Toronto]")

public class AccountActionCreate {
  @SerializedName("description")
  private String description = null;

  @SerializedName("actionTaken")
  private String actionTaken = "Reassignment";

  @SerializedName("assignedTo")
  private String assignedTo = null;

  @SerializedName("assignedFrom")
  private String assignedFrom = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("dateAdded")
  private OffsetDateTime dateAdded = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  public AccountActionCreate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccountActionCreate actionTaken(String actionTaken) {
    this.actionTaken = actionTaken;
    return this;
  }

   /**
   * Get actionTaken
   * @return actionTaken
  **/
  @Schema(description = "")
  public String getActionTaken() {
    return actionTaken;
  }

  public void setActionTaken(String actionTaken) {
    this.actionTaken = actionTaken;
  }

  public AccountActionCreate assignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

   /**
   * Get assignedTo
   * @return assignedTo
  **/
  @Schema(description = "")
  public String getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
  }

  public AccountActionCreate assignedFrom(String assignedFrom) {
    this.assignedFrom = assignedFrom;
    return this;
  }

   /**
   * Get assignedFrom
   * @return assignedFrom
  **/
  @Schema(description = "")
  public String getAssignedFrom() {
    return assignedFrom;
  }

  public void setAssignedFrom(String assignedFrom) {
    this.assignedFrom = assignedFrom;
  }

  public AccountActionCreate id(Integer id) {
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

  public AccountActionCreate accountId(String accountId) {
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

  public AccountActionCreate dateAdded(OffsetDateTime dateAdded) {
    this.dateAdded = dateAdded;
    return this;
  }

   /**
   * Get dateAdded
   * @return dateAdded
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getDateAdded() {
    return dateAdded;
  }

  public void setDateAdded(OffsetDateTime dateAdded) {
    this.dateAdded = dateAdded;
  }

  public AccountActionCreate createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AccountActionCreate updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountActionCreate accountActionCreate = (AccountActionCreate) o;
    return Objects.equals(this.description, accountActionCreate.description) &&
        Objects.equals(this.actionTaken, accountActionCreate.actionTaken) &&
        Objects.equals(this.assignedTo, accountActionCreate.assignedTo) &&
        Objects.equals(this.assignedFrom, accountActionCreate.assignedFrom) &&
        Objects.equals(this.id, accountActionCreate.id) &&
        Objects.equals(this.accountId, accountActionCreate.accountId) &&
        Objects.equals(this.dateAdded, accountActionCreate.dateAdded) &&
        Objects.equals(this.createdAt, accountActionCreate.createdAt) &&
        Objects.equals(this.updatedAt, accountActionCreate.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, actionTaken, assignedTo, assignedFrom, id, accountId, dateAdded, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountActionCreate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    actionTaken: ").append(toIndentedString(actionTaken)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    assignedFrom: ").append(toIndentedString(assignedFrom)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
