package org.apache.custos.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: user_management.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserManagementServiceGrpc {

  private UserManagementServiceGrpc() {}

  public static final String SERVICE_NAME = "org.apache.custos.user.UserManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.custos.user.UserProfile,
      org.apache.custos.user.UserProfile> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = org.apache.custos.user.UserProfile.class,
      responseType = org.apache.custos.user.UserProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.custos.user.UserProfile,
      org.apache.custos.user.UserProfile> getCreateUserMethod() {
    io.grpc.MethodDescriptor<org.apache.custos.user.UserProfile, org.apache.custos.user.UserProfile> getCreateUserMethod;
    if ((getCreateUserMethod = UserManagementServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserManagementServiceGrpc.class) {
        if ((getCreateUserMethod = UserManagementServiceGrpc.getCreateUserMethod) == null) {
          UserManagementServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<org.apache.custos.user.UserProfile, org.apache.custos.user.UserProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.custos.user.UserProfile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.custos.user.UserProfile.getDefaultInstance()))
              .setSchemaDescriptor(new UserManagementServiceMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.custos.user.UserProfile,
      org.apache.custos.user.UserProfile> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = org.apache.custos.user.UserProfile.class,
      responseType = org.apache.custos.user.UserProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.custos.user.UserProfile,
      org.apache.custos.user.UserProfile> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<org.apache.custos.user.UserProfile, org.apache.custos.user.UserProfile> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserManagementServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserManagementServiceGrpc.class) {
        if ((getUpdateUserMethod = UserManagementServiceGrpc.getUpdateUserMethod) == null) {
          UserManagementServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<org.apache.custos.user.UserProfile, org.apache.custos.user.UserProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.custos.user.UserProfile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.custos.user.UserProfile.getDefaultInstance()))
              .setSchemaDescriptor(new UserManagementServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.custos.user.UserManagement.GetUserRequest,
      org.apache.custos.user.UserProfile> getGetUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserById",
      requestType = org.apache.custos.user.UserManagement.GetUserRequest.class,
      responseType = org.apache.custos.user.UserProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.custos.user.UserManagement.GetUserRequest,
      org.apache.custos.user.UserProfile> getGetUserByIdMethod() {
    io.grpc.MethodDescriptor<org.apache.custos.user.UserManagement.GetUserRequest, org.apache.custos.user.UserProfile> getGetUserByIdMethod;
    if ((getGetUserByIdMethod = UserManagementServiceGrpc.getGetUserByIdMethod) == null) {
      synchronized (UserManagementServiceGrpc.class) {
        if ((getGetUserByIdMethod = UserManagementServiceGrpc.getGetUserByIdMethod) == null) {
          UserManagementServiceGrpc.getGetUserByIdMethod = getGetUserByIdMethod =
              io.grpc.MethodDescriptor.<org.apache.custos.user.UserManagement.GetUserRequest, org.apache.custos.user.UserProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.custos.user.UserManagement.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.custos.user.UserProfile.getDefaultInstance()))
              .setSchemaDescriptor(new UserManagementServiceMethodDescriptorSupplier("GetUserById"))
              .build();
        }
      }
    }
    return getGetUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.custos.group.Group,
      org.apache.custos.group.Group> getCreateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGroup",
      requestType = org.apache.custos.group.Group.class,
      responseType = org.apache.custos.group.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.custos.group.Group,
      org.apache.custos.group.Group> getCreateGroupMethod() {
    io.grpc.MethodDescriptor<org.apache.custos.group.Group, org.apache.custos.group.Group> getCreateGroupMethod;
    if ((getCreateGroupMethod = UserManagementServiceGrpc.getCreateGroupMethod) == null) {
      synchronized (UserManagementServiceGrpc.class) {
        if ((getCreateGroupMethod = UserManagementServiceGrpc.getCreateGroupMethod) == null) {
          UserManagementServiceGrpc.getCreateGroupMethod = getCreateGroupMethod =
              io.grpc.MethodDescriptor.<org.apache.custos.group.Group, org.apache.custos.group.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.custos.group.Group.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.custos.group.Group.getDefaultInstance()))
              .setSchemaDescriptor(new UserManagementServiceMethodDescriptorSupplier("CreateGroup"))
              .build();
        }
      }
    }
    return getCreateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.custos.user.UserManagement.GetGroupRequest,
      org.apache.custos.group.Group> getGetGroupByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGroupById",
      requestType = org.apache.custos.user.UserManagement.GetGroupRequest.class,
      responseType = org.apache.custos.group.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.custos.user.UserManagement.GetGroupRequest,
      org.apache.custos.group.Group> getGetGroupByIdMethod() {
    io.grpc.MethodDescriptor<org.apache.custos.user.UserManagement.GetGroupRequest, org.apache.custos.group.Group> getGetGroupByIdMethod;
    if ((getGetGroupByIdMethod = UserManagementServiceGrpc.getGetGroupByIdMethod) == null) {
      synchronized (UserManagementServiceGrpc.class) {
        if ((getGetGroupByIdMethod = UserManagementServiceGrpc.getGetGroupByIdMethod) == null) {
          UserManagementServiceGrpc.getGetGroupByIdMethod = getGetGroupByIdMethod =
              io.grpc.MethodDescriptor.<org.apache.custos.user.UserManagement.GetGroupRequest, org.apache.custos.group.Group>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGroupById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.custos.user.UserManagement.GetGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.custos.group.Group.getDefaultInstance()))
              .setSchemaDescriptor(new UserManagementServiceMethodDescriptorSupplier("GetGroupById"))
              .build();
        }
      }
    }
    return getGetGroupByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserManagementServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserManagementServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserManagementServiceStub>() {
        @java.lang.Override
        public UserManagementServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserManagementServiceStub(channel, callOptions);
        }
      };
    return UserManagementServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserManagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserManagementServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserManagementServiceBlockingStub>() {
        @java.lang.Override
        public UserManagementServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserManagementServiceBlockingStub(channel, callOptions);
        }
      };
    return UserManagementServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserManagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserManagementServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserManagementServiceFutureStub>() {
        @java.lang.Override
        public UserManagementServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserManagementServiceFutureStub(channel, callOptions);
        }
      };
    return UserManagementServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserManagementServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(org.apache.custos.user.UserProfile request,
        io.grpc.stub.StreamObserver<org.apache.custos.user.UserProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(org.apache.custos.user.UserProfile request,
        io.grpc.stub.StreamObserver<org.apache.custos.user.UserProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void getUserById(org.apache.custos.user.UserManagement.GetUserRequest request,
        io.grpc.stub.StreamObserver<org.apache.custos.user.UserProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByIdMethod(), responseObserver);
    }

    /**
     */
    public void createGroup(org.apache.custos.group.Group request,
        io.grpc.stub.StreamObserver<org.apache.custos.group.Group> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGroupMethod(), responseObserver);
    }

    /**
     */
    public void getGroupById(org.apache.custos.user.UserManagement.GetGroupRequest request,
        io.grpc.stub.StreamObserver<org.apache.custos.group.Group> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGroupByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.custos.user.UserProfile,
                org.apache.custos.user.UserProfile>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.custos.user.UserProfile,
                org.apache.custos.user.UserProfile>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getGetUserByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.custos.user.UserManagement.GetUserRequest,
                org.apache.custos.user.UserProfile>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            getCreateGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.custos.group.Group,
                org.apache.custos.group.Group>(
                  this, METHODID_CREATE_GROUP)))
          .addMethod(
            getGetGroupByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.apache.custos.user.UserManagement.GetGroupRequest,
                org.apache.custos.group.Group>(
                  this, METHODID_GET_GROUP_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class UserManagementServiceStub extends io.grpc.stub.AbstractAsyncStub<UserManagementServiceStub> {
    private UserManagementServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserManagementServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserManagementServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUser(org.apache.custos.user.UserProfile request,
        io.grpc.stub.StreamObserver<org.apache.custos.user.UserProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(org.apache.custos.user.UserProfile request,
        io.grpc.stub.StreamObserver<org.apache.custos.user.UserProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserById(org.apache.custos.user.UserManagement.GetUserRequest request,
        io.grpc.stub.StreamObserver<org.apache.custos.user.UserProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createGroup(org.apache.custos.group.Group request,
        io.grpc.stub.StreamObserver<org.apache.custos.group.Group> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGroupById(org.apache.custos.user.UserManagement.GetGroupRequest request,
        io.grpc.stub.StreamObserver<org.apache.custos.group.Group> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGroupByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserManagementServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserManagementServiceBlockingStub> {
    private UserManagementServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserManagementServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserManagementServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.custos.user.UserProfile createUser(org.apache.custos.user.UserProfile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.custos.user.UserProfile updateUser(org.apache.custos.user.UserProfile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.custos.user.UserProfile getUserById(org.apache.custos.user.UserManagement.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.custos.group.Group createGroup(org.apache.custos.group.Group request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.custos.group.Group getGroupById(org.apache.custos.user.UserManagement.GetGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGroupByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserManagementServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserManagementServiceFutureStub> {
    private UserManagementServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserManagementServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserManagementServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.custos.user.UserProfile> createUser(
        org.apache.custos.user.UserProfile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.custos.user.UserProfile> updateUser(
        org.apache.custos.user.UserProfile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.custos.user.UserProfile> getUserById(
        org.apache.custos.user.UserManagement.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.custos.group.Group> createGroup(
        org.apache.custos.group.Group request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.custos.group.Group> getGroupById(
        org.apache.custos.user.UserManagement.GetGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGroupByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_UPDATE_USER = 1;
  private static final int METHODID_GET_USER_BY_ID = 2;
  private static final int METHODID_CREATE_GROUP = 3;
  private static final int METHODID_GET_GROUP_BY_ID = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserManagementServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserManagementServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((org.apache.custos.user.UserProfile) request,
              (io.grpc.stub.StreamObserver<org.apache.custos.user.UserProfile>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((org.apache.custos.user.UserProfile) request,
              (io.grpc.stub.StreamObserver<org.apache.custos.user.UserProfile>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((org.apache.custos.user.UserManagement.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.custos.user.UserProfile>) responseObserver);
          break;
        case METHODID_CREATE_GROUP:
          serviceImpl.createGroup((org.apache.custos.group.Group) request,
              (io.grpc.stub.StreamObserver<org.apache.custos.group.Group>) responseObserver);
          break;
        case METHODID_GET_GROUP_BY_ID:
          serviceImpl.getGroupById((org.apache.custos.user.UserManagement.GetGroupRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.custos.group.Group>) responseObserver);
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

  private static abstract class UserManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.custos.user.UserManagement.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserManagementService");
    }
  }

  private static final class UserManagementServiceFileDescriptorSupplier
      extends UserManagementServiceBaseDescriptorSupplier {
    UserManagementServiceFileDescriptorSupplier() {}
  }

  private static final class UserManagementServiceMethodDescriptorSupplier
      extends UserManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserManagementServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserManagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserManagementServiceFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getGetUserByIdMethod())
              .addMethod(getCreateGroupMethod())
              .addMethod(getGetGroupByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
