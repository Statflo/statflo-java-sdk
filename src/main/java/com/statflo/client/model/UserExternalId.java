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
 * UserExternalId
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-02-03T19:10:57.619356721Z[Etc/UTC]")

public class UserExternalId {
  @SerializedName("id")
  private String id = null;

  @SerializedName("dealer")
  private Dealer dealer = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("fieldName")
  private String fieldName = null;

  @SerializedName("fieldValue")
  private String fieldValue = null;

  @SerializedName("recordSource")
  private String recordSource = "api";

  @SerializedName("dateCreated")
  private OffsetDateTime dateCreated = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  public UserExternalId id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserExternalId dealer(Dealer dealer) {
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

  public UserExternalId user(User user) {
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

  public UserExternalId provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @Schema(required = true, description = "")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public UserExternalId fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Get fieldName
   * @return fieldName
  **/
  @Schema(required = true, description = "")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public UserExternalId fieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

   /**
   * Get fieldValue
   * @return fieldValue
  **/
  @Schema(required = true, description = "")
  public String getFieldValue() {
    return fieldValue;
  }

  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }

  public UserExternalId recordSource(String recordSource) {
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

  public UserExternalId dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public UserExternalId updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
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
    UserExternalId userExternalId = (UserExternalId) o;
    return Objects.equals(this.id, userExternalId.id) &&
        Objects.equals(this.dealer, userExternalId.dealer) &&
        Objects.equals(this.user, userExternalId.user) &&
        Objects.equals(this.provider, userExternalId.provider) &&
        Objects.equals(this.fieldName, userExternalId.fieldName) &&
        Objects.equals(this.fieldValue, userExternalId.fieldValue) &&
        Objects.equals(this.recordSource, userExternalId.recordSource) &&
        Objects.equals(this.dateCreated, userExternalId.dateCreated) &&
        Objects.equals(this.updatedAt, userExternalId.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dealer, user, provider, fieldName, fieldValue, recordSource, dateCreated, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserExternalId {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dealer: ").append(toIndentedString(dealer)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("    recordSource: ").append(toIndentedString(recordSource)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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
