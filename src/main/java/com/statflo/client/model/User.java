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
import com.statflo.client.model.Role;
import com.statflo.client.model.UserPermission;
import com.statflo.client.model.UserTeam;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * User
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-02T00:31:54.569875-04:00[America/Toronto]")

public class User {
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

  @SerializedName("userActive")
  private Boolean userActive = true;

  @SerializedName("dealer")
  private Dealer dealer = null;

  @SerializedName("role")
  private Role role = null;

  @SerializedName("userPermissions")
  private List<UserPermission> userPermissions = null;

  @SerializedName("userTeams")
  private List<UserTeam> userTeams = null;

  @SerializedName("permissions")
  private List<Object> permissions = new ArrayList<Object>();

  public User id(Integer id) {
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

  public User username(String username) {
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

  public User firstName(String firstName) {
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

  public User lastName(String lastName) {
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

  public User email(String email) {
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

  public User language(String language) {
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

  public User salesRepId(String salesRepId) {
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

  public User outletId(String outletId) {
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

  public User districtId(Integer districtId) {
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

  public User regionId(Integer regionId) {
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

  public User userActive(Boolean userActive) {
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

  public User dealer(Dealer dealer) {
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

  public User role(Role role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @Schema(description = "")
  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public User userPermissions(List<UserPermission> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  public User addUserPermissionsItem(UserPermission userPermissionsItem) {
    if (this.userPermissions == null) {
      this.userPermissions = new ArrayList<UserPermission>();
    }
    this.userPermissions.add(userPermissionsItem);
    return this;
  }

   /**
   * Get userPermissions
   * @return userPermissions
  **/
  @Schema(description = "")
  public List<UserPermission> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<UserPermission> userPermissions) {
    this.userPermissions = userPermissions;
  }

  public User userTeams(List<UserTeam> userTeams) {
    this.userTeams = userTeams;
    return this;
  }

  public User addUserTeamsItem(UserTeam userTeamsItem) {
    if (this.userTeams == null) {
      this.userTeams = new ArrayList<UserTeam>();
    }
    this.userTeams.add(userTeamsItem);
    return this;
  }

   /**
   * Get userTeams
   * @return userTeams
  **/
  @Schema(description = "")
  public List<UserTeam> getUserTeams() {
    return userTeams;
  }

  public void setUserTeams(List<UserTeam> userTeams) {
    this.userTeams = userTeams;
  }

  public User permissions(List<Object> permissions) {
    this.permissions = permissions;
    return this;
  }

  public User addPermissionsItem(Object permissionsItem) {
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
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.language, user.language) &&
        Objects.equals(this.salesRepId, user.salesRepId) &&
        Objects.equals(this.outletId, user.outletId) &&
        Objects.equals(this.districtId, user.districtId) &&
        Objects.equals(this.regionId, user.regionId) &&
        Objects.equals(this.userActive, user.userActive) &&
        Objects.equals(this.dealer, user.dealer) &&
        Objects.equals(this.role, user.role) &&
        Objects.equals(this.userPermissions, user.userPermissions) &&
        Objects.equals(this.userTeams, user.userTeams) &&
        Objects.equals(this.permissions, user.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, firstName, lastName, email, language, salesRepId, outletId, districtId, regionId, userActive, dealer, role, userPermissions, userTeams, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
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
    sb.append("    userActive: ").append(toIndentedString(userActive)).append("\n");
    sb.append("    dealer: ").append(toIndentedString(dealer)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
    sb.append("    userTeams: ").append(toIndentedString(userTeams)).append("\n");
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
