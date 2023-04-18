package com.example.calculator.service;

import com.example.autogen.grpc.calculator.SumRequest;
import com.example.autogen.grpc.calculator.SumResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {
    public SumResponse getSum(SumRequest request) {

        List<Integer> numbers = request.getNumbersList();
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        return SumResponse.newBuilder().setSum(sum).build();
    }
}
