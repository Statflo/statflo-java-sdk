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
 * UserActivityLogCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-05T16:05:49.645046-04:00[America/Toronto]")

public class UserActivityLogCreate {
  @SerializedName("activityPerformed")
  private String activityPerformed = null;

  public UserActivityLogCreate activityPerformed(String activityPerformed) {
    this.activityPerformed = activityPerformed;
    return this;
  }

   /**
   * Get activityPerformed
   * @return activityPerformed
  **/
  @Schema(description = "")
  public String getActivityPerformed() {
    return activityPerformed;
  }

  public void setActivityPerformed(String activityPerformed) {
    this.activityPerformed = activityPerformed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserActivityLogCreate userActivityLogCreate = (UserActivityLogCreate) o;
    return Objects.equals(this.activityPerformed, userActivityLogCreate.activityPerformed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityPerformed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivityLogCreate {\n");
    
    sb.append("    activityPerformed: ").append(toIndentedString(activityPerformed)).append("\n");
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
