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
import com.statflo.client.model.Dealer;
import com.statflo.client.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * AccountAction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-02T20:03:55.393689Z[Etc/UTC]")

public class AccountAction {
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

  @SerializedName("user")
  private User user = null;

  @SerializedName("dealer")
  private Dealer dealer = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("dateAdded")
  private OffsetDateTime dateAdded = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  @SerializedName("recordSource")
  private String recordSource = null;

  public AccountAction description(String description) {
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

  public AccountAction actionTaken(String actionTaken) {
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

  public AccountAction assignedTo(String assignedTo) {
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

  public AccountAction assignedFrom(String assignedFrom) {
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

  public AccountAction id(Integer id) {
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

  public AccountAction user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public AccountAction dealer(Dealer dealer) {
    this.dealer = dealer;
    return this;
  }

   /**
   * Get dealer
   * @return dealer
  **/
  @Schema(description = "")
  public Dealer getDealer() {
    return dealer;
  }

  public void setDealer(Dealer dealer) {
    this.dealer = dealer;
  }

  public AccountAction accountId(String accountId) {
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

  public AccountAction dateAdded(OffsetDateTime dateAdded) {
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

  public AccountAction createdAt(OffsetDateTime createdAt) {
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

  public AccountAction updatedAt(OffsetDateTime updatedAt) {
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

  public AccountAction recordSource(String recordSource) {
    this.recordSource = recordSource;
    return this;
  }

   /**
   * Get recordSource
   * @return recordSource
  **/
  @Schema(description = "")
  public String getRecordSource() {
    return recordSource;
  }

  public void setRecordSource(String recordSource) {
    this.recordSource = recordSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAction accountAction = (AccountAction) o;
    return Objects.equals(this.description, accountAction.description) &&
        Objects.equals(this.actionTaken, accountAction.actionTaken) &&
        Objects.equals(this.assignedTo, accountAction.assignedTo) &&
        Objects.equals(this.assignedFrom, accountAction.assignedFrom) &&
        Objects.equals(this.id, accountAction.id) &&
        Objects.equals(this.user, accountAction.user) &&
        Objects.equals(this.dealer, accountAction.dealer) &&
        Objects.equals(this.accountId, accountAction.accountId) &&
        Objects.equals(this.dateAdded, accountAction.dateAdded) &&
        Objects.equals(this.createdAt, accountAction.createdAt) &&
        Objects.equals(this.updatedAt, accountAction.updatedAt) &&
        Objects.equals(this.recordSource, accountAction.recordSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, actionTaken, assignedTo, assignedFrom, id, user, dealer, accountId, dateAdded, createdAt, updatedAt, recordSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAction {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    actionTaken: ").append(toIndentedString(actionTaken)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    assignedFrom: ").append(toIndentedString(assignedFrom)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    dealer: ").append(toIndentedString(dealer)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    recordSource: ").append(toIndentedString(recordSource)).append("\n");
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
