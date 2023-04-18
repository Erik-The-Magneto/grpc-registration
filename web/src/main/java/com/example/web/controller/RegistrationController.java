package com.example.web.controller;

import com.example.web.model.LoginReq;
import com.example.web.service.RegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginReq request){
        return registrationService.authenticate(request);
    }
}
