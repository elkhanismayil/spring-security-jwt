package com.company.springsecurity.repository;

import com.company.springsecurity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * spring-security
 * Elxan
 * 14.08.2023 18:10
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
