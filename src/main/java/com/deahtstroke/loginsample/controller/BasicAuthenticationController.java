package com.deahtstroke.loginsample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BasicAuthenticationController {

    @GetMapping("/login")
    public String login() {
        return "You are trying to log in...";
    }

    @GetMapping("/private")
    public String thisIsAPrivateController() {
        return "was it...?";
    }
}
