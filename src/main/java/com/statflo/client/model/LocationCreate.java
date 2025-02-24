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
 * LocationCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-02-24T16:11:33.082930-05:00[America/Toronto]")

public class LocationCreate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("externalDealerId")
  private String externalDealerId = null;

  @SerializedName("districtId")
  private Integer districtId = null;

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

  public LocationCreate id(Integer id) {
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

  public LocationCreate externalDealerId(String externalDealerId) {
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

  public LocationCreate districtId(Integer districtId) {
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

  public LocationCreate externalLocationId(String externalLocationId) {
    this.externalLocationId = externalLocationId;
    return this;
  }

   /**
   * Get externalLocationId
   * @return externalLocationId
  **/
  @Schema(required = true, description = "")
  public String getExternalLocationId() {
    return externalLocationId;
  }

  public void setExternalLocationId(String externalLocationId) {
    this.externalLocationId = externalLocationId;
  }

  public LocationCreate salesforceLocationId(String salesforceLocationId) {
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

  public LocationCreate name(String name) {
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

  public LocationCreate addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  @Schema(required = true, description = "")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public LocationCreate addressLine2(String addressLine2) {
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

  public LocationCreate city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @Schema(required = true, description = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public LocationCreate state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(required = true, description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public LocationCreate zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @Schema(required = true, description = "")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public LocationCreate country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(required = true, description = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public LocationCreate phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @Schema(required = true, description = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public LocationCreate fax(String fax) {
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

  public LocationCreate website(String website) {
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

  public LocationCreate manager(String manager) {
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

  public LocationCreate managerPhone(String managerPhone) {
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

  public LocationCreate managerEmail(String managerEmail) {
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

  public LocationCreate locator(String locator) {
    this.locator = locator;
    return this;
  }

   /**
   * Get locator
   * @return locator
  **/
  @Schema(required = true, description = "")
  public String getLocator() {
    return locator;
  }

  public void setLocator(String locator) {
    this.locator = locator;
  }

  public LocationCreate address(String address) {
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

  public LocationCreate outlet(String outlet) {
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

  public LocationCreate fullAddress(String fullAddress) {
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
    LocationCreate locationCreate = (LocationCreate) o;
    return Objects.equals(this.id, locationCreate.id) &&
        Objects.equals(this.externalDealerId, locationCreate.externalDealerId) &&
        Objects.equals(this.districtId, locationCreate.districtId) &&
        Objects.equals(this.externalLocationId, locationCreate.externalLocationId) &&
        Objects.equals(this.salesforceLocationId, locationCreate.salesforceLocationId) &&
        Objects.equals(this.name, locationCreate.name) &&
        Objects.equals(this.addressLine1, locationCreate.addressLine1) &&
        Objects.equals(this.addressLine2, locationCreate.addressLine2) &&
        Objects.equals(this.city, locationCreate.city) &&
        Objects.equals(this.state, locationCreate.state) &&
        Objects.equals(this.zipCode, locationCreate.zipCode) &&
        Objects.equals(this.country, locationCreate.country) &&
        Objects.equals(this.phone, locationCreate.phone) &&
        Objects.equals(this.fax, locationCreate.fax) &&
        Objects.equals(this.website, locationCreate.website) &&
        Objects.equals(this.manager, locationCreate.manager) &&
        Objects.equals(this.managerPhone, locationCreate.managerPhone) &&
        Objects.equals(this.managerEmail, locationCreate.managerEmail) &&
        Objects.equals(this.locator, locationCreate.locator) &&
        Objects.equals(this.address, locationCreate.address) &&
        Objects.equals(this.outlet, locationCreate.outlet) &&
        Objects.equals(this.fullAddress, locationCreate.fullAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalDealerId, districtId, externalLocationId, salesforceLocationId, name, addressLine1, addressLine2, city, state, zipCode, country, phone, fax, website, manager, managerPhone, managerEmail, locator, address, outlet, fullAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalDealerId: ").append(toIndentedString(externalDealerId)).append("\n");
    sb.append("    districtId: ").append(toIndentedString(districtId)).append("\n");
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
