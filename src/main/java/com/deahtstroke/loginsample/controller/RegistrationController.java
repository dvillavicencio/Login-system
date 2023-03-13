package com.deahtstroke.loginsample.controller;

import com.deahtstroke.loginsample.dto.UserRegistrationRequest;
import com.deahtstroke.loginsample.service.RegistrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    /**
     * Handles new user registration
     *
     * @param request The new user registration request
     * @return {@link String} saying if the request was successful
     */
    @PostMapping(path = "/registration")
    public ResponseEntity<String> registerNewUser(
            @RequestBody UserRegistrationRequest request) {
        log.info("Registering new user with first name [{}], last name [{}], and email [{}]",
                request.getFirstName(), request.getLastName(), request.getEmail());
        var response = registrationService.registerNewUser(request);
        log.info("Finished registering new user in the database");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> registerOldUser() {
        return registerNewUser(new UserRegistrationRequest());
    }

}
