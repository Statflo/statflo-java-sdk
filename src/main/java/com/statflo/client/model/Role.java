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
import com.statflo.client.model.RolePermission;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Role
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-05T20:48:31.566453Z[Etc/UTC]")

public class Role {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("restrictBySalesRepId")
  private Boolean restrictBySalesRepId = null;

  @SerializedName("restrictByOutletId")
  private Boolean restrictByOutletId = null;

  @SerializedName("restrictByRegionId")
  private Boolean restrictByRegionId = null;

  @SerializedName("restrictByDistrictId")
  private Boolean restrictByDistrictId = null;

  @SerializedName("rolePermissions")
  private List<RolePermission> rolePermissions = null;

  public Role id(Integer id) {
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

  public Role name(String name) {
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

  public Role order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @Schema(required = true, description = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public Role restrictBySalesRepId(Boolean restrictBySalesRepId) {
    this.restrictBySalesRepId = restrictBySalesRepId;
    return this;
  }

   /**
   * Get restrictBySalesRepId
   * @return restrictBySalesRepId
  **/
  @Schema(required = true, description = "")
  public Boolean isRestrictBySalesRepId() {
    return restrictBySalesRepId;
  }

  public void setRestrictBySalesRepId(Boolean restrictBySalesRepId) {
    this.restrictBySalesRepId = restrictBySalesRepId;
  }

  public Role restrictByOutletId(Boolean restrictByOutletId) {
    this.restrictByOutletId = restrictByOutletId;
    return this;
  }

   /**
   * Get restrictByOutletId
   * @return restrictByOutletId
  **/
  @Schema(required = true, description = "")
  public Boolean isRestrictByOutletId() {
    return restrictByOutletId;
  }

  public void setRestrictByOutletId(Boolean restrictByOutletId) {
    this.restrictByOutletId = restrictByOutletId;
  }

  public Role restrictByRegionId(Boolean restrictByRegionId) {
    this.restrictByRegionId = restrictByRegionId;
    return this;
  }

   /**
   * Get restrictByRegionId
   * @return restrictByRegionId
  **/
  @Schema(required = true, description = "")
  public Boolean isRestrictByRegionId() {
    return restrictByRegionId;
  }

  public void setRestrictByRegionId(Boolean restrictByRegionId) {
    this.restrictByRegionId = restrictByRegionId;
  }

  public Role restrictByDistrictId(Boolean restrictByDistrictId) {
    this.restrictByDistrictId = restrictByDistrictId;
    return this;
  }

   /**
   * Get restrictByDistrictId
   * @return restrictByDistrictId
  **/
  @Schema(required = true, description = "")
  public Boolean isRestrictByDistrictId() {
    return restrictByDistrictId;
  }

  public void setRestrictByDistrictId(Boolean restrictByDistrictId) {
    this.restrictByDistrictId = restrictByDistrictId;
  }

  public Role rolePermissions(List<RolePermission> rolePermissions) {
    this.rolePermissions = rolePermissions;
    return this;
  }

  public Role addRolePermissionsItem(RolePermission rolePermissionsItem) {
    if (this.rolePermissions == null) {
      this.rolePermissions = new ArrayList<RolePermission>();
    }
    this.rolePermissions.add(rolePermissionsItem);
    return this;
  }

   /**
   * Get rolePermissions
   * @return rolePermissions
  **/
  @Schema(description = "")
  public List<RolePermission> getRolePermissions() {
    return rolePermissions;
  }

  public void setRolePermissions(List<RolePermission> rolePermissions) {
    this.rolePermissions = rolePermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.id, role.id) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.order, role.order) &&
        Objects.equals(this.restrictBySalesRepId, role.restrictBySalesRepId) &&
        Objects.equals(this.restrictByOutletId, role.restrictByOutletId) &&
        Objects.equals(this.restrictByRegionId, role.restrictByRegionId) &&
        Objects.equals(this.restrictByDistrictId, role.restrictByDistrictId) &&
        Objects.equals(this.rolePermissions, role.rolePermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, restrictBySalesRepId, restrictByOutletId, restrictByRegionId, restrictByDistrictId, rolePermissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    restrictBySalesRepId: ").append(toIndentedString(restrictBySalesRepId)).append("\n");
    sb.append("    restrictByOutletId: ").append(toIndentedString(restrictByOutletId)).append("\n");
    sb.append("    restrictByRegionId: ").append(toIndentedString(restrictByRegionId)).append("\n");
    sb.append("    restrictByDistrictId: ").append(toIndentedString(restrictByDistrictId)).append("\n");
    sb.append("    rolePermissions: ").append(toIndentedString(rolePermissions)).append("\n");
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
