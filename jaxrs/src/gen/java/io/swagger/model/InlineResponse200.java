/*
 * HRAPI2.0.2
 * post and pull employee information
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */

public class InlineResponse200   {
  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("UUID")
  private UUID UUID = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("join_date")
  private String joinDate = null;

  public InlineResponse200 status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Status code
   * @return status
   **/
  @JsonProperty("status")
  @ApiModelProperty(example = "200", value = "Status code")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public InlineResponse200 UUID(UUID UUID) {
    this.UUID = UUID;
    return this;
  }

  /**
   * ID from DB
   * @return UUID
   **/
  @JsonProperty("UUID")
  @ApiModelProperty(example = "3110-78-8832", value = "ID from DB")
  public UUID getUUID() {
    return UUID;
  }

  public void setUUID(UUID UUID) {
    this.UUID = UUID;
  }

  public InlineResponse200 firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Users first name
   * @return firstName
   **/
  @JsonProperty("first_name")
  @ApiModelProperty(example = "James", value = "Users first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public InlineResponse200 lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Users last name
   * @return lastName
   **/
  @JsonProperty("last_name")
  @ApiModelProperty(example = "Stevens", value = "Users last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public InlineResponse200 email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Users email
   * @return email
   **/
  @JsonProperty("email")
  @ApiModelProperty(example = "j_stevens@sb.com", value = "Users email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InlineResponse200 joinDate(String joinDate) {
    this.joinDate = joinDate;
    return this;
  }

  /**
   * Unix timestamp of user posted to DB
   * @return joinDate
   **/
  @JsonProperty("join_date")
  @ApiModelProperty(example = "1511884800", value = "Unix timestamp of user posted to DB")
  public String getJoinDate() {
    return joinDate;
  }

  public void setJoinDate(String joinDate) {
    this.joinDate = joinDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.status, inlineResponse200.status) &&
        Objects.equals(this.UUID, inlineResponse200.UUID) &&
        Objects.equals(this.firstName, inlineResponse200.firstName) &&
        Objects.equals(this.lastName, inlineResponse200.lastName) &&
        Objects.equals(this.email, inlineResponse200.email) &&
        Objects.equals(this.joinDate, inlineResponse200.joinDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, UUID, firstName, lastName, email, joinDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    UUID: ").append(toIndentedString(UUID)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    joinDate: ").append(toIndentedString(joinDate)).append("\n");
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

