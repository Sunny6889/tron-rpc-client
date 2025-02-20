package org.example.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: api/api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MonitorGrpc {

  private MonitorGrpc() {}

  public static final java.lang.String SERVICE_NAME = "protocol.Monitor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.protos.Protocol.MetricsInfo> getGetStatsInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatsInfo",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.protos.Protocol.MetricsInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.protos.Protocol.MetricsInfo> getGetStatsInfoMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.MetricsInfo> getGetStatsInfoMethod;
    if ((getGetStatsInfoMethod = MonitorGrpc.getGetStatsInfoMethod) == null) {
      synchronized (MonitorGrpc.class) {
        if ((getGetStatsInfoMethod = MonitorGrpc.getGetStatsInfoMethod) == null) {
          MonitorGrpc.getGetStatsInfoMethod = getGetStatsInfoMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.MetricsInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStatsInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.MetricsInfo.getDefaultInstance()))
              .setSchemaDescriptor(new MonitorMethodDescriptorSupplier("GetStatsInfo"))
              .build();
        }
      }
    }
    return getGetStatsInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MonitorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MonitorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MonitorStub>() {
        @java.lang.Override
        public MonitorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MonitorStub(channel, callOptions);
        }
      };
    return MonitorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MonitorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MonitorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MonitorBlockingStub>() {
        @java.lang.Override
        public MonitorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MonitorBlockingStub(channel, callOptions);
        }
      };
    return MonitorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MonitorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MonitorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MonitorFutureStub>() {
        @java.lang.Override
        public MonitorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MonitorFutureStub(channel, callOptions);
        }
      };
    return MonitorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getStatsInfo(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.MetricsInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStatsInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Monitor.
   */
  public static abstract class MonitorImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MonitorGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Monitor.
   */
  public static final class MonitorStub
      extends io.grpc.stub.AbstractAsyncStub<MonitorStub> {
    private MonitorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MonitorStub(channel, callOptions);
    }

    /**
     */
    public void getStatsInfo(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.MetricsInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStatsInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Monitor.
   */
  public static final class MonitorBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MonitorBlockingStub> {
    private MonitorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MonitorBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.protos.Protocol.MetricsInfo getStatsInfo(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStatsInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Monitor.
   */
  public static final class MonitorFutureStub
      extends io.grpc.stub.AbstractFutureStub<MonitorFutureStub> {
    private MonitorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MonitorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.MetricsInfo> getStatsInfo(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStatsInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATS_INFO = 0;

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
        case METHODID_GET_STATS_INFO:
          serviceImpl.getStatsInfo((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.MetricsInfo>) responseObserver);
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
          getGetStatsInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.protos.Protocol.MetricsInfo>(
                service, METHODID_GET_STATS_INFO)))
        .build();
  }

  private static abstract class MonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MonitorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.api.GrpcAPI.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Monitor");
    }
  }

  private static final class MonitorFileDescriptorSupplier
      extends MonitorBaseDescriptorSupplier {
    MonitorFileDescriptorSupplier() {}
  }

  private static final class MonitorMethodDescriptorSupplier
      extends MonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MonitorMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MonitorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MonitorFileDescriptorSupplier())
              .addMethod(getGetStatsInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
