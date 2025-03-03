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
 * AccountUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-03T14:30:43.872947-05:00[America/New_York]")

public class AccountUpdate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("accountId")
  private String accountId = null;

  /**
   * Gets or Sets accountType
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    @SerializedName("B")
    B("B"),
    @SerializedName("I")
    I("I"),
    @SerializedName("L")
    L("L"),
    @SerializedName("C")
    C("C"),
    @SerializedName("D")
    D("D");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AccountTypeEnum fromValue(String input) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AccountTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("accountType")
  private AccountTypeEnum accountType = AccountTypeEnum.I;

  @SerializedName("externalUserId")
  private String externalUserId = null;

  @SerializedName("externalLocationId")
  private String externalLocationId = "unassigned";

  @SerializedName("city")
  private String city = null;

  @SerializedName("numberOfCampaignMembers")
  private Integer numberOfCampaignMembers = 0;

  @SerializedName("dealValue")
  private String dealValue = null;

  @SerializedName("potentialRenewals")
  private Integer potentialRenewals = 0;

  @SerializedName("totalResiduals")
  private String totalResiduals = null;

  @SerializedName("totalEligibleRevenue")
  private String totalEligibleRevenue = null;

  @SerializedName("lastSpokenDate")
  private OffsetDateTime lastSpokenDate = null;

  @SerializedName("lastActivityDate")
  private OffsetDateTime lastActivityDate = null;

  @SerializedName("additionsInYear")
  private Integer additionsInYear = null;

  @SerializedName("ineligibles")
  private Integer ineligibles = null;

  @SerializedName("subsGps")
  private Integer subsGps = null;

  @SerializedName("subsHspa")
  private Integer subsHspa = null;

  @SerializedName("subsCdma")
  private Integer subsCdma = null;

  @SerializedName("subsMike")
  private Integer subsMike = null;

  @SerializedName("subsModems")
  private Integer subsModems = null;

  @SerializedName("prevExternalUserId")
  private String prevExternalUserId = null;

  @SerializedName("carrierStatistics")
  private Integer carrierStatistics = null;

  @SerializedName("notClient")
  private Integer notClient = null;

  @SerializedName("status")
  private Integer status = 0;

  @SerializedName("attempt")
  private Integer attempt = 0;

  @SerializedName("callType")
  private Integer callType = null;

  @SerializedName("callDate")
  private OffsetDateTime callDate = null;

  @SerializedName("originalExternalUserId")
  private String originalExternalUserId = null;

  @SerializedName("dateAdded")
  private OffsetDateTime dateAdded = null;

  @SerializedName("proposedAccountId")
  private Integer proposedAccountId = null;

  @SerializedName("website")
  private String website = null;

  @SerializedName("businessHours")
  private String businessHours = null;

  @SerializedName("vertical")
  private String vertical = null;

  @SerializedName("sourceId")
  private Integer sourceId = null;

  @SerializedName("source")
  private String source = "api";

  @SerializedName("customerExternalId")
  private String customerExternalId = null;

  @SerializedName("couponCode")
  private String couponCode = null;

  @SerializedName("currentCarrierId")
  private Integer currentCarrierId = null;

  @SerializedName("preferredCarrierId")
  private Integer preferredCarrierId = null;

  @SerializedName("oldBan")
  private String oldBan = null;

  @SerializedName("customerBusinessUnitCustomerId")
  private String customerBusinessUnitCustomerId = null;

  @SerializedName("brandId")
  private Integer brandId = null;

  @SerializedName("seatType")
  private String seatType = null;

  @SerializedName("rptBu")
  private String rptBu = null;

  @SerializedName("recordOwned")
  private Boolean recordOwned = true;

  @SerializedName("accountSubtype")
  private String accountSubtype = null;

  @SerializedName("dateCreated")
  private OffsetDateTime dateCreated = null;

  @SerializedName("dateUpdated")
  private OffsetDateTime dateUpdated = null;

  public AccountUpdate id(Integer id) {
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

  public AccountUpdate name(String name) {
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

  public AccountUpdate accountId(String accountId) {
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

  public AccountUpdate accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @Schema(required = true, description = "")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public AccountUpdate externalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }

   /**
   * Get externalUserId
   * @return externalUserId
  **/
  @Schema(description = "")
  public String getExternalUserId() {
    return externalUserId;
  }

  public void setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
  }

  public AccountUpdate externalLocationId(String externalLocationId) {
    this.externalLocationId = externalLocationId;
    return this;
  }

   /**
   * Get externalLocationId
   * @return externalLocationId
  **/
  @Schema(description = "")
  public String getExternalLocationId() {
    return externalLocationId;
  }

  public void setExternalLocationId(String externalLocationId) {
    this.externalLocationId = externalLocationId;
  }

  public AccountUpdate city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @Schema(description = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AccountUpdate numberOfCampaignMembers(Integer numberOfCampaignMembers) {
    this.numberOfCampaignMembers = numberOfCampaignMembers;
    return this;
  }

   /**
   * Get numberOfCampaignMembers
   * @return numberOfCampaignMembers
  **/
  @Schema(description = "")
  public Integer getNumberOfCampaignMembers() {
    return numberOfCampaignMembers;
  }

  public void setNumberOfCampaignMembers(Integer numberOfCampaignMembers) {
    this.numberOfCampaignMembers = numberOfCampaignMembers;
  }

  public AccountUpdate dealValue(String dealValue) {
    this.dealValue = dealValue;
    return this;
  }

   /**
   * Get dealValue
   * @return dealValue
  **/
  @Schema(description = "")
  public String getDealValue() {
    return dealValue;
  }

  public void setDealValue(String dealValue) {
    this.dealValue = dealValue;
  }

  public AccountUpdate potentialRenewals(Integer potentialRenewals) {
    this.potentialRenewals = potentialRenewals;
    return this;
  }

   /**
   * Get potentialRenewals
   * @return potentialRenewals
  **/
  @Schema(description = "")
  public Integer getPotentialRenewals() {
    return potentialRenewals;
  }

  public void setPotentialRenewals(Integer potentialRenewals) {
    this.potentialRenewals = potentialRenewals;
  }

  public AccountUpdate totalResiduals(String totalResiduals) {
    this.totalResiduals = totalResiduals;
    return this;
  }

   /**
   * Get totalResiduals
   * @return totalResiduals
  **/
  @Schema(description = "")
  public String getTotalResiduals() {
    return totalResiduals;
  }

  public void setTotalResiduals(String totalResiduals) {
    this.totalResiduals = totalResiduals;
  }

  public AccountUpdate totalEligibleRevenue(String totalEligibleRevenue) {
    this.totalEligibleRevenue = totalEligibleRevenue;
    return this;
  }

   /**
   * Get totalEligibleRevenue
   * @return totalEligibleRevenue
  **/
  @Schema(description = "")
  public String getTotalEligibleRevenue() {
    return totalEligibleRevenue;
  }

  public void setTotalEligibleRevenue(String totalEligibleRevenue) {
    this.totalEligibleRevenue = totalEligibleRevenue;
  }

  public AccountUpdate lastSpokenDate(OffsetDateTime lastSpokenDate) {
    this.lastSpokenDate = lastSpokenDate;
    return this;
  }

   /**
   * Get lastSpokenDate
   * @return lastSpokenDate
  **/
  @Schema(description = "")
  public OffsetDateTime getLastSpokenDate() {
    return lastSpokenDate;
  }

  public void setLastSpokenDate(OffsetDateTime lastSpokenDate) {
    this.lastSpokenDate = lastSpokenDate;
  }

  public AccountUpdate lastActivityDate(OffsetDateTime lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
    return this;
  }

   /**
   * Get lastActivityDate
   * @return lastActivityDate
  **/
  @Schema(description = "")
  public OffsetDateTime getLastActivityDate() {
    return lastActivityDate;
  }

  public void setLastActivityDate(OffsetDateTime lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }

  public AccountUpdate additionsInYear(Integer additionsInYear) {
    this.additionsInYear = additionsInYear;
    return this;
  }

   /**
   * Get additionsInYear
   * @return additionsInYear
  **/
  @Schema(description = "")
  public Integer getAdditionsInYear() {
    return additionsInYear;
  }

  public void setAdditionsInYear(Integer additionsInYear) {
    this.additionsInYear = additionsInYear;
  }

  public AccountUpdate ineligibles(Integer ineligibles) {
    this.ineligibles = ineligibles;
    return this;
  }

   /**
   * Get ineligibles
   * @return ineligibles
  **/
  @Schema(description = "")
  public Integer getIneligibles() {
    return ineligibles;
  }

  public void setIneligibles(Integer ineligibles) {
    this.ineligibles = ineligibles;
  }

  public AccountUpdate subsGps(Integer subsGps) {
    this.subsGps = subsGps;
    return this;
  }

   /**
   * Get subsGps
   * @return subsGps
  **/
  @Schema(description = "")
  public Integer getSubsGps() {
    return subsGps;
  }

  public void setSubsGps(Integer subsGps) {
    this.subsGps = subsGps;
  }

  public AccountUpdate subsHspa(Integer subsHspa) {
    this.subsHspa = subsHspa;
    return this;
  }

   /**
   * Get subsHspa
   * @return subsHspa
  **/
  @Schema(description = "")
  public Integer getSubsHspa() {
    return subsHspa;
  }

  public void setSubsHspa(Integer subsHspa) {
    this.subsHspa = subsHspa;
  }

  public AccountUpdate subsCdma(Integer subsCdma) {
    this.subsCdma = subsCdma;
    return this;
  }

   /**
   * Get subsCdma
   * @return subsCdma
  **/
  @Schema(description = "")
  public Integer getSubsCdma() {
    return subsCdma;
  }

  public void setSubsCdma(Integer subsCdma) {
    this.subsCdma = subsCdma;
  }

  public AccountUpdate subsMike(Integer subsMike) {
    this.subsMike = subsMike;
    return this;
  }

   /**
   * Get subsMike
   * @return subsMike
  **/
  @Schema(description = "")
  public Integer getSubsMike() {
    return subsMike;
  }

  public void setSubsMike(Integer subsMike) {
    this.subsMike = subsMike;
  }

  public AccountUpdate subsModems(Integer subsModems) {
    this.subsModems = subsModems;
    return this;
  }

   /**
   * Get subsModems
   * @return subsModems
  **/
  @Schema(description = "")
  public Integer getSubsModems() {
    return subsModems;
  }

  public void setSubsModems(Integer subsModems) {
    this.subsModems = subsModems;
  }

  public AccountUpdate prevExternalUserId(String prevExternalUserId) {
    this.prevExternalUserId = prevExternalUserId;
    return this;
  }

   /**
   * Get prevExternalUserId
   * @return prevExternalUserId
  **/
  @Schema(description = "")
  public String getPrevExternalUserId() {
    return prevExternalUserId;
  }

  public void setPrevExternalUserId(String prevExternalUserId) {
    this.prevExternalUserId = prevExternalUserId;
  }

  public AccountUpdate carrierStatistics(Integer carrierStatistics) {
    this.carrierStatistics = carrierStatistics;
    return this;
  }

   /**
   * Get carrierStatistics
   * @return carrierStatistics
  **/
  @Schema(description = "")
  public Integer getCarrierStatistics() {
    return carrierStatistics;
  }

  public void setCarrierStatistics(Integer carrierStatistics) {
    this.carrierStatistics = carrierStatistics;
  }

  public AccountUpdate notClient(Integer notClient) {
    this.notClient = notClient;
    return this;
  }

   /**
   * Get notClient
   * @return notClient
  **/
  @Schema(description = "")
  public Integer getNotClient() {
    return notClient;
  }

  public void setNotClient(Integer notClient) {
    this.notClient = notClient;
  }

  public AccountUpdate status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public AccountUpdate attempt(Integer attempt) {
    this.attempt = attempt;
    return this;
  }

   /**
   * Get attempt
   * minimum: 0
   * @return attempt
  **/
  @Schema(description = "")
  public Integer getAttempt() {
    return attempt;
  }

  public void setAttempt(Integer attempt) {
    this.attempt = attempt;
  }

  public AccountUpdate callType(Integer callType) {
    this.callType = callType;
    return this;
  }

   /**
   * Get callType
   * @return callType
  **/
  @Schema(description = "")
  public Integer getCallType() {
    return callType;
  }

  public void setCallType(Integer callType) {
    this.callType = callType;
  }

  public AccountUpdate callDate(OffsetDateTime callDate) {
    this.callDate = callDate;
    return this;
  }

   /**
   * Get callDate
   * @return callDate
  **/
  @Schema(description = "")
  public OffsetDateTime getCallDate() {
    return callDate;
  }

  public void setCallDate(OffsetDateTime callDate) {
    this.callDate = callDate;
  }

  public AccountUpdate originalExternalUserId(String originalExternalUserId) {
    this.originalExternalUserId = originalExternalUserId;
    return this;
  }

   /**
   * Get originalExternalUserId
   * @return originalExternalUserId
  **/
  @Schema(description = "")
  public String getOriginalExternalUserId() {
    return originalExternalUserId;
  }

  public void setOriginalExternalUserId(String originalExternalUserId) {
    this.originalExternalUserId = originalExternalUserId;
  }

  public AccountUpdate dateAdded(OffsetDateTime dateAdded) {
    this.dateAdded = dateAdded;
    return this;
  }

   /**
   * Get dateAdded
   * @return dateAdded
  **/
  @Schema(description = "")
  public OffsetDateTime getDateAdded() {
    return dateAdded;
  }

  public void setDateAdded(OffsetDateTime dateAdded) {
    this.dateAdded = dateAdded;
  }

  public AccountUpdate proposedAccountId(Integer proposedAccountId) {
    this.proposedAccountId = proposedAccountId;
    return this;
  }

   /**
   * Get proposedAccountId
   * @return proposedAccountId
  **/
  @Schema(description = "")
  public Integer getProposedAccountId() {
    return proposedAccountId;
  }

  public void setProposedAccountId(Integer proposedAccountId) {
    this.proposedAccountId = proposedAccountId;
  }

  public AccountUpdate website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @Schema(description = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public AccountUpdate businessHours(String businessHours) {
    this.businessHours = businessHours;
    return this;
  }

   /**
   * Get businessHours
   * @return businessHours
  **/
  @Schema(description = "")
  public String getBusinessHours() {
    return businessHours;
  }

  public void setBusinessHours(String businessHours) {
    this.businessHours = businessHours;
  }

  public AccountUpdate vertical(String vertical) {
    this.vertical = vertical;
    return this;
  }

   /**
   * Get vertical
   * @return vertical
  **/
  @Schema(description = "")
  public String getVertical() {
    return vertical;
  }

  public void setVertical(String vertical) {
    this.vertical = vertical;
  }

  public AccountUpdate sourceId(Integer sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @Schema(description = "")
  public Integer getSourceId() {
    return sourceId;
  }

  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }

  public AccountUpdate source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public AccountUpdate customerExternalId(String customerExternalId) {
    this.customerExternalId = customerExternalId;
    return this;
  }

   /**
   * Get customerExternalId
   * @return customerExternalId
  **/
  @Schema(description = "")
  public String getCustomerExternalId() {
    return customerExternalId;
  }

  public void setCustomerExternalId(String customerExternalId) {
    this.customerExternalId = customerExternalId;
  }

  public AccountUpdate couponCode(String couponCode) {
    this.couponCode = couponCode;
    return this;
  }

   /**
   * Get couponCode
   * @return couponCode
  **/
  @Schema(description = "")
  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }

  public AccountUpdate currentCarrierId(Integer currentCarrierId) {
    this.currentCarrierId = currentCarrierId;
    return this;
  }

   /**
   * Get currentCarrierId
   * @return currentCarrierId
  **/
  @Schema(description = "")
  public Integer getCurrentCarrierId() {
    return currentCarrierId;
  }

  public void setCurrentCarrierId(Integer currentCarrierId) {
    this.currentCarrierId = currentCarrierId;
  }

  public AccountUpdate preferredCarrierId(Integer preferredCarrierId) {
    this.preferredCarrierId = preferredCarrierId;
    return this;
  }

   /**
   * Get preferredCarrierId
   * @return preferredCarrierId
  **/
  @Schema(description = "")
  public Integer getPreferredCarrierId() {
    return preferredCarrierId;
  }

  public void setPreferredCarrierId(Integer preferredCarrierId) {
    this.preferredCarrierId = preferredCarrierId;
  }

  public AccountUpdate oldBan(String oldBan) {
    this.oldBan = oldBan;
    return this;
  }

   /**
   * Get oldBan
   * @return oldBan
  **/
  @Schema(description = "")
  public String getOldBan() {
    return oldBan;
  }

  public void setOldBan(String oldBan) {
    this.oldBan = oldBan;
  }

  public AccountUpdate customerBusinessUnitCustomerId(String customerBusinessUnitCustomerId) {
    this.customerBusinessUnitCustomerId = customerBusinessUnitCustomerId;
    return this;
  }

   /**
   * Get customerBusinessUnitCustomerId
   * @return customerBusinessUnitCustomerId
  **/
  @Schema(description = "")
  public String getCustomerBusinessUnitCustomerId() {
    return customerBusinessUnitCustomerId;
  }

  public void setCustomerBusinessUnitCustomerId(String customerBusinessUnitCustomerId) {
    this.customerBusinessUnitCustomerId = customerBusinessUnitCustomerId;
  }

  public AccountUpdate brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * Get brandId
   * @return brandId
  **/
  @Schema(description = "")
  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }

  public AccountUpdate seatType(String seatType) {
    this.seatType = seatType;
    return this;
  }

   /**
   * Get seatType
   * @return seatType
  **/
  @Schema(description = "")
  public String getSeatType() {
    return seatType;
  }

  public void setSeatType(String seatType) {
    this.seatType = seatType;
  }

  public AccountUpdate rptBu(String rptBu) {
    this.rptBu = rptBu;
    return this;
  }

   /**
   * Get rptBu
   * @return rptBu
  **/
  @Schema(description = "")
  public String getRptBu() {
    return rptBu;
  }

  public void setRptBu(String rptBu) {
    this.rptBu = rptBu;
  }

  public AccountUpdate recordOwned(Boolean recordOwned) {
    this.recordOwned = recordOwned;
    return this;
  }

   /**
   * Get recordOwned
   * @return recordOwned
  **/
  @Schema(description = "")
  public Boolean isRecordOwned() {
    return recordOwned;
  }

  public void setRecordOwned(Boolean recordOwned) {
    this.recordOwned = recordOwned;
  }

  public AccountUpdate accountSubtype(String accountSubtype) {
    this.accountSubtype = accountSubtype;
    return this;
  }

   /**
   * Get accountSubtype
   * @return accountSubtype
  **/
  @Schema(description = "")
  public String getAccountSubtype() {
    return accountSubtype;
  }

  public void setAccountSubtype(String accountSubtype) {
    this.accountSubtype = accountSubtype;
  }

  public AccountUpdate dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @Schema(description = "")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public AccountUpdate dateUpdated(OffsetDateTime dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * Get dateUpdated
   * @return dateUpdated
  **/
  @Schema(description = "")
  public OffsetDateTime getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(OffsetDateTime dateUpdated) {
    this.dateUpdated = dateUpdated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUpdate accountUpdate = (AccountUpdate) o;
    return Objects.equals(this.id, accountUpdate.id) &&
        Objects.equals(this.name, accountUpdate.name) &&
        Objects.equals(this.accountId, accountUpdate.accountId) &&
        Objects.equals(this.accountType, accountUpdate.accountType) &&
        Objects.equals(this.externalUserId, accountUpdate.externalUserId) &&
        Objects.equals(this.externalLocationId, accountUpdate.externalLocationId) &&
        Objects.equals(this.city, accountUpdate.city) &&
        Objects.equals(this.numberOfCampaignMembers, accountUpdate.numberOfCampaignMembers) &&
        Objects.equals(this.dealValue, accountUpdate.dealValue) &&
        Objects.equals(this.potentialRenewals, accountUpdate.potentialRenewals) &&
        Objects.equals(this.totalResiduals, accountUpdate.totalResiduals) &&
        Objects.equals(this.totalEligibleRevenue, accountUpdate.totalEligibleRevenue) &&
        Objects.equals(this.lastSpokenDate, accountUpdate.lastSpokenDate) &&
        Objects.equals(this.lastActivityDate, accountUpdate.lastActivityDate) &&
        Objects.equals(this.additionsInYear, accountUpdate.additionsInYear) &&
        Objects.equals(this.ineligibles, accountUpdate.ineligibles) &&
        Objects.equals(this.subsGps, accountUpdate.subsGps) &&
        Objects.equals(this.subsHspa, accountUpdate.subsHspa) &&
        Objects.equals(this.subsCdma, accountUpdate.subsCdma) &&
        Objects.equals(this.subsMike, accountUpdate.subsMike) &&
        Objects.equals(this.subsModems, accountUpdate.subsModems) &&
        Objects.equals(this.prevExternalUserId, accountUpdate.prevExternalUserId) &&
        Objects.equals(this.carrierStatistics, accountUpdate.carrierStatistics) &&
        Objects.equals(this.notClient, accountUpdate.notClient) &&
        Objects.equals(this.status, accountUpdate.status) &&
        Objects.equals(this.attempt, accountUpdate.attempt) &&
        Objects.equals(this.callType, accountUpdate.callType) &&
        Objects.equals(this.callDate, accountUpdate.callDate) &&
        Objects.equals(this.originalExternalUserId, accountUpdate.originalExternalUserId) &&
        Objects.equals(this.dateAdded, accountUpdate.dateAdded) &&
        Objects.equals(this.proposedAccountId, accountUpdate.proposedAccountId) &&
        Objects.equals(this.website, accountUpdate.website) &&
        Objects.equals(this.businessHours, accountUpdate.businessHours) &&
        Objects.equals(this.vertical, accountUpdate.vertical) &&
        Objects.equals(this.sourceId, accountUpdate.sourceId) &&
        Objects.equals(this.source, accountUpdate.source) &&
        Objects.equals(this.customerExternalId, accountUpdate.customerExternalId) &&
        Objects.equals(this.couponCode, accountUpdate.couponCode) &&
        Objects.equals(this.currentCarrierId, accountUpdate.currentCarrierId) &&
        Objects.equals(this.preferredCarrierId, accountUpdate.preferredCarrierId) &&
        Objects.equals(this.oldBan, accountUpdate.oldBan) &&
        Objects.equals(this.customerBusinessUnitCustomerId, accountUpdate.customerBusinessUnitCustomerId) &&
        Objects.equals(this.brandId, accountUpdate.brandId) &&
        Objects.equals(this.seatType, accountUpdate.seatType) &&
        Objects.equals(this.rptBu, accountUpdate.rptBu) &&
        Objects.equals(this.recordOwned, accountUpdate.recordOwned) &&
        Objects.equals(this.accountSubtype, accountUpdate.accountSubtype) &&
        Objects.equals(this.dateCreated, accountUpdate.dateCreated) &&
        Objects.equals(this.dateUpdated, accountUpdate.dateUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, accountId, accountType, externalUserId, externalLocationId, city, numberOfCampaignMembers, dealValue, potentialRenewals, totalResiduals, totalEligibleRevenue, lastSpokenDate, lastActivityDate, additionsInYear, ineligibles, subsGps, subsHspa, subsCdma, subsMike, subsModems, prevExternalUserId, carrierStatistics, notClient, status, attempt, callType, callDate, originalExternalUserId, dateAdded, proposedAccountId, website, businessHours, vertical, sourceId, source, customerExternalId, couponCode, currentCarrierId, preferredCarrierId, oldBan, customerBusinessUnitCustomerId, brandId, seatType, rptBu, recordOwned, accountSubtype, dateCreated, dateUpdated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
    sb.append("    externalLocationId: ").append(toIndentedString(externalLocationId)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    numberOfCampaignMembers: ").append(toIndentedString(numberOfCampaignMembers)).append("\n");
    sb.append("    dealValue: ").append(toIndentedString(dealValue)).append("\n");
    sb.append("    potentialRenewals: ").append(toIndentedString(potentialRenewals)).append("\n");
    sb.append("    totalResiduals: ").append(toIndentedString(totalResiduals)).append("\n");
    sb.append("    totalEligibleRevenue: ").append(toIndentedString(totalEligibleRevenue)).append("\n");
    sb.append("    lastSpokenDate: ").append(toIndentedString(lastSpokenDate)).append("\n");
    sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
    sb.append("    additionsInYear: ").append(toIndentedString(additionsInYear)).append("\n");
    sb.append("    ineligibles: ").append(toIndentedString(ineligibles)).append("\n");
    sb.append("    subsGps: ").append(toIndentedString(subsGps)).append("\n");
    sb.append("    subsHspa: ").append(toIndentedString(subsHspa)).append("\n");
    sb.append("    subsCdma: ").append(toIndentedString(subsCdma)).append("\n");
    sb.append("    subsMike: ").append(toIndentedString(subsMike)).append("\n");
    sb.append("    subsModems: ").append(toIndentedString(subsModems)).append("\n");
    sb.append("    prevExternalUserId: ").append(toIndentedString(prevExternalUserId)).append("\n");
    sb.append("    carrierStatistics: ").append(toIndentedString(carrierStatistics)).append("\n");
    sb.append("    notClient: ").append(toIndentedString(notClient)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    attempt: ").append(toIndentedString(attempt)).append("\n");
    sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
    sb.append("    callDate: ").append(toIndentedString(callDate)).append("\n");
    sb.append("    originalExternalUserId: ").append(toIndentedString(originalExternalUserId)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    proposedAccountId: ").append(toIndentedString(proposedAccountId)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    businessHours: ").append(toIndentedString(businessHours)).append("\n");
    sb.append("    vertical: ").append(toIndentedString(vertical)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    customerExternalId: ").append(toIndentedString(customerExternalId)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    currentCarrierId: ").append(toIndentedString(currentCarrierId)).append("\n");
    sb.append("    preferredCarrierId: ").append(toIndentedString(preferredCarrierId)).append("\n");
    sb.append("    oldBan: ").append(toIndentedString(oldBan)).append("\n");
    sb.append("    customerBusinessUnitCustomerId: ").append(toIndentedString(customerBusinessUnitCustomerId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    seatType: ").append(toIndentedString(seatType)).append("\n");
    sb.append("    rptBu: ").append(toIndentedString(rptBu)).append("\n");
    sb.append("    recordOwned: ").append(toIndentedString(recordOwned)).append("\n");
    sb.append("    accountSubtype: ").append(toIndentedString(accountSubtype)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
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
