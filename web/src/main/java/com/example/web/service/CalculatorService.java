package com.example.web.service;

import com.example.autogen.grpc.calculator.SumGrpc;
import com.example.autogen.grpc.calculator.SumRequest;
import com.example.autogen.grpc.registration.RegistrationGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {
//    @GrpcClient("calculator")
//    private SumGrpc.SumBlockingStub client;

    public Integer getSum(List<Integer> numbers) {

        Channel channel = ManagedChannelBuilder.forAddress("calculator", 9090).usePlaintext().build();
        SumGrpc.SumBlockingStub stub
                = SumGrpc.newBlockingStub(channel);

        SumRequest sumRequest = SumRequest.newBuilder()
                .addAllNumbers(numbers)
                .build();
        return stub.getSum(sumRequest).getSum();
    }
}
