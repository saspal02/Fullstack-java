package com.fullstackJava.MyfirstWebApp;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username,String password) {

        boolean isValidUserName = username.equalsIgnoreCase("WebApp");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");

        return isValidUserName && isValidPassword;
    }
}
