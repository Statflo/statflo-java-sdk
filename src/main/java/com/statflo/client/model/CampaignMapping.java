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
import com.statflo.client.model.Campaign;
import com.statflo.client.model.Carrier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
/**
 * CampaignMapping
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-20T20:15:05.814297111Z[Etc/UTC]")

public class CampaignMapping {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("carrier")
  private Carrier carrier = null;

  @SerializedName("campaign")
  private Campaign campaign = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("dateAdded")
  private OffsetDateTime dateAdded = null;

  public CampaignMapping id(Integer id) {
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

  public CampaignMapping carrier(Carrier carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Get carrier
   * @return carrier
  **/
  @Schema(description = "")
  public Carrier getCarrier() {
    return carrier;
  }

  public void setCarrier(Carrier carrier) {
    this.carrier = carrier;
  }

  public CampaignMapping campaign(Campaign campaign) {
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @Schema(description = "")
  public Campaign getCampaign() {
    return campaign;
  }

  public void setCampaign(Campaign campaign) {
    this.campaign = campaign;
  }

  public CampaignMapping fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @Schema(required = true, description = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public CampaignMapping dateAdded(OffsetDateTime dateAdded) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignMapping campaignMapping = (CampaignMapping) o;
    return Objects.equals(this.id, campaignMapping.id) &&
        Objects.equals(this.carrier, campaignMapping.carrier) &&
        Objects.equals(this.campaign, campaignMapping.campaign) &&
        Objects.equals(this.fileName, campaignMapping.fileName) &&
        Objects.equals(this.dateAdded, campaignMapping.dateAdded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, carrier, campaign, fileName, dateAdded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignMapping {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
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
