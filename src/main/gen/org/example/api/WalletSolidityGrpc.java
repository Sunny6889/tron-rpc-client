package org.example.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: api/api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WalletSolidityGrpc {

  private WalletSolidityGrpc() {}

  public static final java.lang.String SERVICE_NAME = "protocol.WalletSolidity";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.protos.Protocol.Account,
      org.example.protos.Protocol.Account> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = org.example.protos.Protocol.Account.class,
      responseType = org.example.protos.Protocol.Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.Protocol.Account,
      org.example.protos.Protocol.Account> getGetAccountMethod() {
    io.grpc.MethodDescriptor<org.example.protos.Protocol.Account, org.example.protos.Protocol.Account> getGetAccountMethod;
    if ((getGetAccountMethod = WalletSolidityGrpc.getGetAccountMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetAccountMethod = WalletSolidityGrpc.getGetAccountMethod) == null) {
          WalletSolidityGrpc.getGetAccountMethod = getGetAccountMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.Account, org.example.protos.Protocol.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Account.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Account.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetAccount"))
              .build();
        }
      }
    }
    return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.Protocol.Account,
      org.example.protos.Protocol.Account> getGetAccountByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountById",
      requestType = org.example.protos.Protocol.Account.class,
      responseType = org.example.protos.Protocol.Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.Protocol.Account,
      org.example.protos.Protocol.Account> getGetAccountByIdMethod() {
    io.grpc.MethodDescriptor<org.example.protos.Protocol.Account, org.example.protos.Protocol.Account> getGetAccountByIdMethod;
    if ((getGetAccountByIdMethod = WalletSolidityGrpc.getGetAccountByIdMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetAccountByIdMethod = WalletSolidityGrpc.getGetAccountByIdMethod) == null) {
          WalletSolidityGrpc.getGetAccountByIdMethod = getGetAccountByIdMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.Account, org.example.protos.Protocol.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Account.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Account.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetAccountById"))
              .build();
        }
      }
    }
    return getGetAccountByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.WitnessList> getListWitnessesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWitnesses",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.WitnessList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.WitnessList> getListWitnessesMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.WitnessList> getListWitnessesMethod;
    if ((getListWitnessesMethod = WalletSolidityGrpc.getListWitnessesMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getListWitnessesMethod = WalletSolidityGrpc.getListWitnessesMethod) == null) {
          WalletSolidityGrpc.getListWitnessesMethod = getListWitnessesMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.WitnessList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWitnesses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.WitnessList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("ListWitnesses"))
              .build();
        }
      }
    }
    return getListWitnessesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.AssetIssueList> getGetAssetIssueListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueList",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.AssetIssueList> getGetAssetIssueListMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.AssetIssueList> getGetAssetIssueListMethod;
    if ((getGetAssetIssueListMethod = WalletSolidityGrpc.getGetAssetIssueListMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetAssetIssueListMethod = WalletSolidityGrpc.getGetAssetIssueListMethod) == null) {
          WalletSolidityGrpc.getGetAssetIssueListMethod = getGetAssetIssueListMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetAssetIssueList"))
              .build();
        }
      }
    }
    return getGetAssetIssueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PaginatedMessage,
      org.example.api.GrpcAPI.AssetIssueList> getGetPaginatedAssetIssueListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedAssetIssueList",
      requestType = org.example.api.GrpcAPI.PaginatedMessage.class,
      responseType = org.example.api.GrpcAPI.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PaginatedMessage,
      org.example.api.GrpcAPI.AssetIssueList> getGetPaginatedAssetIssueListMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PaginatedMessage, org.example.api.GrpcAPI.AssetIssueList> getGetPaginatedAssetIssueListMethod;
    if ((getGetPaginatedAssetIssueListMethod = WalletSolidityGrpc.getGetPaginatedAssetIssueListMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetPaginatedAssetIssueListMethod = WalletSolidityGrpc.getGetPaginatedAssetIssueListMethod) == null) {
          WalletSolidityGrpc.getGetPaginatedAssetIssueListMethod = getGetPaginatedAssetIssueListMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.PaginatedMessage, org.example.api.GrpcAPI.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedAssetIssueList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetPaginatedAssetIssueList"))
              .build();
        }
      }
    }
    return getGetPaginatedAssetIssueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getGetAssetIssueByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueByName",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getGetAssetIssueByNameMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getGetAssetIssueByNameMethod;
    if ((getGetAssetIssueByNameMethod = WalletSolidityGrpc.getGetAssetIssueByNameMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetAssetIssueByNameMethod = WalletSolidityGrpc.getGetAssetIssueByNameMethod) == null) {
          WalletSolidityGrpc.getGetAssetIssueByNameMethod = getGetAssetIssueByNameMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetAssetIssueByName"))
              .build();
        }
      }
    }
    return getGetAssetIssueByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.api.GrpcAPI.AssetIssueList> getGetAssetIssueListByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueListByName",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.api.GrpcAPI.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.api.GrpcAPI.AssetIssueList> getGetAssetIssueListByNameMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.api.GrpcAPI.AssetIssueList> getGetAssetIssueListByNameMethod;
    if ((getGetAssetIssueListByNameMethod = WalletSolidityGrpc.getGetAssetIssueListByNameMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetAssetIssueListByNameMethod = WalletSolidityGrpc.getGetAssetIssueListByNameMethod) == null) {
          WalletSolidityGrpc.getGetAssetIssueListByNameMethod = getGetAssetIssueListByNameMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.api.GrpcAPI.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueListByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetAssetIssueListByName"))
              .build();
        }
      }
    }
    return getGetAssetIssueListByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getGetAssetIssueByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueById",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getGetAssetIssueByIdMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getGetAssetIssueByIdMethod;
    if ((getGetAssetIssueByIdMethod = WalletSolidityGrpc.getGetAssetIssueByIdMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetAssetIssueByIdMethod = WalletSolidityGrpc.getGetAssetIssueByIdMethod) == null) {
          WalletSolidityGrpc.getGetAssetIssueByIdMethod = getGetAssetIssueByIdMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetAssetIssueById"))
              .build();
        }
      }
    }
    return getGetAssetIssueByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.protos.Protocol.Block> getGetNowBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNowBlock",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.protos.Protocol.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.protos.Protocol.Block> getGetNowBlockMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.Block> getGetNowBlockMethod;
    if ((getGetNowBlockMethod = WalletSolidityGrpc.getGetNowBlockMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetNowBlockMethod = WalletSolidityGrpc.getGetNowBlockMethod) == null) {
          WalletSolidityGrpc.getGetNowBlockMethod = getGetNowBlockMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNowBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetNowBlock"))
              .build();
        }
      }
    }
    return getGetNowBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.BlockExtention> getGetNowBlock2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNowBlock2",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.BlockExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.BlockExtention> getGetNowBlock2Method() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.BlockExtention> getGetNowBlock2Method;
    if ((getGetNowBlock2Method = WalletSolidityGrpc.getGetNowBlock2Method) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetNowBlock2Method = WalletSolidityGrpc.getGetNowBlock2Method) == null) {
          WalletSolidityGrpc.getGetNowBlock2Method = getGetNowBlock2Method =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNowBlock2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BlockExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetNowBlock2"))
              .build();
        }
      }
    }
    return getGetNowBlock2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage,
      org.example.protos.Protocol.Block> getGetBlockByNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByNum",
      requestType = org.example.api.GrpcAPI.NumberMessage.class,
      responseType = org.example.protos.Protocol.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage,
      org.example.protos.Protocol.Block> getGetBlockByNumMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage, org.example.protos.Protocol.Block> getGetBlockByNumMethod;
    if ((getGetBlockByNumMethod = WalletSolidityGrpc.getGetBlockByNumMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetBlockByNumMethod = WalletSolidityGrpc.getGetBlockByNumMethod) == null) {
          WalletSolidityGrpc.getGetBlockByNumMethod = getGetBlockByNumMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NumberMessage, org.example.protos.Protocol.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetBlockByNum"))
              .build();
        }
      }
    }
    return getGetBlockByNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage,
      org.example.api.GrpcAPI.BlockExtention> getGetBlockByNum2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByNum2",
      requestType = org.example.api.GrpcAPI.NumberMessage.class,
      responseType = org.example.api.GrpcAPI.BlockExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage,
      org.example.api.GrpcAPI.BlockExtention> getGetBlockByNum2Method() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage, org.example.api.GrpcAPI.BlockExtention> getGetBlockByNum2Method;
    if ((getGetBlockByNum2Method = WalletSolidityGrpc.getGetBlockByNum2Method) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetBlockByNum2Method = WalletSolidityGrpc.getGetBlockByNum2Method) == null) {
          WalletSolidityGrpc.getGetBlockByNum2Method = getGetBlockByNum2Method =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NumberMessage, org.example.api.GrpcAPI.BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByNum2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BlockExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetBlockByNum2"))
              .build();
        }
      }
    }
    return getGetBlockByNum2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage,
      org.example.api.GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionCountByBlockNum",
      requestType = org.example.api.GrpcAPI.NumberMessage.class,
      responseType = org.example.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage,
      org.example.api.GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage, org.example.api.GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod;
    if ((getGetTransactionCountByBlockNumMethod = WalletSolidityGrpc.getGetTransactionCountByBlockNumMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetTransactionCountByBlockNumMethod = WalletSolidityGrpc.getGetTransactionCountByBlockNumMethod) == null) {
          WalletSolidityGrpc.getGetTransactionCountByBlockNumMethod = getGetTransactionCountByBlockNumMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NumberMessage, org.example.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionCountByBlockNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetTransactionCountByBlockNum"))
              .build();
        }
      }
    }
    return getGetTransactionCountByBlockNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.DelegatedResourceMessage,
      org.example.api.GrpcAPI.DelegatedResourceList> getGetDelegatedResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResource",
      requestType = org.example.api.GrpcAPI.DelegatedResourceMessage.class,
      responseType = org.example.api.GrpcAPI.DelegatedResourceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.DelegatedResourceMessage,
      org.example.api.GrpcAPI.DelegatedResourceList> getGetDelegatedResourceMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.DelegatedResourceMessage, org.example.api.GrpcAPI.DelegatedResourceList> getGetDelegatedResourceMethod;
    if ((getGetDelegatedResourceMethod = WalletSolidityGrpc.getGetDelegatedResourceMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetDelegatedResourceMethod = WalletSolidityGrpc.getGetDelegatedResourceMethod) == null) {
          WalletSolidityGrpc.getGetDelegatedResourceMethod = getGetDelegatedResourceMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.DelegatedResourceMessage, org.example.api.GrpcAPI.DelegatedResourceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DelegatedResourceMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DelegatedResourceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetDelegatedResource"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.DelegatedResourceMessage,
      org.example.api.GrpcAPI.DelegatedResourceList> getGetDelegatedResourceV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResourceV2",
      requestType = org.example.api.GrpcAPI.DelegatedResourceMessage.class,
      responseType = org.example.api.GrpcAPI.DelegatedResourceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.DelegatedResourceMessage,
      org.example.api.GrpcAPI.DelegatedResourceList> getGetDelegatedResourceV2Method() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.DelegatedResourceMessage, org.example.api.GrpcAPI.DelegatedResourceList> getGetDelegatedResourceV2Method;
    if ((getGetDelegatedResourceV2Method = WalletSolidityGrpc.getGetDelegatedResourceV2Method) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetDelegatedResourceV2Method = WalletSolidityGrpc.getGetDelegatedResourceV2Method) == null) {
          WalletSolidityGrpc.getGetDelegatedResourceV2Method = getGetDelegatedResourceV2Method =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.DelegatedResourceMessage, org.example.api.GrpcAPI.DelegatedResourceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResourceV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DelegatedResourceMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DelegatedResourceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetDelegatedResourceV2"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResourceAccountIndex",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.protos.Protocol.DelegatedResourceAccountIndex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod;
    if ((getGetDelegatedResourceAccountIndexMethod = WalletSolidityGrpc.getGetDelegatedResourceAccountIndexMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetDelegatedResourceAccountIndexMethod = WalletSolidityGrpc.getGetDelegatedResourceAccountIndexMethod) == null) {
          WalletSolidityGrpc.getGetDelegatedResourceAccountIndexMethod = getGetDelegatedResourceAccountIndexMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.DelegatedResourceAccountIndex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResourceAccountIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.DelegatedResourceAccountIndex.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetDelegatedResourceAccountIndex"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceAccountIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResourceAccountIndexV2",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.protos.Protocol.DelegatedResourceAccountIndex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexV2Method() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexV2Method;
    if ((getGetDelegatedResourceAccountIndexV2Method = WalletSolidityGrpc.getGetDelegatedResourceAccountIndexV2Method) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetDelegatedResourceAccountIndexV2Method = WalletSolidityGrpc.getGetDelegatedResourceAccountIndexV2Method) == null) {
          WalletSolidityGrpc.getGetDelegatedResourceAccountIndexV2Method = getGetDelegatedResourceAccountIndexV2Method =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.DelegatedResourceAccountIndex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResourceAccountIndexV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.DelegatedResourceAccountIndex.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetDelegatedResourceAccountIndexV2"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceAccountIndexV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.CanDelegatedMaxSizeRequestMessage,
      org.example.api.GrpcAPI.CanDelegatedMaxSizeResponseMessage> getGetCanDelegatedMaxSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCanDelegatedMaxSize",
      requestType = org.example.api.GrpcAPI.CanDelegatedMaxSizeRequestMessage.class,
      responseType = org.example.api.GrpcAPI.CanDelegatedMaxSizeResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.CanDelegatedMaxSizeRequestMessage,
      org.example.api.GrpcAPI.CanDelegatedMaxSizeResponseMessage> getGetCanDelegatedMaxSizeMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.CanDelegatedMaxSizeRequestMessage, org.example.api.GrpcAPI.CanDelegatedMaxSizeResponseMessage> getGetCanDelegatedMaxSizeMethod;
    if ((getGetCanDelegatedMaxSizeMethod = WalletSolidityGrpc.getGetCanDelegatedMaxSizeMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetCanDelegatedMaxSizeMethod = WalletSolidityGrpc.getGetCanDelegatedMaxSizeMethod) == null) {
          WalletSolidityGrpc.getGetCanDelegatedMaxSizeMethod = getGetCanDelegatedMaxSizeMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.CanDelegatedMaxSizeRequestMessage, org.example.api.GrpcAPI.CanDelegatedMaxSizeResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCanDelegatedMaxSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.CanDelegatedMaxSizeRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.CanDelegatedMaxSizeResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetCanDelegatedMaxSize"))
              .build();
        }
      }
    }
    return getGetCanDelegatedMaxSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.GetAvailableUnfreezeCountRequestMessage,
      org.example.api.GrpcAPI.GetAvailableUnfreezeCountResponseMessage> getGetAvailableUnfreezeCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailableUnfreezeCount",
      requestType = org.example.api.GrpcAPI.GetAvailableUnfreezeCountRequestMessage.class,
      responseType = org.example.api.GrpcAPI.GetAvailableUnfreezeCountResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.GetAvailableUnfreezeCountRequestMessage,
      org.example.api.GrpcAPI.GetAvailableUnfreezeCountResponseMessage> getGetAvailableUnfreezeCountMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.GetAvailableUnfreezeCountRequestMessage, org.example.api.GrpcAPI.GetAvailableUnfreezeCountResponseMessage> getGetAvailableUnfreezeCountMethod;
    if ((getGetAvailableUnfreezeCountMethod = WalletSolidityGrpc.getGetAvailableUnfreezeCountMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetAvailableUnfreezeCountMethod = WalletSolidityGrpc.getGetAvailableUnfreezeCountMethod) == null) {
          WalletSolidityGrpc.getGetAvailableUnfreezeCountMethod = getGetAvailableUnfreezeCountMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.GetAvailableUnfreezeCountRequestMessage, org.example.api.GrpcAPI.GetAvailableUnfreezeCountResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailableUnfreezeCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.GetAvailableUnfreezeCountRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.GetAvailableUnfreezeCountResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetAvailableUnfreezeCount"))
              .build();
        }
      }
    }
    return getGetAvailableUnfreezeCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage,
      org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> getGetCanWithdrawUnfreezeAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCanWithdrawUnfreezeAmount",
      requestType = org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage.class,
      responseType = org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage,
      org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> getGetCanWithdrawUnfreezeAmountMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage, org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> getGetCanWithdrawUnfreezeAmountMethod;
    if ((getGetCanWithdrawUnfreezeAmountMethod = WalletSolidityGrpc.getGetCanWithdrawUnfreezeAmountMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetCanWithdrawUnfreezeAmountMethod = WalletSolidityGrpc.getGetCanWithdrawUnfreezeAmountMethod) == null) {
          WalletSolidityGrpc.getGetCanWithdrawUnfreezeAmountMethod = getGetCanWithdrawUnfreezeAmountMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage, org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCanWithdrawUnfreezeAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetCanWithdrawUnfreezeAmount"))
              .build();
        }
      }
    }
    return getGetCanWithdrawUnfreezeAmountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.Exchange> getGetExchangeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExchangeById",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.protos.Protocol.Exchange.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.Exchange> getGetExchangeByIdMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.Exchange> getGetExchangeByIdMethod;
    if ((getGetExchangeByIdMethod = WalletSolidityGrpc.getGetExchangeByIdMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetExchangeByIdMethod = WalletSolidityGrpc.getGetExchangeByIdMethod) == null) {
          WalletSolidityGrpc.getGetExchangeByIdMethod = getGetExchangeByIdMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.Exchange>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExchangeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Exchange.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetExchangeById"))
              .build();
        }
      }
    }
    return getGetExchangeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.ExchangeList> getListExchangesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExchanges",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.ExchangeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.ExchangeList> getListExchangesMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.ExchangeList> getListExchangesMethod;
    if ((getListExchangesMethod = WalletSolidityGrpc.getListExchangesMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getListExchangesMethod = WalletSolidityGrpc.getListExchangesMethod) == null) {
          WalletSolidityGrpc.getListExchangesMethod = getListExchangesMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.ExchangeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExchanges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.ExchangeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("ListExchanges"))
              .build();
        }
      }
    }
    return getListExchangesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.Transaction> getGetTransactionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionById",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.Transaction> getGetTransactionByIdMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.Transaction> getGetTransactionByIdMethod;
    if ((getGetTransactionByIdMethod = WalletSolidityGrpc.getGetTransactionByIdMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetTransactionByIdMethod = WalletSolidityGrpc.getGetTransactionByIdMethod) == null) {
          WalletSolidityGrpc.getGetTransactionByIdMethod = getGetTransactionByIdMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetTransactionById"))
              .build();
        }
      }
    }
    return getGetTransactionByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.TransactionInfo> getGetTransactionInfoByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionInfoById",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.protos.Protocol.TransactionInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.TransactionInfo> getGetTransactionInfoByIdMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.TransactionInfo> getGetTransactionInfoByIdMethod;
    if ((getGetTransactionInfoByIdMethod = WalletSolidityGrpc.getGetTransactionInfoByIdMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetTransactionInfoByIdMethod = WalletSolidityGrpc.getGetTransactionInfoByIdMethod) == null) {
          WalletSolidityGrpc.getGetTransactionInfoByIdMethod = getGetTransactionInfoByIdMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.TransactionInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionInfoById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.TransactionInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetTransactionInfoById"))
              .build();
        }
      }
    }
    return getGetTransactionInfoByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.ShieldContract.OutputPointInfo,
      org.example.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo> getGetMerkleTreeVoucherInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMerkleTreeVoucherInfo",
      requestType = org.example.protos.contract.ShieldContract.OutputPointInfo.class,
      responseType = org.example.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.ShieldContract.OutputPointInfo,
      org.example.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo> getGetMerkleTreeVoucherInfoMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.ShieldContract.OutputPointInfo, org.example.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo> getGetMerkleTreeVoucherInfoMethod;
    if ((getGetMerkleTreeVoucherInfoMethod = WalletSolidityGrpc.getGetMerkleTreeVoucherInfoMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetMerkleTreeVoucherInfoMethod = WalletSolidityGrpc.getGetMerkleTreeVoucherInfoMethod) == null) {
          WalletSolidityGrpc.getGetMerkleTreeVoucherInfoMethod = getGetMerkleTreeVoucherInfoMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.ShieldContract.OutputPointInfo, org.example.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMerkleTreeVoucherInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.ShieldContract.OutputPointInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetMerkleTreeVoucherInfo"))
              .build();
        }
      }
    }
    return getGetMerkleTreeVoucherInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.IvkDecryptParameters,
      org.example.api.GrpcAPI.DecryptNotes> getScanNoteByIvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanNoteByIvk",
      requestType = org.example.api.GrpcAPI.IvkDecryptParameters.class,
      responseType = org.example.api.GrpcAPI.DecryptNotes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.IvkDecryptParameters,
      org.example.api.GrpcAPI.DecryptNotes> getScanNoteByIvkMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.IvkDecryptParameters, org.example.api.GrpcAPI.DecryptNotes> getScanNoteByIvkMethod;
    if ((getScanNoteByIvkMethod = WalletSolidityGrpc.getScanNoteByIvkMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getScanNoteByIvkMethod = WalletSolidityGrpc.getScanNoteByIvkMethod) == null) {
          WalletSolidityGrpc.getScanNoteByIvkMethod = getScanNoteByIvkMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.IvkDecryptParameters, org.example.api.GrpcAPI.DecryptNotes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanNoteByIvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.IvkDecryptParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DecryptNotes.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("ScanNoteByIvk"))
              .build();
        }
      }
    }
    return getScanNoteByIvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.IvkDecryptAndMarkParameters,
      org.example.api.GrpcAPI.DecryptNotesMarked> getScanAndMarkNoteByIvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanAndMarkNoteByIvk",
      requestType = org.example.api.GrpcAPI.IvkDecryptAndMarkParameters.class,
      responseType = org.example.api.GrpcAPI.DecryptNotesMarked.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.IvkDecryptAndMarkParameters,
      org.example.api.GrpcAPI.DecryptNotesMarked> getScanAndMarkNoteByIvkMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.IvkDecryptAndMarkParameters, org.example.api.GrpcAPI.DecryptNotesMarked> getScanAndMarkNoteByIvkMethod;
    if ((getScanAndMarkNoteByIvkMethod = WalletSolidityGrpc.getScanAndMarkNoteByIvkMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getScanAndMarkNoteByIvkMethod = WalletSolidityGrpc.getScanAndMarkNoteByIvkMethod) == null) {
          WalletSolidityGrpc.getScanAndMarkNoteByIvkMethod = getScanAndMarkNoteByIvkMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.IvkDecryptAndMarkParameters, org.example.api.GrpcAPI.DecryptNotesMarked>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanAndMarkNoteByIvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.IvkDecryptAndMarkParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DecryptNotesMarked.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("ScanAndMarkNoteByIvk"))
              .build();
        }
      }
    }
    return getScanAndMarkNoteByIvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.OvkDecryptParameters,
      org.example.api.GrpcAPI.DecryptNotes> getScanNoteByOvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanNoteByOvk",
      requestType = org.example.api.GrpcAPI.OvkDecryptParameters.class,
      responseType = org.example.api.GrpcAPI.DecryptNotes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.OvkDecryptParameters,
      org.example.api.GrpcAPI.DecryptNotes> getScanNoteByOvkMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.OvkDecryptParameters, org.example.api.GrpcAPI.DecryptNotes> getScanNoteByOvkMethod;
    if ((getScanNoteByOvkMethod = WalletSolidityGrpc.getScanNoteByOvkMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getScanNoteByOvkMethod = WalletSolidityGrpc.getScanNoteByOvkMethod) == null) {
          WalletSolidityGrpc.getScanNoteByOvkMethod = getScanNoteByOvkMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.OvkDecryptParameters, org.example.api.GrpcAPI.DecryptNotes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanNoteByOvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.OvkDecryptParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DecryptNotes.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("ScanNoteByOvk"))
              .build();
        }
      }
    }
    return getScanNoteByOvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NoteParameters,
      org.example.api.GrpcAPI.SpendResult> getIsSpendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsSpend",
      requestType = org.example.api.GrpcAPI.NoteParameters.class,
      responseType = org.example.api.GrpcAPI.SpendResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NoteParameters,
      org.example.api.GrpcAPI.SpendResult> getIsSpendMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NoteParameters, org.example.api.GrpcAPI.SpendResult> getIsSpendMethod;
    if ((getIsSpendMethod = WalletSolidityGrpc.getIsSpendMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getIsSpendMethod = WalletSolidityGrpc.getIsSpendMethod) == null) {
          WalletSolidityGrpc.getIsSpendMethod = getIsSpendMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NoteParameters, org.example.api.GrpcAPI.SpendResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsSpend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NoteParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.SpendResult.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("IsSpend"))
              .build();
        }
      }
    }
    return getIsSpendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.IvkDecryptTRC20Parameters,
      org.example.api.GrpcAPI.DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanShieldedTRC20NotesByIvk",
      requestType = org.example.api.GrpcAPI.IvkDecryptTRC20Parameters.class,
      responseType = org.example.api.GrpcAPI.DecryptNotesTRC20.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.IvkDecryptTRC20Parameters,
      org.example.api.GrpcAPI.DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.IvkDecryptTRC20Parameters, org.example.api.GrpcAPI.DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod;
    if ((getScanShieldedTRC20NotesByIvkMethod = WalletSolidityGrpc.getScanShieldedTRC20NotesByIvkMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getScanShieldedTRC20NotesByIvkMethod = WalletSolidityGrpc.getScanShieldedTRC20NotesByIvkMethod) == null) {
          WalletSolidityGrpc.getScanShieldedTRC20NotesByIvkMethod = getScanShieldedTRC20NotesByIvkMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.IvkDecryptTRC20Parameters, org.example.api.GrpcAPI.DecryptNotesTRC20>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanShieldedTRC20NotesByIvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.IvkDecryptTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DecryptNotesTRC20.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("ScanShieldedTRC20NotesByIvk"))
              .build();
        }
      }
    }
    return getScanShieldedTRC20NotesByIvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.OvkDecryptTRC20Parameters,
      org.example.api.GrpcAPI.DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanShieldedTRC20NotesByOvk",
      requestType = org.example.api.GrpcAPI.OvkDecryptTRC20Parameters.class,
      responseType = org.example.api.GrpcAPI.DecryptNotesTRC20.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.OvkDecryptTRC20Parameters,
      org.example.api.GrpcAPI.DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.OvkDecryptTRC20Parameters, org.example.api.GrpcAPI.DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod;
    if ((getScanShieldedTRC20NotesByOvkMethod = WalletSolidityGrpc.getScanShieldedTRC20NotesByOvkMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getScanShieldedTRC20NotesByOvkMethod = WalletSolidityGrpc.getScanShieldedTRC20NotesByOvkMethod) == null) {
          WalletSolidityGrpc.getScanShieldedTRC20NotesByOvkMethod = getScanShieldedTRC20NotesByOvkMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.OvkDecryptTRC20Parameters, org.example.api.GrpcAPI.DecryptNotesTRC20>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanShieldedTRC20NotesByOvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.OvkDecryptTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DecryptNotesTRC20.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("ScanShieldedTRC20NotesByOvk"))
              .build();
        }
      }
    }
    return getScanShieldedTRC20NotesByOvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NfTRC20Parameters,
      org.example.api.GrpcAPI.NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsShieldedTRC20ContractNoteSpent",
      requestType = org.example.api.GrpcAPI.NfTRC20Parameters.class,
      responseType = org.example.api.GrpcAPI.NullifierResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NfTRC20Parameters,
      org.example.api.GrpcAPI.NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NfTRC20Parameters, org.example.api.GrpcAPI.NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod;
    if ((getIsShieldedTRC20ContractNoteSpentMethod = WalletSolidityGrpc.getIsShieldedTRC20ContractNoteSpentMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getIsShieldedTRC20ContractNoteSpentMethod = WalletSolidityGrpc.getIsShieldedTRC20ContractNoteSpentMethod) == null) {
          WalletSolidityGrpc.getIsShieldedTRC20ContractNoteSpentMethod = getIsShieldedTRC20ContractNoteSpentMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NfTRC20Parameters, org.example.api.GrpcAPI.NullifierResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsShieldedTRC20ContractNoteSpent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NfTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NullifierResult.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("IsShieldedTRC20ContractNoteSpent"))
              .build();
        }
      }
    }
    return getIsShieldedTRC20ContractNoteSpentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.api.GrpcAPI.NumberMessage> getGetRewardInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRewardInfo",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.api.GrpcAPI.NumberMessage> getGetRewardInfoMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.api.GrpcAPI.NumberMessage> getGetRewardInfoMethod;
    if ((getGetRewardInfoMethod = WalletSolidityGrpc.getGetRewardInfoMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetRewardInfoMethod = WalletSolidityGrpc.getGetRewardInfoMethod) == null) {
          WalletSolidityGrpc.getGetRewardInfoMethod = getGetRewardInfoMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRewardInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetRewardInfo"))
              .build();
        }
      }
    }
    return getGetRewardInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.api.GrpcAPI.NumberMessage> getGetBrokerageInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBrokerageInfo",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.api.GrpcAPI.NumberMessage> getGetBrokerageInfoMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.api.GrpcAPI.NumberMessage> getGetBrokerageInfoMethod;
    if ((getGetBrokerageInfoMethod = WalletSolidityGrpc.getGetBrokerageInfoMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetBrokerageInfoMethod = WalletSolidityGrpc.getGetBrokerageInfoMethod) == null) {
          WalletSolidityGrpc.getGetBrokerageInfoMethod = getGetBrokerageInfoMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBrokerageInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetBrokerageInfo"))
              .build();
        }
      }
    }
    return getGetBrokerageInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract,
      org.example.api.GrpcAPI.TransactionExtention> getTriggerConstantContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerConstantContract",
      requestType = org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract,
      org.example.api.GrpcAPI.TransactionExtention> getTriggerConstantContractMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract, org.example.api.GrpcAPI.TransactionExtention> getTriggerConstantContractMethod;
    if ((getTriggerConstantContractMethod = WalletSolidityGrpc.getTriggerConstantContractMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getTriggerConstantContractMethod = WalletSolidityGrpc.getTriggerConstantContractMethod) == null) {
          WalletSolidityGrpc.getTriggerConstantContractMethod = getTriggerConstantContractMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerConstantContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("TriggerConstantContract"))
              .build();
        }
      }
    }
    return getTriggerConstantContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract,
      org.example.api.GrpcAPI.EstimateEnergyMessage> getEstimateEnergyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateEnergy",
      requestType = org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract.class,
      responseType = org.example.api.GrpcAPI.EstimateEnergyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract,
      org.example.api.GrpcAPI.EstimateEnergyMessage> getEstimateEnergyMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract, org.example.api.GrpcAPI.EstimateEnergyMessage> getEstimateEnergyMethod;
    if ((getEstimateEnergyMethod = WalletSolidityGrpc.getEstimateEnergyMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getEstimateEnergyMethod = WalletSolidityGrpc.getEstimateEnergyMethod) == null) {
          WalletSolidityGrpc.getEstimateEnergyMethod = getEstimateEnergyMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract, org.example.api.GrpcAPI.EstimateEnergyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateEnergy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EstimateEnergyMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("EstimateEnergy"))
              .build();
        }
      }
    }
    return getEstimateEnergyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage,
      org.example.api.GrpcAPI.TransactionInfoList> getGetTransactionInfoByBlockNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionInfoByBlockNum",
      requestType = org.example.api.GrpcAPI.NumberMessage.class,
      responseType = org.example.api.GrpcAPI.TransactionInfoList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage,
      org.example.api.GrpcAPI.TransactionInfoList> getGetTransactionInfoByBlockNumMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage, org.example.api.GrpcAPI.TransactionInfoList> getGetTransactionInfoByBlockNumMethod;
    if ((getGetTransactionInfoByBlockNumMethod = WalletSolidityGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetTransactionInfoByBlockNumMethod = WalletSolidityGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
          WalletSolidityGrpc.getGetTransactionInfoByBlockNumMethod = getGetTransactionInfoByBlockNumMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NumberMessage, org.example.api.GrpcAPI.TransactionInfoList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionInfoByBlockNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionInfoList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetTransactionInfoByBlockNum"))
              .build();
        }
      }
    }
    return getGetTransactionInfoByBlockNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.MarketOrder> getGetMarketOrderByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderById",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.protos.Protocol.MarketOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.MarketOrder> getGetMarketOrderByIdMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.MarketOrder> getGetMarketOrderByIdMethod;
    if ((getGetMarketOrderByIdMethod = WalletSolidityGrpc.getGetMarketOrderByIdMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetMarketOrderByIdMethod = WalletSolidityGrpc.getGetMarketOrderByIdMethod) == null) {
          WalletSolidityGrpc.getGetMarketOrderByIdMethod = getGetMarketOrderByIdMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.MarketOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.MarketOrder.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetMarketOrderById"))
              .build();
        }
      }
    }
    return getGetMarketOrderByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.MarketOrderList> getGetMarketOrderByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderByAccount",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.protos.Protocol.MarketOrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.MarketOrderList> getGetMarketOrderByAccountMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.MarketOrderList> getGetMarketOrderByAccountMethod;
    if ((getGetMarketOrderByAccountMethod = WalletSolidityGrpc.getGetMarketOrderByAccountMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetMarketOrderByAccountMethod = WalletSolidityGrpc.getGetMarketOrderByAccountMethod) == null) {
          WalletSolidityGrpc.getGetMarketOrderByAccountMethod = getGetMarketOrderByAccountMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.MarketOrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.MarketOrderList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetMarketOrderByAccount"))
              .build();
        }
      }
    }
    return getGetMarketOrderByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.Protocol.MarketOrderPair,
      org.example.protos.Protocol.MarketPriceList> getGetMarketPriceByPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketPriceByPair",
      requestType = org.example.protos.Protocol.MarketOrderPair.class,
      responseType = org.example.protos.Protocol.MarketPriceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.Protocol.MarketOrderPair,
      org.example.protos.Protocol.MarketPriceList> getGetMarketPriceByPairMethod() {
    io.grpc.MethodDescriptor<org.example.protos.Protocol.MarketOrderPair, org.example.protos.Protocol.MarketPriceList> getGetMarketPriceByPairMethod;
    if ((getGetMarketPriceByPairMethod = WalletSolidityGrpc.getGetMarketPriceByPairMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetMarketPriceByPairMethod = WalletSolidityGrpc.getGetMarketPriceByPairMethod) == null) {
          WalletSolidityGrpc.getGetMarketPriceByPairMethod = getGetMarketPriceByPairMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.MarketOrderPair, org.example.protos.Protocol.MarketPriceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketPriceByPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.MarketOrderPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.MarketPriceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetMarketPriceByPair"))
              .build();
        }
      }
    }
    return getGetMarketPriceByPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.Protocol.MarketOrderPair,
      org.example.protos.Protocol.MarketOrderList> getGetMarketOrderListByPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderListByPair",
      requestType = org.example.protos.Protocol.MarketOrderPair.class,
      responseType = org.example.protos.Protocol.MarketOrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.Protocol.MarketOrderPair,
      org.example.protos.Protocol.MarketOrderList> getGetMarketOrderListByPairMethod() {
    io.grpc.MethodDescriptor<org.example.protos.Protocol.MarketOrderPair, org.example.protos.Protocol.MarketOrderList> getGetMarketOrderListByPairMethod;
    if ((getGetMarketOrderListByPairMethod = WalletSolidityGrpc.getGetMarketOrderListByPairMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetMarketOrderListByPairMethod = WalletSolidityGrpc.getGetMarketOrderListByPairMethod) == null) {
          WalletSolidityGrpc.getGetMarketOrderListByPairMethod = getGetMarketOrderListByPairMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.MarketOrderPair, org.example.protos.Protocol.MarketOrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderListByPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.MarketOrderPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.MarketOrderList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetMarketOrderListByPair"))
              .build();
        }
      }
    }
    return getGetMarketOrderListByPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.protos.Protocol.MarketOrderPairList> getGetMarketPairListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketPairList",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.protos.Protocol.MarketOrderPairList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.protos.Protocol.MarketOrderPairList> getGetMarketPairListMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.MarketOrderPairList> getGetMarketPairListMethod;
    if ((getGetMarketPairListMethod = WalletSolidityGrpc.getGetMarketPairListMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetMarketPairListMethod = WalletSolidityGrpc.getGetMarketPairListMethod) == null) {
          WalletSolidityGrpc.getGetMarketPairListMethod = getGetMarketPairListMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.MarketOrderPairList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketPairList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.MarketOrderPairList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetMarketPairList"))
              .build();
        }
      }
    }
    return getGetMarketPairListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.NumberMessage> getGetBurnTrxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBurnTrx",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.NumberMessage> getGetBurnTrxMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.NumberMessage> getGetBurnTrxMethod;
    if ((getGetBurnTrxMethod = WalletSolidityGrpc.getGetBurnTrxMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetBurnTrxMethod = WalletSolidityGrpc.getGetBurnTrxMethod) == null) {
          WalletSolidityGrpc.getGetBurnTrxMethod = getGetBurnTrxMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBurnTrx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetBurnTrx"))
              .build();
        }
      }
    }
    return getGetBurnTrxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BlockReq,
      org.example.api.GrpcAPI.BlockExtention> getGetBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlock",
      requestType = org.example.api.GrpcAPI.BlockReq.class,
      responseType = org.example.api.GrpcAPI.BlockExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BlockReq,
      org.example.api.GrpcAPI.BlockExtention> getGetBlockMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BlockReq, org.example.api.GrpcAPI.BlockExtention> getGetBlockMethod;
    if ((getGetBlockMethod = WalletSolidityGrpc.getGetBlockMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetBlockMethod = WalletSolidityGrpc.getGetBlockMethod) == null) {
          WalletSolidityGrpc.getGetBlockMethod = getGetBlockMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BlockReq, org.example.api.GrpcAPI.BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BlockReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BlockExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetBlock"))
              .build();
        }
      }
    }
    return getGetBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.PricesResponseMessage> getGetBandwidthPricesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBandwidthPrices",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.PricesResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.PricesResponseMessage> getGetBandwidthPricesMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.PricesResponseMessage> getGetBandwidthPricesMethod;
    if ((getGetBandwidthPricesMethod = WalletSolidityGrpc.getGetBandwidthPricesMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetBandwidthPricesMethod = WalletSolidityGrpc.getGetBandwidthPricesMethod) == null) {
          WalletSolidityGrpc.getGetBandwidthPricesMethod = getGetBandwidthPricesMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.PricesResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBandwidthPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.PricesResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetBandwidthPrices"))
              .build();
        }
      }
    }
    return getGetBandwidthPricesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.PricesResponseMessage> getGetEnergyPricesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnergyPrices",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.PricesResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.PricesResponseMessage> getGetEnergyPricesMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.PricesResponseMessage> getGetEnergyPricesMethod;
    if ((getGetEnergyPricesMethod = WalletSolidityGrpc.getGetEnergyPricesMethod) == null) {
      synchronized (WalletSolidityGrpc.class) {
        if ((getGetEnergyPricesMethod = WalletSolidityGrpc.getGetEnergyPricesMethod) == null) {
          WalletSolidityGrpc.getGetEnergyPricesMethod = getGetEnergyPricesMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.PricesResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnergyPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.PricesResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletSolidityMethodDescriptorSupplier("GetEnergyPrices"))
              .build();
        }
      }
    }
    return getGetEnergyPricesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletSolidityStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletSolidityStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletSolidityStub>() {
        @java.lang.Override
        public WalletSolidityStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletSolidityStub(channel, callOptions);
        }
      };
    return WalletSolidityStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletSolidityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletSolidityBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletSolidityBlockingStub>() {
        @java.lang.Override
        public WalletSolidityBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletSolidityBlockingStub(channel, callOptions);
        }
      };
    return WalletSolidityBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletSolidityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletSolidityFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletSolidityFutureStub>() {
        @java.lang.Override
        public WalletSolidityFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletSolidityFutureStub(channel, callOptions);
        }
      };
    return WalletSolidityFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAccount(org.example.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Account> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    default void getAccountById(org.example.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Account> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountByIdMethod(), responseObserver);
    }

    /**
     */
    default void listWitnesses(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.WitnessList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWitnessesMethod(), responseObserver);
    }

    /**
     */
    default void getAssetIssueList(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AssetIssueList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetIssueListMethod(), responseObserver);
    }

    /**
     */
    default void getPaginatedAssetIssueList(org.example.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AssetIssueList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPaginatedAssetIssueListMethod(), responseObserver);
    }

    /**
     */
    default void getAssetIssueByName(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetIssueByNameMethod(), responseObserver);
    }

    /**
     */
    default void getAssetIssueListByName(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AssetIssueList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetIssueListByNameMethod(), responseObserver);
    }

    /**
     */
    default void getAssetIssueById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetIssueByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     *Please use GetNowBlock2 instead of this function.
     * </pre>
     */
    default void getNowBlock(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Block> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNowBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetNowBlock.
     * </pre>
     */
    default void getNowBlock2(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNowBlock2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use GetBlockByNum2 instead of this function.
     * </pre>
     */
    default void getBlockByNum(org.example.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Block> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByNumMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    default void getBlockByNum2(org.example.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByNum2Method(), responseObserver);
    }

    /**
     */
    default void getTransactionCountByBlockNum(org.example.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionCountByBlockNumMethod(), responseObserver);
    }

    /**
     */
    default void getDelegatedResource(org.example.api.GrpcAPI.DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DelegatedResourceList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegatedResourceMethod(), responseObserver);
    }

    /**
     */
    default void getDelegatedResourceV2(org.example.api.GrpcAPI.DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DelegatedResourceList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegatedResourceV2Method(), responseObserver);
    }

    /**
     */
    default void getDelegatedResourceAccountIndex(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.DelegatedResourceAccountIndex> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegatedResourceAccountIndexMethod(), responseObserver);
    }

    /**
     */
    default void getDelegatedResourceAccountIndexV2(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.DelegatedResourceAccountIndex> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegatedResourceAccountIndexV2Method(), responseObserver);
    }

    /**
     */
    default void getCanDelegatedMaxSize(org.example.api.GrpcAPI.CanDelegatedMaxSizeRequestMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.CanDelegatedMaxSizeResponseMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCanDelegatedMaxSizeMethod(), responseObserver);
    }

    /**
     */
    default void getAvailableUnfreezeCount(org.example.api.GrpcAPI.GetAvailableUnfreezeCountRequestMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.GetAvailableUnfreezeCountResponseMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailableUnfreezeCountMethod(), responseObserver);
    }

    /**
     */
    default void getCanWithdrawUnfreezeAmount(org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCanWithdrawUnfreezeAmountMethod(), responseObserver);
    }

    /**
     */
    default void getExchangeById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Exchange> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExchangeByIdMethod(), responseObserver);
    }

    /**
     */
    default void listExchanges(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ExchangeList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListExchangesMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionByIdMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionInfoById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.TransactionInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionInfoByIdMethod(), responseObserver);
    }

    /**
     */
    default void getMerkleTreeVoucherInfo(org.example.protos.contract.ShieldContract.OutputPointInfo request,
        io.grpc.stub.StreamObserver<org.example.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMerkleTreeVoucherInfoMethod(), responseObserver);
    }

    /**
     */
    default void scanNoteByIvk(org.example.api.GrpcAPI.IvkDecryptParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DecryptNotes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanNoteByIvkMethod(), responseObserver);
    }

    /**
     */
    default void scanAndMarkNoteByIvk(org.example.api.GrpcAPI.IvkDecryptAndMarkParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DecryptNotesMarked> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanAndMarkNoteByIvkMethod(), responseObserver);
    }

    /**
     */
    default void scanNoteByOvk(org.example.api.GrpcAPI.OvkDecryptParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DecryptNotes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanNoteByOvkMethod(), responseObserver);
    }

    /**
     */
    default void isSpend(org.example.api.GrpcAPI.NoteParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.SpendResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsSpendMethod(), responseObserver);
    }

    /**
     */
    default void scanShieldedTRC20NotesByIvk(org.example.api.GrpcAPI.IvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DecryptNotesTRC20> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanShieldedTRC20NotesByIvkMethod(), responseObserver);
    }

    /**
     */
    default void scanShieldedTRC20NotesByOvk(org.example.api.GrpcAPI.OvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DecryptNotesTRC20> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanShieldedTRC20NotesByOvkMethod(), responseObserver);
    }

    /**
     */
    default void isShieldedTRC20ContractNoteSpent(org.example.api.GrpcAPI.NfTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NullifierResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsShieldedTRC20ContractNoteSpentMethod(), responseObserver);
    }

    /**
     */
    default void getRewardInfo(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRewardInfoMethod(), responseObserver);
    }

    /**
     */
    default void getBrokerageInfo(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBrokerageInfoMethod(), responseObserver);
    }

    /**
     */
    default void triggerConstantContract(org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTriggerConstantContractMethod(), responseObserver);
    }

    /**
     */
    default void estimateEnergy(org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.EstimateEnergyMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateEnergyMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionInfoByBlockNum(org.example.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionInfoList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionInfoByBlockNumMethod(), responseObserver);
    }

    /**
     */
    default void getMarketOrderById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.MarketOrder> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketOrderByIdMethod(), responseObserver);
    }

    /**
     */
    default void getMarketOrderByAccount(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.MarketOrderList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketOrderByAccountMethod(), responseObserver);
    }

    /**
     */
    default void getMarketPriceByPair(org.example.protos.Protocol.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.MarketPriceList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketPriceByPairMethod(), responseObserver);
    }

    /**
     */
    default void getMarketOrderListByPair(org.example.protos.Protocol.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.MarketOrderList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketOrderListByPairMethod(), responseObserver);
    }

    /**
     */
    default void getMarketPairList(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.MarketOrderPairList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketPairListMethod(), responseObserver);
    }

    /**
     */
    default void getBurnTrx(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBurnTrxMethod(), responseObserver);
    }

    /**
     */
    default void getBlock(org.example.api.GrpcAPI.BlockReq request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockMethod(), responseObserver);
    }

    /**
     */
    default void getBandwidthPrices(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.PricesResponseMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBandwidthPricesMethod(), responseObserver);
    }

    /**
     */
    default void getEnergyPrices(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.PricesResponseMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEnergyPricesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WalletSolidity.
   */
  public static abstract class WalletSolidityImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WalletSolidityGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WalletSolidity.
   */
  public static final class WalletSolidityStub
      extends io.grpc.stub.AbstractAsyncStub<WalletSolidityStub> {
    private WalletSolidityStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletSolidityStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletSolidityStub(channel, callOptions);
    }

    /**
     */
    public void getAccount(org.example.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Account> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountById(org.example.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Account> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWitnesses(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.WitnessList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWitnessesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueList(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AssetIssueList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedAssetIssueList(org.example.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AssetIssueList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPaginatedAssetIssueListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueByName(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueListByName(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AssetIssueList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueListByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use GetNowBlock2 instead of this function.
     * </pre>
     */
    public void getNowBlock(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Block> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetNowBlock.
     * </pre>
     */
    public void getNowBlock2(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNowBlock2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use GetBlockByNum2 instead of this function.
     * </pre>
     */
    public void getBlockByNum(org.example.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Block> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public void getBlockByNum2(org.example.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByNum2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionCountByBlockNum(org.example.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionCountByBlockNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResource(org.example.api.GrpcAPI.DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DelegatedResourceList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResourceV2(org.example.api.GrpcAPI.DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DelegatedResourceList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResourceAccountIndex(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.DelegatedResourceAccountIndex> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResourceAccountIndexV2(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.DelegatedResourceAccountIndex> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCanDelegatedMaxSize(org.example.api.GrpcAPI.CanDelegatedMaxSizeRequestMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.CanDelegatedMaxSizeResponseMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCanDelegatedMaxSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAvailableUnfreezeCount(org.example.api.GrpcAPI.GetAvailableUnfreezeCountRequestMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.GetAvailableUnfreezeCountResponseMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAvailableUnfreezeCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCanWithdrawUnfreezeAmount(org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCanWithdrawUnfreezeAmountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExchangeById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Exchange> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExchangeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listExchanges(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ExchangeList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListExchangesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionInfoById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.TransactionInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionInfoByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMerkleTreeVoucherInfo(org.example.protos.contract.ShieldContract.OutputPointInfo request,
        io.grpc.stub.StreamObserver<org.example.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMerkleTreeVoucherInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanNoteByIvk(org.example.api.GrpcAPI.IvkDecryptParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DecryptNotes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanNoteByIvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanAndMarkNoteByIvk(org.example.api.GrpcAPI.IvkDecryptAndMarkParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DecryptNotesMarked> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanAndMarkNoteByIvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanNoteByOvk(org.example.api.GrpcAPI.OvkDecryptParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DecryptNotes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanNoteByOvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isSpend(org.example.api.GrpcAPI.NoteParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.SpendResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsSpendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanShieldedTRC20NotesByIvk(org.example.api.GrpcAPI.IvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DecryptNotesTRC20> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByIvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanShieldedTRC20NotesByOvk(org.example.api.GrpcAPI.OvkDecryptTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DecryptNotesTRC20> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByOvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isShieldedTRC20ContractNoteSpent(org.example.api.GrpcAPI.NfTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NullifierResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRewardInfo(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRewardInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBrokerageInfo(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBrokerageInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerConstantContract(org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTriggerConstantContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void estimateEnergy(org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.EstimateEnergyMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateEnergyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionInfoByBlockNum(org.example.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionInfoList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionInfoByBlockNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketOrderById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.MarketOrder> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketOrderByAccount(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.MarketOrderList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketPriceByPair(org.example.protos.Protocol.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.MarketPriceList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketPriceByPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketOrderListByPair(org.example.protos.Protocol.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.MarketOrderList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderListByPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketPairList(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.MarketOrderPairList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketPairListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBurnTrx(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBurnTrxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlock(org.example.api.GrpcAPI.BlockReq request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBandwidthPrices(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.PricesResponseMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBandwidthPricesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEnergyPrices(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.PricesResponseMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEnergyPricesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WalletSolidity.
   */
  public static final class WalletSolidityBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WalletSolidityBlockingStub> {
    private WalletSolidityBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletSolidityBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletSolidityBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.protos.Protocol.Account getAccount(org.example.protos.Protocol.Account request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.Account getAccountById(org.example.protos.Protocol.Account request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.WitnessList listWitnesses(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWitnessesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.AssetIssueList getAssetIssueList(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetIssueListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.AssetIssueList getPaginatedAssetIssueList(org.example.api.GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPaginatedAssetIssueListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract getAssetIssueByName(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetIssueByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.AssetIssueList getAssetIssueListByName(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetIssueListByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract getAssetIssueById(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetIssueByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use GetNowBlock2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Block getNowBlock(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNowBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of GetNowBlock.
     * </pre>
     */
    public org.example.api.GrpcAPI.BlockExtention getNowBlock2(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNowBlock2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use GetBlockByNum2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Block getBlockByNum(org.example.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByNumMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public org.example.api.GrpcAPI.BlockExtention getBlockByNum2(org.example.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByNum2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.NumberMessage getTransactionCountByBlockNum(org.example.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionCountByBlockNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.DelegatedResourceList getDelegatedResource(org.example.api.GrpcAPI.DelegatedResourceMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegatedResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.DelegatedResourceList getDelegatedResourceV2(org.example.api.GrpcAPI.DelegatedResourceMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegatedResourceV2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.DelegatedResourceAccountIndex getDelegatedResourceAccountIndex(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegatedResourceAccountIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.DelegatedResourceAccountIndex getDelegatedResourceAccountIndexV2(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegatedResourceAccountIndexV2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.CanDelegatedMaxSizeResponseMessage getCanDelegatedMaxSize(org.example.api.GrpcAPI.CanDelegatedMaxSizeRequestMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCanDelegatedMaxSizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.GetAvailableUnfreezeCountResponseMessage getAvailableUnfreezeCount(org.example.api.GrpcAPI.GetAvailableUnfreezeCountRequestMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailableUnfreezeCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage getCanWithdrawUnfreezeAmount(org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCanWithdrawUnfreezeAmountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.Exchange getExchangeById(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExchangeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.ExchangeList listExchanges(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListExchangesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.Transaction getTransactionById(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.TransactionInfo getTransactionInfoById(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionInfoByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo getMerkleTreeVoucherInfo(org.example.protos.contract.ShieldContract.OutputPointInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMerkleTreeVoucherInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.DecryptNotes scanNoteByIvk(org.example.api.GrpcAPI.IvkDecryptParameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanNoteByIvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.DecryptNotesMarked scanAndMarkNoteByIvk(org.example.api.GrpcAPI.IvkDecryptAndMarkParameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanAndMarkNoteByIvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.DecryptNotes scanNoteByOvk(org.example.api.GrpcAPI.OvkDecryptParameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanNoteByOvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.SpendResult isSpend(org.example.api.GrpcAPI.NoteParameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsSpendMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.DecryptNotesTRC20 scanShieldedTRC20NotesByIvk(org.example.api.GrpcAPI.IvkDecryptTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanShieldedTRC20NotesByIvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.DecryptNotesTRC20 scanShieldedTRC20NotesByOvk(org.example.api.GrpcAPI.OvkDecryptTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanShieldedTRC20NotesByOvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.NullifierResult isShieldedTRC20ContractNoteSpent(org.example.api.GrpcAPI.NfTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.NumberMessage getRewardInfo(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRewardInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.NumberMessage getBrokerageInfo(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBrokerageInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention triggerConstantContract(org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTriggerConstantContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.EstimateEnergyMessage estimateEnergy(org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateEnergyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionInfoList getTransactionInfoByBlockNum(org.example.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionInfoByBlockNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.MarketOrder getMarketOrderById(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketOrderByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.MarketOrderList getMarketOrderByAccount(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketOrderByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.MarketPriceList getMarketPriceByPair(org.example.protos.Protocol.MarketOrderPair request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketPriceByPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.MarketOrderList getMarketOrderListByPair(org.example.protos.Protocol.MarketOrderPair request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketOrderListByPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.MarketOrderPairList getMarketPairList(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketPairListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.NumberMessage getBurnTrx(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBurnTrxMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.BlockExtention getBlock(org.example.api.GrpcAPI.BlockReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.PricesResponseMessage getBandwidthPrices(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBandwidthPricesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.PricesResponseMessage getEnergyPrices(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEnergyPricesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WalletSolidity.
   */
  public static final class WalletSolidityFutureStub
      extends io.grpc.stub.AbstractFutureStub<WalletSolidityFutureStub> {
    private WalletSolidityFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletSolidityFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletSolidityFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Account> getAccount(
        org.example.protos.Protocol.Account request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Account> getAccountById(
        org.example.protos.Protocol.Account request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.WitnessList> listWitnesses(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWitnessesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.AssetIssueList> getAssetIssueList(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetIssueListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.AssetIssueList> getPaginatedAssetIssueList(
        org.example.api.GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPaginatedAssetIssueListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getAssetIssueByName(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.AssetIssueList> getAssetIssueListByName(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetIssueListByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract> getAssetIssueById(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use GetNowBlock2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Block> getNowBlock(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of GetNowBlock.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BlockExtention> getNowBlock2(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNowBlock2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use GetBlockByNum2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Block> getBlockByNum(
        org.example.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BlockExtention> getBlockByNum2(
        org.example.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByNum2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.NumberMessage> getTransactionCountByBlockNum(
        org.example.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionCountByBlockNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.DelegatedResourceList> getDelegatedResource(
        org.example.api.GrpcAPI.DelegatedResourceMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.DelegatedResourceList> getDelegatedResourceV2(
        org.example.api.GrpcAPI.DelegatedResourceMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceV2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.DelegatedResourceAccountIndex> getDelegatedResourceAccountIndex(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.DelegatedResourceAccountIndex> getDelegatedResourceAccountIndexV2(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexV2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.CanDelegatedMaxSizeResponseMessage> getCanDelegatedMaxSize(
        org.example.api.GrpcAPI.CanDelegatedMaxSizeRequestMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCanDelegatedMaxSizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.GetAvailableUnfreezeCountResponseMessage> getAvailableUnfreezeCount(
        org.example.api.GrpcAPI.GetAvailableUnfreezeCountRequestMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAvailableUnfreezeCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> getCanWithdrawUnfreezeAmount(
        org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCanWithdrawUnfreezeAmountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Exchange> getExchangeById(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExchangeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.ExchangeList> listExchanges(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListExchangesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> getTransactionById(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.TransactionInfo> getTransactionInfoById(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionInfoByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo> getMerkleTreeVoucherInfo(
        org.example.protos.contract.ShieldContract.OutputPointInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMerkleTreeVoucherInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.DecryptNotes> scanNoteByIvk(
        org.example.api.GrpcAPI.IvkDecryptParameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanNoteByIvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.DecryptNotesMarked> scanAndMarkNoteByIvk(
        org.example.api.GrpcAPI.IvkDecryptAndMarkParameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanAndMarkNoteByIvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.DecryptNotes> scanNoteByOvk(
        org.example.api.GrpcAPI.OvkDecryptParameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanNoteByOvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.SpendResult> isSpend(
        org.example.api.GrpcAPI.NoteParameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsSpendMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.DecryptNotesTRC20> scanShieldedTRC20NotesByIvk(
        org.example.api.GrpcAPI.IvkDecryptTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByIvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.DecryptNotesTRC20> scanShieldedTRC20NotesByOvk(
        org.example.api.GrpcAPI.OvkDecryptTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByOvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.NullifierResult> isShieldedTRC20ContractNoteSpent(
        org.example.api.GrpcAPI.NfTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.NumberMessage> getRewardInfo(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRewardInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.NumberMessage> getBrokerageInfo(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBrokerageInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> triggerConstantContract(
        org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTriggerConstantContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.EstimateEnergyMessage> estimateEnergy(
        org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateEnergyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionInfoList> getTransactionInfoByBlockNum(
        org.example.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionInfoByBlockNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.MarketOrder> getMarketOrderById(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketOrderByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.MarketOrderList> getMarketOrderByAccount(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketOrderByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.MarketPriceList> getMarketPriceByPair(
        org.example.protos.Protocol.MarketOrderPair request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketPriceByPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.MarketOrderList> getMarketOrderListByPair(
        org.example.protos.Protocol.MarketOrderPair request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketOrderListByPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.MarketOrderPairList> getMarketPairList(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketPairListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.NumberMessage> getBurnTrx(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBurnTrxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BlockExtention> getBlock(
        org.example.api.GrpcAPI.BlockReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.PricesResponseMessage> getBandwidthPrices(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBandwidthPricesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.PricesResponseMessage> getEnergyPrices(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEnergyPricesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCOUNT = 0;
  private static final int METHODID_GET_ACCOUNT_BY_ID = 1;
  private static final int METHODID_LIST_WITNESSES = 2;
  private static final int METHODID_GET_ASSET_ISSUE_LIST = 3;
  private static final int METHODID_GET_PAGINATED_ASSET_ISSUE_LIST = 4;
  private static final int METHODID_GET_ASSET_ISSUE_BY_NAME = 5;
  private static final int METHODID_GET_ASSET_ISSUE_LIST_BY_NAME = 6;
  private static final int METHODID_GET_ASSET_ISSUE_BY_ID = 7;
  private static final int METHODID_GET_NOW_BLOCK = 8;
  private static final int METHODID_GET_NOW_BLOCK2 = 9;
  private static final int METHODID_GET_BLOCK_BY_NUM = 10;
  private static final int METHODID_GET_BLOCK_BY_NUM2 = 11;
  private static final int METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM = 12;
  private static final int METHODID_GET_DELEGATED_RESOURCE = 13;
  private static final int METHODID_GET_DELEGATED_RESOURCE_V2 = 14;
  private static final int METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX = 15;
  private static final int METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX_V2 = 16;
  private static final int METHODID_GET_CAN_DELEGATED_MAX_SIZE = 17;
  private static final int METHODID_GET_AVAILABLE_UNFREEZE_COUNT = 18;
  private static final int METHODID_GET_CAN_WITHDRAW_UNFREEZE_AMOUNT = 19;
  private static final int METHODID_GET_EXCHANGE_BY_ID = 20;
  private static final int METHODID_LIST_EXCHANGES = 21;
  private static final int METHODID_GET_TRANSACTION_BY_ID = 22;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_ID = 23;
  private static final int METHODID_GET_MERKLE_TREE_VOUCHER_INFO = 24;
  private static final int METHODID_SCAN_NOTE_BY_IVK = 25;
  private static final int METHODID_SCAN_AND_MARK_NOTE_BY_IVK = 26;
  private static final int METHODID_SCAN_NOTE_BY_OVK = 27;
  private static final int METHODID_IS_SPEND = 28;
  private static final int METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK = 29;
  private static final int METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK = 30;
  private static final int METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT = 31;
  private static final int METHODID_GET_REWARD_INFO = 32;
  private static final int METHODID_GET_BROKERAGE_INFO = 33;
  private static final int METHODID_TRIGGER_CONSTANT_CONTRACT = 34;
  private static final int METHODID_ESTIMATE_ENERGY = 35;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM = 36;
  private static final int METHODID_GET_MARKET_ORDER_BY_ID = 37;
  private static final int METHODID_GET_MARKET_ORDER_BY_ACCOUNT = 38;
  private static final int METHODID_GET_MARKET_PRICE_BY_PAIR = 39;
  private static final int METHODID_GET_MARKET_ORDER_LIST_BY_PAIR = 40;
  private static final int METHODID_GET_MARKET_PAIR_LIST = 41;
  private static final int METHODID_GET_BURN_TRX = 42;
  private static final int METHODID_GET_BLOCK = 43;
  private static final int METHODID_GET_BANDWIDTH_PRICES = 44;
  private static final int METHODID_GET_ENERGY_PRICES = 45;

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
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((org.example.protos.Protocol.Account) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Account>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_BY_ID:
          serviceImpl.getAccountById((org.example.protos.Protocol.Account) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Account>) responseObserver);
          break;
        case METHODID_LIST_WITNESSES:
          serviceImpl.listWitnesses((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.WitnessList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_LIST:
          serviceImpl.getAssetIssueList((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_ASSET_ISSUE_LIST:
          serviceImpl.getPaginatedAssetIssueList((org.example.api.GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_NAME:
          serviceImpl.getAssetIssueByName((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_LIST_BY_NAME:
          serviceImpl.getAssetIssueListByName((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_ID:
          serviceImpl.getAssetIssueById((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract>) responseObserver);
          break;
        case METHODID_GET_NOW_BLOCK:
          serviceImpl.getNowBlock((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Block>) responseObserver);
          break;
        case METHODID_GET_NOW_BLOCK2:
          serviceImpl.getNowBlock2((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUM:
          serviceImpl.getBlockByNum((org.example.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Block>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUM2:
          serviceImpl.getBlockByNum2((org.example.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockExtention>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM:
          serviceImpl.getTransactionCountByBlockNum((org.example.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE:
          serviceImpl.getDelegatedResource((org.example.api.GrpcAPI.DelegatedResourceMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DelegatedResourceList>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE_V2:
          serviceImpl.getDelegatedResourceV2((org.example.api.GrpcAPI.DelegatedResourceMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DelegatedResourceList>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX:
          serviceImpl.getDelegatedResourceAccountIndex((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.DelegatedResourceAccountIndex>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX_V2:
          serviceImpl.getDelegatedResourceAccountIndexV2((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.DelegatedResourceAccountIndex>) responseObserver);
          break;
        case METHODID_GET_CAN_DELEGATED_MAX_SIZE:
          serviceImpl.getCanDelegatedMaxSize((org.example.api.GrpcAPI.CanDelegatedMaxSizeRequestMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.CanDelegatedMaxSizeResponseMessage>) responseObserver);
          break;
        case METHODID_GET_AVAILABLE_UNFREEZE_COUNT:
          serviceImpl.getAvailableUnfreezeCount((org.example.api.GrpcAPI.GetAvailableUnfreezeCountRequestMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.GetAvailableUnfreezeCountResponseMessage>) responseObserver);
          break;
        case METHODID_GET_CAN_WITHDRAW_UNFREEZE_AMOUNT:
          serviceImpl.getCanWithdrawUnfreezeAmount((org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage>) responseObserver);
          break;
        case METHODID_GET_EXCHANGE_BY_ID:
          serviceImpl.getExchangeById((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Exchange>) responseObserver);
          break;
        case METHODID_LIST_EXCHANGES:
          serviceImpl.listExchanges((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ExchangeList>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_BY_ID:
          serviceImpl.getTransactionById((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_ID:
          serviceImpl.getTransactionInfoById((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.TransactionInfo>) responseObserver);
          break;
        case METHODID_GET_MERKLE_TREE_VOUCHER_INFO:
          serviceImpl.getMerkleTreeVoucherInfo((org.example.protos.contract.ShieldContract.OutputPointInfo) request,
              (io.grpc.stub.StreamObserver<org.example.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo>) responseObserver);
          break;
        case METHODID_SCAN_NOTE_BY_IVK:
          serviceImpl.scanNoteByIvk((org.example.api.GrpcAPI.IvkDecryptParameters) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DecryptNotes>) responseObserver);
          break;
        case METHODID_SCAN_AND_MARK_NOTE_BY_IVK:
          serviceImpl.scanAndMarkNoteByIvk((org.example.api.GrpcAPI.IvkDecryptAndMarkParameters) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DecryptNotesMarked>) responseObserver);
          break;
        case METHODID_SCAN_NOTE_BY_OVK:
          serviceImpl.scanNoteByOvk((org.example.api.GrpcAPI.OvkDecryptParameters) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DecryptNotes>) responseObserver);
          break;
        case METHODID_IS_SPEND:
          serviceImpl.isSpend((org.example.api.GrpcAPI.NoteParameters) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.SpendResult>) responseObserver);
          break;
        case METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK:
          serviceImpl.scanShieldedTRC20NotesByIvk((org.example.api.GrpcAPI.IvkDecryptTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DecryptNotesTRC20>) responseObserver);
          break;
        case METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK:
          serviceImpl.scanShieldedTRC20NotesByOvk((org.example.api.GrpcAPI.OvkDecryptTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DecryptNotesTRC20>) responseObserver);
          break;
        case METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT:
          serviceImpl.isShieldedTRC20ContractNoteSpent((org.example.api.GrpcAPI.NfTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NullifierResult>) responseObserver);
          break;
        case METHODID_GET_REWARD_INFO:
          serviceImpl.getRewardInfo((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_BROKERAGE_INFO:
          serviceImpl.getBrokerageInfo((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_TRIGGER_CONSTANT_CONTRACT:
          serviceImpl.triggerConstantContract((org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_ESTIMATE_ENERGY:
          serviceImpl.estimateEnergy((org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.EstimateEnergyMessage>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM:
          serviceImpl.getTransactionInfoByBlockNum((org.example.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionInfoList>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_BY_ID:
          serviceImpl.getMarketOrderById((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.MarketOrder>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_BY_ACCOUNT:
          serviceImpl.getMarketOrderByAccount((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.MarketOrderList>) responseObserver);
          break;
        case METHODID_GET_MARKET_PRICE_BY_PAIR:
          serviceImpl.getMarketPriceByPair((org.example.protos.Protocol.MarketOrderPair) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.MarketPriceList>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_LIST_BY_PAIR:
          serviceImpl.getMarketOrderListByPair((org.example.protos.Protocol.MarketOrderPair) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.MarketOrderList>) responseObserver);
          break;
        case METHODID_GET_MARKET_PAIR_LIST:
          serviceImpl.getMarketPairList((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.MarketOrderPairList>) responseObserver);
          break;
        case METHODID_GET_BURN_TRX:
          serviceImpl.getBurnTrx((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_BLOCK:
          serviceImpl.getBlock((org.example.api.GrpcAPI.BlockReq) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockExtention>) responseObserver);
          break;
        case METHODID_GET_BANDWIDTH_PRICES:
          serviceImpl.getBandwidthPrices((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.PricesResponseMessage>) responseObserver);
          break;
        case METHODID_GET_ENERGY_PRICES:
          serviceImpl.getEnergyPrices((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.PricesResponseMessage>) responseObserver);
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
          getGetAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.Protocol.Account,
              org.example.protos.Protocol.Account>(
                service, METHODID_GET_ACCOUNT)))
        .addMethod(
          getGetAccountByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.Protocol.Account,
              org.example.protos.Protocol.Account>(
                service, METHODID_GET_ACCOUNT_BY_ID)))
        .addMethod(
          getListWitnessesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.WitnessList>(
                service, METHODID_LIST_WITNESSES)))
        .addMethod(
          getGetAssetIssueListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.AssetIssueList>(
                service, METHODID_GET_ASSET_ISSUE_LIST)))
        .addMethod(
          getGetPaginatedAssetIssueListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.PaginatedMessage,
              org.example.api.GrpcAPI.AssetIssueList>(
                service, METHODID_GET_PAGINATED_ASSET_ISSUE_LIST)))
        .addMethod(
          getGetAssetIssueByNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract>(
                service, METHODID_GET_ASSET_ISSUE_BY_NAME)))
        .addMethod(
          getGetAssetIssueListByNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.api.GrpcAPI.AssetIssueList>(
                service, METHODID_GET_ASSET_ISSUE_LIST_BY_NAME)))
        .addMethod(
          getGetAssetIssueByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract>(
                service, METHODID_GET_ASSET_ISSUE_BY_ID)))
        .addMethod(
          getGetNowBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.protos.Protocol.Block>(
                service, METHODID_GET_NOW_BLOCK)))
        .addMethod(
          getGetNowBlock2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.BlockExtention>(
                service, METHODID_GET_NOW_BLOCK2)))
        .addMethod(
          getGetBlockByNumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.NumberMessage,
              org.example.protos.Protocol.Block>(
                service, METHODID_GET_BLOCK_BY_NUM)))
        .addMethod(
          getGetBlockByNum2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.NumberMessage,
              org.example.api.GrpcAPI.BlockExtention>(
                service, METHODID_GET_BLOCK_BY_NUM2)))
        .addMethod(
          getGetTransactionCountByBlockNumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.NumberMessage,
              org.example.api.GrpcAPI.NumberMessage>(
                service, METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM)))
        .addMethod(
          getGetDelegatedResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.DelegatedResourceMessage,
              org.example.api.GrpcAPI.DelegatedResourceList>(
                service, METHODID_GET_DELEGATED_RESOURCE)))
        .addMethod(
          getGetDelegatedResourceV2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.DelegatedResourceMessage,
              org.example.api.GrpcAPI.DelegatedResourceList>(
                service, METHODID_GET_DELEGATED_RESOURCE_V2)))
        .addMethod(
          getGetDelegatedResourceAccountIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.Protocol.DelegatedResourceAccountIndex>(
                service, METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX)))
        .addMethod(
          getGetDelegatedResourceAccountIndexV2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.Protocol.DelegatedResourceAccountIndex>(
                service, METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX_V2)))
        .addMethod(
          getGetCanDelegatedMaxSizeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.CanDelegatedMaxSizeRequestMessage,
              org.example.api.GrpcAPI.CanDelegatedMaxSizeResponseMessage>(
                service, METHODID_GET_CAN_DELEGATED_MAX_SIZE)))
        .addMethod(
          getGetAvailableUnfreezeCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.GetAvailableUnfreezeCountRequestMessage,
              org.example.api.GrpcAPI.GetAvailableUnfreezeCountResponseMessage>(
                service, METHODID_GET_AVAILABLE_UNFREEZE_COUNT)))
        .addMethod(
          getGetCanWithdrawUnfreezeAmountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage,
              org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage>(
                service, METHODID_GET_CAN_WITHDRAW_UNFREEZE_AMOUNT)))
        .addMethod(
          getGetExchangeByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.Protocol.Exchange>(
                service, METHODID_GET_EXCHANGE_BY_ID)))
        .addMethod(
          getListExchangesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.ExchangeList>(
                service, METHODID_LIST_EXCHANGES)))
        .addMethod(
          getGetTransactionByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_GET_TRANSACTION_BY_ID)))
        .addMethod(
          getGetTransactionInfoByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.Protocol.TransactionInfo>(
                service, METHODID_GET_TRANSACTION_INFO_BY_ID)))
        .addMethod(
          getGetMerkleTreeVoucherInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.ShieldContract.OutputPointInfo,
              org.example.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo>(
                service, METHODID_GET_MERKLE_TREE_VOUCHER_INFO)))
        .addMethod(
          getScanNoteByIvkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.IvkDecryptParameters,
              org.example.api.GrpcAPI.DecryptNotes>(
                service, METHODID_SCAN_NOTE_BY_IVK)))
        .addMethod(
          getScanAndMarkNoteByIvkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.IvkDecryptAndMarkParameters,
              org.example.api.GrpcAPI.DecryptNotesMarked>(
                service, METHODID_SCAN_AND_MARK_NOTE_BY_IVK)))
        .addMethod(
          getScanNoteByOvkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.OvkDecryptParameters,
              org.example.api.GrpcAPI.DecryptNotes>(
                service, METHODID_SCAN_NOTE_BY_OVK)))
        .addMethod(
          getIsSpendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.NoteParameters,
              org.example.api.GrpcAPI.SpendResult>(
                service, METHODID_IS_SPEND)))
        .addMethod(
          getScanShieldedTRC20NotesByIvkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.IvkDecryptTRC20Parameters,
              org.example.api.GrpcAPI.DecryptNotesTRC20>(
                service, METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK)))
        .addMethod(
          getScanShieldedTRC20NotesByOvkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.OvkDecryptTRC20Parameters,
              org.example.api.GrpcAPI.DecryptNotesTRC20>(
                service, METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK)))
        .addMethod(
          getIsShieldedTRC20ContractNoteSpentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.NfTRC20Parameters,
              org.example.api.GrpcAPI.NullifierResult>(
                service, METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT)))
        .addMethod(
          getGetRewardInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.api.GrpcAPI.NumberMessage>(
                service, METHODID_GET_REWARD_INFO)))
        .addMethod(
          getGetBrokerageInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.api.GrpcAPI.NumberMessage>(
                service, METHODID_GET_BROKERAGE_INFO)))
        .addMethod(
          getTriggerConstantContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_TRIGGER_CONSTANT_CONTRACT)))
        .addMethod(
          getEstimateEnergyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract,
              org.example.api.GrpcAPI.EstimateEnergyMessage>(
                service, METHODID_ESTIMATE_ENERGY)))
        .addMethod(
          getGetTransactionInfoByBlockNumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.NumberMessage,
              org.example.api.GrpcAPI.TransactionInfoList>(
                service, METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM)))
        .addMethod(
          getGetMarketOrderByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.Protocol.MarketOrder>(
                service, METHODID_GET_MARKET_ORDER_BY_ID)))
        .addMethod(
          getGetMarketOrderByAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.Protocol.MarketOrderList>(
                service, METHODID_GET_MARKET_ORDER_BY_ACCOUNT)))
        .addMethod(
          getGetMarketPriceByPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.Protocol.MarketOrderPair,
              org.example.protos.Protocol.MarketPriceList>(
                service, METHODID_GET_MARKET_PRICE_BY_PAIR)))
        .addMethod(
          getGetMarketOrderListByPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.Protocol.MarketOrderPair,
              org.example.protos.Protocol.MarketOrderList>(
                service, METHODID_GET_MARKET_ORDER_LIST_BY_PAIR)))
        .addMethod(
          getGetMarketPairListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.protos.Protocol.MarketOrderPairList>(
                service, METHODID_GET_MARKET_PAIR_LIST)))
        .addMethod(
          getGetBurnTrxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.NumberMessage>(
                service, METHODID_GET_BURN_TRX)))
        .addMethod(
          getGetBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BlockReq,
              org.example.api.GrpcAPI.BlockExtention>(
                service, METHODID_GET_BLOCK)))
        .addMethod(
          getGetBandwidthPricesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.PricesResponseMessage>(
                service, METHODID_GET_BANDWIDTH_PRICES)))
        .addMethod(
          getGetEnergyPricesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.PricesResponseMessage>(
                service, METHODID_GET_ENERGY_PRICES)))
        .build();
  }

  private static abstract class WalletSolidityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletSolidityBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.api.GrpcAPI.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WalletSolidity");
    }
  }

  private static final class WalletSolidityFileDescriptorSupplier
      extends WalletSolidityBaseDescriptorSupplier {
    WalletSolidityFileDescriptorSupplier() {}
  }

  private static final class WalletSolidityMethodDescriptorSupplier
      extends WalletSolidityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WalletSolidityMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WalletSolidityGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WalletSolidityFileDescriptorSupplier())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetAccountByIdMethod())
              .addMethod(getListWitnessesMethod())
              .addMethod(getGetAssetIssueListMethod())
              .addMethod(getGetPaginatedAssetIssueListMethod())
              .addMethod(getGetAssetIssueByNameMethod())
              .addMethod(getGetAssetIssueListByNameMethod())
              .addMethod(getGetAssetIssueByIdMethod())
              .addMethod(getGetNowBlockMethod())
              .addMethod(getGetNowBlock2Method())
              .addMethod(getGetBlockByNumMethod())
              .addMethod(getGetBlockByNum2Method())
              .addMethod(getGetTransactionCountByBlockNumMethod())
              .addMethod(getGetDelegatedResourceMethod())
              .addMethod(getGetDelegatedResourceV2Method())
              .addMethod(getGetDelegatedResourceAccountIndexMethod())
              .addMethod(getGetDelegatedResourceAccountIndexV2Method())
              .addMethod(getGetCanDelegatedMaxSizeMethod())
              .addMethod(getGetAvailableUnfreezeCountMethod())
              .addMethod(getGetCanWithdrawUnfreezeAmountMethod())
              .addMethod(getGetExchangeByIdMethod())
              .addMethod(getListExchangesMethod())
              .addMethod(getGetTransactionByIdMethod())
              .addMethod(getGetTransactionInfoByIdMethod())
              .addMethod(getGetMerkleTreeVoucherInfoMethod())
              .addMethod(getScanNoteByIvkMethod())
              .addMethod(getScanAndMarkNoteByIvkMethod())
              .addMethod(getScanNoteByOvkMethod())
              .addMethod(getIsSpendMethod())
              .addMethod(getScanShieldedTRC20NotesByIvkMethod())
              .addMethod(getScanShieldedTRC20NotesByOvkMethod())
              .addMethod(getIsShieldedTRC20ContractNoteSpentMethod())
              .addMethod(getGetRewardInfoMethod())
              .addMethod(getGetBrokerageInfoMethod())
              .addMethod(getTriggerConstantContractMethod())
              .addMethod(getEstimateEnergyMethod())
              .addMethod(getGetTransactionInfoByBlockNumMethod())
              .addMethod(getGetMarketOrderByIdMethod())
              .addMethod(getGetMarketOrderByAccountMethod())
              .addMethod(getGetMarketPriceByPairMethod())
              .addMethod(getGetMarketOrderListByPairMethod())
              .addMethod(getGetMarketPairListMethod())
              .addMethod(getGetBurnTrxMethod())
              .addMethod(getGetBlockMethod())
              .addMethod(getGetBandwidthPricesMethod())
              .addMethod(getGetEnergyPricesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
