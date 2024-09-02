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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.CampaignProperty;
import io.swagger.client.model.Dealer;
import io.swagger.client.model.MessageTemplate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * MessageTemplateAssignmentSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-01T23:29:38.928030-04:00[America/Toronto]")

public class MessageTemplateAssignmentSummary {
  @SerializedName("id")
  private String id = null;

  @SerializedName("property")
  private CampaignProperty property = null;

  @SerializedName("template")
  private MessageTemplate template = null;

  @SerializedName("dealer")
  private Dealer dealer = null;

  @SerializedName("priority")
  private Integer priority = 100;

  @SerializedName("assignDate")
  private OffsetDateTime assignDate = null;

  @SerializedName("dateUpdate")
  private OffsetDateTime dateUpdate = null;

  @SerializedName("unassignDate")
  private OffsetDateTime unassignDate = null;

  public MessageTemplateAssignmentSummary id(String id) {
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

  public MessageTemplateAssignmentSummary property(CampaignProperty property) {
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @Schema(description = "")
  public CampaignProperty getProperty() {
    return property;
  }

  public void setProperty(CampaignProperty property) {
    this.property = property;
  }

  public MessageTemplateAssignmentSummary template(MessageTemplate template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @Schema(description = "")
  public MessageTemplate getTemplate() {
    return template;
  }

  public void setTemplate(MessageTemplate template) {
    this.template = template;
  }

  public MessageTemplateAssignmentSummary dealer(Dealer dealer) {
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

  public MessageTemplateAssignmentSummary priority(Integer priority) {
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

  public MessageTemplateAssignmentSummary assignDate(OffsetDateTime assignDate) {
    this.assignDate = assignDate;
    return this;
  }

   /**
   * Get assignDate
   * @return assignDate
  **/
  @Schema(description = "")
  public OffsetDateTime getAssignDate() {
    return assignDate;
  }

  public void setAssignDate(OffsetDateTime assignDate) {
    this.assignDate = assignDate;
  }

  public MessageTemplateAssignmentSummary dateUpdate(OffsetDateTime dateUpdate) {
    this.dateUpdate = dateUpdate;
    return this;
  }

   /**
   * Get dateUpdate
   * @return dateUpdate
  **/
  @Schema(description = "")
  public OffsetDateTime getDateUpdate() {
    return dateUpdate;
  }

  public void setDateUpdate(OffsetDateTime dateUpdate) {
    this.dateUpdate = dateUpdate;
  }

  public MessageTemplateAssignmentSummary unassignDate(OffsetDateTime unassignDate) {
    this.unassignDate = unassignDate;
    return this;
  }

   /**
   * Get unassignDate
   * @return unassignDate
  **/
  @Schema(description = "")
  public OffsetDateTime getUnassignDate() {
    return unassignDate;
  }

  public void setUnassignDate(OffsetDateTime unassignDate) {
    this.unassignDate = unassignDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageTemplateAssignmentSummary messageTemplateAssignmentSummary = (MessageTemplateAssignmentSummary) o;
    return Objects.equals(this.id, messageTemplateAssignmentSummary.id) &&
        Objects.equals(this.property, messageTemplateAssignmentSummary.property) &&
        Objects.equals(this.template, messageTemplateAssignmentSummary.template) &&
        Objects.equals(this.dealer, messageTemplateAssignmentSummary.dealer) &&
        Objects.equals(this.priority, messageTemplateAssignmentSummary.priority) &&
        Objects.equals(this.assignDate, messageTemplateAssignmentSummary.assignDate) &&
        Objects.equals(this.dateUpdate, messageTemplateAssignmentSummary.dateUpdate) &&
        Objects.equals(this.unassignDate, messageTemplateAssignmentSummary.unassignDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, property, template, dealer, priority, assignDate, dateUpdate, unassignDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageTemplateAssignmentSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    dealer: ").append(toIndentedString(dealer)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    assignDate: ").append(toIndentedString(assignDate)).append("\n");
    sb.append("    dateUpdate: ").append(toIndentedString(dateUpdate)).append("\n");
    sb.append("    unassignDate: ").append(toIndentedString(unassignDate)).append("\n");
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
