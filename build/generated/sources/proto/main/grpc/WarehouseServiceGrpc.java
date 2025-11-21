import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: warehouse.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WarehouseServiceGrpc {

  private WarehouseServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "WarehouseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<WarehouseOuterClass.WarehouseRequest,
      WarehouseOuterClass.WarehouseResponse> getSendWarehouseDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendWarehouseData",
      requestType = WarehouseOuterClass.WarehouseRequest.class,
      responseType = WarehouseOuterClass.WarehouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<WarehouseOuterClass.WarehouseRequest,
      WarehouseOuterClass.WarehouseResponse> getSendWarehouseDataMethod() {
    io.grpc.MethodDescriptor<WarehouseOuterClass.WarehouseRequest, WarehouseOuterClass.WarehouseResponse> getSendWarehouseDataMethod;
    if ((getSendWarehouseDataMethod = WarehouseServiceGrpc.getSendWarehouseDataMethod) == null) {
      synchronized (WarehouseServiceGrpc.class) {
        if ((getSendWarehouseDataMethod = WarehouseServiceGrpc.getSendWarehouseDataMethod) == null) {
          WarehouseServiceGrpc.getSendWarehouseDataMethod = getSendWarehouseDataMethod =
              io.grpc.MethodDescriptor.<WarehouseOuterClass.WarehouseRequest, WarehouseOuterClass.WarehouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendWarehouseData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WarehouseOuterClass.WarehouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WarehouseOuterClass.WarehouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WarehouseServiceMethodDescriptorSupplier("SendWarehouseData"))
              .build();
        }
      }
    }
    return getSendWarehouseDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WarehouseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseServiceStub>() {
        @java.lang.Override
        public WarehouseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseServiceStub(channel, callOptions);
        }
      };
    return WarehouseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static WarehouseServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseServiceBlockingV2Stub>() {
        @java.lang.Override
        public WarehouseServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return WarehouseServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WarehouseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseServiceBlockingStub>() {
        @java.lang.Override
        public WarehouseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseServiceBlockingStub(channel, callOptions);
        }
      };
    return WarehouseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WarehouseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseServiceFutureStub>() {
        @java.lang.Override
        public WarehouseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseServiceFutureStub(channel, callOptions);
        }
      };
    return WarehouseServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sendWarehouseData(WarehouseOuterClass.WarehouseRequest request,
        io.grpc.stub.StreamObserver<WarehouseOuterClass.WarehouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendWarehouseDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WarehouseService.
   */
  public static abstract class WarehouseServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WarehouseServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WarehouseService.
   */
  public static final class WarehouseServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WarehouseServiceStub> {
    private WarehouseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendWarehouseData(WarehouseOuterClass.WarehouseRequest request,
        io.grpc.stub.StreamObserver<WarehouseOuterClass.WarehouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendWarehouseDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WarehouseService.
   */
  public static final class WarehouseServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<WarehouseServiceBlockingV2Stub> {
    private WarehouseServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public WarehouseOuterClass.WarehouseResponse sendWarehouseData(WarehouseOuterClass.WarehouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendWarehouseDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service WarehouseService.
   */
  public static final class WarehouseServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WarehouseServiceBlockingStub> {
    private WarehouseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public WarehouseOuterClass.WarehouseResponse sendWarehouseData(WarehouseOuterClass.WarehouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendWarehouseDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WarehouseService.
   */
  public static final class WarehouseServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WarehouseServiceFutureStub> {
    private WarehouseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<WarehouseOuterClass.WarehouseResponse> sendWarehouseData(
        WarehouseOuterClass.WarehouseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendWarehouseDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_WAREHOUSE_DATA = 0;

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
        case METHODID_SEND_WAREHOUSE_DATA:
          serviceImpl.sendWarehouseData((WarehouseOuterClass.WarehouseRequest) request,
              (io.grpc.stub.StreamObserver<WarehouseOuterClass.WarehouseResponse>) responseObserver);
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
          getSendWarehouseDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              WarehouseOuterClass.WarehouseRequest,
              WarehouseOuterClass.WarehouseResponse>(
                service, METHODID_SEND_WAREHOUSE_DATA)))
        .build();
  }

  private static abstract class WarehouseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WarehouseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return WarehouseOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WarehouseService");
    }
  }

  private static final class WarehouseServiceFileDescriptorSupplier
      extends WarehouseServiceBaseDescriptorSupplier {
    WarehouseServiceFileDescriptorSupplier() {}
  }

  private static final class WarehouseServiceMethodDescriptorSupplier
      extends WarehouseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WarehouseServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WarehouseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WarehouseServiceFileDescriptorSupplier())
              .addMethod(getSendWarehouseDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
