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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * MessageTemplateCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-31T16:40:11.632131-04:00[America/Toronto]")

public class MessageTemplateCreate {
  @SerializedName("id")
  private String id = null;

  @SerializedName("templateName")
  private String templateName = null;

  /**
   * Gets or Sets language
   */
  @JsonAdapter(LanguageEnum.Adapter.class)
  public enum LanguageEnum {
    @SerializedName("en")
    EN("en"),
    @SerializedName("fr")
    FR("fr"),
    @SerializedName("cmn")
    CMN("cmn"),
    @SerializedName("es")
    ES("es"),
    @SerializedName("yue")
    YUE("yue"),
    @SerializedName("ar")
    AR("ar"),
    @SerializedName("ko")
    KO("ko"),
    @SerializedName("pa")
    PA("pa"),
    @SerializedName("tl")
    TL("tl"),
    @SerializedName("fa")
    FA("fa");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LanguageEnum fromValue(String input) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LanguageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LanguageEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public LanguageEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return LanguageEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("language")
  private LanguageEnum language = LanguageEnum.EN;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("template")
  private Object template = null;

  @SerializedName("priority")
  private Integer priority = 100;

  @SerializedName("categoryIds")
  private List<Integer> categoryIds = null;

  @SerializedName("dateCreated")
  private OffsetDateTime dateCreated = null;

  public MessageTemplateCreate id(String id) {
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

  public MessageTemplateCreate templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @Schema(required = true, description = "")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public MessageTemplateCreate language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @Schema(description = "")
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  public MessageTemplateCreate metadata(Object metadata) {
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

  public MessageTemplateCreate template(Object template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @Schema(required = true, description = "")
  public Object getTemplate() {
    return template;
  }

  public void setTemplate(Object template) {
    this.template = template;
  }

  public MessageTemplateCreate priority(Integer priority) {
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

  public MessageTemplateCreate categoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public MessageTemplateCreate addCategoryIdsItem(Integer categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

   /**
   * Get categoryIds
   * @return categoryIds
  **/
  @Schema(description = "")
  public List<Integer> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public MessageTemplateCreate dateCreated(OffsetDateTime dateCreated) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageTemplateCreate messageTemplateCreate = (MessageTemplateCreate) o;
    return Objects.equals(this.id, messageTemplateCreate.id) &&
        Objects.equals(this.templateName, messageTemplateCreate.templateName) &&
        Objects.equals(this.language, messageTemplateCreate.language) &&
        Objects.equals(this.metadata, messageTemplateCreate.metadata) &&
        Objects.equals(this.template, messageTemplateCreate.template) &&
        Objects.equals(this.priority, messageTemplateCreate.priority) &&
        Objects.equals(this.categoryIds, messageTemplateCreate.categoryIds) &&
        Objects.equals(this.dateCreated, messageTemplateCreate.dateCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, templateName, language, metadata, template, priority, categoryIds, dateCreated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageTemplateCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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
