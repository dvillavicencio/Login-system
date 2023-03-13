package com.deahtstroke.loginsample.enummeration;

public enum AuthenticationMethod {
    BASIC("Basic"),
    OAUTH2("OAuth2");

    private String label;

    AuthenticationMethod(String label) {
        this.label = label;
    }
}
