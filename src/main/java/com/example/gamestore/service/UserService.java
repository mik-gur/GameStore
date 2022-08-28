package com.example.gamestore.service;

import com.example.gamestore.domain.User;
import com.example.gamestore.domain.security.PasswordResetToken;
import com.example.gamestore.domain.security.UserRole;

import java.util.Set;

public interface UserService {
    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);

    User findByUsername(String username);

    User findByEmail(String email);

    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User user);
}
