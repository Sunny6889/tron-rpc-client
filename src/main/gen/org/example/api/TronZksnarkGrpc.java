package org.example.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: api/zksnark.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TronZksnarkGrpc {

  private TronZksnarkGrpc() {}

  public static final java.lang.String SERVICE_NAME = "protocol.TronZksnark";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.api.ZksnarkGrpcAPI.ZksnarkRequest,
      org.example.api.ZksnarkGrpcAPI.ZksnarkResponse> getCheckZksnarkProofMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckZksnarkProof",
      requestType = org.example.api.ZksnarkGrpcAPI.ZksnarkRequest.class,
      responseType = org.example.api.ZksnarkGrpcAPI.ZksnarkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.ZksnarkGrpcAPI.ZksnarkRequest,
      org.example.api.ZksnarkGrpcAPI.ZksnarkResponse> getCheckZksnarkProofMethod() {
    io.grpc.MethodDescriptor<org.example.api.ZksnarkGrpcAPI.ZksnarkRequest, org.example.api.ZksnarkGrpcAPI.ZksnarkResponse> getCheckZksnarkProofMethod;
    if ((getCheckZksnarkProofMethod = TronZksnarkGrpc.getCheckZksnarkProofMethod) == null) {
      synchronized (TronZksnarkGrpc.class) {
        if ((getCheckZksnarkProofMethod = TronZksnarkGrpc.getCheckZksnarkProofMethod) == null) {
          TronZksnarkGrpc.getCheckZksnarkProofMethod = getCheckZksnarkProofMethod =
              io.grpc.MethodDescriptor.<org.example.api.ZksnarkGrpcAPI.ZksnarkRequest, org.example.api.ZksnarkGrpcAPI.ZksnarkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckZksnarkProof"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.ZksnarkGrpcAPI.ZksnarkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.ZksnarkGrpcAPI.ZksnarkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TronZksnarkMethodDescriptorSupplier("CheckZksnarkProof"))
              .build();
        }
      }
    }
    return getCheckZksnarkProofMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TronZksnarkStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TronZksnarkStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TronZksnarkStub>() {
        @java.lang.Override
        public TronZksnarkStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TronZksnarkStub(channel, callOptions);
        }
      };
    return TronZksnarkStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TronZksnarkBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TronZksnarkBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TronZksnarkBlockingStub>() {
        @java.lang.Override
        public TronZksnarkBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TronZksnarkBlockingStub(channel, callOptions);
        }
      };
    return TronZksnarkBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TronZksnarkFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TronZksnarkFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TronZksnarkFutureStub>() {
        @java.lang.Override
        public TronZksnarkFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TronZksnarkFutureStub(channel, callOptions);
        }
      };
    return TronZksnarkFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void checkZksnarkProof(org.example.api.ZksnarkGrpcAPI.ZksnarkRequest request,
        io.grpc.stub.StreamObserver<org.example.api.ZksnarkGrpcAPI.ZksnarkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckZksnarkProofMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TronZksnark.
   */
  public static abstract class TronZksnarkImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TronZksnarkGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TronZksnark.
   */
  public static final class TronZksnarkStub
      extends io.grpc.stub.AbstractAsyncStub<TronZksnarkStub> {
    private TronZksnarkStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TronZksnarkStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TronZksnarkStub(channel, callOptions);
    }

    /**
     */
    public void checkZksnarkProof(org.example.api.ZksnarkGrpcAPI.ZksnarkRequest request,
        io.grpc.stub.StreamObserver<org.example.api.ZksnarkGrpcAPI.ZksnarkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckZksnarkProofMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TronZksnark.
   */
  public static final class TronZksnarkBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TronZksnarkBlockingStub> {
    private TronZksnarkBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TronZksnarkBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TronZksnarkBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.api.ZksnarkGrpcAPI.ZksnarkResponse checkZksnarkProof(org.example.api.ZksnarkGrpcAPI.ZksnarkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckZksnarkProofMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TronZksnark.
   */
  public static final class TronZksnarkFutureStub
      extends io.grpc.stub.AbstractFutureStub<TronZksnarkFutureStub> {
    private TronZksnarkFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TronZksnarkFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TronZksnarkFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.ZksnarkGrpcAPI.ZksnarkResponse> checkZksnarkProof(
        org.example.api.ZksnarkGrpcAPI.ZksnarkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckZksnarkProofMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_ZKSNARK_PROOF = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_ZKSNARK_PROOF:
          serviceImpl.checkZksnarkProof((org.example.api.ZksnarkGrpcAPI.ZksnarkRequest) request,
              (io.grpc.stub.StreamObserver<org.example.api.ZksnarkGrpcAPI.ZksnarkResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCheckZksnarkProofMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.ZksnarkGrpcAPI.ZksnarkRequest,
              org.example.api.ZksnarkGrpcAPI.ZksnarkResponse>(
                service, METHODID_CHECK_ZKSNARK_PROOF)))
        .build();
  }

  private static abstract class TronZksnarkBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TronZksnarkBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.api.ZksnarkGrpcAPI.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TronZksnark");
    }
  }

  private static final class TronZksnarkFileDescriptorSupplier
      extends TronZksnarkBaseDescriptorSupplier {
    TronZksnarkFileDescriptorSupplier() {}
  }

  private static final class TronZksnarkMethodDescriptorSupplier
      extends TronZksnarkBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TronZksnarkMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TronZksnarkGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TronZksnarkFileDescriptorSupplier())
              .addMethod(getCheckZksnarkProofMethod())
              .build();
        }
      }
    }
    return result;
  }
}
