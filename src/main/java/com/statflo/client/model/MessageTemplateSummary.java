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
import com.statflo.client.model.Carrier;
import com.statflo.client.model.Dealer;
import com.statflo.client.model.MessageTemplateAssignment;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * MessageTemplateSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-12T16:24:49.446464Z[Etc/UTC]")
public class MessageTemplateSummary {
  @SerializedName("id")
  private String id = null;

  @SerializedName("carrier")
  private Carrier carrier = null;

  @SerializedName("dealer")
  private Dealer dealer = null;

  @SerializedName("templateName")
  private String templateName = null;

  @SerializedName("language")
  private String language = "en";

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("template")
  private Object template = null;

  @SerializedName("callListId")
  private Integer callListId = null;

  @SerializedName("priority")
  private Integer priority = 100;

  @SerializedName("dateDeleted")
  private OffsetDateTime dateDeleted = null;

  @SerializedName("messageTemplateAssignments")
  private List<MessageTemplateAssignment> messageTemplateAssignments = null;

  public MessageTemplateSummary id(String id) {
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

  public MessageTemplateSummary carrier(Carrier carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Get carrier
   * @return carrier
  **/
  @Schema(description = "")
  public Carrier getCarrier() {
    return carrier;
  }

  public void setCarrier(Carrier carrier) {
    this.carrier = carrier;
  }

  public MessageTemplateSummary dealer(Dealer dealer) {
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

  public MessageTemplateSummary templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @Schema(description = "")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public MessageTemplateSummary language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @Schema(description = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public MessageTemplateSummary metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public MessageTemplateSummary template(Object template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @Schema(description = "")
  public Object getTemplate() {
    return template;
  }

  public void setTemplate(Object template) {
    this.template = template;
  }

  public MessageTemplateSummary callListId(Integer callListId) {
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

  public MessageTemplateSummary priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public MessageTemplateSummary dateDeleted(OffsetDateTime dateDeleted) {
    this.dateDeleted = dateDeleted;
    return this;
  }

   /**
   * Get dateDeleted
   * @return dateDeleted
  **/
  @Schema(description = "")
  public OffsetDateTime getDateDeleted() {
    return dateDeleted;
  }

  public void setDateDeleted(OffsetDateTime dateDeleted) {
    this.dateDeleted = dateDeleted;
  }

  public MessageTemplateSummary messageTemplateAssignments(List<MessageTemplateAssignment> messageTemplateAssignments) {
    this.messageTemplateAssignments = messageTemplateAssignments;
    return this;
  }

  public MessageTemplateSummary addMessageTemplateAssignmentsItem(MessageTemplateAssignment messageTemplateAssignmentsItem) {
    if (this.messageTemplateAssignments == null) {
      this.messageTemplateAssignments = new ArrayList<MessageTemplateAssignment>();
    }
    this.messageTemplateAssignments.add(messageTemplateAssignmentsItem);
    return this;
  }

   /**
   * Get messageTemplateAssignments
   * @return messageTemplateAssignments
  **/
  @Schema(description = "")
  public List<MessageTemplateAssignment> getMessageTemplateAssignments() {
    return messageTemplateAssignments;
  }

  public void setMessageTemplateAssignments(List<MessageTemplateAssignment> messageTemplateAssignments) {
    this.messageTemplateAssignments = messageTemplateAssignments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageTemplateSummary messageTemplateSummary = (MessageTemplateSummary) o;
    return Objects.equals(this.id, messageTemplateSummary.id) &&
        Objects.equals(this.carrier, messageTemplateSummary.carrier) &&
        Objects.equals(this.dealer, messageTemplateSummary.dealer) &&
        Objects.equals(this.templateName, messageTemplateSummary.templateName) &&
        Objects.equals(this.language, messageTemplateSummary.language) &&
        Objects.equals(this.metadata, messageTemplateSummary.metadata) &&
        Objects.equals(this.template, messageTemplateSummary.template) &&
        Objects.equals(this.callListId, messageTemplateSummary.callListId) &&
        Objects.equals(this.priority, messageTemplateSummary.priority) &&
        Objects.equals(this.dateDeleted, messageTemplateSummary.dateDeleted) &&
        Objects.equals(this.messageTemplateAssignments, messageTemplateSummary.messageTemplateAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, carrier, dealer, templateName, language, metadata, template, callListId, priority, dateDeleted, messageTemplateAssignments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageTemplateSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    dealer: ").append(toIndentedString(dealer)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    callListId: ").append(toIndentedString(callListId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    dateDeleted: ").append(toIndentedString(dateDeleted)).append("\n");
    sb.append("    messageTemplateAssignments: ").append(toIndentedString(messageTemplateAssignments)).append("\n");
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
