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
import com.statflo.client.model.Contact;
import com.statflo.client.model.Dealer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * ConversationSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-02-03T19:10:57.619356721Z[Etc/UTC]")

public class ConversationSummary {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("dealer")
  private Dealer dealer = null;

  @SerializedName("contact")
  private Contact contact = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("lastReadMessageId")
  private Integer lastReadMessageId = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("textkitId")
  private String textkitId = null;

  @SerializedName("opportunityScore")
  private Integer opportunityScore = 0;

  @SerializedName("insightsWidgetPayload")
  private List<Object> insightsWidgetPayload = null;

  @SerializedName("dateAdded")
  private OffsetDateTime dateAdded = null;

  public ConversationSummary id(Integer id) {
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

  public ConversationSummary dealer(Dealer dealer) {
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

  public ConversationSummary contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @Schema(description = "")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public ConversationSummary accountId(String accountId) {
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

  public ConversationSummary lastReadMessageId(Integer lastReadMessageId) {
    this.lastReadMessageId = lastReadMessageId;
    return this;
  }

   /**
   * Get lastReadMessageId
   * @return lastReadMessageId
  **/
  @Schema(description = "")
  public Integer getLastReadMessageId() {
    return lastReadMessageId;
  }

  public void setLastReadMessageId(Integer lastReadMessageId) {
    this.lastReadMessageId = lastReadMessageId;
  }

  public ConversationSummary status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ConversationSummary textkitId(String textkitId) {
    this.textkitId = textkitId;
    return this;
  }

   /**
   * Get textkitId
   * @return textkitId
  **/
  @Schema(description = "")
  public String getTextkitId() {
    return textkitId;
  }

  public void setTextkitId(String textkitId) {
    this.textkitId = textkitId;
  }

  public ConversationSummary opportunityScore(Integer opportunityScore) {
    this.opportunityScore = opportunityScore;
    return this;
  }

   /**
   * Get opportunityScore
   * @return opportunityScore
  **/
  @Schema(description = "")
  public Integer getOpportunityScore() {
    return opportunityScore;
  }

  public void setOpportunityScore(Integer opportunityScore) {
    this.opportunityScore = opportunityScore;
  }

  public ConversationSummary insightsWidgetPayload(List<Object> insightsWidgetPayload) {
    this.insightsWidgetPayload = insightsWidgetPayload;
    return this;
  }

  public ConversationSummary addInsightsWidgetPayloadItem(Object insightsWidgetPayloadItem) {
    if (this.insightsWidgetPayload == null) {
      this.insightsWidgetPayload = new ArrayList<Object>();
    }
    this.insightsWidgetPayload.add(insightsWidgetPayloadItem);
    return this;
  }

   /**
   * Get insightsWidgetPayload
   * @return insightsWidgetPayload
  **/
  @Schema(description = "")
  public List<Object> getInsightsWidgetPayload() {
    return insightsWidgetPayload;
  }

  public void setInsightsWidgetPayload(List<Object> insightsWidgetPayload) {
    this.insightsWidgetPayload = insightsWidgetPayload;
  }

  public ConversationSummary dateAdded(OffsetDateTime dateAdded) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationSummary conversationSummary = (ConversationSummary) o;
    return Objects.equals(this.id, conversationSummary.id) &&
        Objects.equals(this.dealer, conversationSummary.dealer) &&
        Objects.equals(this.contact, conversationSummary.contact) &&
        Objects.equals(this.accountId, conversationSummary.accountId) &&
        Objects.equals(this.lastReadMessageId, conversationSummary.lastReadMessageId) &&
        Objects.equals(this.status, conversationSummary.status) &&
        Objects.equals(this.textkitId, conversationSummary.textkitId) &&
        Objects.equals(this.opportunityScore, conversationSummary.opportunityScore) &&
        Objects.equals(this.insightsWidgetPayload, conversationSummary.insightsWidgetPayload) &&
        Objects.equals(this.dateAdded, conversationSummary.dateAdded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dealer, contact, accountId, lastReadMessageId, status, textkitId, opportunityScore, insightsWidgetPayload, dateAdded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dealer: ").append(toIndentedString(dealer)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    lastReadMessageId: ").append(toIndentedString(lastReadMessageId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    textkitId: ").append(toIndentedString(textkitId)).append("\n");
    sb.append("    opportunityScore: ").append(toIndentedString(opportunityScore)).append("\n");
    sb.append("    insightsWidgetPayload: ").append(toIndentedString(insightsWidgetPayload)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
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
