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
import com.statflo.client.model.District;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LocationSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-06T15:36:46.949215Z[Etc/UTC]")

public class LocationSummary {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("externalDealerId")
  private String externalDealerId = null;

  @SerializedName("dealer")
  private Dealer dealer = null;

  @SerializedName("districtId")
  private Integer districtId = null;

  @SerializedName("district")
  private District district = null;

  @SerializedName("externalLocationId")
  private String externalLocationId = null;

  @SerializedName("salesforceLocationId")
  private String salesforceLocationId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("addressLine1")
  private String addressLine1 = null;

  @SerializedName("addressLine2")
  private String addressLine2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zipCode")
  private String zipCode = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("fax")
  private String fax = null;

  @SerializedName("website")
  private String website = null;

  @SerializedName("manager")
  private String manager = null;

  @SerializedName("managerPhone")
  private String managerPhone = null;

  @SerializedName("managerEmail")
  private String managerEmail = null;

  @SerializedName("locator")
  private String locator = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("outlet")
  private String outlet = null;

  @SerializedName("fullAddress")
  private String fullAddress = null;

  public LocationSummary id(Integer id) {
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

  public LocationSummary externalDealerId(String externalDealerId) {
    this.externalDealerId = externalDealerId;
    return this;
  }

   /**
   * Get externalDealerId
   * @return externalDealerId
  **/
  @Schema(description = "")
  public String getExternalDealerId() {
    return externalDealerId;
  }

  public void setExternalDealerId(String externalDealerId) {
    this.externalDealerId = externalDealerId;
  }

  public LocationSummary dealer(Dealer dealer) {
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

  public LocationSummary districtId(Integer districtId) {
    this.districtId = districtId;
    return this;
  }

   /**
   * Get districtId
   * @return districtId
  **/
  @Schema(required = true, description = "")
  public Integer getDistrictId() {
    return districtId;
  }

  public void setDistrictId(Integer districtId) {
    this.districtId = districtId;
  }

  public LocationSummary district(District district) {
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @Schema(description = "")
  public District getDistrict() {
    return district;
  }

  public void setDistrict(District district) {
    this.district = district;
  }

  public LocationSummary externalLocationId(String externalLocationId) {
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

  public LocationSummary salesforceLocationId(String salesforceLocationId) {
    this.salesforceLocationId = salesforceLocationId;
    return this;
  }

   /**
   * Get salesforceLocationId
   * @return salesforceLocationId
  **/
  @Schema(description = "")
  public String getSalesforceLocationId() {
    return salesforceLocationId;
  }

  public void setSalesforceLocationId(String salesforceLocationId) {
    this.salesforceLocationId = salesforceLocationId;
  }

  public LocationSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocationSummary addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  @Schema(description = "")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public LocationSummary addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  @Schema(description = "")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public LocationSummary city(String city) {
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

  public LocationSummary state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public LocationSummary zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @Schema(description = "")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public LocationSummary country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(description = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public LocationSummary phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @Schema(description = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public LocationSummary fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @Schema(description = "")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public LocationSummary website(String website) {
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

  public LocationSummary manager(String manager) {
    this.manager = manager;
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/
  @Schema(description = "")
  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  public LocationSummary managerPhone(String managerPhone) {
    this.managerPhone = managerPhone;
    return this;
  }

   /**
   * Get managerPhone
   * @return managerPhone
  **/
  @Schema(description = "")
  public String getManagerPhone() {
    return managerPhone;
  }

  public void setManagerPhone(String managerPhone) {
    this.managerPhone = managerPhone;
  }

  public LocationSummary managerEmail(String managerEmail) {
    this.managerEmail = managerEmail;
    return this;
  }

   /**
   * Get managerEmail
   * @return managerEmail
  **/
  @Schema(description = "")
  public String getManagerEmail() {
    return managerEmail;
  }

  public void setManagerEmail(String managerEmail) {
    this.managerEmail = managerEmail;
  }

  public LocationSummary locator(String locator) {
    this.locator = locator;
    return this;
  }

   /**
   * Get locator
   * @return locator
  **/
  @Schema(description = "")
  public String getLocator() {
    return locator;
  }

  public void setLocator(String locator) {
    this.locator = locator;
  }

  public LocationSummary address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public LocationSummary outlet(String outlet) {
    this.outlet = outlet;
    return this;
  }

   /**
   * Get outlet
   * @return outlet
  **/
  @Schema(description = "")
  public String getOutlet() {
    return outlet;
  }

  public void setOutlet(String outlet) {
    this.outlet = outlet;
  }

  public LocationSummary fullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
    return this;
  }

   /**
   * Get fullAddress
   * @return fullAddress
  **/
  @Schema(required = true, description = "")
  public String getFullAddress() {
    return fullAddress;
  }

  public void setFullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationSummary locationSummary = (LocationSummary) o;
    return Objects.equals(this.id, locationSummary.id) &&
        Objects.equals(this.externalDealerId, locationSummary.externalDealerId) &&
        Objects.equals(this.dealer, locationSummary.dealer) &&
        Objects.equals(this.districtId, locationSummary.districtId) &&
        Objects.equals(this.district, locationSummary.district) &&
        Objects.equals(this.externalLocationId, locationSummary.externalLocationId) &&
        Objects.equals(this.salesforceLocationId, locationSummary.salesforceLocationId) &&
        Objects.equals(this.name, locationSummary.name) &&
        Objects.equals(this.addressLine1, locationSummary.addressLine1) &&
        Objects.equals(this.addressLine2, locationSummary.addressLine2) &&
        Objects.equals(this.city, locationSummary.city) &&
        Objects.equals(this.state, locationSummary.state) &&
        Objects.equals(this.zipCode, locationSummary.zipCode) &&
        Objects.equals(this.country, locationSummary.country) &&
        Objects.equals(this.phone, locationSummary.phone) &&
        Objects.equals(this.fax, locationSummary.fax) &&
        Objects.equals(this.website, locationSummary.website) &&
        Objects.equals(this.manager, locationSummary.manager) &&
        Objects.equals(this.managerPhone, locationSummary.managerPhone) &&
        Objects.equals(this.managerEmail, locationSummary.managerEmail) &&
        Objects.equals(this.locator, locationSummary.locator) &&
        Objects.equals(this.address, locationSummary.address) &&
        Objects.equals(this.outlet, locationSummary.outlet) &&
        Objects.equals(this.fullAddress, locationSummary.fullAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalDealerId, dealer, districtId, district, externalLocationId, salesforceLocationId, name, addressLine1, addressLine2, city, state, zipCode, country, phone, fax, website, manager, managerPhone, managerEmail, locator, address, outlet, fullAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalDealerId: ").append(toIndentedString(externalDealerId)).append("\n");
    sb.append("    dealer: ").append(toIndentedString(dealer)).append("\n");
    sb.append("    districtId: ").append(toIndentedString(districtId)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    externalLocationId: ").append(toIndentedString(externalLocationId)).append("\n");
    sb.append("    salesforceLocationId: ").append(toIndentedString(salesforceLocationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    managerPhone: ").append(toIndentedString(managerPhone)).append("\n");
    sb.append("    managerEmail: ").append(toIndentedString(managerEmail)).append("\n");
    sb.append("    locator: ").append(toIndentedString(locator)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    outlet: ").append(toIndentedString(outlet)).append("\n");
    sb.append("    fullAddress: ").append(toIndentedString(fullAddress)).append("\n");
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
