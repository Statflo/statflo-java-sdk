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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * ContactCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-02T20:03:55.393689Z[Etc/UTC]")

public class ContactCreate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountName")
  private String accountName = null;

  @SerializedName("accountId")
  private String accountId = null;

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

  @SerializedName("dateAdded")
  private OffsetDateTime dateAdded = null;

  @SerializedName("jobTitle")
  private String jobTitle = null;

  @SerializedName("source")
  private String source = "api";

  @SerializedName("sourceId")
  private Integer sourceId = null;

  @SerializedName("customerId")
  private String customerId = null;

  @SerializedName("oldBan")
  private String oldBan = null;

  @SerializedName("smsCapable")
  private Boolean smsCapable = null;

  @SerializedName("flag")
  private String flag = null;

  @SerializedName("optedOut")
  private List<Object> optedOut = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("preferredLanguage")
  private String preferredLanguage = null;

  public ContactCreate id(Integer id) {
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

  public ContactCreate accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @Schema(required = true, description = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public ContactCreate accountId(String accountId) {
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

  public ContactCreate contactName(String contactName) {
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

  public ContactCreate streetNumber(String streetNumber) {
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

  public ContactCreate streetName(String streetName) {
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

  public ContactCreate city(String city) {
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

  public ContactCreate province(String province) {
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

  public ContactCreate country(String country) {
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

  public ContactCreate zipCode(String zipCode) {
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

  public ContactCreate phoneNumber(String phoneNumber) {
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

  public ContactCreate phoneExtension(String phoneExtension) {
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

  public ContactCreate email(String email) {
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

  public ContactCreate primaryContact(Boolean primaryContact) {
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

  public ContactCreate dateAdded(OffsetDateTime dateAdded) {
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

  public ContactCreate jobTitle(String jobTitle) {
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

  public ContactCreate source(String source) {
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

  public ContactCreate sourceId(Integer sourceId) {
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

  public ContactCreate customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @Schema(description = "")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public ContactCreate oldBan(String oldBan) {
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

  public ContactCreate smsCapable(Boolean smsCapable) {
    this.smsCapable = smsCapable;
    return this;
  }

   /**
   * Get smsCapable
   * @return smsCapable
  **/
  @Schema(description = "")
  public Boolean isSmsCapable() {
    return smsCapable;
  }

  public void setSmsCapable(Boolean smsCapable) {
    this.smsCapable = smsCapable;
  }

  public ContactCreate flag(String flag) {
    this.flag = flag;
    return this;
  }

   /**
   * Get flag
   * @return flag
  **/
  @Schema(description = "")
  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  public ContactCreate optedOut(List<Object> optedOut) {
    this.optedOut = optedOut;
    return this;
  }

  public ContactCreate addOptedOutItem(Object optedOutItem) {
    if (this.optedOut == null) {
      this.optedOut = new ArrayList<Object>();
    }
    this.optedOut.add(optedOutItem);
    return this;
  }

   /**
   * Get optedOut
   * @return optedOut
  **/
  @Schema(description = "")
  public List<Object> getOptedOut() {
    return optedOut;
  }

  public void setOptedOut(List<Object> optedOut) {
    this.optedOut = optedOut;
  }

  public ContactCreate firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @Schema(description = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ContactCreate preferredLanguage(String preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
    return this;
  }

   /**
   * Get preferredLanguage
   * @return preferredLanguage
  **/
  @Schema(description = "")
  public String getPreferredLanguage() {
    return preferredLanguage;
  }

  public void setPreferredLanguage(String preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactCreate contactCreate = (ContactCreate) o;
    return Objects.equals(this.id, contactCreate.id) &&
        Objects.equals(this.accountName, contactCreate.accountName) &&
        Objects.equals(this.accountId, contactCreate.accountId) &&
        Objects.equals(this.contactName, contactCreate.contactName) &&
        Objects.equals(this.streetNumber, contactCreate.streetNumber) &&
        Objects.equals(this.streetName, contactCreate.streetName) &&
        Objects.equals(this.city, contactCreate.city) &&
        Objects.equals(this.province, contactCreate.province) &&
        Objects.equals(this.country, contactCreate.country) &&
        Objects.equals(this.zipCode, contactCreate.zipCode) &&
        Objects.equals(this.phoneNumber, contactCreate.phoneNumber) &&
        Objects.equals(this.phoneExtension, contactCreate.phoneExtension) &&
        Objects.equals(this.email, contactCreate.email) &&
        Objects.equals(this.primaryContact, contactCreate.primaryContact) &&
        Objects.equals(this.dateAdded, contactCreate.dateAdded) &&
        Objects.equals(this.jobTitle, contactCreate.jobTitle) &&
        Objects.equals(this.source, contactCreate.source) &&
        Objects.equals(this.sourceId, contactCreate.sourceId) &&
        Objects.equals(this.customerId, contactCreate.customerId) &&
        Objects.equals(this.oldBan, contactCreate.oldBan) &&
        Objects.equals(this.smsCapable, contactCreate.smsCapable) &&
        Objects.equals(this.flag, contactCreate.flag) &&
        Objects.equals(this.optedOut, contactCreate.optedOut) &&
        Objects.equals(this.firstName, contactCreate.firstName) &&
        Objects.equals(this.preferredLanguage, contactCreate.preferredLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountName, accountId, contactName, streetNumber, streetName, city, province, country, zipCode, phoneNumber, phoneExtension, email, primaryContact, dateAdded, jobTitle, source, sourceId, customerId, oldBan, smsCapable, flag, optedOut, firstName, preferredLanguage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    oldBan: ").append(toIndentedString(oldBan)).append("\n");
    sb.append("    smsCapable: ").append(toIndentedString(smsCapable)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    optedOut: ").append(toIndentedString(optedOut)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    preferredLanguage: ").append(toIndentedString(preferredLanguage)).append("\n");
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
