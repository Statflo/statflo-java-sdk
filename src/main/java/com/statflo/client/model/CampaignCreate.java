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
 * CampaignCreate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-03T14:30:43.872947-05:00[America/New_York]")

public class CampaignCreate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("campaignNickname")
  private String campaignNickname = null;

  @SerializedName("totangoName")
  private String totangoName = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("add")
    ADD("add"),
    @SerializedName("monthly")
    MONTHLY("monthly"),
    @SerializedName("once")
    ONCE("once"),
    @SerializedName("daily")
    DAILY("daily");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = TypeEnum.ADD;

  /**
   * Gets or Sets frequency
   */
  @JsonAdapter(FrequencyEnum.Adapter.class)
  public enum FrequencyEnum {
    @SerializedName("monthly")
    MONTHLY("monthly"),
    @SerializedName("once")
    ONCE("once"),
    @SerializedName("daily")
    DAILY("daily");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FrequencyEnum fromValue(String input) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FrequencyEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("frequency")
  private FrequencyEnum frequency = FrequencyEnum.MONTHLY;

  @SerializedName("lifetime")
  private String lifetime = "monthly";

  @SerializedName("method")
  private String method = "provided";

  @SerializedName("carrierAllowed")
  private Boolean carrierAllowed = false;

  /**
   * Gets or Sets accountType
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    @SerializedName("I")
    I("I"),
    @SerializedName("D")
    D("D"),
    @SerializedName("C")
    C("C"),
    @SerializedName("B")
    B("B"),
    @SerializedName("L")
    L("L");

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

  @SerializedName("dncScrub")
  private Boolean dncScrub = false;

  @SerializedName("reportingPeriodType")
  private String reportingPeriodType = "month";

  @SerializedName("reportingPeriodBefore")
  private Integer reportingPeriodBefore = 0;

  @SerializedName("reportingPeriodAfter")
  private Integer reportingPeriodAfter = 0;

  @SerializedName("transactionEarliest")
  private String transactionEarliest = null;

  @SerializedName("transactionLatest")
  private String transactionLatest = null;

  @SerializedName("productTypes")
  private String productTypes = null;

  /**
   * Gets or Sets source
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    @SerializedName("api")
    API("api"),
    @SerializedName("uploaded")
    UPLOADED("uploaded");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SourceEnum fromValue(String input) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SourceEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("source")
  private SourceEnum source = SourceEnum.API;

  /**
   * Gets or Sets visibilityCrm
   */
  @JsonAdapter(VisibilityCrmEnum.Adapter.class)
  public enum VisibilityCrmEnum {
    @SerializedName("0")
    NUMBER_0(0),
    @SerializedName("10")
    NUMBER_10(10),
    @SerializedName("30")
    NUMBER_30(30);

    private Integer value;

    VisibilityCrmEnum(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VisibilityCrmEnum fromValue(Integer input) {
      for (VisibilityCrmEnum b : VisibilityCrmEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VisibilityCrmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityCrmEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public VisibilityCrmEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextInt();
        return VisibilityCrmEnum.fromValue((Integer)(value));
      }
    }
  }  @SerializedName("visibilityCrm")
  private VisibilityCrmEnum visibilityCrm = VisibilityCrmEnum.NUMBER_10;

  /**
   * Gets or Sets visibilityReport
   */
  @JsonAdapter(VisibilityReportEnum.Adapter.class)
  public enum VisibilityReportEnum {
    @SerializedName("0")
    NUMBER_0(0),
    @SerializedName("10")
    NUMBER_10(10),
    @SerializedName("30")
    NUMBER_30(30);

    private Integer value;

    VisibilityReportEnum(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VisibilityReportEnum fromValue(Integer input) {
      for (VisibilityReportEnum b : VisibilityReportEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VisibilityReportEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityReportEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public VisibilityReportEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextInt();
        return VisibilityReportEnum.fromValue((Integer)(value));
      }
    }
  }  @SerializedName("visibilityReport")
  private VisibilityReportEnum visibilityReport = VisibilityReportEnum.NUMBER_10;

  public CampaignCreate id(Integer id) {
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

  public CampaignCreate campaignNickname(String campaignNickname) {
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

  public CampaignCreate totangoName(String totangoName) {
    this.totangoName = totangoName;
    return this;
  }

   /**
   * Get totangoName
   * @return totangoName
  **/
  @Schema(description = "")
  public String getTotangoName() {
    return totangoName;
  }

  public void setTotangoName(String totangoName) {
    this.totangoName = totangoName;
  }

  public CampaignCreate type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CampaignCreate frequency(FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @Schema(required = true, description = "")
  public FrequencyEnum getFrequency() {
    return frequency;
  }

  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }

  public CampaignCreate lifetime(String lifetime) {
    this.lifetime = lifetime;
    return this;
  }

   /**
   * Get lifetime
   * @return lifetime
  **/
  @Schema(description = "")
  public String getLifetime() {
    return lifetime;
  }

  public void setLifetime(String lifetime) {
    this.lifetime = lifetime;
  }

  public CampaignCreate method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @Schema(description = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public CampaignCreate carrierAllowed(Boolean carrierAllowed) {
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

  public CampaignCreate accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @Schema(description = "")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public CampaignCreate dncScrub(Boolean dncScrub) {
    this.dncScrub = dncScrub;
    return this;
  }

   /**
   * Get dncScrub
   * @return dncScrub
  **/
  @Schema(description = "")
  public Boolean isDncScrub() {
    return dncScrub;
  }

  public void setDncScrub(Boolean dncScrub) {
    this.dncScrub = dncScrub;
  }

  public CampaignCreate reportingPeriodType(String reportingPeriodType) {
    this.reportingPeriodType = reportingPeriodType;
    return this;
  }

   /**
   * Get reportingPeriodType
   * @return reportingPeriodType
  **/
  @Schema(description = "")
  public String getReportingPeriodType() {
    return reportingPeriodType;
  }

  public void setReportingPeriodType(String reportingPeriodType) {
    this.reportingPeriodType = reportingPeriodType;
  }

  public CampaignCreate reportingPeriodBefore(Integer reportingPeriodBefore) {
    this.reportingPeriodBefore = reportingPeriodBefore;
    return this;
  }

   /**
   * Get reportingPeriodBefore
   * @return reportingPeriodBefore
  **/
  @Schema(description = "")
  public Integer getReportingPeriodBefore() {
    return reportingPeriodBefore;
  }

  public void setReportingPeriodBefore(Integer reportingPeriodBefore) {
    this.reportingPeriodBefore = reportingPeriodBefore;
  }

  public CampaignCreate reportingPeriodAfter(Integer reportingPeriodAfter) {
    this.reportingPeriodAfter = reportingPeriodAfter;
    return this;
  }

   /**
   * Get reportingPeriodAfter
   * @return reportingPeriodAfter
  **/
  @Schema(description = "")
  public Integer getReportingPeriodAfter() {
    return reportingPeriodAfter;
  }

  public void setReportingPeriodAfter(Integer reportingPeriodAfter) {
    this.reportingPeriodAfter = reportingPeriodAfter;
  }

  public CampaignCreate transactionEarliest(String transactionEarliest) {
    this.transactionEarliest = transactionEarliest;
    return this;
  }

   /**
   * Get transactionEarliest
   * @return transactionEarliest
  **/
  @Schema(description = "")
  public String getTransactionEarliest() {
    return transactionEarliest;
  }

  public void setTransactionEarliest(String transactionEarliest) {
    this.transactionEarliest = transactionEarliest;
  }

  public CampaignCreate transactionLatest(String transactionLatest) {
    this.transactionLatest = transactionLatest;
    return this;
  }

   /**
   * Get transactionLatest
   * @return transactionLatest
  **/
  @Schema(description = "")
  public String getTransactionLatest() {
    return transactionLatest;
  }

  public void setTransactionLatest(String transactionLatest) {
    this.transactionLatest = transactionLatest;
  }

  public CampaignCreate productTypes(String productTypes) {
    this.productTypes = productTypes;
    return this;
  }

   /**
   * Get productTypes
   * @return productTypes
  **/
  @Schema(description = "")
  public String getProductTypes() {
    return productTypes;
  }

  public void setProductTypes(String productTypes) {
    this.productTypes = productTypes;
  }

  public CampaignCreate source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public CampaignCreate visibilityCrm(VisibilityCrmEnum visibilityCrm) {
    this.visibilityCrm = visibilityCrm;
    return this;
  }

   /**
   * Get visibilityCrm
   * @return visibilityCrm
  **/
  @Schema(description = "")
  public VisibilityCrmEnum getVisibilityCrm() {
    return visibilityCrm;
  }

  public void setVisibilityCrm(VisibilityCrmEnum visibilityCrm) {
    this.visibilityCrm = visibilityCrm;
  }

  public CampaignCreate visibilityReport(VisibilityReportEnum visibilityReport) {
    this.visibilityReport = visibilityReport;
    return this;
  }

   /**
   * Get visibilityReport
   * @return visibilityReport
  **/
  @Schema(description = "")
  public VisibilityReportEnum getVisibilityReport() {
    return visibilityReport;
  }

  public void setVisibilityReport(VisibilityReportEnum visibilityReport) {
    this.visibilityReport = visibilityReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCreate campaignCreate = (CampaignCreate) o;
    return Objects.equals(this.id, campaignCreate.id) &&
        Objects.equals(this.campaignNickname, campaignCreate.campaignNickname) &&
        Objects.equals(this.totangoName, campaignCreate.totangoName) &&
        Objects.equals(this.type, campaignCreate.type) &&
        Objects.equals(this.frequency, campaignCreate.frequency) &&
        Objects.equals(this.lifetime, campaignCreate.lifetime) &&
        Objects.equals(this.method, campaignCreate.method) &&
        Objects.equals(this.carrierAllowed, campaignCreate.carrierAllowed) &&
        Objects.equals(this.accountType, campaignCreate.accountType) &&
        Objects.equals(this.dncScrub, campaignCreate.dncScrub) &&
        Objects.equals(this.reportingPeriodType, campaignCreate.reportingPeriodType) &&
        Objects.equals(this.reportingPeriodBefore, campaignCreate.reportingPeriodBefore) &&
        Objects.equals(this.reportingPeriodAfter, campaignCreate.reportingPeriodAfter) &&
        Objects.equals(this.transactionEarliest, campaignCreate.transactionEarliest) &&
        Objects.equals(this.transactionLatest, campaignCreate.transactionLatest) &&
        Objects.equals(this.productTypes, campaignCreate.productTypes) &&
        Objects.equals(this.source, campaignCreate.source) &&
        Objects.equals(this.visibilityCrm, campaignCreate.visibilityCrm) &&
        Objects.equals(this.visibilityReport, campaignCreate.visibilityReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, campaignNickname, totangoName, type, frequency, lifetime, method, carrierAllowed, accountType, dncScrub, reportingPeriodType, reportingPeriodBefore, reportingPeriodAfter, transactionEarliest, transactionLatest, productTypes, source, visibilityCrm, visibilityReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    campaignNickname: ").append(toIndentedString(campaignNickname)).append("\n");
    sb.append("    totangoName: ").append(toIndentedString(totangoName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    carrierAllowed: ").append(toIndentedString(carrierAllowed)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    dncScrub: ").append(toIndentedString(dncScrub)).append("\n");
    sb.append("    reportingPeriodType: ").append(toIndentedString(reportingPeriodType)).append("\n");
    sb.append("    reportingPeriodBefore: ").append(toIndentedString(reportingPeriodBefore)).append("\n");
    sb.append("    reportingPeriodAfter: ").append(toIndentedString(reportingPeriodAfter)).append("\n");
    sb.append("    transactionEarliest: ").append(toIndentedString(transactionEarliest)).append("\n");
    sb.append("    transactionLatest: ").append(toIndentedString(transactionLatest)).append("\n");
    sb.append("    productTypes: ").append(toIndentedString(productTypes)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    visibilityCrm: ").append(toIndentedString(visibilityCrm)).append("\n");
    sb.append("    visibilityReport: ").append(toIndentedString(visibilityReport)).append("\n");
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
