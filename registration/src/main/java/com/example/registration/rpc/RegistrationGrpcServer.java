package com.example.registration.rpc;

import com.example.autogen.grpc.registration.LoginRequest;
import com.example.autogen.grpc.registration.LoginResponse;
import com.example.autogen.grpc.registration.RegistrationGrpc;
import com.example.registration.service.RegistrationService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@RequiredArgsConstructor
public class RegistrationGrpcServer extends RegistrationGrpc.RegistrationImplBase{

    private final RegistrationService registrationService;
    @Override
    public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {

        // logics...
        String token = registrationService.getToken();

        LoginResponse response = LoginResponse.newBuilder()
                .setToken(token)
                .build();

        // returns
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
