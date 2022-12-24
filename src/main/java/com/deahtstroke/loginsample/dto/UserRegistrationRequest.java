package com.deahtstroke.loginsample.dto;

import lombok.Data;

@Data
public class UserRegistrationRequest {

    /**
     * The password
     */
    private String password;

    /**
     * The username
     */
    private String username;

    /**
     * The first name
     */
    private String firstName;

    /**
     * The last name
     */
    private String lastName;

    /**
     * The email
     */
    private String email;
}
