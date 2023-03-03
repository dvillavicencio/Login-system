package com.deahtstroke.loginsample.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.validation.annotation.Validated;

@Entity
@Data
@Builder
@Table(name = "user_info")
@AllArgsConstructor
@Validated
@NoArgsConstructor
public class UserInfo {

    @Id
    @Column(name = "userid")
    @NonNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
    private Integer userId;

    @Column(name = "username")
    private String username;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "authenticationmethod")
    private String authenticationMethod;
}
