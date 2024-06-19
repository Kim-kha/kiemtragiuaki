package com.example.kiemtra.service;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public boolean authenticate(String username, String password) {
        return "admin".equals(username) && "password".equals(password);
    }
}
