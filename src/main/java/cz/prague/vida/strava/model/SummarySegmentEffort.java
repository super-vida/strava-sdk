/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cz.prague.vida.strava.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * SummarySegmentEffort
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-28T18:17:19.342Z")
public class SummarySegmentEffort {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("activity_id")
  private Long activityId = null;

  @SerializedName("elapsed_time")
  private Integer elapsedTime = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("start_date_local")
  private String startDateLocal = null;

  @SerializedName("distance")
  private Float distance = null;

  @SerializedName("is_kom")
  private Boolean isKom = null;

  public SummarySegmentEffort id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of this effort
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of this effort")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SummarySegmentEffort activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * The unique identifier of the activity related to this effort
   * @return activityId
  **/
  @ApiModelProperty(value = "The unique identifier of the activity related to this effort")
  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  public SummarySegmentEffort elapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

   /**
   * The effort&#39;s elapsed time
   * @return elapsedTime
  **/
  @ApiModelProperty(value = "The effort's elapsed time")
  public Integer getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public SummarySegmentEffort startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The time at which the effort was started.
   * @return startDate
  **/
  @ApiModelProperty(value = "The time at which the effort was started.")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public SummarySegmentEffort startDateLocal(String startDateLocal) {
    this.startDateLocal = startDateLocal;
    return this;
  }

   /**
   * The time at which the effort was started in the local timezone.
   * @return startDateLocal
  **/
  @ApiModelProperty(value = "The time at which the effort was started in the local timezone.")
  public String getStartDateLocal() {
    return startDateLocal;
  }

  public void setStartDateLocal(String startDateLocal) {
    this.startDateLocal = startDateLocal;
  }

  public SummarySegmentEffort distance(Float distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The effort&#39;s distance in meters
   * @return distance
  **/
  @ApiModelProperty(value = "The effort's distance in meters")
  public Float getDistance() {
    return distance;
  }

  public void setDistance(Float distance) {
    this.distance = distance;
  }

  public SummarySegmentEffort isKom(Boolean isKom) {
    this.isKom = isKom;
    return this;
  }

   /**
   * Whether this effort is the current best on the leaderboard
   * @return isKom
  **/
  @ApiModelProperty(value = "Whether this effort is the current best on the leaderboard")
  public Boolean isIsKom() {
    return isKom;
  }

  public void setIsKom(Boolean isKom) {
    this.isKom = isKom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummarySegmentEffort summarySegmentEffort = (SummarySegmentEffort) o;
    return Objects.equals(this.id, summarySegmentEffort.id) &&
        Objects.equals(this.activityId, summarySegmentEffort.activityId) &&
        Objects.equals(this.elapsedTime, summarySegmentEffort.elapsedTime) &&
        Objects.equals(this.startDate, summarySegmentEffort.startDate) &&
        Objects.equals(this.startDateLocal, summarySegmentEffort.startDateLocal) &&
        Objects.equals(this.distance, summarySegmentEffort.distance) &&
        Objects.equals(this.isKom, summarySegmentEffort.isKom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, activityId, elapsedTime, startDate, startDateLocal, distance, isKom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummarySegmentEffort {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startDateLocal: ").append(toIndentedString(startDateLocal)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    isKom: ").append(toIndentedString(isKom)).append("\n");
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

