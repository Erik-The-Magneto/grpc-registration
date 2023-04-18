package com.example.registration.service;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public String getToken(){
        return "Hi this is your token !";
    }
}
