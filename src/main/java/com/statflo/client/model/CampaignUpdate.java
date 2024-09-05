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
 * CampaignUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-05T16:05:49.645046-04:00[America/Toronto]")

public class CampaignUpdate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("campaignNickname")
  private String campaignNickname = null;

  @SerializedName("type")
  private String type = "add";

  @SerializedName("carrierAllowed")
  private Boolean carrierAllowed = false;

  public CampaignUpdate id(Integer id) {
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

  public CampaignUpdate campaignNickname(String campaignNickname) {
    this.campaignNickname = campaignNickname;
    return this;
  }

   /**
   * Get campaignNickname
   * @return campaignNickname
  **/
  @Schema(required = true, description = "")
  public String getCampaignNickname() {
    return campaignNickname;
  }

  public void setCampaignNickname(String campaignNickname) {
    this.campaignNickname = campaignNickname;
  }

  public CampaignUpdate type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CampaignUpdate carrierAllowed(Boolean carrierAllowed) {
    this.carrierAllowed = carrierAllowed;
    return this;
  }

   /**
   * Get carrierAllowed
   * @return carrierAllowed
  **/
  @Schema(description = "")
  public Boolean isCarrierAllowed() {
    return carrierAllowed;
  }

  public void setCarrierAllowed(Boolean carrierAllowed) {
    this.carrierAllowed = carrierAllowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignUpdate campaignUpdate = (CampaignUpdate) o;
    return Objects.equals(this.id, campaignUpdate.id) &&
        Objects.equals(this.campaignNickname, campaignUpdate.campaignNickname) &&
        Objects.equals(this.type, campaignUpdate.type) &&
        Objects.equals(this.carrierAllowed, campaignUpdate.carrierAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, campaignNickname, type, carrierAllowed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    campaignNickname: ").append(toIndentedString(campaignNickname)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    carrierAllowed: ").append(toIndentedString(carrierAllowed)).append("\n");
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
