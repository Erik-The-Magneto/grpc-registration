package com.example.web.service;

import com.example.autogen.grpc.calculator.SumGrpc;
import com.example.autogen.grpc.calculator.SumRequest;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {
    @GrpcClient("calculator")
    private SumGrpc.SumBlockingStub client;

    public Integer getSum(List<Integer> numbers) {
        SumRequest sumRequest = SumRequest.newBuilder()
                .addAllNumbers(numbers)
                .build();
        return client.getSum(sumRequest).getSum();
    }
}
