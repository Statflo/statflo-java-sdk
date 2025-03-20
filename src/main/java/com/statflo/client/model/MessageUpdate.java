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
import java.time.OffsetDateTime;
/**
 * MessageUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-20T20:15:05.814297111Z[Etc/UTC]")

public class MessageUpdate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("conversationId")
  private Integer conversationId = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("provider")
  private String provider = "twilio";

  @SerializedName("referenceId")
  private String referenceId = null;

  /**
   * Gets or Sets deliveryStatus
   */
  @JsonAdapter(DeliveryStatusEnum.Adapter.class)
  public enum DeliveryStatusEnum {
    @SerializedName("new")
    NEW("new"),
    @SerializedName("ok")
    OK("ok"),
    @SerializedName("error")
    ERROR("error"),
    @SerializedName("rejected")
    REJECTED("rejected"),
    @SerializedName("failed")
    FAILED("failed"),
    @SerializedName("auto")
    AUTO("auto");

    private String value;

    DeliveryStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DeliveryStatusEnum fromValue(String input) {
      for (DeliveryStatusEnum b : DeliveryStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DeliveryStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DeliveryStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DeliveryStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("deliveryStatus")
  private DeliveryStatusEnum deliveryStatus = DeliveryStatusEnum.NEW;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("associatedAppPhoneNumber")
  private String associatedAppPhoneNumber = null;

  /**
   * Gets or Sets associatedAppPhoneNumberType
   */
  @JsonAdapter(AssociatedAppPhoneNumberTypeEnum.Adapter.class)
  public enum AssociatedAppPhoneNumberTypeEnum {
    @SerializedName("masquerade")
    MASQUERADE("masquerade"),
    @SerializedName("primary")
    PRIMARY("primary"),
    @SerializedName("private")
    PRIVATE("private"),
    @SerializedName("outlet")
    OUTLET("outlet");

    private String value;

    AssociatedAppPhoneNumberTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AssociatedAppPhoneNumberTypeEnum fromValue(String input) {
      for (AssociatedAppPhoneNumberTypeEnum b : AssociatedAppPhoneNumberTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AssociatedAppPhoneNumberTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssociatedAppPhoneNumberTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AssociatedAppPhoneNumberTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AssociatedAppPhoneNumberTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("associatedAppPhoneNumberType")
  private AssociatedAppPhoneNumberTypeEnum associatedAppPhoneNumberType = null;

  @SerializedName("messageTemplateId")
  private String messageTemplateId = null;

  @SerializedName("dateAdded")
  private OffsetDateTime dateAdded = null;

  @SerializedName("dateSent")
  private OffsetDateTime dateSent = null;

  public MessageUpdate id(Integer id) {
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

  public MessageUpdate userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public MessageUpdate conversationId(Integer conversationId) {
    this.conversationId = conversationId;
    return this;
  }

   /**
   * Get conversationId
   * @return conversationId
  **/
  @Schema(description = "")
  public Integer getConversationId() {
    return conversationId;
  }

  public void setConversationId(Integer conversationId) {
    this.conversationId = conversationId;
  }

  public MessageUpdate content(String content) {
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

  public MessageUpdate action(String action) {
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

  public MessageUpdate provider(String provider) {
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

  public MessageUpdate referenceId(String referenceId) {
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

  public MessageUpdate deliveryStatus(DeliveryStatusEnum deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @Schema(description = "")
  public DeliveryStatusEnum getDeliveryStatus() {
    return deliveryStatus;
  }

  public void setDeliveryStatus(DeliveryStatusEnum deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }

  public MessageUpdate ipAddress(String ipAddress) {
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

  public MessageUpdate associatedAppPhoneNumber(String associatedAppPhoneNumber) {
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

  public MessageUpdate associatedAppPhoneNumberType(AssociatedAppPhoneNumberTypeEnum associatedAppPhoneNumberType) {
    this.associatedAppPhoneNumberType = associatedAppPhoneNumberType;
    return this;
  }

   /**
   * Get associatedAppPhoneNumberType
   * @return associatedAppPhoneNumberType
  **/
  @Schema(description = "")
  public AssociatedAppPhoneNumberTypeEnum getAssociatedAppPhoneNumberType() {
    return associatedAppPhoneNumberType;
  }

  public void setAssociatedAppPhoneNumberType(AssociatedAppPhoneNumberTypeEnum associatedAppPhoneNumberType) {
    this.associatedAppPhoneNumberType = associatedAppPhoneNumberType;
  }

  public MessageUpdate messageTemplateId(String messageTemplateId) {
    this.messageTemplateId = messageTemplateId;
    return this;
  }

   /**
   * Get messageTemplateId
   * @return messageTemplateId
  **/
  @Schema(description = "")
  public String getMessageTemplateId() {
    return messageTemplateId;
  }

  public void setMessageTemplateId(String messageTemplateId) {
    this.messageTemplateId = messageTemplateId;
  }

  public MessageUpdate dateAdded(OffsetDateTime dateAdded) {
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

  public MessageUpdate dateSent(OffsetDateTime dateSent) {
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
    MessageUpdate messageUpdate = (MessageUpdate) o;
    return Objects.equals(this.id, messageUpdate.id) &&
        Objects.equals(this.userId, messageUpdate.userId) &&
        Objects.equals(this.conversationId, messageUpdate.conversationId) &&
        Objects.equals(this.content, messageUpdate.content) &&
        Objects.equals(this.action, messageUpdate.action) &&
        Objects.equals(this.provider, messageUpdate.provider) &&
        Objects.equals(this.referenceId, messageUpdate.referenceId) &&
        Objects.equals(this.deliveryStatus, messageUpdate.deliveryStatus) &&
        Objects.equals(this.ipAddress, messageUpdate.ipAddress) &&
        Objects.equals(this.associatedAppPhoneNumber, messageUpdate.associatedAppPhoneNumber) &&
        Objects.equals(this.associatedAppPhoneNumberType, messageUpdate.associatedAppPhoneNumberType) &&
        Objects.equals(this.messageTemplateId, messageUpdate.messageTemplateId) &&
        Objects.equals(this.dateAdded, messageUpdate.dateAdded) &&
        Objects.equals(this.dateSent, messageUpdate.dateSent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, conversationId, content, action, provider, referenceId, deliveryStatus, ipAddress, associatedAppPhoneNumber, associatedAppPhoneNumberType, messageTemplateId, dateAdded, dateSent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    associatedAppPhoneNumber: ").append(toIndentedString(associatedAppPhoneNumber)).append("\n");
    sb.append("    associatedAppPhoneNumberType: ").append(toIndentedString(associatedAppPhoneNumberType)).append("\n");
    sb.append("    messageTemplateId: ").append(toIndentedString(messageTemplateId)).append("\n");
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
