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
import org.threeten.bp.OffsetDateTime;
/**
 * CampaignMemberUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-05T14:23:39.893836-04:00[America/Toronto]")

public class CampaignMemberUpdate {
  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("excludeDnc")
  private String excludeDnc = null;

  @SerializedName("excludeDncDate")
  private OffsetDateTime excludeDncDate = null;

  @SerializedName("excludeKill")
  private String excludeKill = null;

  @SerializedName("excludeDuplicate")
  private String excludeDuplicate = null;

  @SerializedName("excludeTerminated")
  private String excludeTerminated = null;

  @SerializedName("excludeTerminatedDate")
  private OffsetDateTime excludeTerminatedDate = null;

  @SerializedName("excludePrepaid")
  private String excludePrepaid = null;

  @SerializedName("excludeNoDealerMatch")
  private String excludeNoDealerMatch = null;

  @SerializedName("excludeArchived")
  private String excludeArchived = null;

  @SerializedName("excludeLegacy")
  private String excludeLegacy = null;

  public CampaignMemberUpdate phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @Schema(description = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CampaignMemberUpdate startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(description = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public CampaignMemberUpdate endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @Schema(description = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public CampaignMemberUpdate excludeDnc(String excludeDnc) {
    this.excludeDnc = excludeDnc;
    return this;
  }

   /**
   * Get excludeDnc
   * @return excludeDnc
  **/
  @Schema(description = "")
  public String getExcludeDnc() {
    return excludeDnc;
  }

  public void setExcludeDnc(String excludeDnc) {
    this.excludeDnc = excludeDnc;
  }

  public CampaignMemberUpdate excludeDncDate(OffsetDateTime excludeDncDate) {
    this.excludeDncDate = excludeDncDate;
    return this;
  }

   /**
   * Get excludeDncDate
   * @return excludeDncDate
  **/
  @Schema(description = "")
  public OffsetDateTime getExcludeDncDate() {
    return excludeDncDate;
  }

  public void setExcludeDncDate(OffsetDateTime excludeDncDate) {
    this.excludeDncDate = excludeDncDate;
  }

  public CampaignMemberUpdate excludeKill(String excludeKill) {
    this.excludeKill = excludeKill;
    return this;
  }

   /**
   * Get excludeKill
   * @return excludeKill
  **/
  @Schema(description = "")
  public String getExcludeKill() {
    return excludeKill;
  }

  public void setExcludeKill(String excludeKill) {
    this.excludeKill = excludeKill;
  }

  public CampaignMemberUpdate excludeDuplicate(String excludeDuplicate) {
    this.excludeDuplicate = excludeDuplicate;
    return this;
  }

   /**
   * Get excludeDuplicate
   * @return excludeDuplicate
  **/
  @Schema(description = "")
  public String getExcludeDuplicate() {
    return excludeDuplicate;
  }

  public void setExcludeDuplicate(String excludeDuplicate) {
    this.excludeDuplicate = excludeDuplicate;
  }

  public CampaignMemberUpdate excludeTerminated(String excludeTerminated) {
    this.excludeTerminated = excludeTerminated;
    return this;
  }

   /**
   * Get excludeTerminated
   * @return excludeTerminated
  **/
  @Schema(description = "")
  public String getExcludeTerminated() {
    return excludeTerminated;
  }

  public void setExcludeTerminated(String excludeTerminated) {
    this.excludeTerminated = excludeTerminated;
  }

  public CampaignMemberUpdate excludeTerminatedDate(OffsetDateTime excludeTerminatedDate) {
    this.excludeTerminatedDate = excludeTerminatedDate;
    return this;
  }

   /**
   * Get excludeTerminatedDate
   * @return excludeTerminatedDate
  **/
  @Schema(description = "")
  public OffsetDateTime getExcludeTerminatedDate() {
    return excludeTerminatedDate;
  }

  public void setExcludeTerminatedDate(OffsetDateTime excludeTerminatedDate) {
    this.excludeTerminatedDate = excludeTerminatedDate;
  }

  public CampaignMemberUpdate excludePrepaid(String excludePrepaid) {
    this.excludePrepaid = excludePrepaid;
    return this;
  }

   /**
   * Get excludePrepaid
   * @return excludePrepaid
  **/
  @Schema(description = "")
  public String getExcludePrepaid() {
    return excludePrepaid;
  }

  public void setExcludePrepaid(String excludePrepaid) {
    this.excludePrepaid = excludePrepaid;
  }

  public CampaignMemberUpdate excludeNoDealerMatch(String excludeNoDealerMatch) {
    this.excludeNoDealerMatch = excludeNoDealerMatch;
    return this;
  }

   /**
   * Get excludeNoDealerMatch
   * @return excludeNoDealerMatch
  **/
  @Schema(description = "")
  public String getExcludeNoDealerMatch() {
    return excludeNoDealerMatch;
  }

  public void setExcludeNoDealerMatch(String excludeNoDealerMatch) {
    this.excludeNoDealerMatch = excludeNoDealerMatch;
  }

  public CampaignMemberUpdate excludeArchived(String excludeArchived) {
    this.excludeArchived = excludeArchived;
    return this;
  }

   /**
   * Get excludeArchived
   * @return excludeArchived
  **/
  @Schema(description = "")
  public String getExcludeArchived() {
    return excludeArchived;
  }

  public void setExcludeArchived(String excludeArchived) {
    this.excludeArchived = excludeArchived;
  }

  public CampaignMemberUpdate excludeLegacy(String excludeLegacy) {
    this.excludeLegacy = excludeLegacy;
    return this;
  }

   /**
   * Get excludeLegacy
   * @return excludeLegacy
  **/
  @Schema(description = "")
  public String getExcludeLegacy() {
    return excludeLegacy;
  }

  public void setExcludeLegacy(String excludeLegacy) {
    this.excludeLegacy = excludeLegacy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignMemberUpdate campaignMemberUpdate = (CampaignMemberUpdate) o;
    return Objects.equals(this.phoneNumber, campaignMemberUpdate.phoneNumber) &&
        Objects.equals(this.startDate, campaignMemberUpdate.startDate) &&
        Objects.equals(this.endDate, campaignMemberUpdate.endDate) &&
        Objects.equals(this.excludeDnc, campaignMemberUpdate.excludeDnc) &&
        Objects.equals(this.excludeDncDate, campaignMemberUpdate.excludeDncDate) &&
        Objects.equals(this.excludeKill, campaignMemberUpdate.excludeKill) &&
        Objects.equals(this.excludeDuplicate, campaignMemberUpdate.excludeDuplicate) &&
        Objects.equals(this.excludeTerminated, campaignMemberUpdate.excludeTerminated) &&
        Objects.equals(this.excludeTerminatedDate, campaignMemberUpdate.excludeTerminatedDate) &&
        Objects.equals(this.excludePrepaid, campaignMemberUpdate.excludePrepaid) &&
        Objects.equals(this.excludeNoDealerMatch, campaignMemberUpdate.excludeNoDealerMatch) &&
        Objects.equals(this.excludeArchived, campaignMemberUpdate.excludeArchived) &&
        Objects.equals(this.excludeLegacy, campaignMemberUpdate.excludeLegacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, startDate, endDate, excludeDnc, excludeDncDate, excludeKill, excludeDuplicate, excludeTerminated, excludeTerminatedDate, excludePrepaid, excludeNoDealerMatch, excludeArchived, excludeLegacy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignMemberUpdate {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    excludeDnc: ").append(toIndentedString(excludeDnc)).append("\n");
    sb.append("    excludeDncDate: ").append(toIndentedString(excludeDncDate)).append("\n");
    sb.append("    excludeKill: ").append(toIndentedString(excludeKill)).append("\n");
    sb.append("    excludeDuplicate: ").append(toIndentedString(excludeDuplicate)).append("\n");
    sb.append("    excludeTerminated: ").append(toIndentedString(excludeTerminated)).append("\n");
    sb.append("    excludeTerminatedDate: ").append(toIndentedString(excludeTerminatedDate)).append("\n");
    sb.append("    excludePrepaid: ").append(toIndentedString(excludePrepaid)).append("\n");
    sb.append("    excludeNoDealerMatch: ").append(toIndentedString(excludeNoDealerMatch)).append("\n");
    sb.append("    excludeArchived: ").append(toIndentedString(excludeArchived)).append("\n");
    sb.append("    excludeLegacy: ").append(toIndentedString(excludeLegacy)).append("\n");
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
