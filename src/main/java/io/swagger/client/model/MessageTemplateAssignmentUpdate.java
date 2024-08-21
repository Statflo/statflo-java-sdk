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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MessageTemplateAssignmentUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-08-21T15:24:44.515981-04:00[America/Toronto]")

public class MessageTemplateAssignmentUpdate {
  @SerializedName("propertyId")
  private Integer propertyId = null;

  @SerializedName("templateId")
  private String templateId = null;

  @SerializedName("priority")
  private Integer priority = 100;

  public MessageTemplateAssignmentUpdate propertyId(Integer propertyId) {
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Get propertyId
   * @return propertyId
  **/
  @Schema(description = "")
  public Integer getPropertyId() {
    return propertyId;
  }

  public void setPropertyId(Integer propertyId) {
    this.propertyId = propertyId;
  }

  public MessageTemplateAssignmentUpdate templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @Schema(description = "")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public MessageTemplateAssignmentUpdate priority(Integer priority) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageTemplateAssignmentUpdate messageTemplateAssignmentUpdate = (MessageTemplateAssignmentUpdate) o;
    return Objects.equals(this.propertyId, messageTemplateAssignmentUpdate.propertyId) &&
        Objects.equals(this.templateId, messageTemplateAssignmentUpdate.templateId) &&
        Objects.equals(this.priority, messageTemplateAssignmentUpdate.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyId, templateId, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageTemplateAssignmentUpdate {\n");
    
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
