package com.example.web.model;

public class LoginRes {
    private String token;

    public LoginRes(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
