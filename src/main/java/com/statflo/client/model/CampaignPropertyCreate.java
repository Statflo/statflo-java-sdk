/*
 * Statflo API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4.1.149
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
 * CampaignPropertyCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-24T20:30:11.489899882Z[Etc/UTC]")

public class CampaignPropertyCreate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("dealerId")
  private Integer dealerId = null;

  @SerializedName("campaignId")
  private Integer campaignId = null;

  @SerializedName("campaignPriority")
  private Integer campaignPriority = null;

  @SerializedName("displayPriority")
  private Integer displayPriority = null;

  @SerializedName("carryoverUnattempted")
  private Integer carryoverUnattempted = 4;

  /**
   * Gets or Sets visibilityCrm
   */
  @JsonAdapter(VisibilityCrmEnum.Adapter.class)
  public enum VisibilityCrmEnum {
    @SerializedName("0")
    NUMBER_0(0),
    @SerializedName("10")
    NUMBER_10(10),
    @SerializedName("30")
    NUMBER_30(30);

    private Integer value;

    VisibilityCrmEnum(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VisibilityCrmEnum fromValue(Integer input) {
      for (VisibilityCrmEnum b : VisibilityCrmEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VisibilityCrmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityCrmEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public VisibilityCrmEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextInt();
        return VisibilityCrmEnum.fromValue((Integer)(value));
      }
    }
  }  @SerializedName("visibilityCrm")
  private VisibilityCrmEnum visibilityCrm = null;

  /**
   * Gets or Sets visibilityReport
   */
  @JsonAdapter(VisibilityReportEnum.Adapter.class)
  public enum VisibilityReportEnum {
    @SerializedName("0")
    NUMBER_0(0),
    @SerializedName("10")
    NUMBER_10(10),
    @SerializedName("30")
    NUMBER_30(30);

    private Integer value;

    VisibilityReportEnum(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VisibilityReportEnum fromValue(Integer input) {
      for (VisibilityReportEnum b : VisibilityReportEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VisibilityReportEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityReportEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public VisibilityReportEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextInt();
        return VisibilityReportEnum.fromValue((Integer)(value));
      }
    }
  }  @SerializedName("visibilityReport")
  private VisibilityReportEnum visibilityReport = null;

  public CampaignPropertyCreate id(Integer id) {
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

  public CampaignPropertyCreate dealerId(Integer dealerId) {
    this.dealerId = dealerId;
    return this;
  }

   /**
   * Get dealerId
   * @return dealerId
  **/
  @Schema(description = "")
  public Integer getDealerId() {
    return dealerId;
  }

  public void setDealerId(Integer dealerId) {
    this.dealerId = dealerId;
  }

  public CampaignPropertyCreate campaignId(Integer campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @Schema(required = true, description = "")
  public Integer getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignPropertyCreate campaignPriority(Integer campaignPriority) {
    this.campaignPriority = campaignPriority;
    return this;
  }

   /**
   * Get campaignPriority
   * @return campaignPriority
  **/
  @Schema(description = "")
  public Integer getCampaignPriority() {
    return campaignPriority;
  }

  public void setCampaignPriority(Integer campaignPriority) {
    this.campaignPriority = campaignPriority;
  }

  public CampaignPropertyCreate displayPriority(Integer displayPriority) {
    this.displayPriority = displayPriority;
    return this;
  }

   /**
   * Get displayPriority
   * @return displayPriority
  **/
  @Schema(description = "")
  public Integer getDisplayPriority() {
    return displayPriority;
  }

  public void setDisplayPriority(Integer displayPriority) {
    this.displayPriority = displayPriority;
  }

  public CampaignPropertyCreate carryoverUnattempted(Integer carryoverUnattempted) {
    this.carryoverUnattempted = carryoverUnattempted;
    return this;
  }

   /**
   * Get carryoverUnattempted
   * minimum: 0
   * maximum: 11
   * @return carryoverUnattempted
  **/
  @Schema(description = "")
  public Integer getCarryoverUnattempted() {
    return carryoverUnattempted;
  }

  public void setCarryoverUnattempted(Integer carryoverUnattempted) {
    this.carryoverUnattempted = carryoverUnattempted;
  }

  public CampaignPropertyCreate visibilityCrm(VisibilityCrmEnum visibilityCrm) {
    this.visibilityCrm = visibilityCrm;
    return this;
  }

   /**
   * Get visibilityCrm
   * @return visibilityCrm
  **/
  @Schema(description = "")
  public VisibilityCrmEnum getVisibilityCrm() {
    return visibilityCrm;
  }

  public void setVisibilityCrm(VisibilityCrmEnum visibilityCrm) {
    this.visibilityCrm = visibilityCrm;
  }

  public CampaignPropertyCreate visibilityReport(VisibilityReportEnum visibilityReport) {
    this.visibilityReport = visibilityReport;
    return this;
  }

   /**
   * Get visibilityReport
   * @return visibilityReport
  **/
  @Schema(description = "")
  public VisibilityReportEnum getVisibilityReport() {
    return visibilityReport;
  }

  public void setVisibilityReport(VisibilityReportEnum visibilityReport) {
    this.visibilityReport = visibilityReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPropertyCreate campaignPropertyCreate = (CampaignPropertyCreate) o;
    return Objects.equals(this.id, campaignPropertyCreate.id) &&
        Objects.equals(this.dealerId, campaignPropertyCreate.dealerId) &&
        Objects.equals(this.campaignId, campaignPropertyCreate.campaignId) &&
        Objects.equals(this.campaignPriority, campaignPropertyCreate.campaignPriority) &&
        Objects.equals(this.displayPriority, campaignPropertyCreate.displayPriority) &&
        Objects.equals(this.carryoverUnattempted, campaignPropertyCreate.carryoverUnattempted) &&
        Objects.equals(this.visibilityCrm, campaignPropertyCreate.visibilityCrm) &&
        Objects.equals(this.visibilityReport, campaignPropertyCreate.visibilityReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dealerId, campaignId, campaignPriority, displayPriority, carryoverUnattempted, visibilityCrm, visibilityReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPropertyCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dealerId: ").append(toIndentedString(dealerId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignPriority: ").append(toIndentedString(campaignPriority)).append("\n");
    sb.append("    displayPriority: ").append(toIndentedString(displayPriority)).append("\n");
    sb.append("    carryoverUnattempted: ").append(toIndentedString(carryoverUnattempted)).append("\n");
    sb.append("    visibilityCrm: ").append(toIndentedString(visibilityCrm)).append("\n");
    sb.append("    visibilityReport: ").append(toIndentedString(visibilityReport)).append("\n");
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
