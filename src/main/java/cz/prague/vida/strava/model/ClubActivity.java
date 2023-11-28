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
 * ClubActivity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-28T18:17:19.342Z")
public class ClubActivity {
  @SerializedName("athlete")
  private MetaAthlete athlete = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("distance")
  private Float distance = null;

  @SerializedName("moving_time")
  private Integer movingTime = null;

  @SerializedName("elapsed_time")
  private Integer elapsedTime = null;

  @SerializedName("total_elevation_gain")
  private Float totalElevationGain = null;

  @SerializedName("type")
  private ActivityType type = null;

  @SerializedName("sport_type")
  private SportType sportType = null;

  @SerializedName("workout_type")
  private Integer workoutType = null;

  public ClubActivity athlete(MetaAthlete athlete) {
    this.athlete = athlete;
    return this;
  }

   /**
   * Get athlete
   * @return athlete
  **/
  @ApiModelProperty(value = "")
  public MetaAthlete getAthlete() {
    return athlete;
  }

  public void setAthlete(MetaAthlete athlete) {
    this.athlete = athlete;
  }

  public ClubActivity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the activity
   * @return name
  **/
  @ApiModelProperty(value = "The name of the activity")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClubActivity distance(Float distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The activity&#39;s distance, in meters
   * @return distance
  **/
  @ApiModelProperty(value = "The activity's distance, in meters")
  public Float getDistance() {
    return distance;
  }

  public void setDistance(Float distance) {
    this.distance = distance;
  }

  public ClubActivity movingTime(Integer movingTime) {
    this.movingTime = movingTime;
    return this;
  }

   /**
   * The activity&#39;s moving time, in seconds
   * @return movingTime
  **/
  @ApiModelProperty(value = "The activity's moving time, in seconds")
  public Integer getMovingTime() {
    return movingTime;
  }

  public void setMovingTime(Integer movingTime) {
    this.movingTime = movingTime;
  }

  public ClubActivity elapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

   /**
   * The activity&#39;s elapsed time, in seconds
   * @return elapsedTime
  **/
  @ApiModelProperty(value = "The activity's elapsed time, in seconds")
  public Integer getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public ClubActivity totalElevationGain(Float totalElevationGain) {
    this.totalElevationGain = totalElevationGain;
    return this;
  }

   /**
   * The activity&#39;s total elevation gain.
   * @return totalElevationGain
  **/
  @ApiModelProperty(value = "The activity's total elevation gain.")
  public Float getTotalElevationGain() {
    return totalElevationGain;
  }

  public void setTotalElevationGain(Float totalElevationGain) {
    this.totalElevationGain = totalElevationGain;
  }

  public ClubActivity type(ActivityType type) {
    this.type = type;
    return this;
  }

   /**
   * Deprecated. Prefer to use sport_type
   * @return type
  **/
  @ApiModelProperty(value = "Deprecated. Prefer to use sport_type")
  public ActivityType getType() {
    return type;
  }

  public void setType(ActivityType type) {
    this.type = type;
  }

  public ClubActivity sportType(SportType sportType) {
    this.sportType = sportType;
    return this;
  }

   /**
   * Get sportType
   * @return sportType
  **/
  @ApiModelProperty(value = "")
  public SportType getSportType() {
    return sportType;
  }

  public void setSportType(SportType sportType) {
    this.sportType = sportType;
  }

  public ClubActivity workoutType(Integer workoutType) {
    this.workoutType = workoutType;
    return this;
  }

   /**
   * The activity&#39;s workout type
   * @return workoutType
  **/
  @ApiModelProperty(value = "The activity's workout type")
  public Integer getWorkoutType() {
    return workoutType;
  }

  public void setWorkoutType(Integer workoutType) {
    this.workoutType = workoutType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClubActivity clubActivity = (ClubActivity) o;
    return Objects.equals(this.athlete, clubActivity.athlete) &&
        Objects.equals(this.name, clubActivity.name) &&
        Objects.equals(this.distance, clubActivity.distance) &&
        Objects.equals(this.movingTime, clubActivity.movingTime) &&
        Objects.equals(this.elapsedTime, clubActivity.elapsedTime) &&
        Objects.equals(this.totalElevationGain, clubActivity.totalElevationGain) &&
        Objects.equals(this.type, clubActivity.type) &&
        Objects.equals(this.sportType, clubActivity.sportType) &&
        Objects.equals(this.workoutType, clubActivity.workoutType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(athlete, name, distance, movingTime, elapsedTime, totalElevationGain, type, sportType, workoutType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClubActivity {\n");
    
    sb.append("    athlete: ").append(toIndentedString(athlete)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    movingTime: ").append(toIndentedString(movingTime)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    totalElevationGain: ").append(toIndentedString(totalElevationGain)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sportType: ").append(toIndentedString(sportType)).append("\n");
    sb.append("    workoutType: ").append(toIndentedString(workoutType)).append("\n");
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
