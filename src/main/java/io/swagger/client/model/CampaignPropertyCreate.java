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
 * CampaignPropertyCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-08-21T09:34:43.221254-04:00[America/Toronto]")

public class CampaignPropertyCreate {
  @SerializedName("campaignId")
  private Integer campaignId = null;

  @SerializedName("carryoverUnattempted")
  private Boolean carryoverUnattempted = false;

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
  private VisibilityCrmEnum visibilityCrm = VisibilityCrmEnum.NUMBER_30;

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
  private VisibilityReportEnum visibilityReport = VisibilityReportEnum.NUMBER_30;

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

  public CampaignPropertyCreate carryoverUnattempted(Boolean carryoverUnattempted) {
    this.carryoverUnattempted = carryoverUnattempted;
    return this;
  }

   /**
   * Get carryoverUnattempted
   * @return carryoverUnattempted
  **/
  @Schema(description = "")
  public Boolean isCarryoverUnattempted() {
    return carryoverUnattempted;
  }

  public void setCarryoverUnattempted(Boolean carryoverUnattempted) {
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
    return Objects.equals(this.campaignId, campaignPropertyCreate.campaignId) &&
        Objects.equals(this.carryoverUnattempted, campaignPropertyCreate.carryoverUnattempted) &&
        Objects.equals(this.visibilityCrm, campaignPropertyCreate.visibilityCrm) &&
        Objects.equals(this.visibilityReport, campaignPropertyCreate.visibilityReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, carryoverUnattempted, visibilityCrm, visibilityReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPropertyCreate {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
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
