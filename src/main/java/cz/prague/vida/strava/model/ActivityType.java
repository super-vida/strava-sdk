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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * An enumeration of the types an activity may have. Note that this enumeration does not include new sport types (e.g. MountainBikeRide, EMountainBikeRide), activities with these sport types will have the corresponding activity type (e.g. Ride for MountainBikeRide, EBikeRide for EMountainBikeRide)
 */
@JsonAdapter(ActivityType.Adapter.class)
public enum ActivityType {
  
  ALPINESKI("AlpineSki"),
  
  BACKCOUNTRYSKI("BackcountrySki"),
  
  CANOEING("Canoeing"),
  
  CROSSFIT("Crossfit"),
  
  EBIKERIDE("EBikeRide"),
  
  ELLIPTICAL("Elliptical"),
  
  GOLF("Golf"),
  
  HANDCYCLE("Handcycle"),
  
  HIKE("Hike"),
  
  ICESKATE("IceSkate"),
  
  INLINESKATE("InlineSkate"),
  
  KAYAKING("Kayaking"),
  
  KITESURF("Kitesurf"),
  
  NORDICSKI("NordicSki"),
  
  RIDE("Ride"),
  
  ROCKCLIMBING("RockClimbing"),
  
  ROLLERSKI("RollerSki"),
  
  ROWING("Rowing"),
  
  RUN("Run"),
  
  SAIL("Sail"),
  
  SKATEBOARD("Skateboard"),
  
  SNOWBOARD("Snowboard"),
  
  SNOWSHOE("Snowshoe"),
  
  SOCCER("Soccer"),
  
  STAIRSTEPPER("StairStepper"),
  
  STANDUPPADDLING("StandUpPaddling"),
  
  SURFING("Surfing"),
  
  SWIM("Swim"),
  
  VELOMOBILE("Velomobile"),
  
  VIRTUALRIDE("VirtualRide"),
  
  VIRTUALRUN("VirtualRun"),
  
  WALK("Walk"),
  
  WEIGHTTRAINING("WeightTraining"),
  
  WHEELCHAIR("Wheelchair"),
  
  WINDSURF("Windsurf"),
  
  WORKOUT("Workout"),
  
  YOGA("Yoga");

  private String value;

  ActivityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActivityType fromValue(String text) {
    for (ActivityType b : ActivityType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ActivityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ActivityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActivityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ActivityType.fromValue(String.valueOf(value));
    }
  }
}

