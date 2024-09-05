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
 * ContactUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-05T14:23:39.893836-04:00[America/Toronto]")

public class ContactUpdate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountName")
  private String accountName = null;

  @SerializedName("contactName")
  private String contactName = null;

  @SerializedName("streetNumber")
  private String streetNumber = null;

  @SerializedName("streetName")
  private String streetName = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("province")
  private String province = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("zipCode")
  private String zipCode = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("phoneExtension")
  private String phoneExtension = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("primaryContact")
  private Boolean primaryContact = true;

  @SerializedName("jobTitle")
  private String jobTitle = null;

  public ContactUpdate id(Integer id) {
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

  public ContactUpdate accountName(String accountName) {
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

  public ContactUpdate contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

   /**
   * Get contactName
   * @return contactName
  **/
  @Schema(required = true, description = "")
  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public ContactUpdate streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * Get streetNumber
   * @return streetNumber
  **/
  @Schema(required = true, description = "")
  public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public ContactUpdate streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @Schema(required = true, description = "")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public ContactUpdate city(String city) {
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

  public ContactUpdate province(String province) {
    this.province = province;
    return this;
  }

   /**
   * Get province
   * @return province
  **/
  @Schema(required = true, description = "")
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public ContactUpdate country(String country) {
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

  public ContactUpdate zipCode(String zipCode) {
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

  public ContactUpdate phoneNumber(String phoneNumber) {
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

  public ContactUpdate phoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
    return this;
  }

   /**
   * Get phoneExtension
   * @return phoneExtension
  **/
  @Schema(description = "")
  public String getPhoneExtension() {
    return phoneExtension;
  }

  public void setPhoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
  }

  public ContactUpdate email(String email) {
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

  public ContactUpdate primaryContact(Boolean primaryContact) {
    this.primaryContact = primaryContact;
    return this;
  }

   /**
   * Get primaryContact
   * @return primaryContact
  **/
  @Schema(description = "")
  public Boolean isPrimaryContact() {
    return primaryContact;
  }

  public void setPrimaryContact(Boolean primaryContact) {
    this.primaryContact = primaryContact;
  }

  public ContactUpdate jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @Schema(description = "")
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactUpdate contactUpdate = (ContactUpdate) o;
    return Objects.equals(this.id, contactUpdate.id) &&
        Objects.equals(this.accountName, contactUpdate.accountName) &&
        Objects.equals(this.contactName, contactUpdate.contactName) &&
        Objects.equals(this.streetNumber, contactUpdate.streetNumber) &&
        Objects.equals(this.streetName, contactUpdate.streetName) &&
        Objects.equals(this.city, contactUpdate.city) &&
        Objects.equals(this.province, contactUpdate.province) &&
        Objects.equals(this.country, contactUpdate.country) &&
        Objects.equals(this.zipCode, contactUpdate.zipCode) &&
        Objects.equals(this.phoneNumber, contactUpdate.phoneNumber) &&
        Objects.equals(this.phoneExtension, contactUpdate.phoneExtension) &&
        Objects.equals(this.email, contactUpdate.email) &&
        Objects.equals(this.primaryContact, contactUpdate.primaryContact) &&
        Objects.equals(this.jobTitle, contactUpdate.jobTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountName, contactName, streetNumber, streetName, city, province, country, zipCode, phoneNumber, phoneExtension, email, primaryContact, jobTitle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneExtension: ").append(toIndentedString(phoneExtension)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    primaryContact: ").append(toIndentedString(primaryContact)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
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
