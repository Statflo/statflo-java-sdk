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
 * CallListVisibilityStatusCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-14T14:53:34.839132Z[Etc/UTC]")

public class CallListVisibilityStatusCreate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("visibleTo")
  private String visibleTo = null;

  @SerializedName("permissionId")
  private Integer permissionId = null;

  public CallListVisibilityStatusCreate id(Integer id) {
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

  public CallListVisibilityStatusCreate visibleTo(String visibleTo) {
    this.visibleTo = visibleTo;
    return this;
  }

   /**
   * Get visibleTo
   * @return visibleTo
  **/
  @Schema(description = "")
  public String getVisibleTo() {
    return visibleTo;
  }

  public void setVisibleTo(String visibleTo) {
    this.visibleTo = visibleTo;
  }

  public CallListVisibilityStatusCreate permissionId(Integer permissionId) {
    this.permissionId = permissionId;
    return this;
  }

   /**
   * Get permissionId
   * @return permissionId
  **/
  @Schema(description = "")
  public Integer getPermissionId() {
    return permissionId;
  }

  public void setPermissionId(Integer permissionId) {
    this.permissionId = permissionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallListVisibilityStatusCreate callListVisibilityStatusCreate = (CallListVisibilityStatusCreate) o;
    return Objects.equals(this.id, callListVisibilityStatusCreate.id) &&
        Objects.equals(this.visibleTo, callListVisibilityStatusCreate.visibleTo) &&
        Objects.equals(this.permissionId, callListVisibilityStatusCreate.permissionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, visibleTo, permissionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallListVisibilityStatusCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
    sb.append("    permissionId: ").append(toIndentedString(permissionId)).append("\n");
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
