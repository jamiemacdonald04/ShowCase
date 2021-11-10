package com.proto.sum;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: Sum/Sum.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SumServiceGrpc {

  private SumServiceGrpc() {}

  public static final String SERVICE_NAME = "Sum.SumService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.sum.SumRequest,
      com.proto.sum.SumResponse> getCalculateSumOfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateSumOf",
      requestType = com.proto.sum.SumRequest.class,
      responseType = com.proto.sum.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.sum.SumRequest,
      com.proto.sum.SumResponse> getCalculateSumOfMethod() {
    io.grpc.MethodDescriptor<com.proto.sum.SumRequest, com.proto.sum.SumResponse> getCalculateSumOfMethod;
    if ((getCalculateSumOfMethod = SumServiceGrpc.getCalculateSumOfMethod) == null) {
      synchronized (SumServiceGrpc.class) {
        if ((getCalculateSumOfMethod = SumServiceGrpc.getCalculateSumOfMethod) == null) {
          SumServiceGrpc.getCalculateSumOfMethod = getCalculateSumOfMethod =
              io.grpc.MethodDescriptor.<com.proto.sum.SumRequest, com.proto.sum.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateSumOf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SumServiceMethodDescriptorSupplier("CalculateSumOf"))
              .build();
        }
      }
    }
    return getCalculateSumOfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.sum.HelloReq,
      com.proto.sum.HelloResp> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hello",
      requestType = com.proto.sum.HelloReq.class,
      responseType = com.proto.sum.HelloResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.sum.HelloReq,
      com.proto.sum.HelloResp> getHelloMethod() {
    io.grpc.MethodDescriptor<com.proto.sum.HelloReq, com.proto.sum.HelloResp> getHelloMethod;
    if ((getHelloMethod = SumServiceGrpc.getHelloMethod) == null) {
      synchronized (SumServiceGrpc.class) {
        if ((getHelloMethod = SumServiceGrpc.getHelloMethod) == null) {
          SumServiceGrpc.getHelloMethod = getHelloMethod =
              io.grpc.MethodDescriptor.<com.proto.sum.HelloReq, com.proto.sum.HelloResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.HelloReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.HelloResp.getDefaultInstance()))
              .setSchemaDescriptor(new SumServiceMethodDescriptorSupplier("Hello"))
              .build();
        }
      }
    }
    return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.sum.SumRequest,
      com.proto.sum.SumResponse> getCalculateSumOfStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateSumOfStream",
      requestType = com.proto.sum.SumRequest.class,
      responseType = com.proto.sum.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.sum.SumRequest,
      com.proto.sum.SumResponse> getCalculateSumOfStreamMethod() {
    io.grpc.MethodDescriptor<com.proto.sum.SumRequest, com.proto.sum.SumResponse> getCalculateSumOfStreamMethod;
    if ((getCalculateSumOfStreamMethod = SumServiceGrpc.getCalculateSumOfStreamMethod) == null) {
      synchronized (SumServiceGrpc.class) {
        if ((getCalculateSumOfStreamMethod = SumServiceGrpc.getCalculateSumOfStreamMethod) == null) {
          SumServiceGrpc.getCalculateSumOfStreamMethod = getCalculateSumOfStreamMethod =
              io.grpc.MethodDescriptor.<com.proto.sum.SumRequest, com.proto.sum.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateSumOfStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SumServiceMethodDescriptorSupplier("CalculateSumOfStream"))
              .build();
        }
      }
    }
    return getCalculateSumOfStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.sum.SingleSumRequest,
      com.proto.sum.SumResponse> getCalculateOnTheFlyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculateOnTheFly",
      requestType = com.proto.sum.SingleSumRequest.class,
      responseType = com.proto.sum.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.sum.SingleSumRequest,
      com.proto.sum.SumResponse> getCalculateOnTheFlyMethod() {
    io.grpc.MethodDescriptor<com.proto.sum.SingleSumRequest, com.proto.sum.SumResponse> getCalculateOnTheFlyMethod;
    if ((getCalculateOnTheFlyMethod = SumServiceGrpc.getCalculateOnTheFlyMethod) == null) {
      synchronized (SumServiceGrpc.class) {
        if ((getCalculateOnTheFlyMethod = SumServiceGrpc.getCalculateOnTheFlyMethod) == null) {
          SumServiceGrpc.getCalculateOnTheFlyMethod = getCalculateOnTheFlyMethod =
              io.grpc.MethodDescriptor.<com.proto.sum.SingleSumRequest, com.proto.sum.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "calculateOnTheFly"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SingleSumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SumServiceMethodDescriptorSupplier("calculateOnTheFly"))
              .build();
        }
      }
    }
    return getCalculateOnTheFlyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.sum.SingleSumRequest,
      com.proto.sum.SumResponse> getPrescriptionNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "prescriptionNumber",
      requestType = com.proto.sum.SingleSumRequest.class,
      responseType = com.proto.sum.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.sum.SingleSumRequest,
      com.proto.sum.SumResponse> getPrescriptionNumberMethod() {
    io.grpc.MethodDescriptor<com.proto.sum.SingleSumRequest, com.proto.sum.SumResponse> getPrescriptionNumberMethod;
    if ((getPrescriptionNumberMethod = SumServiceGrpc.getPrescriptionNumberMethod) == null) {
      synchronized (SumServiceGrpc.class) {
        if ((getPrescriptionNumberMethod = SumServiceGrpc.getPrescriptionNumberMethod) == null) {
          SumServiceGrpc.getPrescriptionNumberMethod = getPrescriptionNumberMethod =
              io.grpc.MethodDescriptor.<com.proto.sum.SingleSumRequest, com.proto.sum.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "prescriptionNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SingleSumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SumServiceMethodDescriptorSupplier("prescriptionNumber"))
              .build();
        }
      }
    }
    return getPrescriptionNumberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SumServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumServiceStub>() {
        @java.lang.Override
        public SumServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumServiceStub(channel, callOptions);
        }
      };
    return SumServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SumServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumServiceBlockingStub>() {
        @java.lang.Override
        public SumServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumServiceBlockingStub(channel, callOptions);
        }
      };
    return SumServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SumServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumServiceFutureStub>() {
        @java.lang.Override
        public SumServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumServiceFutureStub(channel, callOptions);
        }
      };
    return SumServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SumServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * request response
     * </pre>
     */
    public void calculateSumOf(com.proto.sum.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateSumOfMethod(), responseObserver);
    }

    /**
     * <pre>
     * im here.
     * </pre>
     */
    public void hello(com.proto.sum.HelloReq request,
        io.grpc.stub.StreamObserver<com.proto.sum.HelloResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     *server polling client
     * </pre>
     */
    public void calculateSumOfStream(com.proto.sum.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateSumOfStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *client polling service
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.sum.SingleSumRequest> calculateOnTheFly(
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCalculateOnTheFlyMethod(), responseObserver);
    }

    /**
     * <pre>
     *bio directional polling
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.sum.SingleSumRequest> prescriptionNumber(
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPrescriptionNumberMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateSumOfMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.sum.SumRequest,
                com.proto.sum.SumResponse>(
                  this, METHODID_CALCULATE_SUM_OF)))
          .addMethod(
            getHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.sum.HelloReq,
                com.proto.sum.HelloResp>(
                  this, METHODID_HELLO)))
          .addMethod(
            getCalculateSumOfStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.sum.SumRequest,
                com.proto.sum.SumResponse>(
                  this, METHODID_CALCULATE_SUM_OF_STREAM)))
          .addMethod(
            getCalculateOnTheFlyMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.sum.SingleSumRequest,
                com.proto.sum.SumResponse>(
                  this, METHODID_CALCULATE_ON_THE_FLY)))
          .addMethod(
            getPrescriptionNumberMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.sum.SingleSumRequest,
                com.proto.sum.SumResponse>(
                  this, METHODID_PRESCRIPTION_NUMBER)))
          .build();
    }
  }

  /**
   */
  public static final class SumServiceStub extends io.grpc.stub.AbstractAsyncStub<SumServiceStub> {
    private SumServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * request response
     * </pre>
     */
    public void calculateSumOf(com.proto.sum.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateSumOfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * im here.
     * </pre>
     */
    public void hello(com.proto.sum.HelloReq request,
        io.grpc.stub.StreamObserver<com.proto.sum.HelloResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server polling client
     * </pre>
     */
    public void calculateSumOfStream(com.proto.sum.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getCalculateSumOfStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client polling service
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.sum.SingleSumRequest> calculateOnTheFly(
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCalculateOnTheFlyMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *bio directional polling
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.sum.SingleSumRequest> prescriptionNumber(
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getPrescriptionNumberMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SumServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SumServiceBlockingStub> {
    private SumServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * request response
     * </pre>
     */
    public com.proto.sum.SumResponse calculateSumOf(com.proto.sum.SumRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateSumOfMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * im here.
     * </pre>
     */
    public com.proto.sum.HelloResp hello(com.proto.sum.HelloReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server polling client
     * </pre>
     */
    public java.util.Iterator<com.proto.sum.SumResponse> calculateSumOfStream(
        com.proto.sum.SumRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getCalculateSumOfStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SumServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SumServiceFutureStub> {
    private SumServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * request response
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.sum.SumResponse> calculateSumOf(
        com.proto.sum.SumRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateSumOfMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * im here.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.sum.HelloResp> hello(
        com.proto.sum.HelloReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE_SUM_OF = 0;
  private static final int METHODID_HELLO = 1;
  private static final int METHODID_CALCULATE_SUM_OF_STREAM = 2;
  private static final int METHODID_CALCULATE_ON_THE_FLY = 3;
  private static final int METHODID_PRESCRIPTION_NUMBER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SumServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SumServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE_SUM_OF:
          serviceImpl.calculateSumOf((com.proto.sum.SumRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.sum.SumResponse>) responseObserver);
          break;
        case METHODID_HELLO:
          serviceImpl.hello((com.proto.sum.HelloReq) request,
              (io.grpc.stub.StreamObserver<com.proto.sum.HelloResp>) responseObserver);
          break;
        case METHODID_CALCULATE_SUM_OF_STREAM:
          serviceImpl.calculateSumOfStream((com.proto.sum.SumRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.sum.SumResponse>) responseObserver);
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
        case METHODID_CALCULATE_ON_THE_FLY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.calculateOnTheFly(
              (io.grpc.stub.StreamObserver<com.proto.sum.SumResponse>) responseObserver);
        case METHODID_PRESCRIPTION_NUMBER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.prescriptionNumber(
              (io.grpc.stub.StreamObserver<com.proto.sum.SumResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SumServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.sum.Sum.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SumService");
    }
  }

  private static final class SumServiceFileDescriptorSupplier
      extends SumServiceBaseDescriptorSupplier {
    SumServiceFileDescriptorSupplier() {}
  }

  private static final class SumServiceMethodDescriptorSupplier
      extends SumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SumServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SumServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SumServiceFileDescriptorSupplier())
              .addMethod(getCalculateSumOfMethod())
              .addMethod(getHelloMethod())
              .addMethod(getCalculateSumOfStreamMethod())
              .addMethod(getCalculateOnTheFlyMethod())
              .addMethod(getPrescriptionNumberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
