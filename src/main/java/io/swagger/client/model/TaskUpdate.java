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
import org.threeten.bp.OffsetDateTime;
/**
 * TaskUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-01T23:29:38.928030-04:00[America/Toronto]")

public class TaskUpdate {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("To Do")
    TO_DO("To Do"),
    @SerializedName("In Progress")
    IN_PROGRESS("In Progress"),
    @SerializedName("Blocked")
    BLOCKED("Blocked"),
    @SerializedName("Completed")
    COMPLETED("Completed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
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
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = StatusEnum.TO_DO;

  @SerializedName("userIdAssigned")
  private Integer userIdAssigned = null;

  @SerializedName("priority")
  private Integer priority = 3;

  @SerializedName("dueDate")
  private OffsetDateTime dueDate = null;

  @SerializedName("id")
  private Integer id = null;

  public TaskUpdate name(String name) {
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

  public TaskUpdate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaskUpdate status(StatusEnum status) {
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

  public TaskUpdate userIdAssigned(Integer userIdAssigned) {
    this.userIdAssigned = userIdAssigned;
    return this;
  }

   /**
   * Get userIdAssigned
   * @return userIdAssigned
  **/
  @Schema(description = "")
  public Integer getUserIdAssigned() {
    return userIdAssigned;
  }

  public void setUserIdAssigned(Integer userIdAssigned) {
    this.userIdAssigned = userIdAssigned;
  }

  public TaskUpdate priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * minimum: 1
   * maximum: 5
   * @return priority
  **/
  @Schema(description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public TaskUpdate dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public TaskUpdate id(Integer id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskUpdate taskUpdate = (TaskUpdate) o;
    return Objects.equals(this.name, taskUpdate.name) &&
        Objects.equals(this.description, taskUpdate.description) &&
        Objects.equals(this.status, taskUpdate.status) &&
        Objects.equals(this.userIdAssigned, taskUpdate.userIdAssigned) &&
        Objects.equals(this.priority, taskUpdate.priority) &&
        Objects.equals(this.dueDate, taskUpdate.dueDate) &&
        Objects.equals(this.id, taskUpdate.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, status, userIdAssigned, priority, dueDate, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userIdAssigned: ").append(toIndentedString(userIdAssigned)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
