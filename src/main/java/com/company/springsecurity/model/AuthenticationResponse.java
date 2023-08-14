package com.company.springsecurity.model;

import lombok.Builder;
import lombok.Data;

/**
 * spring-security
 * Elxan
 * 14.08.2023 20:34
 */
@Data
@Builder
public class AuthenticationResponse {
    private String token;
}
