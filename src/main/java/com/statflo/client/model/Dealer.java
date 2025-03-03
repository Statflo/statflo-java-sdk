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
import com.statflo.client.model.Carrier;
import com.statflo.client.model.DealerAllowedFeature;
import com.statflo.client.model.Permission;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Dealer
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-03T14:30:43.872947-05:00[America/New_York]")

public class Dealer {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("carrier")
  private Carrier carrier = null;

  @SerializedName("permissions")
  private List<Permission> permissions = null;

  @SerializedName("dealerFeatures")
  private List<DealerAllowedFeature> dealerFeatures = null;

  public Dealer id(Integer id) {
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

  public Dealer name(String name) {
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

  public Dealer countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @Schema(required = true, description = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Dealer carrier(Carrier carrier) {
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

  public Dealer permissions(List<Permission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public Dealer addPermissionsItem(Permission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<Permission>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
  public List<Permission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Permission> permissions) {
    this.permissions = permissions;
  }

  public Dealer dealerFeatures(List<DealerAllowedFeature> dealerFeatures) {
    this.dealerFeatures = dealerFeatures;
    return this;
  }

  public Dealer addDealerFeaturesItem(DealerAllowedFeature dealerFeaturesItem) {
    if (this.dealerFeatures == null) {
      this.dealerFeatures = new ArrayList<DealerAllowedFeature>();
    }
    this.dealerFeatures.add(dealerFeaturesItem);
    return this;
  }

   /**
   * Get dealerFeatures
   * @return dealerFeatures
  **/
  @Schema(description = "")
  public List<DealerAllowedFeature> getDealerFeatures() {
    return dealerFeatures;
  }

  public void setDealerFeatures(List<DealerAllowedFeature> dealerFeatures) {
    this.dealerFeatures = dealerFeatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dealer dealer = (Dealer) o;
    return Objects.equals(this.id, dealer.id) &&
        Objects.equals(this.name, dealer.name) &&
        Objects.equals(this.countryCode, dealer.countryCode) &&
        Objects.equals(this.carrier, dealer.carrier) &&
        Objects.equals(this.permissions, dealer.permissions) &&
        Objects.equals(this.dealerFeatures, dealer.dealerFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, countryCode, carrier, permissions, dealerFeatures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dealer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    dealerFeatures: ").append(toIndentedString(dealerFeatures)).append("\n");
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
