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
/**
 * AccountCredential
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-02-03T19:10:57.619356721Z[Etc/UTC]")

public class AccountCredential {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("dealer")
  private OneOfAccountCredentialDealer dealer = null;

  @SerializedName("accountSid")
  private String accountSid = null;

  @SerializedName("authToken")
  private String authToken = null;

  @SerializedName("secondaryBusinessProfileSid")
  private String secondaryBusinessProfileSid = null;

  @SerializedName("addressSid")
  private String addressSid = null;

  @SerializedName("supportingDocumentSid")
  private String supportingDocumentSid = null;

  @SerializedName("customerProfileBusinessInformationSid")
  private String customerProfileBusinessInformationSid = null;

  @SerializedName("authorizedRepresentativeSid")
  private String authorizedRepresentativeSid = null;

  @SerializedName("messagingServiceId")
  private String messagingServiceId = null;

  public AccountCredential id(Integer id) {
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

  public AccountCredential dealer(OneOfAccountCredentialDealer dealer) {
    this.dealer = dealer;
    return this;
  }

   /**
   * Get dealer
   * @return dealer
  **/
  @Schema(description = "")
  public OneOfAccountCredentialDealer getDealer() {
    return dealer;
  }

  public void setDealer(OneOfAccountCredentialDealer dealer) {
    this.dealer = dealer;
  }

  public AccountCredential accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

   /**
   * Get accountSid
   * @return accountSid
  **/
  @Schema(description = "")
  public String getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }

  public AccountCredential authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

   /**
   * Get authToken
   * @return authToken
  **/
  @Schema(description = "")
  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }

  public AccountCredential secondaryBusinessProfileSid(String secondaryBusinessProfileSid) {
    this.secondaryBusinessProfileSid = secondaryBusinessProfileSid;
    return this;
  }

   /**
   * Get secondaryBusinessProfileSid
   * @return secondaryBusinessProfileSid
  **/
  @Schema(description = "")
  public String getSecondaryBusinessProfileSid() {
    return secondaryBusinessProfileSid;
  }

  public void setSecondaryBusinessProfileSid(String secondaryBusinessProfileSid) {
    this.secondaryBusinessProfileSid = secondaryBusinessProfileSid;
  }

  public AccountCredential addressSid(String addressSid) {
    this.addressSid = addressSid;
    return this;
  }

   /**
   * Get addressSid
   * @return addressSid
  **/
  @Schema(description = "")
  public String getAddressSid() {
    return addressSid;
  }

  public void setAddressSid(String addressSid) {
    this.addressSid = addressSid;
  }

  public AccountCredential supportingDocumentSid(String supportingDocumentSid) {
    this.supportingDocumentSid = supportingDocumentSid;
    return this;
  }

   /**
   * Get supportingDocumentSid
   * @return supportingDocumentSid
  **/
  @Schema(description = "")
  public String getSupportingDocumentSid() {
    return supportingDocumentSid;
  }

  public void setSupportingDocumentSid(String supportingDocumentSid) {
    this.supportingDocumentSid = supportingDocumentSid;
  }

  public AccountCredential customerProfileBusinessInformationSid(String customerProfileBusinessInformationSid) {
    this.customerProfileBusinessInformationSid = customerProfileBusinessInformationSid;
    return this;
  }

   /**
   * Get customerProfileBusinessInformationSid
   * @return customerProfileBusinessInformationSid
  **/
  @Schema(description = "")
  public String getCustomerProfileBusinessInformationSid() {
    return customerProfileBusinessInformationSid;
  }

  public void setCustomerProfileBusinessInformationSid(String customerProfileBusinessInformationSid) {
    this.customerProfileBusinessInformationSid = customerProfileBusinessInformationSid;
  }

  public AccountCredential authorizedRepresentativeSid(String authorizedRepresentativeSid) {
    this.authorizedRepresentativeSid = authorizedRepresentativeSid;
    return this;
  }

   /**
   * Get authorizedRepresentativeSid
   * @return authorizedRepresentativeSid
  **/
  @Schema(description = "")
  public String getAuthorizedRepresentativeSid() {
    return authorizedRepresentativeSid;
  }

  public void setAuthorizedRepresentativeSid(String authorizedRepresentativeSid) {
    this.authorizedRepresentativeSid = authorizedRepresentativeSid;
  }

  public AccountCredential messagingServiceId(String messagingServiceId) {
    this.messagingServiceId = messagingServiceId;
    return this;
  }

   /**
   * Get messagingServiceId
   * @return messagingServiceId
  **/
  @Schema(description = "")
  public String getMessagingServiceId() {
    return messagingServiceId;
  }

  public void setMessagingServiceId(String messagingServiceId) {
    this.messagingServiceId = messagingServiceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCredential accountCredential = (AccountCredential) o;
    return Objects.equals(this.id, accountCredential.id) &&
        Objects.equals(this.dealer, accountCredential.dealer) &&
        Objects.equals(this.accountSid, accountCredential.accountSid) &&
        Objects.equals(this.authToken, accountCredential.authToken) &&
        Objects.equals(this.secondaryBusinessProfileSid, accountCredential.secondaryBusinessProfileSid) &&
        Objects.equals(this.addressSid, accountCredential.addressSid) &&
        Objects.equals(this.supportingDocumentSid, accountCredential.supportingDocumentSid) &&
        Objects.equals(this.customerProfileBusinessInformationSid, accountCredential.customerProfileBusinessInformationSid) &&
        Objects.equals(this.authorizedRepresentativeSid, accountCredential.authorizedRepresentativeSid) &&
        Objects.equals(this.messagingServiceId, accountCredential.messagingServiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dealer, accountSid, authToken, secondaryBusinessProfileSid, addressSid, supportingDocumentSid, customerProfileBusinessInformationSid, authorizedRepresentativeSid, messagingServiceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCredential {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dealer: ").append(toIndentedString(dealer)).append("\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    secondaryBusinessProfileSid: ").append(toIndentedString(secondaryBusinessProfileSid)).append("\n");
    sb.append("    addressSid: ").append(toIndentedString(addressSid)).append("\n");
    sb.append("    supportingDocumentSid: ").append(toIndentedString(supportingDocumentSid)).append("\n");
    sb.append("    customerProfileBusinessInformationSid: ").append(toIndentedString(customerProfileBusinessInformationSid)).append("\n");
    sb.append("    authorizedRepresentativeSid: ").append(toIndentedString(authorizedRepresentativeSid)).append("\n");
    sb.append("    messagingServiceId: ").append(toIndentedString(messagingServiceId)).append("\n");
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
