package com.example.gamestore.utilities;

import com.example.gamestore.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MailConstructor {

    @Autowired
    private Environment environment;
    public SimpleMailMessage constructResetTokenEmail(String contextPath, Locale locale, String token, User user, String password){
        String url = contextPath + "/newUser?token"+token;
        String message = "\n Please click on this link to verify your email adn edit your personal information. Your password is: \n" + password;
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(user.getEmail());
        email.setSubject("GameStore - New User");
        email.setText(url+message);
        email.setFrom(environment.getProperty("support.email"));
        return email;
    }
}
