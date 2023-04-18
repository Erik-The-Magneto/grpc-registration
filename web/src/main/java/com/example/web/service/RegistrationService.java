package com.example.web.service;

import com.example.autogen.grpc.registration.LoginRequest;
import com.example.autogen.grpc.registration.LoginResponse;
import com.example.autogen.grpc.registration.RegistrationGrpc;
import com.example.web.model.LoginReq;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @GrpcClient("registration")
    private RegistrationGrpc.RegistrationBlockingStub client;
    public String authenticate(LoginReq request) {

        LoginResponse rpcResponse = client.login(
                LoginRequest.newBuilder()
                        .setUsername(request.getUsername())
                        .setPassword(request.getPassword())
                        .build()
        );

        return rpcResponse.getToken();
    }
}
