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
import com.statflo.client.model.Permission;
import com.statflo.client.model.Role;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * RolePermissionSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-02T00:13:23.215852-04:00[America/Toronto]")

public class RolePermissionSummary {
  @SerializedName("role")
  private Role role = null;

  @SerializedName("permission")
  private Permission permission = null;

  @SerializedName("dealerSpecific")
  private Boolean dealerSpecific = null;

  @SerializedName("dealerBlacklisted")
  private Boolean dealerBlacklisted = null;

  public RolePermissionSummary role(Role role) {
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

  public RolePermissionSummary permission(Permission permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @Schema(description = "")
  public Permission getPermission() {
    return permission;
  }

  public void setPermission(Permission permission) {
    this.permission = permission;
  }

  public RolePermissionSummary dealerSpecific(Boolean dealerSpecific) {
    this.dealerSpecific = dealerSpecific;
    return this;
  }

   /**
   * Get dealerSpecific
   * @return dealerSpecific
  **/
  @Schema(required = true, description = "")
  public Boolean isDealerSpecific() {
    return dealerSpecific;
  }

  public void setDealerSpecific(Boolean dealerSpecific) {
    this.dealerSpecific = dealerSpecific;
  }

  public RolePermissionSummary dealerBlacklisted(Boolean dealerBlacklisted) {
    this.dealerBlacklisted = dealerBlacklisted;
    return this;
  }

   /**
   * Get dealerBlacklisted
   * @return dealerBlacklisted
  **/
  @Schema(required = true, description = "")
  public Boolean isDealerBlacklisted() {
    return dealerBlacklisted;
  }

  public void setDealerBlacklisted(Boolean dealerBlacklisted) {
    this.dealerBlacklisted = dealerBlacklisted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RolePermissionSummary rolePermissionSummary = (RolePermissionSummary) o;
    return Objects.equals(this.role, rolePermissionSummary.role) &&
        Objects.equals(this.permission, rolePermissionSummary.permission) &&
        Objects.equals(this.dealerSpecific, rolePermissionSummary.dealerSpecific) &&
        Objects.equals(this.dealerBlacklisted, rolePermissionSummary.dealerBlacklisted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, permission, dealerSpecific, dealerBlacklisted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RolePermissionSummary {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    dealerSpecific: ").append(toIndentedString(dealerSpecific)).append("\n");
    sb.append("    dealerBlacklisted: ").append(toIndentedString(dealerBlacklisted)).append("\n");
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