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
import com.statflo.client.model.Conversation;
import com.statflo.client.model.MessageTemplate;
import com.statflo.client.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
/**
 * MessageSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-28T10:12:06.710821-04:00[America/Toronto]")

public class MessageSummary {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("conversation")
  private Conversation conversation = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("provider")
  private String provider = "twilio";

  @SerializedName("referenceId")
  private String referenceId = null;

  @SerializedName("deliveryStatus")
  private String deliveryStatus = "new";

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("associatedAppPhoneNumber")
  private String associatedAppPhoneNumber = null;

  @SerializedName("associatedAppPhoneNumberType")
  private String associatedAppPhoneNumberType = null;

  @SerializedName("messageTemplate")
  private MessageTemplate messageTemplate = null;

  @SerializedName("dateAdded")
  private OffsetDateTime dateAdded = null;

  @SerializedName("dateSent")
  private OffsetDateTime dateSent = null;

  public MessageSummary id(Integer id) {
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

  public MessageSummary user(User user) {
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

  public MessageSummary conversation(Conversation conversation) {
    this.conversation = conversation;
    return this;
  }

   /**
   * Get conversation
   * @return conversation
  **/
  @Schema(description = "")
  public Conversation getConversation() {
    return conversation;
  }

  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
  }

  public MessageSummary content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(required = true, description = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public MessageSummary action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public MessageSummary provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @Schema(description = "")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public MessageSummary referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Get referenceId
   * @return referenceId
  **/
  @Schema(description = "")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public MessageSummary deliveryStatus(String deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @Schema(description = "")
  public String getDeliveryStatus() {
    return deliveryStatus;
  }

  public void setDeliveryStatus(String deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }

  public MessageSummary ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @Schema(description = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public MessageSummary associatedAppPhoneNumber(String associatedAppPhoneNumber) {
    this.associatedAppPhoneNumber = associatedAppPhoneNumber;
    return this;
  }

   /**
   * Get associatedAppPhoneNumber
   * @return associatedAppPhoneNumber
  **/
  @Schema(description = "")
  public String getAssociatedAppPhoneNumber() {
    return associatedAppPhoneNumber;
  }

  public void setAssociatedAppPhoneNumber(String associatedAppPhoneNumber) {
    this.associatedAppPhoneNumber = associatedAppPhoneNumber;
  }

  public MessageSummary associatedAppPhoneNumberType(String associatedAppPhoneNumberType) {
    this.associatedAppPhoneNumberType = associatedAppPhoneNumberType;
    return this;
  }

   /**
   * Get associatedAppPhoneNumberType
   * @return associatedAppPhoneNumberType
  **/
  @Schema(description = "")
  public String getAssociatedAppPhoneNumberType() {
    return associatedAppPhoneNumberType;
  }

  public void setAssociatedAppPhoneNumberType(String associatedAppPhoneNumberType) {
    this.associatedAppPhoneNumberType = associatedAppPhoneNumberType;
  }

  public MessageSummary messageTemplate(MessageTemplate messageTemplate) {
    this.messageTemplate = messageTemplate;
    return this;
  }

   /**
   * Get messageTemplate
   * @return messageTemplate
  **/
  @Schema(description = "")
  public MessageTemplate getMessageTemplate() {
    return messageTemplate;
  }

  public void setMessageTemplate(MessageTemplate messageTemplate) {
    this.messageTemplate = messageTemplate;
  }

  public MessageSummary dateAdded(OffsetDateTime dateAdded) {
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

  public MessageSummary dateSent(OffsetDateTime dateSent) {
    this.dateSent = dateSent;
    return this;
  }

   /**
   * Get dateSent
   * @return dateSent
  **/
  @Schema(description = "")
  public OffsetDateTime getDateSent() {
    return dateSent;
  }

  public void setDateSent(OffsetDateTime dateSent) {
    this.dateSent = dateSent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageSummary messageSummary = (MessageSummary) o;
    return Objects.equals(this.id, messageSummary.id) &&
        Objects.equals(this.user, messageSummary.user) &&
        Objects.equals(this.conversation, messageSummary.conversation) &&
        Objects.equals(this.content, messageSummary.content) &&
        Objects.equals(this.action, messageSummary.action) &&
        Objects.equals(this.provider, messageSummary.provider) &&
        Objects.equals(this.referenceId, messageSummary.referenceId) &&
        Objects.equals(this.deliveryStatus, messageSummary.deliveryStatus) &&
        Objects.equals(this.ipAddress, messageSummary.ipAddress) &&
        Objects.equals(this.associatedAppPhoneNumber, messageSummary.associatedAppPhoneNumber) &&
        Objects.equals(this.associatedAppPhoneNumberType, messageSummary.associatedAppPhoneNumberType) &&
        Objects.equals(this.messageTemplate, messageSummary.messageTemplate) &&
        Objects.equals(this.dateAdded, messageSummary.dateAdded) &&
        Objects.equals(this.dateSent, messageSummary.dateSent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, conversation, content, action, provider, referenceId, deliveryStatus, ipAddress, associatedAppPhoneNumber, associatedAppPhoneNumberType, messageTemplate, dateAdded, dateSent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    associatedAppPhoneNumber: ").append(toIndentedString(associatedAppPhoneNumber)).append("\n");
    sb.append("    associatedAppPhoneNumberType: ").append(toIndentedString(associatedAppPhoneNumberType)).append("\n");
    sb.append("    messageTemplate: ").append(toIndentedString(messageTemplate)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    dateSent: ").append(toIndentedString(dateSent)).append("\n");
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
