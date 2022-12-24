package com.deahtstroke.loginsample.service;

import com.deahtstroke.loginsample.dto.UserRegistrationRequest;
import com.deahtstroke.loginsample.entity.UserInfo;
import com.deahtstroke.loginsample.repository.UserInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RegistrationService {

    private final UserInfoRepository userInfoRepository;

    public RegistrationService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    /**
     * Register a new user in the database
     *
     * @param request The registration request
     * @return Successful string
     */
    public String registerNewUser(UserRegistrationRequest request) {
        var newUser = UserInfo.builder()
                .username(request.getUsername())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword())
                .authenticationMethod("basic")
                .build();
        userInfoRepository.save(newUser);
        return String.format("User with email [%s] was registered in the database",
                request.getEmail());
    }
}
