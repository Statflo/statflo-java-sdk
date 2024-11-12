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
 * AccountMemberCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-12T16:24:49.446464Z[Etc/UTC]")
public class AccountMemberCreate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  /**
   * Gets or Sets accountType
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    B("B"),
    I("I"),
    L("L"),
    C("C"),
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
    public static AccountTypeEnum fromValue(String text) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AccountTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("accountType")
  private AccountTypeEnum accountType = AccountTypeEnum.I;

  /**
   * Gets or Sets language
   */
  @JsonAdapter(LanguageEnum.Adapter.class)
  public enum LanguageEnum {
    EN("en"),
    FR("fr");

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
    public static LanguageEnum fromValue(String text) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LanguageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LanguageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LanguageEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return LanguageEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("language")
  private LanguageEnum language = LanguageEnum.EN;

  @SerializedName("accountName")
  private String accountName = null;

  @SerializedName("accountMemberName")
  private String accountMemberName = null;

  @SerializedName("service")
  private String service = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("serviceStartDate")
  private OffsetDateTime serviceStartDate = null;

  @SerializedName("serviceEndDate")
  private OffsetDateTime serviceEndDate = null;

  @SerializedName("locationId")
  private String locationId = null;

  @SerializedName("dateCreated")
  private OffsetDateTime dateCreated = null;

  @SerializedName("tradeIn")
  private String tradeIn = null;

  @SerializedName("imei")
  private String imei = null;

  @SerializedName("esnDec")
  private String esnDec = null;

  @SerializedName("eduf")
  private Float eduf = null;

  @SerializedName("contactTerm")
  private Integer contactTerm = null;

  @SerializedName("contactMonthsLeft")
  private Integer contactMonthsLeft = null;

  @SerializedName("units")
  private String units = null;

  @SerializedName("streetNumber")
  private String streetNumber = null;

  @SerializedName("streetName")
  private String streetName = null;

  @SerializedName("unitType")
  private String unitType = null;

  @SerializedName("unit")
  private String unit = null;

  @SerializedName("poBox")
  private String poBox = null;

  @SerializedName("rr")
  private String rr = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("province")
  private String province = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("homePhone")
  private String homePhone = null;

  @SerializedName("businessPhone")
  private String businessPhone = null;

  @SerializedName("businessExtensions")
  private String businessExtensions = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("status")
  private Boolean status = false;

  @SerializedName("avgDataUsage")
  private Integer avgDataUsage = null;

  @SerializedName("avgMinutesUsage")
  private Integer avgMinutesUsage = null;

  @SerializedName("avgLongDistanceUsage")
  private Integer avgLongDistanceUsage = null;

  @SerializedName("avgRoamingUsage")
  private Integer avgRoamingUsage = null;

  @SerializedName("avgDataOverage")
  private Integer avgDataOverage = null;

  @SerializedName("avgMinsOverage")
  private Integer avgMinsOverage = null;

  @SerializedName("avgLdOverage")
  private Float avgLdOverage = null;

  @SerializedName("avgRoamOverage")
  private Float avgRoamOverage = null;

  @SerializedName("campaignType")
  private String campaignType = null;

  @SerializedName("campaignId")
  private String campaignId = null;

  @SerializedName("avgRpu")
  private Float avgRpu = null;

  @SerializedName("tab")
  private Float tab = null;

  @SerializedName("tabCharge")
  private Float tabCharge = null;

  @SerializedName("tabDate")
  private OffsetDateTime tabDate = null;

  @SerializedName("source")
  private String source = "api";

  @SerializedName("sourceId")
  private Integer sourceId = null;

  @SerializedName("customerExternalId")
  private String customerExternalId = null;

  @SerializedName("oldBan")
  private String oldBan = null;

  @SerializedName("salesforceLineId")
  private String salesforceLineId = null;

  @SerializedName("byodCustomer")
  private String byodCustomer = "0";

  @SerializedName("prepaid")
  private String prepaid = "0";

  @SerializedName("subscriberId")
  private String subscriberId = null;

  @SerializedName("portInCarrierId")
  private Integer portInCarrierId = null;

  @SerializedName("portInCarrierName")
  private String portInCarrierName = null;

  public AccountMemberCreate id(Integer id) {
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

  public AccountMemberCreate accountId(String accountId) {
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

  public AccountMemberCreate phoneNumber(String phoneNumber) {
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

  public AccountMemberCreate accountType(AccountTypeEnum accountType) {
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

  public AccountMemberCreate language(LanguageEnum language) {
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

  public AccountMemberCreate accountName(String accountName) {
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

  public AccountMemberCreate accountMemberName(String accountMemberName) {
    this.accountMemberName = accountMemberName;
    return this;
  }

   /**
   * Get accountMemberName
   * @return accountMemberName
  **/
  @Schema(description = "")
  public String getAccountMemberName() {
    return accountMemberName;
  }

  public void setAccountMemberName(String accountMemberName) {
    this.accountMemberName = accountMemberName;
  }

  public AccountMemberCreate service(String service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @Schema(description = "")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public AccountMemberCreate product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @Schema(description = "")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public AccountMemberCreate serviceStartDate(OffsetDateTime serviceStartDate) {
    this.serviceStartDate = serviceStartDate;
    return this;
  }

   /**
   * Get serviceStartDate
   * @return serviceStartDate
  **/
  @Schema(description = "")
  public OffsetDateTime getServiceStartDate() {
    return serviceStartDate;
  }

  public void setServiceStartDate(OffsetDateTime serviceStartDate) {
    this.serviceStartDate = serviceStartDate;
  }

  public AccountMemberCreate serviceEndDate(OffsetDateTime serviceEndDate) {
    this.serviceEndDate = serviceEndDate;
    return this;
  }

   /**
   * Get serviceEndDate
   * @return serviceEndDate
  **/
  @Schema(description = "")
  public OffsetDateTime getServiceEndDate() {
    return serviceEndDate;
  }

  public void setServiceEndDate(OffsetDateTime serviceEndDate) {
    this.serviceEndDate = serviceEndDate;
  }

  public AccountMemberCreate locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @Schema(description = "")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public AccountMemberCreate dateCreated(OffsetDateTime dateCreated) {
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

  public AccountMemberCreate tradeIn(String tradeIn) {
    this.tradeIn = tradeIn;
    return this;
  }

   /**
   * Get tradeIn
   * @return tradeIn
  **/
  @Schema(description = "")
  public String getTradeIn() {
    return tradeIn;
  }

  public void setTradeIn(String tradeIn) {
    this.tradeIn = tradeIn;
  }

  public AccountMemberCreate imei(String imei) {
    this.imei = imei;
    return this;
  }

   /**
   * Get imei
   * @return imei
  **/
  @Schema(description = "")
  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }

  public AccountMemberCreate esnDec(String esnDec) {
    this.esnDec = esnDec;
    return this;
  }

   /**
   * Get esnDec
   * @return esnDec
  **/
  @Schema(description = "")
  public String getEsnDec() {
    return esnDec;
  }

  public void setEsnDec(String esnDec) {
    this.esnDec = esnDec;
  }

  public AccountMemberCreate eduf(Float eduf) {
    this.eduf = eduf;
    return this;
  }

   /**
   * Get eduf
   * @return eduf
  **/
  @Schema(description = "")
  public Float getEduf() {
    return eduf;
  }

  public void setEduf(Float eduf) {
    this.eduf = eduf;
  }

  public AccountMemberCreate contactTerm(Integer contactTerm) {
    this.contactTerm = contactTerm;
    return this;
  }

   /**
   * Get contactTerm
   * @return contactTerm
  **/
  @Schema(description = "")
  public Integer getContactTerm() {
    return contactTerm;
  }

  public void setContactTerm(Integer contactTerm) {
    this.contactTerm = contactTerm;
  }

  public AccountMemberCreate contactMonthsLeft(Integer contactMonthsLeft) {
    this.contactMonthsLeft = contactMonthsLeft;
    return this;
  }

   /**
   * Get contactMonthsLeft
   * @return contactMonthsLeft
  **/
  @Schema(description = "")
  public Integer getContactMonthsLeft() {
    return contactMonthsLeft;
  }

  public void setContactMonthsLeft(Integer contactMonthsLeft) {
    this.contactMonthsLeft = contactMonthsLeft;
  }

  public AccountMemberCreate units(String units) {
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @Schema(description = "")
  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }

  public AccountMemberCreate streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * Get streetNumber
   * @return streetNumber
  **/
  @Schema(description = "")
  public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public AccountMemberCreate streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @Schema(description = "")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public AccountMemberCreate unitType(String unitType) {
    this.unitType = unitType;
    return this;
  }

   /**
   * Get unitType
   * @return unitType
  **/
  @Schema(description = "")
  public String getUnitType() {
    return unitType;
  }

  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }

  public AccountMemberCreate unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @Schema(description = "")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public AccountMemberCreate poBox(String poBox) {
    this.poBox = poBox;
    return this;
  }

   /**
   * Get poBox
   * @return poBox
  **/
  @Schema(description = "")
  public String getPoBox() {
    return poBox;
  }

  public void setPoBox(String poBox) {
    this.poBox = poBox;
  }

  public AccountMemberCreate rr(String rr) {
    this.rr = rr;
    return this;
  }

   /**
   * Get rr
   * @return rr
  **/
  @Schema(description = "")
  public String getRr() {
    return rr;
  }

  public void setRr(String rr) {
    this.rr = rr;
  }

  public AccountMemberCreate city(String city) {
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

  public AccountMemberCreate province(String province) {
    this.province = province;
    return this;
  }

   /**
   * Get province
   * @return province
  **/
  @Schema(description = "")
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public AccountMemberCreate postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @Schema(description = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public AccountMemberCreate homePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

   /**
   * Get homePhone
   * @return homePhone
  **/
  @Schema(description = "")
  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public AccountMemberCreate businessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

   /**
   * Get businessPhone
   * @return businessPhone
  **/
  @Schema(description = "")
  public String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }

  public AccountMemberCreate businessExtensions(String businessExtensions) {
    this.businessExtensions = businessExtensions;
    return this;
  }

   /**
   * Get businessExtensions
   * @return businessExtensions
  **/
  @Schema(description = "")
  public String getBusinessExtensions() {
    return businessExtensions;
  }

  public void setBusinessExtensions(String businessExtensions) {
    this.businessExtensions = businessExtensions;
  }

  public AccountMemberCreate email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AccountMemberCreate status(Boolean status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Boolean isStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public AccountMemberCreate avgDataUsage(Integer avgDataUsage) {
    this.avgDataUsage = avgDataUsage;
    return this;
  }

   /**
   * Get avgDataUsage
   * @return avgDataUsage
  **/
  @Schema(description = "")
  public Integer getAvgDataUsage() {
    return avgDataUsage;
  }

  public void setAvgDataUsage(Integer avgDataUsage) {
    this.avgDataUsage = avgDataUsage;
  }

  public AccountMemberCreate avgMinutesUsage(Integer avgMinutesUsage) {
    this.avgMinutesUsage = avgMinutesUsage;
    return this;
  }

   /**
   * Get avgMinutesUsage
   * @return avgMinutesUsage
  **/
  @Schema(description = "")
  public Integer getAvgMinutesUsage() {
    return avgMinutesUsage;
  }

  public void setAvgMinutesUsage(Integer avgMinutesUsage) {
    this.avgMinutesUsage = avgMinutesUsage;
  }

  public AccountMemberCreate avgLongDistanceUsage(Integer avgLongDistanceUsage) {
    this.avgLongDistanceUsage = avgLongDistanceUsage;
    return this;
  }

   /**
   * Get avgLongDistanceUsage
   * @return avgLongDistanceUsage
  **/
  @Schema(description = "")
  public Integer getAvgLongDistanceUsage() {
    return avgLongDistanceUsage;
  }

  public void setAvgLongDistanceUsage(Integer avgLongDistanceUsage) {
    this.avgLongDistanceUsage = avgLongDistanceUsage;
  }

  public AccountMemberCreate avgRoamingUsage(Integer avgRoamingUsage) {
    this.avgRoamingUsage = avgRoamingUsage;
    return this;
  }

   /**
   * Get avgRoamingUsage
   * @return avgRoamingUsage
  **/
  @Schema(description = "")
  public Integer getAvgRoamingUsage() {
    return avgRoamingUsage;
  }

  public void setAvgRoamingUsage(Integer avgRoamingUsage) {
    this.avgRoamingUsage = avgRoamingUsage;
  }

  public AccountMemberCreate avgDataOverage(Integer avgDataOverage) {
    this.avgDataOverage = avgDataOverage;
    return this;
  }

   /**
   * Get avgDataOverage
   * @return avgDataOverage
  **/
  @Schema(description = "")
  public Integer getAvgDataOverage() {
    return avgDataOverage;
  }

  public void setAvgDataOverage(Integer avgDataOverage) {
    this.avgDataOverage = avgDataOverage;
  }

  public AccountMemberCreate avgMinsOverage(Integer avgMinsOverage) {
    this.avgMinsOverage = avgMinsOverage;
    return this;
  }

   /**
   * Get avgMinsOverage
   * @return avgMinsOverage
  **/
  @Schema(description = "")
  public Integer getAvgMinsOverage() {
    return avgMinsOverage;
  }

  public void setAvgMinsOverage(Integer avgMinsOverage) {
    this.avgMinsOverage = avgMinsOverage;
  }

  public AccountMemberCreate avgLdOverage(Float avgLdOverage) {
    this.avgLdOverage = avgLdOverage;
    return this;
  }

   /**
   * Get avgLdOverage
   * @return avgLdOverage
  **/
  @Schema(description = "")
  public Float getAvgLdOverage() {
    return avgLdOverage;
  }

  public void setAvgLdOverage(Float avgLdOverage) {
    this.avgLdOverage = avgLdOverage;
  }

  public AccountMemberCreate avgRoamOverage(Float avgRoamOverage) {
    this.avgRoamOverage = avgRoamOverage;
    return this;
  }

   /**
   * Get avgRoamOverage
   * @return avgRoamOverage
  **/
  @Schema(description = "")
  public Float getAvgRoamOverage() {
    return avgRoamOverage;
  }

  public void setAvgRoamOverage(Float avgRoamOverage) {
    this.avgRoamOverage = avgRoamOverage;
  }

  public AccountMemberCreate campaignType(String campaignType) {
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Get campaignType
   * @return campaignType
  **/
  @Schema(description = "")
  public String getCampaignType() {
    return campaignType;
  }

  public void setCampaignType(String campaignType) {
    this.campaignType = campaignType;
  }

  public AccountMemberCreate campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @Schema(description = "")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public AccountMemberCreate avgRpu(Float avgRpu) {
    this.avgRpu = avgRpu;
    return this;
  }

   /**
   * Get avgRpu
   * @return avgRpu
  **/
  @Schema(description = "")
  public Float getAvgRpu() {
    return avgRpu;
  }

  public void setAvgRpu(Float avgRpu) {
    this.avgRpu = avgRpu;
  }

  public AccountMemberCreate tab(Float tab) {
    this.tab = tab;
    return this;
  }

   /**
   * Get tab
   * @return tab
  **/
  @Schema(description = "")
  public Float getTab() {
    return tab;
  }

  public void setTab(Float tab) {
    this.tab = tab;
  }

  public AccountMemberCreate tabCharge(Float tabCharge) {
    this.tabCharge = tabCharge;
    return this;
  }

   /**
   * Get tabCharge
   * @return tabCharge
  **/
  @Schema(description = "")
  public Float getTabCharge() {
    return tabCharge;
  }

  public void setTabCharge(Float tabCharge) {
    this.tabCharge = tabCharge;
  }

  public AccountMemberCreate tabDate(OffsetDateTime tabDate) {
    this.tabDate = tabDate;
    return this;
  }

   /**
   * Get tabDate
   * @return tabDate
  **/
  @Schema(description = "")
  public OffsetDateTime getTabDate() {
    return tabDate;
  }

  public void setTabDate(OffsetDateTime tabDate) {
    this.tabDate = tabDate;
  }

  public AccountMemberCreate source(String source) {
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

  public AccountMemberCreate sourceId(Integer sourceId) {
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

  public AccountMemberCreate customerExternalId(String customerExternalId) {
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

  public AccountMemberCreate oldBan(String oldBan) {
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

  public AccountMemberCreate salesforceLineId(String salesforceLineId) {
    this.salesforceLineId = salesforceLineId;
    return this;
  }

   /**
   * Get salesforceLineId
   * @return salesforceLineId
  **/
  @Schema(description = "")
  public String getSalesforceLineId() {
    return salesforceLineId;
  }

  public void setSalesforceLineId(String salesforceLineId) {
    this.salesforceLineId = salesforceLineId;
  }

  public AccountMemberCreate byodCustomer(String byodCustomer) {
    this.byodCustomer = byodCustomer;
    return this;
  }

   /**
   * Get byodCustomer
   * @return byodCustomer
  **/
  @Schema(description = "")
  public String getByodCustomer() {
    return byodCustomer;
  }

  public void setByodCustomer(String byodCustomer) {
    this.byodCustomer = byodCustomer;
  }

  public AccountMemberCreate prepaid(String prepaid) {
    this.prepaid = prepaid;
    return this;
  }

   /**
   * Get prepaid
   * @return prepaid
  **/
  @Schema(description = "")
  public String getPrepaid() {
    return prepaid;
  }

  public void setPrepaid(String prepaid) {
    this.prepaid = prepaid;
  }

  public AccountMemberCreate subscriberId(String subscriberId) {
    this.subscriberId = subscriberId;
    return this;
  }

   /**
   * Get subscriberId
   * @return subscriberId
  **/
  @Schema(description = "")
  public String getSubscriberId() {
    return subscriberId;
  }

  public void setSubscriberId(String subscriberId) {
    this.subscriberId = subscriberId;
  }

  public AccountMemberCreate portInCarrierId(Integer portInCarrierId) {
    this.portInCarrierId = portInCarrierId;
    return this;
  }

   /**
   * Get portInCarrierId
   * @return portInCarrierId
  **/
  @Schema(description = "")
  public Integer getPortInCarrierId() {
    return portInCarrierId;
  }

  public void setPortInCarrierId(Integer portInCarrierId) {
    this.portInCarrierId = portInCarrierId;
  }

  public AccountMemberCreate portInCarrierName(String portInCarrierName) {
    this.portInCarrierName = portInCarrierName;
    return this;
  }

   /**
   * Get portInCarrierName
   * @return portInCarrierName
  **/
  @Schema(description = "")
  public String getPortInCarrierName() {
    return portInCarrierName;
  }

  public void setPortInCarrierName(String portInCarrierName) {
    this.portInCarrierName = portInCarrierName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountMemberCreate accountMemberCreate = (AccountMemberCreate) o;
    return Objects.equals(this.id, accountMemberCreate.id) &&
        Objects.equals(this.accountId, accountMemberCreate.accountId) &&
        Objects.equals(this.phoneNumber, accountMemberCreate.phoneNumber) &&
        Objects.equals(this.accountType, accountMemberCreate.accountType) &&
        Objects.equals(this.language, accountMemberCreate.language) &&
        Objects.equals(this.accountName, accountMemberCreate.accountName) &&
        Objects.equals(this.accountMemberName, accountMemberCreate.accountMemberName) &&
        Objects.equals(this.service, accountMemberCreate.service) &&
        Objects.equals(this.product, accountMemberCreate.product) &&
        Objects.equals(this.serviceStartDate, accountMemberCreate.serviceStartDate) &&
        Objects.equals(this.serviceEndDate, accountMemberCreate.serviceEndDate) &&
        Objects.equals(this.locationId, accountMemberCreate.locationId) &&
        Objects.equals(this.dateCreated, accountMemberCreate.dateCreated) &&
        Objects.equals(this.tradeIn, accountMemberCreate.tradeIn) &&
        Objects.equals(this.imei, accountMemberCreate.imei) &&
        Objects.equals(this.esnDec, accountMemberCreate.esnDec) &&
        Objects.equals(this.eduf, accountMemberCreate.eduf) &&
        Objects.equals(this.contactTerm, accountMemberCreate.contactTerm) &&
        Objects.equals(this.contactMonthsLeft, accountMemberCreate.contactMonthsLeft) &&
        Objects.equals(this.units, accountMemberCreate.units) &&
        Objects.equals(this.streetNumber, accountMemberCreate.streetNumber) &&
        Objects.equals(this.streetName, accountMemberCreate.streetName) &&
        Objects.equals(this.unitType, accountMemberCreate.unitType) &&
        Objects.equals(this.unit, accountMemberCreate.unit) &&
        Objects.equals(this.poBox, accountMemberCreate.poBox) &&
        Objects.equals(this.rr, accountMemberCreate.rr) &&
        Objects.equals(this.city, accountMemberCreate.city) &&
        Objects.equals(this.province, accountMemberCreate.province) &&
        Objects.equals(this.postalCode, accountMemberCreate.postalCode) &&
        Objects.equals(this.homePhone, accountMemberCreate.homePhone) &&
        Objects.equals(this.businessPhone, accountMemberCreate.businessPhone) &&
        Objects.equals(this.businessExtensions, accountMemberCreate.businessExtensions) &&
        Objects.equals(this.email, accountMemberCreate.email) &&
        Objects.equals(this.status, accountMemberCreate.status) &&
        Objects.equals(this.avgDataUsage, accountMemberCreate.avgDataUsage) &&
        Objects.equals(this.avgMinutesUsage, accountMemberCreate.avgMinutesUsage) &&
        Objects.equals(this.avgLongDistanceUsage, accountMemberCreate.avgLongDistanceUsage) &&
        Objects.equals(this.avgRoamingUsage, accountMemberCreate.avgRoamingUsage) &&
        Objects.equals(this.avgDataOverage, accountMemberCreate.avgDataOverage) &&
        Objects.equals(this.avgMinsOverage, accountMemberCreate.avgMinsOverage) &&
        Objects.equals(this.avgLdOverage, accountMemberCreate.avgLdOverage) &&
        Objects.equals(this.avgRoamOverage, accountMemberCreate.avgRoamOverage) &&
        Objects.equals(this.campaignType, accountMemberCreate.campaignType) &&
        Objects.equals(this.campaignId, accountMemberCreate.campaignId) &&
        Objects.equals(this.avgRpu, accountMemberCreate.avgRpu) &&
        Objects.equals(this.tab, accountMemberCreate.tab) &&
        Objects.equals(this.tabCharge, accountMemberCreate.tabCharge) &&
        Objects.equals(this.tabDate, accountMemberCreate.tabDate) &&
        Objects.equals(this.source, accountMemberCreate.source) &&
        Objects.equals(this.sourceId, accountMemberCreate.sourceId) &&
        Objects.equals(this.customerExternalId, accountMemberCreate.customerExternalId) &&
        Objects.equals(this.oldBan, accountMemberCreate.oldBan) &&
        Objects.equals(this.salesforceLineId, accountMemberCreate.salesforceLineId) &&
        Objects.equals(this.byodCustomer, accountMemberCreate.byodCustomer) &&
        Objects.equals(this.prepaid, accountMemberCreate.prepaid) &&
        Objects.equals(this.subscriberId, accountMemberCreate.subscriberId) &&
        Objects.equals(this.portInCarrierId, accountMemberCreate.portInCarrierId) &&
        Objects.equals(this.portInCarrierName, accountMemberCreate.portInCarrierName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, phoneNumber, accountType, language, accountName, accountMemberName, service, product, serviceStartDate, serviceEndDate, locationId, dateCreated, tradeIn, imei, esnDec, eduf, contactTerm, contactMonthsLeft, units, streetNumber, streetName, unitType, unit, poBox, rr, city, province, postalCode, homePhone, businessPhone, businessExtensions, email, status, avgDataUsage, avgMinutesUsage, avgLongDistanceUsage, avgRoamingUsage, avgDataOverage, avgMinsOverage, avgLdOverage, avgRoamOverage, campaignType, campaignId, avgRpu, tab, tabCharge, tabDate, source, sourceId, customerExternalId, oldBan, salesforceLineId, byodCustomer, prepaid, subscriberId, portInCarrierId, portInCarrierName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountMemberCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountMemberName: ").append(toIndentedString(accountMemberName)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    serviceStartDate: ").append(toIndentedString(serviceStartDate)).append("\n");
    sb.append("    serviceEndDate: ").append(toIndentedString(serviceEndDate)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    tradeIn: ").append(toIndentedString(tradeIn)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    esnDec: ").append(toIndentedString(esnDec)).append("\n");
    sb.append("    eduf: ").append(toIndentedString(eduf)).append("\n");
    sb.append("    contactTerm: ").append(toIndentedString(contactTerm)).append("\n");
    sb.append("    contactMonthsLeft: ").append(toIndentedString(contactMonthsLeft)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    poBox: ").append(toIndentedString(poBox)).append("\n");
    sb.append("    rr: ").append(toIndentedString(rr)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    homePhone: ").append(toIndentedString(homePhone)).append("\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    businessExtensions: ").append(toIndentedString(businessExtensions)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    avgDataUsage: ").append(toIndentedString(avgDataUsage)).append("\n");
    sb.append("    avgMinutesUsage: ").append(toIndentedString(avgMinutesUsage)).append("\n");
    sb.append("    avgLongDistanceUsage: ").append(toIndentedString(avgLongDistanceUsage)).append("\n");
    sb.append("    avgRoamingUsage: ").append(toIndentedString(avgRoamingUsage)).append("\n");
    sb.append("    avgDataOverage: ").append(toIndentedString(avgDataOverage)).append("\n");
    sb.append("    avgMinsOverage: ").append(toIndentedString(avgMinsOverage)).append("\n");
    sb.append("    avgLdOverage: ").append(toIndentedString(avgLdOverage)).append("\n");
    sb.append("    avgRoamOverage: ").append(toIndentedString(avgRoamOverage)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    avgRpu: ").append(toIndentedString(avgRpu)).append("\n");
    sb.append("    tab: ").append(toIndentedString(tab)).append("\n");
    sb.append("    tabCharge: ").append(toIndentedString(tabCharge)).append("\n");
    sb.append("    tabDate: ").append(toIndentedString(tabDate)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    customerExternalId: ").append(toIndentedString(customerExternalId)).append("\n");
    sb.append("    oldBan: ").append(toIndentedString(oldBan)).append("\n");
    sb.append("    salesforceLineId: ").append(toIndentedString(salesforceLineId)).append("\n");
    sb.append("    byodCustomer: ").append(toIndentedString(byodCustomer)).append("\n");
    sb.append("    prepaid: ").append(toIndentedString(prepaid)).append("\n");
    sb.append("    subscriberId: ").append(toIndentedString(subscriberId)).append("\n");
    sb.append("    portInCarrierId: ").append(toIndentedString(portInCarrierId)).append("\n");
    sb.append("    portInCarrierName: ").append(toIndentedString(portInCarrierName)).append("\n");
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
