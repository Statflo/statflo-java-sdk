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
import com.statflo.client.model.Dealer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * AccountMemberSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-11-12T16:36:58.380507Z[Etc/UTC]")
public class AccountMemberSummary {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("accountType")
  private String accountType = "I";

  @SerializedName("language")
  private String language = "en";

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

  @SerializedName("dealer")
  private Dealer dealer = null;

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

  public AccountMemberSummary id(Integer id) {
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

  public AccountMemberSummary accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AccountMemberSummary phoneNumber(String phoneNumber) {
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

  public AccountMemberSummary accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @Schema(description = "")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public AccountMemberSummary language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @Schema(description = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public AccountMemberSummary accountName(String accountName) {
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

  public AccountMemberSummary accountMemberName(String accountMemberName) {
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

  public AccountMemberSummary service(String service) {
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

  public AccountMemberSummary product(String product) {
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

  public AccountMemberSummary serviceStartDate(OffsetDateTime serviceStartDate) {
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

  public AccountMemberSummary serviceEndDate(OffsetDateTime serviceEndDate) {
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

  public AccountMemberSummary dealer(Dealer dealer) {
    this.dealer = dealer;
    return this;
  }

   /**
   * Get dealer
   * @return dealer
  **/
  @Schema(description = "")
  public Dealer getDealer() {
    return dealer;
  }

  public void setDealer(Dealer dealer) {
    this.dealer = dealer;
  }

  public AccountMemberSummary locationId(String locationId) {
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

  public AccountMemberSummary dateCreated(OffsetDateTime dateCreated) {
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

  public AccountMemberSummary tradeIn(String tradeIn) {
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

  public AccountMemberSummary imei(String imei) {
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

  public AccountMemberSummary esnDec(String esnDec) {
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

  public AccountMemberSummary eduf(Float eduf) {
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

  public AccountMemberSummary contactTerm(Integer contactTerm) {
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

  public AccountMemberSummary contactMonthsLeft(Integer contactMonthsLeft) {
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

  public AccountMemberSummary units(String units) {
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

  public AccountMemberSummary streetNumber(String streetNumber) {
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

  public AccountMemberSummary streetName(String streetName) {
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

  public AccountMemberSummary unitType(String unitType) {
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

  public AccountMemberSummary unit(String unit) {
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

  public AccountMemberSummary poBox(String poBox) {
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

  public AccountMemberSummary rr(String rr) {
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

  public AccountMemberSummary city(String city) {
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

  public AccountMemberSummary province(String province) {
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

  public AccountMemberSummary postalCode(String postalCode) {
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

  public AccountMemberSummary homePhone(String homePhone) {
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

  public AccountMemberSummary businessPhone(String businessPhone) {
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

  public AccountMemberSummary businessExtensions(String businessExtensions) {
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

  public AccountMemberSummary email(String email) {
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

  public AccountMemberSummary status(Boolean status) {
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

  public AccountMemberSummary avgDataUsage(Integer avgDataUsage) {
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

  public AccountMemberSummary avgMinutesUsage(Integer avgMinutesUsage) {
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

  public AccountMemberSummary avgLongDistanceUsage(Integer avgLongDistanceUsage) {
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

  public AccountMemberSummary avgRoamingUsage(Integer avgRoamingUsage) {
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

  public AccountMemberSummary avgDataOverage(Integer avgDataOverage) {
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

  public AccountMemberSummary avgMinsOverage(Integer avgMinsOverage) {
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

  public AccountMemberSummary avgLdOverage(Float avgLdOverage) {
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

  public AccountMemberSummary avgRoamOverage(Float avgRoamOverage) {
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

  public AccountMemberSummary campaignType(String campaignType) {
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

  public AccountMemberSummary campaignId(String campaignId) {
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

  public AccountMemberSummary avgRpu(Float avgRpu) {
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

  public AccountMemberSummary tab(Float tab) {
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

  public AccountMemberSummary tabCharge(Float tabCharge) {
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

  public AccountMemberSummary tabDate(OffsetDateTime tabDate) {
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

  public AccountMemberSummary source(String source) {
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

  public AccountMemberSummary sourceId(Integer sourceId) {
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

  public AccountMemberSummary customerExternalId(String customerExternalId) {
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

  public AccountMemberSummary oldBan(String oldBan) {
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

  public AccountMemberSummary salesforceLineId(String salesforceLineId) {
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

  public AccountMemberSummary byodCustomer(String byodCustomer) {
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

  public AccountMemberSummary prepaid(String prepaid) {
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

  public AccountMemberSummary subscriberId(String subscriberId) {
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

  public AccountMemberSummary portInCarrierId(Integer portInCarrierId) {
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

  public AccountMemberSummary portInCarrierName(String portInCarrierName) {
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
    AccountMemberSummary accountMemberSummary = (AccountMemberSummary) o;
    return Objects.equals(this.id, accountMemberSummary.id) &&
        Objects.equals(this.accountId, accountMemberSummary.accountId) &&
        Objects.equals(this.phoneNumber, accountMemberSummary.phoneNumber) &&
        Objects.equals(this.accountType, accountMemberSummary.accountType) &&
        Objects.equals(this.language, accountMemberSummary.language) &&
        Objects.equals(this.accountName, accountMemberSummary.accountName) &&
        Objects.equals(this.accountMemberName, accountMemberSummary.accountMemberName) &&
        Objects.equals(this.service, accountMemberSummary.service) &&
        Objects.equals(this.product, accountMemberSummary.product) &&
        Objects.equals(this.serviceStartDate, accountMemberSummary.serviceStartDate) &&
        Objects.equals(this.serviceEndDate, accountMemberSummary.serviceEndDate) &&
        Objects.equals(this.dealer, accountMemberSummary.dealer) &&
        Objects.equals(this.locationId, accountMemberSummary.locationId) &&
        Objects.equals(this.dateCreated, accountMemberSummary.dateCreated) &&
        Objects.equals(this.tradeIn, accountMemberSummary.tradeIn) &&
        Objects.equals(this.imei, accountMemberSummary.imei) &&
        Objects.equals(this.esnDec, accountMemberSummary.esnDec) &&
        Objects.equals(this.eduf, accountMemberSummary.eduf) &&
        Objects.equals(this.contactTerm, accountMemberSummary.contactTerm) &&
        Objects.equals(this.contactMonthsLeft, accountMemberSummary.contactMonthsLeft) &&
        Objects.equals(this.units, accountMemberSummary.units) &&
        Objects.equals(this.streetNumber, accountMemberSummary.streetNumber) &&
        Objects.equals(this.streetName, accountMemberSummary.streetName) &&
        Objects.equals(this.unitType, accountMemberSummary.unitType) &&
        Objects.equals(this.unit, accountMemberSummary.unit) &&
        Objects.equals(this.poBox, accountMemberSummary.poBox) &&
        Objects.equals(this.rr, accountMemberSummary.rr) &&
        Objects.equals(this.city, accountMemberSummary.city) &&
        Objects.equals(this.province, accountMemberSummary.province) &&
        Objects.equals(this.postalCode, accountMemberSummary.postalCode) &&
        Objects.equals(this.homePhone, accountMemberSummary.homePhone) &&
        Objects.equals(this.businessPhone, accountMemberSummary.businessPhone) &&
        Objects.equals(this.businessExtensions, accountMemberSummary.businessExtensions) &&
        Objects.equals(this.email, accountMemberSummary.email) &&
        Objects.equals(this.status, accountMemberSummary.status) &&
        Objects.equals(this.avgDataUsage, accountMemberSummary.avgDataUsage) &&
        Objects.equals(this.avgMinutesUsage, accountMemberSummary.avgMinutesUsage) &&
        Objects.equals(this.avgLongDistanceUsage, accountMemberSummary.avgLongDistanceUsage) &&
        Objects.equals(this.avgRoamingUsage, accountMemberSummary.avgRoamingUsage) &&
        Objects.equals(this.avgDataOverage, accountMemberSummary.avgDataOverage) &&
        Objects.equals(this.avgMinsOverage, accountMemberSummary.avgMinsOverage) &&
        Objects.equals(this.avgLdOverage, accountMemberSummary.avgLdOverage) &&
        Objects.equals(this.avgRoamOverage, accountMemberSummary.avgRoamOverage) &&
        Objects.equals(this.campaignType, accountMemberSummary.campaignType) &&
        Objects.equals(this.campaignId, accountMemberSummary.campaignId) &&
        Objects.equals(this.avgRpu, accountMemberSummary.avgRpu) &&
        Objects.equals(this.tab, accountMemberSummary.tab) &&
        Objects.equals(this.tabCharge, accountMemberSummary.tabCharge) &&
        Objects.equals(this.tabDate, accountMemberSummary.tabDate) &&
        Objects.equals(this.source, accountMemberSummary.source) &&
        Objects.equals(this.sourceId, accountMemberSummary.sourceId) &&
        Objects.equals(this.customerExternalId, accountMemberSummary.customerExternalId) &&
        Objects.equals(this.oldBan, accountMemberSummary.oldBan) &&
        Objects.equals(this.salesforceLineId, accountMemberSummary.salesforceLineId) &&
        Objects.equals(this.byodCustomer, accountMemberSummary.byodCustomer) &&
        Objects.equals(this.prepaid, accountMemberSummary.prepaid) &&
        Objects.equals(this.subscriberId, accountMemberSummary.subscriberId) &&
        Objects.equals(this.portInCarrierId, accountMemberSummary.portInCarrierId) &&
        Objects.equals(this.portInCarrierName, accountMemberSummary.portInCarrierName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, phoneNumber, accountType, language, accountName, accountMemberName, service, product, serviceStartDate, serviceEndDate, dealer, locationId, dateCreated, tradeIn, imei, esnDec, eduf, contactTerm, contactMonthsLeft, units, streetNumber, streetName, unitType, unit, poBox, rr, city, province, postalCode, homePhone, businessPhone, businessExtensions, email, status, avgDataUsage, avgMinutesUsage, avgLongDistanceUsage, avgRoamingUsage, avgDataOverage, avgMinsOverage, avgLdOverage, avgRoamOverage, campaignType, campaignId, avgRpu, tab, tabCharge, tabDate, source, sourceId, customerExternalId, oldBan, salesforceLineId, byodCustomer, prepaid, subscriberId, portInCarrierId, portInCarrierName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountMemberSummary {\n");
    
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
    sb.append("    dealer: ").append(toIndentedString(dealer)).append("\n");
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
