/*
 * Statflo API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: STATFLO-2697
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
import java.time.OffsetDateTime;
/**
 * NotepadSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-28T11:04:44.576146-04:00[America/Toronto]")

public class NotepadSummary {
  @SerializedName("message")
  private String message = null;

  @SerializedName("subject")
  private String subject = null;

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

  public NotepadSummary message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public NotepadSummary subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @Schema(description = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public NotepadSummary id(Integer id) {
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

  public NotepadSummary user(User user) {
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

  public NotepadSummary dealer(Dealer dealer) {
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

  public NotepadSummary accountId(String accountId) {
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

  public NotepadSummary dateAdded(OffsetDateTime dateAdded) {
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

  public NotepadSummary createdAt(OffsetDateTime createdAt) {
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

  public NotepadSummary updatedAt(OffsetDateTime updatedAt) {
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

  public NotepadSummary recordSource(String recordSource) {
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
    NotepadSummary notepadSummary = (NotepadSummary) o;
    return Objects.equals(this.message, notepadSummary.message) &&
        Objects.equals(this.subject, notepadSummary.subject) &&
        Objects.equals(this.id, notepadSummary.id) &&
        Objects.equals(this.user, notepadSummary.user) &&
        Objects.equals(this.dealer, notepadSummary.dealer) &&
        Objects.equals(this.accountId, notepadSummary.accountId) &&
        Objects.equals(this.dateAdded, notepadSummary.dateAdded) &&
        Objects.equals(this.createdAt, notepadSummary.createdAt) &&
        Objects.equals(this.updatedAt, notepadSummary.updatedAt) &&
        Objects.equals(this.recordSource, notepadSummary.recordSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, subject, id, user, dealer, accountId, dateAdded, createdAt, updatedAt, recordSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotepadSummary {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
