package com.example.calculator.rpc;

import com.example.autogen.grpc.calculator.SumGrpc;
import com.example.autogen.grpc.calculator.SumRequest;
import com.example.autogen.grpc.calculator.SumResponse;
import com.example.calculator.service.CalculatorService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class SumGrpcServer extends SumGrpc.SumImplBase {

    private final CalculatorService calculatorService;

    public SumGrpcServer(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @Override
    public void getSum(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        responseObserver.onNext(calculatorService.getSum(request));
        responseObserver.onCompleted();
    }
}
