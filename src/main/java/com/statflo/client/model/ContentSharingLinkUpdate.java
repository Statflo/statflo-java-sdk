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
/**
 * ContentSharingLinkUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-31T16:40:11.632131-04:00[America/Toronto]")

public class ContentSharingLinkUpdate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("categoryId")
  private Integer categoryId = null;

  /**
   * Gets or Sets language
   */
  @JsonAdapter(LanguageEnum.Adapter.class)
  public enum LanguageEnum {
    @SerializedName("en")
    EN("en"),
    @SerializedName("fr")
    FR("fr"),
    @SerializedName("es")
    ES("es"),
    @SerializedName("yue")
    YUE("yue"),
    @SerializedName("cmn")
    CMN("cmn"),
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
  private LanguageEnum language = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("status")
  private Boolean status = null;

  @SerializedName("displayOrder")
  private Integer displayOrder = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  public ContentSharingLinkUpdate id(Integer id) {
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

  public ContentSharingLinkUpdate categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @Schema(required = true, description = "")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public ContentSharingLinkUpdate language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @Schema(required = true, description = "")
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  public ContentSharingLinkUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContentSharingLinkUpdate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ContentSharingLinkUpdate url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(required = true, description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ContentSharingLinkUpdate image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @Schema(description = "")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public ContentSharingLinkUpdate status(Boolean status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public Boolean isStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public ContentSharingLinkUpdate displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Get displayOrder
   * @return displayOrder
  **/
  @Schema(required = true, description = "")
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  public ContentSharingLinkUpdate createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ContentSharingLinkUpdate updatedAt(OffsetDateTime updatedAt) {
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
    ContentSharingLinkUpdate contentSharingLinkUpdate = (ContentSharingLinkUpdate) o;
    return Objects.equals(this.id, contentSharingLinkUpdate.id) &&
        Objects.equals(this.categoryId, contentSharingLinkUpdate.categoryId) &&
        Objects.equals(this.language, contentSharingLinkUpdate.language) &&
        Objects.equals(this.name, contentSharingLinkUpdate.name) &&
        Objects.equals(this.description, contentSharingLinkUpdate.description) &&
        Objects.equals(this.url, contentSharingLinkUpdate.url) &&
        Objects.equals(this.image, contentSharingLinkUpdate.image) &&
        Objects.equals(this.status, contentSharingLinkUpdate.status) &&
        Objects.equals(this.displayOrder, contentSharingLinkUpdate.displayOrder) &&
        Objects.equals(this.createdAt, contentSharingLinkUpdate.createdAt) &&
        Objects.equals(this.updatedAt, contentSharingLinkUpdate.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, categoryId, language, name, description, url, image, status, displayOrder, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentSharingLinkUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
