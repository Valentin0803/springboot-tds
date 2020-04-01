package com.example.td5.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
@Table(name = "user")
public class User {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private final UUID id;
    @NotBlank
    private final String login;
    @NotBlank
    private final String password;
    @NotBlank
    private final String email;
    @NotBlank
    private final String identity;

    public User(@JsonProperty("id") UUID id,
                @JsonProperty("login") String login,
                @JsonProperty("password") String password,
                @JsonProperty("email") String email,
                @JsonProperty("identity") String identity) {

        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
        this.identity = identity;
    }

    public UUID getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getIdentity() {
        return identity;
    }
}
