package com.company.springsecurity.model;

import lombok.Builder;
import lombok.Data;

/**
 * spring-security
 * Elxan
 * 14.08.2023 20:37
 */
@Data
@Builder
public class AuthenticationRequest {
    private String email;
    private String password;
}
