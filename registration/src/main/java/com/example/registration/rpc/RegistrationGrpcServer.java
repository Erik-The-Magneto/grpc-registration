package com.example.registration.rpc;

import com.example.autogen.grpc.registration.LoginRequest;
import com.example.autogen.grpc.registration.LoginResponse;
import com.example.autogen.grpc.registration.RegistrationGrpc;
import com.example.registration.service.RegistrationService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@GrpcService
@RequiredArgsConstructor
public class RegistrationGrpcServer extends RegistrationGrpc.RegistrationImplBase{
    private final Logger log = LoggerFactory.getLogger(RegistrationGrpcServer.class);
    private final RegistrationService registrationService;
    @Override
    public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {

        log.info("Received request from web service : {}", request);
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
