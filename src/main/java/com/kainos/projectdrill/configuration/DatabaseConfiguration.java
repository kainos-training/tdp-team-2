package com.kainos.projectdrill.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DatabaseConfiguration {
    @JsonProperty
    private String url;

    @JsonProperty
    private String user;

    @JsonProperty
    private String password;

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}