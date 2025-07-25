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
import java.time.OffsetDateTime;
/**
 * CampaignMemberCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-24T20:30:11.489899882Z[Etc/UTC]")

public class CampaignMemberCreate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("accountName")
  private String accountName = null;

  @SerializedName("campaignId")
  private Integer campaignId = null;

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("secondaryDealerId")
  private String secondaryDealerId = null;

  @SerializedName("campaignNickname")
  private String campaignNickname = null;

  /**
   * Gets or Sets source
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    @SerializedName("api")
    API("api"),
    @SerializedName("salesforce")
    SALESFORCE("salesforce"),
    @SerializedName("addToCampaign")
    ADDTOCAMPAIGN("addToCampaign");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SourceEnum fromValue(String input) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SourceEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("source")
  private SourceEnum source = SourceEnum.API;

  @SerializedName("dateCreated")
  private OffsetDateTime dateCreated = null;

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

  public CampaignMemberCreate id(Integer id) {
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

  public CampaignMemberCreate accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(required = true, description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public CampaignMemberCreate phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @Schema(required = true, description = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CampaignMemberCreate accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @Schema(description = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public CampaignMemberCreate campaignId(Integer campaignId) {
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

  public CampaignMemberCreate startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public CampaignMemberCreate endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public CampaignMemberCreate secondaryDealerId(String secondaryDealerId) {
    this.secondaryDealerId = secondaryDealerId;
    return this;
  }

   /**
   * Get secondaryDealerId
   * @return secondaryDealerId
  **/
  @Schema(description = "")
  public String getSecondaryDealerId() {
    return secondaryDealerId;
  }

  public void setSecondaryDealerId(String secondaryDealerId) {
    this.secondaryDealerId = secondaryDealerId;
  }

  public CampaignMemberCreate campaignNickname(String campaignNickname) {
    this.campaignNickname = campaignNickname;
    return this;
  }

   /**
   * Get campaignNickname
   * @return campaignNickname
  **/
  @Schema(description = "")
  public String getCampaignNickname() {
    return campaignNickname;
  }

  public void setCampaignNickname(String campaignNickname) {
    this.campaignNickname = campaignNickname;
  }

  public CampaignMemberCreate source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public CampaignMemberCreate dateCreated(OffsetDateTime dateCreated) {
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

  public CampaignMemberCreate excludeDnc(String excludeDnc) {
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

  public CampaignMemberCreate excludeDncDate(OffsetDateTime excludeDncDate) {
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

  public CampaignMemberCreate excludeKill(String excludeKill) {
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

  public CampaignMemberCreate excludeDuplicate(String excludeDuplicate) {
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

  public CampaignMemberCreate excludeTerminated(String excludeTerminated) {
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

  public CampaignMemberCreate excludeTerminatedDate(OffsetDateTime excludeTerminatedDate) {
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

  public CampaignMemberCreate excludePrepaid(String excludePrepaid) {
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

  public CampaignMemberCreate excludeNoDealerMatch(String excludeNoDealerMatch) {
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

  public CampaignMemberCreate excludeArchived(String excludeArchived) {
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

  public CampaignMemberCreate excludeLegacy(String excludeLegacy) {
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
    CampaignMemberCreate campaignMemberCreate = (CampaignMemberCreate) o;
    return Objects.equals(this.id, campaignMemberCreate.id) &&
        Objects.equals(this.accountId, campaignMemberCreate.accountId) &&
        Objects.equals(this.phoneNumber, campaignMemberCreate.phoneNumber) &&
        Objects.equals(this.accountName, campaignMemberCreate.accountName) &&
        Objects.equals(this.campaignId, campaignMemberCreate.campaignId) &&
        Objects.equals(this.startDate, campaignMemberCreate.startDate) &&
        Objects.equals(this.endDate, campaignMemberCreate.endDate) &&
        Objects.equals(this.secondaryDealerId, campaignMemberCreate.secondaryDealerId) &&
        Objects.equals(this.campaignNickname, campaignMemberCreate.campaignNickname) &&
        Objects.equals(this.source, campaignMemberCreate.source) &&
        Objects.equals(this.dateCreated, campaignMemberCreate.dateCreated) &&
        Objects.equals(this.excludeDnc, campaignMemberCreate.excludeDnc) &&
        Objects.equals(this.excludeDncDate, campaignMemberCreate.excludeDncDate) &&
        Objects.equals(this.excludeKill, campaignMemberCreate.excludeKill) &&
        Objects.equals(this.excludeDuplicate, campaignMemberCreate.excludeDuplicate) &&
        Objects.equals(this.excludeTerminated, campaignMemberCreate.excludeTerminated) &&
        Objects.equals(this.excludeTerminatedDate, campaignMemberCreate.excludeTerminatedDate) &&
        Objects.equals(this.excludePrepaid, campaignMemberCreate.excludePrepaid) &&
        Objects.equals(this.excludeNoDealerMatch, campaignMemberCreate.excludeNoDealerMatch) &&
        Objects.equals(this.excludeArchived, campaignMemberCreate.excludeArchived) &&
        Objects.equals(this.excludeLegacy, campaignMemberCreate.excludeLegacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, phoneNumber, accountName, campaignId, startDate, endDate, secondaryDealerId, campaignNickname, source, dateCreated, excludeDnc, excludeDncDate, excludeKill, excludeDuplicate, excludeTerminated, excludeTerminatedDate, excludePrepaid, excludeNoDealerMatch, excludeArchived, excludeLegacy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignMemberCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    secondaryDealerId: ").append(toIndentedString(secondaryDealerId)).append("\n");
    sb.append("    campaignNickname: ").append(toIndentedString(campaignNickname)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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
