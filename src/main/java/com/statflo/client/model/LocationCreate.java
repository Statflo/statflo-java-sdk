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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-05T16:05:49.645046-04:00[America/Toronto]")

public class LocationCreate {
  @SerializedName("externalDealerId")
  private String externalDealerId = null;

  @SerializedName("districtId")
  private Integer districtId = null;

  @SerializedName("externalLocationId")
  private String externalLocationId = null;

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationCreate locationCreate = (LocationCreate) o;
    return Objects.equals(this.externalDealerId, locationCreate.externalDealerId) &&
        Objects.equals(this.districtId, locationCreate.districtId) &&
        Objects.equals(this.externalLocationId, locationCreate.externalLocationId) &&
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
        Objects.equals(this.locator, locationCreate.locator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalDealerId, districtId, externalLocationId, name, addressLine1, addressLine2, city, state, zipCode, country, phone, fax, website, manager, managerPhone, managerEmail, locator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationCreate {\n");
    
    sb.append("    externalDealerId: ").append(toIndentedString(externalDealerId)).append("\n");
    sb.append("    districtId: ").append(toIndentedString(districtId)).append("\n");
    sb.append("    externalLocationId: ").append(toIndentedString(externalLocationId)).append("\n");
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
