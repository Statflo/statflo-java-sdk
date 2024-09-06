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
 * CampaignMetadataUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-05T21:23:30.303929-04:00[America/Toronto]")

public class CampaignMetadataUpdate {
  @SerializedName("campaignId")
  private Integer campaignId = null;

  /**
   * Gets or Sets metadata
   */
  @JsonAdapter(MetadataEnum.Adapter.class)
  public enum MetadataEnum {
    @SerializedName("visibility_crm")
    VISIBILITY_CRM("visibility_crm"),
    @SerializedName("visibility_report")
    VISIBILITY_REPORT("visibility_report"),
    @SerializedName("translations")
    TRANSLATIONS("translations"),
    @SerializedName("call_list_priority")
    CALL_LIST_PRIORITY("call_list_priority"),
    @SerializedName("override_default_visibility")
    OVERRIDE_DEFAULT_VISIBILITY("override_default_visibility"),
    @SerializedName("visibility_lead_selection")
    VISIBILITY_LEAD_SELECTION("visibility_lead_selection"),
    @SerializedName("visibility_campaign_widget")
    VISIBILITY_CAMPAIGN_WIDGET("visibility_campaign_widget"),
    @SerializedName("default_start_end_date")
    DEFAULT_START_END_DATE("default_start_end_date");

    private String value;

    MetadataEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MetadataEnum fromValue(String input) {
      for (MetadataEnum b : MetadataEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MetadataEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MetadataEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public MetadataEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return MetadataEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("metadata")
  private MetadataEnum metadata = null;

  @SerializedName("value")
  private Object value = null;

  public CampaignMetadataUpdate campaignId(Integer campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @Schema(description = "")
  public Integer getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignMetadataUpdate metadata(MetadataEnum metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public MetadataEnum getMetadata() {
    return metadata;
  }

  public void setMetadata(MetadataEnum metadata) {
    this.metadata = metadata;
  }

  public CampaignMetadataUpdate value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignMetadataUpdate campaignMetadataUpdate = (CampaignMetadataUpdate) o;
    return Objects.equals(this.campaignId, campaignMetadataUpdate.campaignId) &&
        Objects.equals(this.metadata, campaignMetadataUpdate.metadata) &&
        Objects.equals(this.value, campaignMetadataUpdate.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, metadata, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignMetadataUpdate {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
