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

package io.swagger.client.model;

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
/**
 * TeamUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-08-21T15:24:44.515981-04:00[America/Toronto]")

public class TeamUpdate {
  @SerializedName("name")
  private String name = null;

  @SerializedName("permissionIds")
  private List<Integer> permissionIds = null;

  @SerializedName("parentId")
  private Integer parentId = null;

  @SerializedName("ownerId")
  private Integer ownerId = null;

  public TeamUpdate name(String name) {
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

  public TeamUpdate permissionIds(List<Integer> permissionIds) {
    this.permissionIds = permissionIds;
    return this;
  }

  public TeamUpdate addPermissionIdsItem(Integer permissionIdsItem) {
    if (this.permissionIds == null) {
      this.permissionIds = new ArrayList<Integer>();
    }
    this.permissionIds.add(permissionIdsItem);
    return this;
  }

   /**
   * Get permissionIds
   * @return permissionIds
  **/
  @Schema(description = "")
  public List<Integer> getPermissionIds() {
    return permissionIds;
  }

  public void setPermissionIds(List<Integer> permissionIds) {
    this.permissionIds = permissionIds;
  }

  public TeamUpdate parentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @Schema(description = "")
  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public TeamUpdate ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @Schema(description = "")
  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamUpdate teamUpdate = (TeamUpdate) o;
    return Objects.equals(this.name, teamUpdate.name) &&
        Objects.equals(this.permissionIds, teamUpdate.permissionIds) &&
        Objects.equals(this.parentId, teamUpdate.parentId) &&
        Objects.equals(this.ownerId, teamUpdate.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, permissionIds, parentId, ownerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissionIds: ").append(toIndentedString(permissionIds)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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
