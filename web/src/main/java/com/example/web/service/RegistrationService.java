package com.example.web.service;

import com.example.autogen.grpc.registration.LoginRequest;
import com.example.autogen.grpc.registration.LoginResponse;
import com.example.autogen.grpc.registration.RegistrationGrpc;
import com.example.web.model.LoginReq;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    public String authenticate(LoginReq request) {

        Channel channel = ManagedChannelBuilder.forAddress("registration", 9092).usePlaintext().build();
        RegistrationGrpc.RegistrationBlockingStub stub
                = RegistrationGrpc.newBlockingStub(channel);

        LoginResponse rpcResponse = stub.login(
                LoginRequest.newBuilder()
                        .setUsername(request.getUsername())
                        .setPassword(request.getPassword())
                        .build()
        );

        return rpcResponse.getToken();
    }
}
