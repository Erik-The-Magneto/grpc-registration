package com.example.autogen.grpc.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.30.0)",
    comments = "Source: caculator.proto")
public final class SumGrpc {

  private SumGrpc() {}

  public static final String SERVICE_NAME = "calculator.Sum";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SumRequest,
      SumResponse> getGetSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSum",
      requestType = SumRequest.class,
      responseType = SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SumRequest,
      SumResponse> getGetSumMethod() {
    io.grpc.MethodDescriptor<SumRequest, SumResponse> getGetSumMethod;
    if ((getGetSumMethod = SumGrpc.getGetSumMethod) == null) {
      synchronized (SumGrpc.class) {
        if ((getGetSumMethod = SumGrpc.getGetSumMethod) == null) {
          SumGrpc.getGetSumMethod = getGetSumMethod =
              io.grpc.MethodDescriptor.<SumRequest, SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SumMethodDescriptorSupplier("GetSum"))
              .build();
        }
      }
    }
    return getGetSumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SumStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumStub>() {
        @Override
        public SumStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumStub(channel, callOptions);
        }
      };
    return SumStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SumBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumBlockingStub>() {
        @Override
        public SumBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumBlockingStub(channel, callOptions);
        }
      };
    return SumBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SumFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumFutureStub>() {
        @Override
        public SumFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumFutureStub(channel, callOptions);
        }
      };
    return SumFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SumImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSum(SumRequest request,
                       io.grpc.stub.StreamObserver<SumResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSumMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                SumRequest,
                SumResponse>(
                  this, METHODID_GET_SUM)))
          .build();
    }
  }

  /**
   */
  public static final class SumStub extends io.grpc.stub.AbstractAsyncStub<SumStub> {
    private SumStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SumStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumStub(channel, callOptions);
    }

    /**
     */
    public void getSum(SumRequest request,
                       io.grpc.stub.StreamObserver<SumResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSumMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SumBlockingStub extends io.grpc.stub.AbstractBlockingStub<SumBlockingStub> {
    private SumBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SumBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumBlockingStub(channel, callOptions);
    }

    /**
     */
    public SumResponse getSum(SumRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSumMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SumFutureStub extends io.grpc.stub.AbstractFutureStub<SumFutureStub> {
    private SumFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SumFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SumResponse> getSum(
        SumRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SUM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SumImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SumImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SUM:
          serviceImpl.getSum((SumRequest) request,
              (io.grpc.stub.StreamObserver<SumResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SumBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SumBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Caculator.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sum");
    }
  }

  private static final class SumFileDescriptorSupplier
      extends SumBaseDescriptorSupplier {
    SumFileDescriptorSupplier() {}
  }

  private static final class SumMethodDescriptorSupplier
      extends SumBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SumMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SumGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SumFileDescriptorSupplier())
              .addMethod(getGetSumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
