package com.example.gamestore.service;

import com.example.gamestore.domain.User;
import com.example.gamestore.domain.security.PasswordResetToken;

public interface UserService {
    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);
}
