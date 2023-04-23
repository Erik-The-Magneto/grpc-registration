package com.example.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentController {

    @GetMapping("/name")
    public ResponseEntity<String> getNameFromStudentService() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity("http://student:8083/name", String.class);
    }
}
