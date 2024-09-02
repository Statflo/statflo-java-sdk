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
 * MessageTemplateCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-01T23:29:38.928030-04:00[America/Toronto]")

public class MessageTemplateCreate {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageTemplateCreate messageTemplateCreate = (MessageTemplateCreate) o;
    return Objects.equals(this.templateName, messageTemplateCreate.templateName) &&
        Objects.equals(this.language, messageTemplateCreate.language) &&
        Objects.equals(this.metadata, messageTemplateCreate.metadata) &&
        Objects.equals(this.template, messageTemplateCreate.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateName, language, metadata, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageTemplateCreate {\n");
    
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
