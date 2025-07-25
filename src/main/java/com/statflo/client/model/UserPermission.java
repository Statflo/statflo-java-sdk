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
import com.statflo.client.model.Permission;
import com.statflo.client.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UserPermission
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-24T20:30:11.489899882Z[Etc/UTC]")

public class UserPermission {
  @SerializedName("user")
  private User user = null;

  @SerializedName("permission")
  private Permission permission = null;

  @SerializedName("blacklisted")
  private Boolean blacklisted = false;

  public UserPermission user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public UserPermission permission(Permission permission) {
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

  public UserPermission blacklisted(Boolean blacklisted) {
    this.blacklisted = blacklisted;
    return this;
  }

   /**
   * Get blacklisted
   * @return blacklisted
  **/
  @Schema(description = "")
  public Boolean isBlacklisted() {
    return blacklisted;
  }

  public void setBlacklisted(Boolean blacklisted) {
    this.blacklisted = blacklisted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPermission userPermission = (UserPermission) o;
    return Objects.equals(this.user, userPermission.user) &&
        Objects.equals(this.permission, userPermission.permission) &&
        Objects.equals(this.blacklisted, userPermission.blacklisted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, permission, blacklisted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPermission {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    blacklisted: ").append(toIndentedString(blacklisted)).append("\n");
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
