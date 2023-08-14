package com.company.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring-security
 * Elxan
 * 14.08.2023 21:10
 */
@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {
    @GetMapping
    public ResponseEntity<String> defaultPage() {
        return ResponseEntity.ok("Hello from Spring Security");
    }
}
