package com.booking.entities;

public class AuthResponse {
    private String email;
    private String accessToken;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public AuthResponse(String email, String accessToken, int id) {
        this.email = email;
        this.accessToken = accessToken;
        this.id = id;
    }

    public AuthResponse() {
    }
}
