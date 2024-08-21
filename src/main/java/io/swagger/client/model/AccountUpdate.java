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
/**
 * AccountUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-08-21T15:24:44.515981-04:00[America/Toronto]")

public class AccountUpdate {
  @SerializedName("name")
  private String name = null;

  @SerializedName("accountId")
  private String accountId = null;

  /**
   * Gets or Sets accountType
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    @SerializedName("B")
    B("B"),
    @SerializedName("I")
    I("I"),
    @SerializedName("L")
    L("L"),
    @SerializedName("C")
    C("C"),
    @SerializedName("D")
    D("D");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AccountTypeEnum fromValue(String input) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AccountTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("accountType")
  private AccountTypeEnum accountType = AccountTypeEnum.I;

  @SerializedName("externalUserId")
  private String externalUserId = null;

  @SerializedName("externalLocationId")
  private String externalLocationId = "unassigned";

  @SerializedName("city")
  private String city = null;

  public AccountUpdate name(String name) {
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

  public AccountUpdate accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(required = true, description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AccountUpdate accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @Schema(required = true, description = "")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public AccountUpdate externalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
    return this;
  }

   /**
   * Get externalUserId
   * @return externalUserId
  **/
  @Schema(description = "")
  public String getExternalUserId() {
    return externalUserId;
  }

  public void setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
  }

  public AccountUpdate externalLocationId(String externalLocationId) {
    this.externalLocationId = externalLocationId;
    return this;
  }

   /**
   * Get externalLocationId
   * @return externalLocationId
  **/
  @Schema(description = "")
  public String getExternalLocationId() {
    return externalLocationId;
  }

  public void setExternalLocationId(String externalLocationId) {
    this.externalLocationId = externalLocationId;
  }

  public AccountUpdate city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @Schema(description = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUpdate accountUpdate = (AccountUpdate) o;
    return Objects.equals(this.name, accountUpdate.name) &&
        Objects.equals(this.accountId, accountUpdate.accountId) &&
        Objects.equals(this.accountType, accountUpdate.accountType) &&
        Objects.equals(this.externalUserId, accountUpdate.externalUserId) &&
        Objects.equals(this.externalLocationId, accountUpdate.externalLocationId) &&
        Objects.equals(this.city, accountUpdate.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accountId, accountType, externalUserId, externalLocationId, city);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
    sb.append("    externalLocationId: ").append(toIndentedString(externalLocationId)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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