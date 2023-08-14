package com.company.springsecurity.model;

import lombok.Builder;
import lombok.Data;

/**
 * spring-security
 * Elxan
 * 14.08.2023 20:36
 */
@Data
@Builder
public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
