package com.example.web.controller;

import com.example.web.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/get-sum")
    public ResponseEntity<Integer> getSum(@RequestParam List<Integer> numbers) {
        return new ResponseEntity<>(calculatorService.getSum(numbers), HttpStatus.OK);
    }
}
