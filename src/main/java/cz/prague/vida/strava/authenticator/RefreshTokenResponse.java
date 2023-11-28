package cz.prague.vida.strava.authenticator;

import com.google.gson.annotations.SerializedName;

public class RefreshTokenResponse {
	@SerializedName("token_type")
	private String tokenType;
	@SerializedName("access_token")
	private String accessToken;
	@SerializedName("expires_at")
	private int expiresAt;
	@SerializedName("expires_in")
	private int expiresIn;
	@SerializedName("refresh_token")
	private String refreshToken;

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public int getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(int expiresAt) {
		this.expiresAt = expiresAt;
	}

	public int getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
}
