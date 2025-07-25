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
import java.util.ArrayList;
import java.util.List;
/**
 * UserUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-24T20:30:11.489899882Z[Etc/UTC]")

public class UserUpdate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("salesRepId")
  private String salesRepId = null;

  @SerializedName("outletId")
  private String outletId = null;

  @SerializedName("districtId")
  private Integer districtId = null;

  @SerializedName("regionId")
  private Integer regionId = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("theme")
  private Integer theme = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("tokenParagon")
  private String tokenParagon = null;

  @SerializedName("userActive")
  private Boolean userActive = null;

  @SerializedName("inboundAvailable")
  private Boolean inboundAvailable = null;

  @SerializedName("dateAdded")
  private OffsetDateTime dateAdded = null;

  @SerializedName("permissions")
  private List<Object> permissions = new ArrayList<>();

  public UserUpdate id(Integer id) {
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

  public UserUpdate username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserUpdate firstName(String firstName) {
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

  public UserUpdate lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserUpdate email(String email) {
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

  public UserUpdate language(String language) {
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

  public UserUpdate salesRepId(String salesRepId) {
    this.salesRepId = salesRepId;
    return this;
  }

   /**
   * Get salesRepId
   * @return salesRepId
  **/
  @Schema(description = "")
  public String getSalesRepId() {
    return salesRepId;
  }

  public void setSalesRepId(String salesRepId) {
    this.salesRepId = salesRepId;
  }

  public UserUpdate outletId(String outletId) {
    this.outletId = outletId;
    return this;
  }

   /**
   * Get outletId
   * @return outletId
  **/
  @Schema(description = "")
  public String getOutletId() {
    return outletId;
  }

  public void setOutletId(String outletId) {
    this.outletId = outletId;
  }

  public UserUpdate districtId(Integer districtId) {
    this.districtId = districtId;
    return this;
  }

   /**
   * Get districtId
   * @return districtId
  **/
  @Schema(description = "")
  public Integer getDistrictId() {
    return districtId;
  }

  public void setDistrictId(Integer districtId) {
    this.districtId = districtId;
  }

  public UserUpdate regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @Schema(description = "")
  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  public UserUpdate phoneNumber(String phoneNumber) {
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

  public UserUpdate timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @Schema(description = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public UserUpdate theme(Integer theme) {
    this.theme = theme;
    return this;
  }

   /**
   * Get theme
   * @return theme
  **/
  @Schema(description = "")
  public Integer getTheme() {
    return theme;
  }

  public void setTheme(Integer theme) {
    this.theme = theme;
  }

  public UserUpdate token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @Schema(description = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public UserUpdate tokenParagon(String tokenParagon) {
    this.tokenParagon = tokenParagon;
    return this;
  }

   /**
   * Get tokenParagon
   * @return tokenParagon
  **/
  @Schema(description = "")
  public String getTokenParagon() {
    return tokenParagon;
  }

  public void setTokenParagon(String tokenParagon) {
    this.tokenParagon = tokenParagon;
  }

  public UserUpdate userActive(Boolean userActive) {
    this.userActive = userActive;
    return this;
  }

   /**
   * Get userActive
   * @return userActive
  **/
  @Schema(description = "")
  public Boolean isUserActive() {
    return userActive;
  }

  public void setUserActive(Boolean userActive) {
    this.userActive = userActive;
  }

  public UserUpdate inboundAvailable(Boolean inboundAvailable) {
    this.inboundAvailable = inboundAvailable;
    return this;
  }

   /**
   * Get inboundAvailable
   * @return inboundAvailable
  **/
  @Schema(description = "")
  public Boolean isInboundAvailable() {
    return inboundAvailable;
  }

  public void setInboundAvailable(Boolean inboundAvailable) {
    this.inboundAvailable = inboundAvailable;
  }

  public UserUpdate dateAdded(OffsetDateTime dateAdded) {
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

  public UserUpdate permissions(List<Object> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UserUpdate addPermissionsItem(Object permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(required = true, description = "")
  public List<Object> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Object> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdate userUpdate = (UserUpdate) o;
    return Objects.equals(this.id, userUpdate.id) &&
        Objects.equals(this.username, userUpdate.username) &&
        Objects.equals(this.firstName, userUpdate.firstName) &&
        Objects.equals(this.lastName, userUpdate.lastName) &&
        Objects.equals(this.email, userUpdate.email) &&
        Objects.equals(this.language, userUpdate.language) &&
        Objects.equals(this.salesRepId, userUpdate.salesRepId) &&
        Objects.equals(this.outletId, userUpdate.outletId) &&
        Objects.equals(this.districtId, userUpdate.districtId) &&
        Objects.equals(this.regionId, userUpdate.regionId) &&
        Objects.equals(this.phoneNumber, userUpdate.phoneNumber) &&
        Objects.equals(this.timezone, userUpdate.timezone) &&
        Objects.equals(this.theme, userUpdate.theme) &&
        Objects.equals(this.token, userUpdate.token) &&
        Objects.equals(this.tokenParagon, userUpdate.tokenParagon) &&
        Objects.equals(this.userActive, userUpdate.userActive) &&
        Objects.equals(this.inboundAvailable, userUpdate.inboundAvailable) &&
        Objects.equals(this.dateAdded, userUpdate.dateAdded) &&
        Objects.equals(this.permissions, userUpdate.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, firstName, lastName, email, language, salesRepId, outletId, districtId, regionId, phoneNumber, timezone, theme, token, tokenParagon, userActive, inboundAvailable, dateAdded, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    salesRepId: ").append(toIndentedString(salesRepId)).append("\n");
    sb.append("    outletId: ").append(toIndentedString(outletId)).append("\n");
    sb.append("    districtId: ").append(toIndentedString(districtId)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenParagon: ").append(toIndentedString(tokenParagon)).append("\n");
    sb.append("    userActive: ").append(toIndentedString(userActive)).append("\n");
    sb.append("    inboundAvailable: ").append(toIndentedString(inboundAvailable)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
