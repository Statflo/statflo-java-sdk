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
import org.threeten.bp.OffsetDateTime;
/**
 * ConversationUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-03T14:30:43.872947-05:00[America/New_York]")

public class ConversationUpdate {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("lastReadMessageId")
  private Integer lastReadMessageId = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("0")
    NUMBER_0(0),
    @SerializedName("1")
    NUMBER_1(1),
    @SerializedName("2")
    NUMBER_2(2);

    private Integer value;

    StatusEnum(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(Integer input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextInt();
        return StatusEnum.fromValue((Integer)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("textkitId")
  private String textkitId = null;

  @SerializedName("opportunityScore")
  private Integer opportunityScore = 0;

  @SerializedName("insightsWidgetPayload")
  private Object insightsWidgetPayload = null;

  @SerializedName("dateAdded")
  private OffsetDateTime dateAdded = null;

  public ConversationUpdate id(Integer id) {
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

  public ConversationUpdate accountId(String accountId) {
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

  public ConversationUpdate lastReadMessageId(Integer lastReadMessageId) {
    this.lastReadMessageId = lastReadMessageId;
    return this;
  }

   /**
   * Get lastReadMessageId
   * @return lastReadMessageId
  **/
  @Schema(description = "")
  public Integer getLastReadMessageId() {
    return lastReadMessageId;
  }

  public void setLastReadMessageId(Integer lastReadMessageId) {
    this.lastReadMessageId = lastReadMessageId;
  }

  public ConversationUpdate status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ConversationUpdate textkitId(String textkitId) {
    this.textkitId = textkitId;
    return this;
  }

   /**
   * Get textkitId
   * @return textkitId
  **/
  @Schema(description = "")
  public String getTextkitId() {
    return textkitId;
  }

  public void setTextkitId(String textkitId) {
    this.textkitId = textkitId;
  }

  public ConversationUpdate opportunityScore(Integer opportunityScore) {
    this.opportunityScore = opportunityScore;
    return this;
  }

   /**
   * Get opportunityScore
   * minimum: 0
   * maximum: 100
   * @return opportunityScore
  **/
  @Schema(description = "")
  public Integer getOpportunityScore() {
    return opportunityScore;
  }

  public void setOpportunityScore(Integer opportunityScore) {
    this.opportunityScore = opportunityScore;
  }

  public ConversationUpdate insightsWidgetPayload(Object insightsWidgetPayload) {
    this.insightsWidgetPayload = insightsWidgetPayload;
    return this;
  }

   /**
   * Get insightsWidgetPayload
   * @return insightsWidgetPayload
  **/
  @Schema(description = "")
  public Object getInsightsWidgetPayload() {
    return insightsWidgetPayload;
  }

  public void setInsightsWidgetPayload(Object insightsWidgetPayload) {
    this.insightsWidgetPayload = insightsWidgetPayload;
  }

  public ConversationUpdate dateAdded(OffsetDateTime dateAdded) {
    this.dateAdded = dateAdded;
    return this;
  }

   /**
   * Get dateAdded
   * @return dateAdded
  **/
  @Schema(required = true, description = "")
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
    ConversationUpdate conversationUpdate = (ConversationUpdate) o;
    return Objects.equals(this.id, conversationUpdate.id) &&
        Objects.equals(this.accountId, conversationUpdate.accountId) &&
        Objects.equals(this.lastReadMessageId, conversationUpdate.lastReadMessageId) &&
        Objects.equals(this.status, conversationUpdate.status) &&
        Objects.equals(this.textkitId, conversationUpdate.textkitId) &&
        Objects.equals(this.opportunityScore, conversationUpdate.opportunityScore) &&
        Objects.equals(this.insightsWidgetPayload, conversationUpdate.insightsWidgetPayload) &&
        Objects.equals(this.dateAdded, conversationUpdate.dateAdded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, lastReadMessageId, status, textkitId, opportunityScore, insightsWidgetPayload, dateAdded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    lastReadMessageId: ").append(toIndentedString(lastReadMessageId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    textkitId: ").append(toIndentedString(textkitId)).append("\n");
    sb.append("    opportunityScore: ").append(toIndentedString(opportunityScore)).append("\n");
    sb.append("    insightsWidgetPayload: ").append(toIndentedString(insightsWidgetPayload)).append("\n");
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
