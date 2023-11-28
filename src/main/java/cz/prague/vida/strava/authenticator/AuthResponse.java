package cz.prague.vida.strava.authenticator;


import com.google.gson.annotations.SerializedName;
import cz.prague.vida.strava.entities.Athlete;

public class AuthResponse {
    @SerializedName("access_token")
    String accessToken;
    Athlete athlete;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    @Override
    public String toString() {
        return "AuthResponse{" +
                "accessToken='" + accessToken + '\'' +
                ", athlete=" + athlete +
                '}';
    }
}