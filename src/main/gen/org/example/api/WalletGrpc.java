package org.example.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: api/api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WalletGrpc {

  private WalletGrpc() {}

  public static final java.lang.String SERVICE_NAME = "protocol.Wallet";

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
    if ((getGetAccountMethod = WalletGrpc.getGetAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountMethod = WalletGrpc.getGetAccountMethod) == null) {
          WalletGrpc.getGetAccountMethod = getGetAccountMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.Account, org.example.protos.Protocol.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Account.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Account.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccount"))
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
    if ((getGetAccountByIdMethod = WalletGrpc.getGetAccountByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountByIdMethod = WalletGrpc.getGetAccountByIdMethod) == null) {
          WalletGrpc.getGetAccountByIdMethod = getGetAccountByIdMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.Account, org.example.protos.Protocol.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Account.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Account.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountById"))
              .build();
        }
      }
    }
    return getGetAccountByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.AccountBalanceRequest,
      org.example.protos.contract.BalanceContract.AccountBalanceResponse> getGetAccountBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountBalance",
      requestType = org.example.protos.contract.BalanceContract.AccountBalanceRequest.class,
      responseType = org.example.protos.contract.BalanceContract.AccountBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.AccountBalanceRequest,
      org.example.protos.contract.BalanceContract.AccountBalanceResponse> getGetAccountBalanceMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.AccountBalanceRequest, org.example.protos.contract.BalanceContract.AccountBalanceResponse> getGetAccountBalanceMethod;
    if ((getGetAccountBalanceMethod = WalletGrpc.getGetAccountBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountBalanceMethod = WalletGrpc.getGetAccountBalanceMethod) == null) {
          WalletGrpc.getGetAccountBalanceMethod = getGetAccountBalanceMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.AccountBalanceRequest, org.example.protos.contract.BalanceContract.AccountBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.AccountBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.AccountBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountBalance"))
              .build();
        }
      }
    }
    return getGetAccountBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier,
      org.example.protos.contract.BalanceContract.BlockBalanceTrace> getGetBlockBalanceTraceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockBalanceTrace",
      requestType = org.example.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier.class,
      responseType = org.example.protos.contract.BalanceContract.BlockBalanceTrace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier,
      org.example.protos.contract.BalanceContract.BlockBalanceTrace> getGetBlockBalanceTraceMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier, org.example.protos.contract.BalanceContract.BlockBalanceTrace> getGetBlockBalanceTraceMethod;
    if ((getGetBlockBalanceTraceMethod = WalletGrpc.getGetBlockBalanceTraceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockBalanceTraceMethod = WalletGrpc.getGetBlockBalanceTraceMethod) == null) {
          WalletGrpc.getGetBlockBalanceTraceMethod = getGetBlockBalanceTraceMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier, org.example.protos.contract.BalanceContract.BlockBalanceTrace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockBalanceTrace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.BlockBalanceTrace.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockBalanceTrace"))
              .build();
        }
      }
    }
    return getGetBlockBalanceTraceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.TransferContract,
      org.example.protos.Protocol.Transaction> getCreateTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransaction",
      requestType = org.example.protos.contract.BalanceContract.TransferContract.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.TransferContract,
      org.example.protos.Protocol.Transaction> getCreateTransactionMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.TransferContract, org.example.protos.Protocol.Transaction> getCreateTransactionMethod;
    if ((getCreateTransactionMethod = WalletGrpc.getCreateTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateTransactionMethod = WalletGrpc.getCreateTransactionMethod) == null) {
          WalletGrpc.getCreateTransactionMethod = getCreateTransactionMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.TransferContract, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.TransferContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateTransaction"))
              .build();
        }
      }
    }
    return getCreateTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.TransferContract,
      org.example.api.GrpcAPI.TransactionExtention> getCreateTransaction2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransaction2",
      requestType = org.example.protos.contract.BalanceContract.TransferContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.TransferContract,
      org.example.api.GrpcAPI.TransactionExtention> getCreateTransaction2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.TransferContract, org.example.api.GrpcAPI.TransactionExtention> getCreateTransaction2Method;
    if ((getCreateTransaction2Method = WalletGrpc.getCreateTransaction2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateTransaction2Method = WalletGrpc.getCreateTransaction2Method) == null) {
          WalletGrpc.getCreateTransaction2Method = getCreateTransaction2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.TransferContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransaction2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.TransferContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateTransaction2"))
              .build();
        }
      }
    }
    return getCreateTransaction2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.Protocol.Transaction,
      org.example.api.GrpcAPI.Return> getBroadcastTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BroadcastTransaction",
      requestType = org.example.protos.Protocol.Transaction.class,
      responseType = org.example.api.GrpcAPI.Return.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.Protocol.Transaction,
      org.example.api.GrpcAPI.Return> getBroadcastTransactionMethod() {
    io.grpc.MethodDescriptor<org.example.protos.Protocol.Transaction, org.example.api.GrpcAPI.Return> getBroadcastTransactionMethod;
    if ((getBroadcastTransactionMethod = WalletGrpc.getBroadcastTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getBroadcastTransactionMethod = WalletGrpc.getBroadcastTransactionMethod) == null) {
          WalletGrpc.getBroadcastTransactionMethod = getBroadcastTransactionMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.Transaction, org.example.api.GrpcAPI.Return>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BroadcastTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.Return.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("BroadcastTransaction"))
              .build();
        }
      }
    }
    return getBroadcastTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.AccountUpdateContract,
      org.example.protos.Protocol.Transaction> getUpdateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccount",
      requestType = org.example.protos.contract.AccountContract.AccountUpdateContract.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.AccountUpdateContract,
      org.example.protos.Protocol.Transaction> getUpdateAccountMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.AccountUpdateContract, org.example.protos.Protocol.Transaction> getUpdateAccountMethod;
    if ((getUpdateAccountMethod = WalletGrpc.getUpdateAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAccountMethod = WalletGrpc.getUpdateAccountMethod) == null) {
          WalletGrpc.getUpdateAccountMethod = getUpdateAccountMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AccountContract.AccountUpdateContract, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AccountContract.AccountUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAccount"))
              .build();
        }
      }
    }
    return getUpdateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.SetAccountIdContract,
      org.example.protos.Protocol.Transaction> getSetAccountIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAccountId",
      requestType = org.example.protos.contract.AccountContract.SetAccountIdContract.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.SetAccountIdContract,
      org.example.protos.Protocol.Transaction> getSetAccountIdMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.SetAccountIdContract, org.example.protos.Protocol.Transaction> getSetAccountIdMethod;
    if ((getSetAccountIdMethod = WalletGrpc.getSetAccountIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getSetAccountIdMethod = WalletGrpc.getSetAccountIdMethod) == null) {
          WalletGrpc.getSetAccountIdMethod = getSetAccountIdMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AccountContract.SetAccountIdContract, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccountId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AccountContract.SetAccountIdContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("SetAccountId"))
              .build();
        }
      }
    }
    return getSetAccountIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.AccountUpdateContract,
      org.example.api.GrpcAPI.TransactionExtention> getUpdateAccount2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccount2",
      requestType = org.example.protos.contract.AccountContract.AccountUpdateContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.AccountUpdateContract,
      org.example.api.GrpcAPI.TransactionExtention> getUpdateAccount2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.AccountUpdateContract, org.example.api.GrpcAPI.TransactionExtention> getUpdateAccount2Method;
    if ((getUpdateAccount2Method = WalletGrpc.getUpdateAccount2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAccount2Method = WalletGrpc.getUpdateAccount2Method) == null) {
          WalletGrpc.getUpdateAccount2Method = getUpdateAccount2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AccountContract.AccountUpdateContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccount2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AccountContract.AccountUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAccount2"))
              .build();
        }
      }
    }
    return getUpdateAccount2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.VoteWitnessContract,
      org.example.protos.Protocol.Transaction> getVoteWitnessAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteWitnessAccount",
      requestType = org.example.protos.contract.WitnessContract.VoteWitnessContract.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.VoteWitnessContract,
      org.example.protos.Protocol.Transaction> getVoteWitnessAccountMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.VoteWitnessContract, org.example.protos.Protocol.Transaction> getVoteWitnessAccountMethod;
    if ((getVoteWitnessAccountMethod = WalletGrpc.getVoteWitnessAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getVoteWitnessAccountMethod = WalletGrpc.getVoteWitnessAccountMethod) == null) {
          WalletGrpc.getVoteWitnessAccountMethod = getVoteWitnessAccountMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.WitnessContract.VoteWitnessContract, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteWitnessAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.WitnessContract.VoteWitnessContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("VoteWitnessAccount"))
              .build();
        }
      }
    }
    return getVoteWitnessAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.UpdateSettingContract,
      org.example.api.GrpcAPI.TransactionExtention> getUpdateSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSetting",
      requestType = org.example.protos.contract.SmartContractOuterClass.UpdateSettingContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.UpdateSettingContract,
      org.example.api.GrpcAPI.TransactionExtention> getUpdateSettingMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.UpdateSettingContract, org.example.api.GrpcAPI.TransactionExtention> getUpdateSettingMethod;
    if ((getUpdateSettingMethod = WalletGrpc.getUpdateSettingMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateSettingMethod = WalletGrpc.getUpdateSettingMethod) == null) {
          WalletGrpc.getUpdateSettingMethod = getUpdateSettingMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.SmartContractOuterClass.UpdateSettingContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.SmartContractOuterClass.UpdateSettingContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateSetting"))
              .build();
        }
      }
    }
    return getUpdateSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract,
      org.example.api.GrpcAPI.TransactionExtention> getUpdateEnergyLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEnergyLimit",
      requestType = org.example.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract,
      org.example.api.GrpcAPI.TransactionExtention> getUpdateEnergyLimitMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract, org.example.api.GrpcAPI.TransactionExtention> getUpdateEnergyLimitMethod;
    if ((getUpdateEnergyLimitMethod = WalletGrpc.getUpdateEnergyLimitMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateEnergyLimitMethod = WalletGrpc.getUpdateEnergyLimitMethod) == null) {
          WalletGrpc.getUpdateEnergyLimitMethod = getUpdateEnergyLimitMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEnergyLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateEnergyLimit"))
              .build();
        }
      }
    }
    return getUpdateEnergyLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.VoteWitnessContract,
      org.example.api.GrpcAPI.TransactionExtention> getVoteWitnessAccount2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteWitnessAccount2",
      requestType = org.example.protos.contract.WitnessContract.VoteWitnessContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.VoteWitnessContract,
      org.example.api.GrpcAPI.TransactionExtention> getVoteWitnessAccount2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.VoteWitnessContract, org.example.api.GrpcAPI.TransactionExtention> getVoteWitnessAccount2Method;
    if ((getVoteWitnessAccount2Method = WalletGrpc.getVoteWitnessAccount2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getVoteWitnessAccount2Method = WalletGrpc.getVoteWitnessAccount2Method) == null) {
          WalletGrpc.getVoteWitnessAccount2Method = getVoteWitnessAccount2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.WitnessContract.VoteWitnessContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteWitnessAccount2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.WitnessContract.VoteWitnessContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("VoteWitnessAccount2"))
              .build();
        }
      }
    }
    return getVoteWitnessAccount2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract,
      org.example.protos.Protocol.Transaction> getCreateAssetIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAssetIssue",
      requestType = org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract,
      org.example.protos.Protocol.Transaction> getCreateAssetIssueMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract, org.example.protos.Protocol.Transaction> getCreateAssetIssueMethod;
    if ((getCreateAssetIssueMethod = WalletGrpc.getCreateAssetIssueMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAssetIssueMethod = WalletGrpc.getCreateAssetIssueMethod) == null) {
          WalletGrpc.getCreateAssetIssueMethod = getCreateAssetIssueMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAssetIssue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAssetIssue"))
              .build();
        }
      }
    }
    return getCreateAssetIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract,
      org.example.api.GrpcAPI.TransactionExtention> getCreateAssetIssue2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAssetIssue2",
      requestType = org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract,
      org.example.api.GrpcAPI.TransactionExtention> getCreateAssetIssue2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract, org.example.api.GrpcAPI.TransactionExtention> getCreateAssetIssue2Method;
    if ((getCreateAssetIssue2Method = WalletGrpc.getCreateAssetIssue2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAssetIssue2Method = WalletGrpc.getCreateAssetIssue2Method) == null) {
          WalletGrpc.getCreateAssetIssue2Method = getCreateAssetIssue2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAssetIssue2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAssetIssue2"))
              .build();
        }
      }
    }
    return getCreateAssetIssue2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.WitnessUpdateContract,
      org.example.protos.Protocol.Transaction> getUpdateWitnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWitness",
      requestType = org.example.protos.contract.WitnessContract.WitnessUpdateContract.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.WitnessUpdateContract,
      org.example.protos.Protocol.Transaction> getUpdateWitnessMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.WitnessUpdateContract, org.example.protos.Protocol.Transaction> getUpdateWitnessMethod;
    if ((getUpdateWitnessMethod = WalletGrpc.getUpdateWitnessMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateWitnessMethod = WalletGrpc.getUpdateWitnessMethod) == null) {
          WalletGrpc.getUpdateWitnessMethod = getUpdateWitnessMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.WitnessContract.WitnessUpdateContract, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWitness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.WitnessContract.WitnessUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateWitness"))
              .build();
        }
      }
    }
    return getUpdateWitnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.WitnessUpdateContract,
      org.example.api.GrpcAPI.TransactionExtention> getUpdateWitness2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWitness2",
      requestType = org.example.protos.contract.WitnessContract.WitnessUpdateContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.WitnessUpdateContract,
      org.example.api.GrpcAPI.TransactionExtention> getUpdateWitness2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.WitnessUpdateContract, org.example.api.GrpcAPI.TransactionExtention> getUpdateWitness2Method;
    if ((getUpdateWitness2Method = WalletGrpc.getUpdateWitness2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateWitness2Method = WalletGrpc.getUpdateWitness2Method) == null) {
          WalletGrpc.getUpdateWitness2Method = getUpdateWitness2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.WitnessContract.WitnessUpdateContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWitness2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.WitnessContract.WitnessUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateWitness2"))
              .build();
        }
      }
    }
    return getUpdateWitness2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.AccountCreateContract,
      org.example.protos.Protocol.Transaction> getCreateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccount",
      requestType = org.example.protos.contract.AccountContract.AccountCreateContract.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.AccountCreateContract,
      org.example.protos.Protocol.Transaction> getCreateAccountMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.AccountCreateContract, org.example.protos.Protocol.Transaction> getCreateAccountMethod;
    if ((getCreateAccountMethod = WalletGrpc.getCreateAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAccountMethod = WalletGrpc.getCreateAccountMethod) == null) {
          WalletGrpc.getCreateAccountMethod = getCreateAccountMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AccountContract.AccountCreateContract, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AccountContract.AccountCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAccount"))
              .build();
        }
      }
    }
    return getCreateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.AccountCreateContract,
      org.example.api.GrpcAPI.TransactionExtention> getCreateAccount2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccount2",
      requestType = org.example.protos.contract.AccountContract.AccountCreateContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.AccountCreateContract,
      org.example.api.GrpcAPI.TransactionExtention> getCreateAccount2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.AccountCreateContract, org.example.api.GrpcAPI.TransactionExtention> getCreateAccount2Method;
    if ((getCreateAccount2Method = WalletGrpc.getCreateAccount2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAccount2Method = WalletGrpc.getCreateAccount2Method) == null) {
          WalletGrpc.getCreateAccount2Method = getCreateAccount2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AccountContract.AccountCreateContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccount2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AccountContract.AccountCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAccount2"))
              .build();
        }
      }
    }
    return getCreateAccount2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.WitnessCreateContract,
      org.example.protos.Protocol.Transaction> getCreateWitnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWitness",
      requestType = org.example.protos.contract.WitnessContract.WitnessCreateContract.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.WitnessCreateContract,
      org.example.protos.Protocol.Transaction> getCreateWitnessMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.WitnessCreateContract, org.example.protos.Protocol.Transaction> getCreateWitnessMethod;
    if ((getCreateWitnessMethod = WalletGrpc.getCreateWitnessMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateWitnessMethod = WalletGrpc.getCreateWitnessMethod) == null) {
          WalletGrpc.getCreateWitnessMethod = getCreateWitnessMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.WitnessContract.WitnessCreateContract, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWitness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.WitnessContract.WitnessCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateWitness"))
              .build();
        }
      }
    }
    return getCreateWitnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.WitnessCreateContract,
      org.example.api.GrpcAPI.TransactionExtention> getCreateWitness2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWitness2",
      requestType = org.example.protos.contract.WitnessContract.WitnessCreateContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.WitnessCreateContract,
      org.example.api.GrpcAPI.TransactionExtention> getCreateWitness2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.WitnessContract.WitnessCreateContract, org.example.api.GrpcAPI.TransactionExtention> getCreateWitness2Method;
    if ((getCreateWitness2Method = WalletGrpc.getCreateWitness2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateWitness2Method = WalletGrpc.getCreateWitness2Method) == null) {
          WalletGrpc.getCreateWitness2Method = getCreateWitness2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.WitnessContract.WitnessCreateContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWitness2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.WitnessContract.WitnessCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateWitness2"))
              .build();
        }
      }
    }
    return getCreateWitness2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract,
      org.example.protos.Protocol.Transaction> getTransferAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferAsset",
      requestType = org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract,
      org.example.protos.Protocol.Transaction> getTransferAssetMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract, org.example.protos.Protocol.Transaction> getTransferAssetMethod;
    if ((getTransferAssetMethod = WalletGrpc.getTransferAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTransferAssetMethod = WalletGrpc.getTransferAssetMethod) == null) {
          WalletGrpc.getTransferAssetMethod = getTransferAssetMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TransferAsset"))
              .build();
        }
      }
    }
    return getTransferAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract,
      org.example.api.GrpcAPI.TransactionExtention> getTransferAsset2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferAsset2",
      requestType = org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract,
      org.example.api.GrpcAPI.TransactionExtention> getTransferAsset2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract, org.example.api.GrpcAPI.TransactionExtention> getTransferAsset2Method;
    if ((getTransferAsset2Method = WalletGrpc.getTransferAsset2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTransferAsset2Method = WalletGrpc.getTransferAsset2Method) == null) {
          WalletGrpc.getTransferAsset2Method = getTransferAsset2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferAsset2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TransferAsset2"))
              .build();
        }
      }
    }
    return getTransferAsset2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract,
      org.example.protos.Protocol.Transaction> getParticipateAssetIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParticipateAssetIssue",
      requestType = org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract,
      org.example.protos.Protocol.Transaction> getParticipateAssetIssueMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract, org.example.protos.Protocol.Transaction> getParticipateAssetIssueMethod;
    if ((getParticipateAssetIssueMethod = WalletGrpc.getParticipateAssetIssueMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getParticipateAssetIssueMethod = WalletGrpc.getParticipateAssetIssueMethod) == null) {
          WalletGrpc.getParticipateAssetIssueMethod = getParticipateAssetIssueMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParticipateAssetIssue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ParticipateAssetIssue"))
              .build();
        }
      }
    }
    return getParticipateAssetIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract,
      org.example.api.GrpcAPI.TransactionExtention> getParticipateAssetIssue2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParticipateAssetIssue2",
      requestType = org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract,
      org.example.api.GrpcAPI.TransactionExtention> getParticipateAssetIssue2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract, org.example.api.GrpcAPI.TransactionExtention> getParticipateAssetIssue2Method;
    if ((getParticipateAssetIssue2Method = WalletGrpc.getParticipateAssetIssue2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getParticipateAssetIssue2Method = WalletGrpc.getParticipateAssetIssue2Method) == null) {
          WalletGrpc.getParticipateAssetIssue2Method = getParticipateAssetIssue2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParticipateAssetIssue2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ParticipateAssetIssue2"))
              .build();
        }
      }
    }
    return getParticipateAssetIssue2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.FreezeBalanceContract,
      org.example.protos.Protocol.Transaction> getFreezeBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FreezeBalance",
      requestType = org.example.protos.contract.BalanceContract.FreezeBalanceContract.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.FreezeBalanceContract,
      org.example.protos.Protocol.Transaction> getFreezeBalanceMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.FreezeBalanceContract, org.example.protos.Protocol.Transaction> getFreezeBalanceMethod;
    if ((getFreezeBalanceMethod = WalletGrpc.getFreezeBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getFreezeBalanceMethod = WalletGrpc.getFreezeBalanceMethod) == null) {
          WalletGrpc.getFreezeBalanceMethod = getFreezeBalanceMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.FreezeBalanceContract, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FreezeBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.FreezeBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("FreezeBalance"))
              .build();
        }
      }
    }
    return getFreezeBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.FreezeBalanceContract,
      org.example.api.GrpcAPI.TransactionExtention> getFreezeBalance2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FreezeBalance2",
      requestType = org.example.protos.contract.BalanceContract.FreezeBalanceContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.FreezeBalanceContract,
      org.example.api.GrpcAPI.TransactionExtention> getFreezeBalance2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.FreezeBalanceContract, org.example.api.GrpcAPI.TransactionExtention> getFreezeBalance2Method;
    if ((getFreezeBalance2Method = WalletGrpc.getFreezeBalance2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getFreezeBalance2Method = WalletGrpc.getFreezeBalance2Method) == null) {
          WalletGrpc.getFreezeBalance2Method = getFreezeBalance2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.FreezeBalanceContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FreezeBalance2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.FreezeBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("FreezeBalance2"))
              .build();
        }
      }
    }
    return getFreezeBalance2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.FreezeBalanceV2Contract,
      org.example.api.GrpcAPI.TransactionExtention> getFreezeBalanceV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FreezeBalanceV2",
      requestType = org.example.protos.contract.BalanceContract.FreezeBalanceV2Contract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.FreezeBalanceV2Contract,
      org.example.api.GrpcAPI.TransactionExtention> getFreezeBalanceV2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.FreezeBalanceV2Contract, org.example.api.GrpcAPI.TransactionExtention> getFreezeBalanceV2Method;
    if ((getFreezeBalanceV2Method = WalletGrpc.getFreezeBalanceV2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getFreezeBalanceV2Method = WalletGrpc.getFreezeBalanceV2Method) == null) {
          WalletGrpc.getFreezeBalanceV2Method = getFreezeBalanceV2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.FreezeBalanceV2Contract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FreezeBalanceV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.FreezeBalanceV2Contract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("FreezeBalanceV2"))
              .build();
        }
      }
    }
    return getFreezeBalanceV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.UnfreezeBalanceContract,
      org.example.protos.Protocol.Transaction> getUnfreezeBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnfreezeBalance",
      requestType = org.example.protos.contract.BalanceContract.UnfreezeBalanceContract.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.UnfreezeBalanceContract,
      org.example.protos.Protocol.Transaction> getUnfreezeBalanceMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.UnfreezeBalanceContract, org.example.protos.Protocol.Transaction> getUnfreezeBalanceMethod;
    if ((getUnfreezeBalanceMethod = WalletGrpc.getUnfreezeBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeBalanceMethod = WalletGrpc.getUnfreezeBalanceMethod) == null) {
          WalletGrpc.getUnfreezeBalanceMethod = getUnfreezeBalanceMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.UnfreezeBalanceContract, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnfreezeBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.UnfreezeBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeBalance"))
              .build();
        }
      }
    }
    return getUnfreezeBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.UnfreezeBalanceContract,
      org.example.api.GrpcAPI.TransactionExtention> getUnfreezeBalance2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnfreezeBalance2",
      requestType = org.example.protos.contract.BalanceContract.UnfreezeBalanceContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.UnfreezeBalanceContract,
      org.example.api.GrpcAPI.TransactionExtention> getUnfreezeBalance2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.UnfreezeBalanceContract, org.example.api.GrpcAPI.TransactionExtention> getUnfreezeBalance2Method;
    if ((getUnfreezeBalance2Method = WalletGrpc.getUnfreezeBalance2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeBalance2Method = WalletGrpc.getUnfreezeBalance2Method) == null) {
          WalletGrpc.getUnfreezeBalance2Method = getUnfreezeBalance2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.UnfreezeBalanceContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnfreezeBalance2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.UnfreezeBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeBalance2"))
              .build();
        }
      }
    }
    return getUnfreezeBalance2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.UnfreezeBalanceV2Contract,
      org.example.api.GrpcAPI.TransactionExtention> getUnfreezeBalanceV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnfreezeBalanceV2",
      requestType = org.example.protos.contract.BalanceContract.UnfreezeBalanceV2Contract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.UnfreezeBalanceV2Contract,
      org.example.api.GrpcAPI.TransactionExtention> getUnfreezeBalanceV2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.UnfreezeBalanceV2Contract, org.example.api.GrpcAPI.TransactionExtention> getUnfreezeBalanceV2Method;
    if ((getUnfreezeBalanceV2Method = WalletGrpc.getUnfreezeBalanceV2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeBalanceV2Method = WalletGrpc.getUnfreezeBalanceV2Method) == null) {
          WalletGrpc.getUnfreezeBalanceV2Method = getUnfreezeBalanceV2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.UnfreezeBalanceV2Contract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnfreezeBalanceV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.UnfreezeBalanceV2Contract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeBalanceV2"))
              .build();
        }
      }
    }
    return getUnfreezeBalanceV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract,
      org.example.protos.Protocol.Transaction> getUnfreezeAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnfreezeAsset",
      requestType = org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract,
      org.example.protos.Protocol.Transaction> getUnfreezeAssetMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract, org.example.protos.Protocol.Transaction> getUnfreezeAssetMethod;
    if ((getUnfreezeAssetMethod = WalletGrpc.getUnfreezeAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeAssetMethod = WalletGrpc.getUnfreezeAssetMethod) == null) {
          WalletGrpc.getUnfreezeAssetMethod = getUnfreezeAssetMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnfreezeAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeAsset"))
              .build();
        }
      }
    }
    return getUnfreezeAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract,
      org.example.api.GrpcAPI.TransactionExtention> getUnfreezeAsset2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnfreezeAsset2",
      requestType = org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract,
      org.example.api.GrpcAPI.TransactionExtention> getUnfreezeAsset2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract, org.example.api.GrpcAPI.TransactionExtention> getUnfreezeAsset2Method;
    if ((getUnfreezeAsset2Method = WalletGrpc.getUnfreezeAsset2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnfreezeAsset2Method = WalletGrpc.getUnfreezeAsset2Method) == null) {
          WalletGrpc.getUnfreezeAsset2Method = getUnfreezeAsset2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnfreezeAsset2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnfreezeAsset2"))
              .build();
        }
      }
    }
    return getUnfreezeAsset2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.WithdrawBalanceContract,
      org.example.protos.Protocol.Transaction> getWithdrawBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawBalance",
      requestType = org.example.protos.contract.BalanceContract.WithdrawBalanceContract.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.WithdrawBalanceContract,
      org.example.protos.Protocol.Transaction> getWithdrawBalanceMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.WithdrawBalanceContract, org.example.protos.Protocol.Transaction> getWithdrawBalanceMethod;
    if ((getWithdrawBalanceMethod = WalletGrpc.getWithdrawBalanceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getWithdrawBalanceMethod = WalletGrpc.getWithdrawBalanceMethod) == null) {
          WalletGrpc.getWithdrawBalanceMethod = getWithdrawBalanceMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.WithdrawBalanceContract, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.WithdrawBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("WithdrawBalance"))
              .build();
        }
      }
    }
    return getWithdrawBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.WithdrawBalanceContract,
      org.example.api.GrpcAPI.TransactionExtention> getWithdrawBalance2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawBalance2",
      requestType = org.example.protos.contract.BalanceContract.WithdrawBalanceContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.WithdrawBalanceContract,
      org.example.api.GrpcAPI.TransactionExtention> getWithdrawBalance2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.WithdrawBalanceContract, org.example.api.GrpcAPI.TransactionExtention> getWithdrawBalance2Method;
    if ((getWithdrawBalance2Method = WalletGrpc.getWithdrawBalance2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getWithdrawBalance2Method = WalletGrpc.getWithdrawBalance2Method) == null) {
          WalletGrpc.getWithdrawBalance2Method = getWithdrawBalance2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.WithdrawBalanceContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawBalance2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.WithdrawBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("WithdrawBalance2"))
              .build();
        }
      }
    }
    return getWithdrawBalance2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.WithdrawExpireUnfreezeContract,
      org.example.api.GrpcAPI.TransactionExtention> getWithdrawExpireUnfreezeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawExpireUnfreeze",
      requestType = org.example.protos.contract.BalanceContract.WithdrawExpireUnfreezeContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.WithdrawExpireUnfreezeContract,
      org.example.api.GrpcAPI.TransactionExtention> getWithdrawExpireUnfreezeMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.WithdrawExpireUnfreezeContract, org.example.api.GrpcAPI.TransactionExtention> getWithdrawExpireUnfreezeMethod;
    if ((getWithdrawExpireUnfreezeMethod = WalletGrpc.getWithdrawExpireUnfreezeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getWithdrawExpireUnfreezeMethod = WalletGrpc.getWithdrawExpireUnfreezeMethod) == null) {
          WalletGrpc.getWithdrawExpireUnfreezeMethod = getWithdrawExpireUnfreezeMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.WithdrawExpireUnfreezeContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawExpireUnfreeze"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.WithdrawExpireUnfreezeContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("WithdrawExpireUnfreeze"))
              .build();
        }
      }
    }
    return getWithdrawExpireUnfreezeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.DelegateResourceContract,
      org.example.api.GrpcAPI.TransactionExtention> getDelegateResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegateResource",
      requestType = org.example.protos.contract.BalanceContract.DelegateResourceContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.DelegateResourceContract,
      org.example.api.GrpcAPI.TransactionExtention> getDelegateResourceMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.DelegateResourceContract, org.example.api.GrpcAPI.TransactionExtention> getDelegateResourceMethod;
    if ((getDelegateResourceMethod = WalletGrpc.getDelegateResourceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getDelegateResourceMethod = WalletGrpc.getDelegateResourceMethod) == null) {
          WalletGrpc.getDelegateResourceMethod = getDelegateResourceMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.DelegateResourceContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegateResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.DelegateResourceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("DelegateResource"))
              .build();
        }
      }
    }
    return getDelegateResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.UnDelegateResourceContract,
      org.example.api.GrpcAPI.TransactionExtention> getUnDelegateResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnDelegateResource",
      requestType = org.example.protos.contract.BalanceContract.UnDelegateResourceContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.UnDelegateResourceContract,
      org.example.api.GrpcAPI.TransactionExtention> getUnDelegateResourceMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.UnDelegateResourceContract, org.example.api.GrpcAPI.TransactionExtention> getUnDelegateResourceMethod;
    if ((getUnDelegateResourceMethod = WalletGrpc.getUnDelegateResourceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUnDelegateResourceMethod = WalletGrpc.getUnDelegateResourceMethod) == null) {
          WalletGrpc.getUnDelegateResourceMethod = getUnDelegateResourceMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.UnDelegateResourceContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnDelegateResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.UnDelegateResourceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UnDelegateResource"))
              .build();
        }
      }
    }
    return getUnDelegateResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.CancelAllUnfreezeV2Contract,
      org.example.api.GrpcAPI.TransactionExtention> getCancelAllUnfreezeV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelAllUnfreezeV2",
      requestType = org.example.protos.contract.BalanceContract.CancelAllUnfreezeV2Contract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.CancelAllUnfreezeV2Contract,
      org.example.api.GrpcAPI.TransactionExtention> getCancelAllUnfreezeV2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.BalanceContract.CancelAllUnfreezeV2Contract, org.example.api.GrpcAPI.TransactionExtention> getCancelAllUnfreezeV2Method;
    if ((getCancelAllUnfreezeV2Method = WalletGrpc.getCancelAllUnfreezeV2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCancelAllUnfreezeV2Method = WalletGrpc.getCancelAllUnfreezeV2Method) == null) {
          WalletGrpc.getCancelAllUnfreezeV2Method = getCancelAllUnfreezeV2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.BalanceContract.CancelAllUnfreezeV2Contract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelAllUnfreezeV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.BalanceContract.CancelAllUnfreezeV2Contract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CancelAllUnfreezeV2"))
              .build();
        }
      }
    }
    return getCancelAllUnfreezeV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract,
      org.example.protos.Protocol.Transaction> getUpdateAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAsset",
      requestType = org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract,
      org.example.protos.Protocol.Transaction> getUpdateAssetMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract, org.example.protos.Protocol.Transaction> getUpdateAssetMethod;
    if ((getUpdateAssetMethod = WalletGrpc.getUpdateAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAssetMethod = WalletGrpc.getUpdateAssetMethod) == null) {
          WalletGrpc.getUpdateAssetMethod = getUpdateAssetMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAsset"))
              .build();
        }
      }
    }
    return getUpdateAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract,
      org.example.api.GrpcAPI.TransactionExtention> getUpdateAsset2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAsset2",
      requestType = org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract,
      org.example.api.GrpcAPI.TransactionExtention> getUpdateAsset2Method() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract, org.example.api.GrpcAPI.TransactionExtention> getUpdateAsset2Method;
    if ((getUpdateAsset2Method = WalletGrpc.getUpdateAsset2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateAsset2Method = WalletGrpc.getUpdateAsset2Method) == null) {
          WalletGrpc.getUpdateAsset2Method = getUpdateAsset2Method =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAsset2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateAsset2"))
              .build();
        }
      }
    }
    return getUpdateAsset2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.ProposalContract.ProposalCreateContract,
      org.example.api.GrpcAPI.TransactionExtention> getProposalCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalCreate",
      requestType = org.example.protos.contract.ProposalContract.ProposalCreateContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.ProposalContract.ProposalCreateContract,
      org.example.api.GrpcAPI.TransactionExtention> getProposalCreateMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.ProposalContract.ProposalCreateContract, org.example.api.GrpcAPI.TransactionExtention> getProposalCreateMethod;
    if ((getProposalCreateMethod = WalletGrpc.getProposalCreateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProposalCreateMethod = WalletGrpc.getProposalCreateMethod) == null) {
          WalletGrpc.getProposalCreateMethod = getProposalCreateMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.ProposalContract.ProposalCreateContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.ProposalContract.ProposalCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProposalCreate"))
              .build();
        }
      }
    }
    return getProposalCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.ProposalContract.ProposalApproveContract,
      org.example.api.GrpcAPI.TransactionExtention> getProposalApproveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalApprove",
      requestType = org.example.protos.contract.ProposalContract.ProposalApproveContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.ProposalContract.ProposalApproveContract,
      org.example.api.GrpcAPI.TransactionExtention> getProposalApproveMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.ProposalContract.ProposalApproveContract, org.example.api.GrpcAPI.TransactionExtention> getProposalApproveMethod;
    if ((getProposalApproveMethod = WalletGrpc.getProposalApproveMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProposalApproveMethod = WalletGrpc.getProposalApproveMethod) == null) {
          WalletGrpc.getProposalApproveMethod = getProposalApproveMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.ProposalContract.ProposalApproveContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalApprove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.ProposalContract.ProposalApproveContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProposalApprove"))
              .build();
        }
      }
    }
    return getProposalApproveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.ProposalContract.ProposalDeleteContract,
      org.example.api.GrpcAPI.TransactionExtention> getProposalDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalDelete",
      requestType = org.example.protos.contract.ProposalContract.ProposalDeleteContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.ProposalContract.ProposalDeleteContract,
      org.example.api.GrpcAPI.TransactionExtention> getProposalDeleteMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.ProposalContract.ProposalDeleteContract, org.example.api.GrpcAPI.TransactionExtention> getProposalDeleteMethod;
    if ((getProposalDeleteMethod = WalletGrpc.getProposalDeleteMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProposalDeleteMethod = WalletGrpc.getProposalDeleteMethod) == null) {
          WalletGrpc.getProposalDeleteMethod = getProposalDeleteMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.ProposalContract.ProposalDeleteContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.ProposalContract.ProposalDeleteContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProposalDelete"))
              .build();
        }
      }
    }
    return getProposalDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.StorageContract.BuyStorageContract,
      org.example.api.GrpcAPI.TransactionExtention> getBuyStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyStorage",
      requestType = org.example.protos.contract.StorageContract.BuyStorageContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.StorageContract.BuyStorageContract,
      org.example.api.GrpcAPI.TransactionExtention> getBuyStorageMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.StorageContract.BuyStorageContract, org.example.api.GrpcAPI.TransactionExtention> getBuyStorageMethod;
    if ((getBuyStorageMethod = WalletGrpc.getBuyStorageMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getBuyStorageMethod = WalletGrpc.getBuyStorageMethod) == null) {
          WalletGrpc.getBuyStorageMethod = getBuyStorageMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.StorageContract.BuyStorageContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.StorageContract.BuyStorageContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("BuyStorage"))
              .build();
        }
      }
    }
    return getBuyStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.StorageContract.BuyStorageBytesContract,
      org.example.api.GrpcAPI.TransactionExtention> getBuyStorageBytesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyStorageBytes",
      requestType = org.example.protos.contract.StorageContract.BuyStorageBytesContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.StorageContract.BuyStorageBytesContract,
      org.example.api.GrpcAPI.TransactionExtention> getBuyStorageBytesMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.StorageContract.BuyStorageBytesContract, org.example.api.GrpcAPI.TransactionExtention> getBuyStorageBytesMethod;
    if ((getBuyStorageBytesMethod = WalletGrpc.getBuyStorageBytesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getBuyStorageBytesMethod = WalletGrpc.getBuyStorageBytesMethod) == null) {
          WalletGrpc.getBuyStorageBytesMethod = getBuyStorageBytesMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.StorageContract.BuyStorageBytesContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyStorageBytes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.StorageContract.BuyStorageBytesContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("BuyStorageBytes"))
              .build();
        }
      }
    }
    return getBuyStorageBytesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.StorageContract.SellStorageContract,
      org.example.api.GrpcAPI.TransactionExtention> getSellStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellStorage",
      requestType = org.example.protos.contract.StorageContract.SellStorageContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.StorageContract.SellStorageContract,
      org.example.api.GrpcAPI.TransactionExtention> getSellStorageMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.StorageContract.SellStorageContract, org.example.api.GrpcAPI.TransactionExtention> getSellStorageMethod;
    if ((getSellStorageMethod = WalletGrpc.getSellStorageMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getSellStorageMethod = WalletGrpc.getSellStorageMethod) == null) {
          WalletGrpc.getSellStorageMethod = getSellStorageMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.StorageContract.SellStorageContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.StorageContract.SellStorageContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("SellStorage"))
              .build();
        }
      }
    }
    return getSellStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.ExchangeContract.ExchangeCreateContract,
      org.example.api.GrpcAPI.TransactionExtention> getExchangeCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeCreate",
      requestType = org.example.protos.contract.ExchangeContract.ExchangeCreateContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.ExchangeContract.ExchangeCreateContract,
      org.example.api.GrpcAPI.TransactionExtention> getExchangeCreateMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.ExchangeContract.ExchangeCreateContract, org.example.api.GrpcAPI.TransactionExtention> getExchangeCreateMethod;
    if ((getExchangeCreateMethod = WalletGrpc.getExchangeCreateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeCreateMethod = WalletGrpc.getExchangeCreateMethod) == null) {
          WalletGrpc.getExchangeCreateMethod = getExchangeCreateMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.ExchangeContract.ExchangeCreateContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.ExchangeContract.ExchangeCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeCreate"))
              .build();
        }
      }
    }
    return getExchangeCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.ExchangeContract.ExchangeInjectContract,
      org.example.api.GrpcAPI.TransactionExtention> getExchangeInjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeInject",
      requestType = org.example.protos.contract.ExchangeContract.ExchangeInjectContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.ExchangeContract.ExchangeInjectContract,
      org.example.api.GrpcAPI.TransactionExtention> getExchangeInjectMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.ExchangeContract.ExchangeInjectContract, org.example.api.GrpcAPI.TransactionExtention> getExchangeInjectMethod;
    if ((getExchangeInjectMethod = WalletGrpc.getExchangeInjectMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeInjectMethod = WalletGrpc.getExchangeInjectMethod) == null) {
          WalletGrpc.getExchangeInjectMethod = getExchangeInjectMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.ExchangeContract.ExchangeInjectContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeInject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.ExchangeContract.ExchangeInjectContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeInject"))
              .build();
        }
      }
    }
    return getExchangeInjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.ExchangeContract.ExchangeWithdrawContract,
      org.example.api.GrpcAPI.TransactionExtention> getExchangeWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeWithdraw",
      requestType = org.example.protos.contract.ExchangeContract.ExchangeWithdrawContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.ExchangeContract.ExchangeWithdrawContract,
      org.example.api.GrpcAPI.TransactionExtention> getExchangeWithdrawMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.ExchangeContract.ExchangeWithdrawContract, org.example.api.GrpcAPI.TransactionExtention> getExchangeWithdrawMethod;
    if ((getExchangeWithdrawMethod = WalletGrpc.getExchangeWithdrawMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeWithdrawMethod = WalletGrpc.getExchangeWithdrawMethod) == null) {
          WalletGrpc.getExchangeWithdrawMethod = getExchangeWithdrawMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.ExchangeContract.ExchangeWithdrawContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeWithdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.ExchangeContract.ExchangeWithdrawContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeWithdraw"))
              .build();
        }
      }
    }
    return getExchangeWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.ExchangeContract.ExchangeTransactionContract,
      org.example.api.GrpcAPI.TransactionExtention> getExchangeTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeTransaction",
      requestType = org.example.protos.contract.ExchangeContract.ExchangeTransactionContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.ExchangeContract.ExchangeTransactionContract,
      org.example.api.GrpcAPI.TransactionExtention> getExchangeTransactionMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.ExchangeContract.ExchangeTransactionContract, org.example.api.GrpcAPI.TransactionExtention> getExchangeTransactionMethod;
    if ((getExchangeTransactionMethod = WalletGrpc.getExchangeTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getExchangeTransactionMethod = WalletGrpc.getExchangeTransactionMethod) == null) {
          WalletGrpc.getExchangeTransactionMethod = getExchangeTransactionMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.ExchangeContract.ExchangeTransactionContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.ExchangeContract.ExchangeTransactionContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ExchangeTransaction"))
              .build();
        }
      }
    }
    return getExchangeTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.MarketContract.MarketSellAssetContract,
      org.example.api.GrpcAPI.TransactionExtention> getMarketSellAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketSellAsset",
      requestType = org.example.protos.contract.MarketContract.MarketSellAssetContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.MarketContract.MarketSellAssetContract,
      org.example.api.GrpcAPI.TransactionExtention> getMarketSellAssetMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.MarketContract.MarketSellAssetContract, org.example.api.GrpcAPI.TransactionExtention> getMarketSellAssetMethod;
    if ((getMarketSellAssetMethod = WalletGrpc.getMarketSellAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getMarketSellAssetMethod = WalletGrpc.getMarketSellAssetMethod) == null) {
          WalletGrpc.getMarketSellAssetMethod = getMarketSellAssetMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.MarketContract.MarketSellAssetContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarketSellAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.MarketContract.MarketSellAssetContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("MarketSellAsset"))
              .build();
        }
      }
    }
    return getMarketSellAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.MarketContract.MarketCancelOrderContract,
      org.example.api.GrpcAPI.TransactionExtention> getMarketCancelOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketCancelOrder",
      requestType = org.example.protos.contract.MarketContract.MarketCancelOrderContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.MarketContract.MarketCancelOrderContract,
      org.example.api.GrpcAPI.TransactionExtention> getMarketCancelOrderMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.MarketContract.MarketCancelOrderContract, org.example.api.GrpcAPI.TransactionExtention> getMarketCancelOrderMethod;
    if ((getMarketCancelOrderMethod = WalletGrpc.getMarketCancelOrderMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getMarketCancelOrderMethod = WalletGrpc.getMarketCancelOrderMethod) == null) {
          WalletGrpc.getMarketCancelOrderMethod = getMarketCancelOrderMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.MarketContract.MarketCancelOrderContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarketCancelOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.MarketContract.MarketCancelOrderContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("MarketCancelOrder"))
              .build();
        }
      }
    }
    return getMarketCancelOrderMethod;
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
    if ((getGetMarketOrderByIdMethod = WalletGrpc.getGetMarketOrderByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderByIdMethod = WalletGrpc.getGetMarketOrderByIdMethod) == null) {
          WalletGrpc.getGetMarketOrderByIdMethod = getGetMarketOrderByIdMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.MarketOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.MarketOrder.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderById"))
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
    if ((getGetMarketOrderByAccountMethod = WalletGrpc.getGetMarketOrderByAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderByAccountMethod = WalletGrpc.getGetMarketOrderByAccountMethod) == null) {
          WalletGrpc.getGetMarketOrderByAccountMethod = getGetMarketOrderByAccountMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.MarketOrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.MarketOrderList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderByAccount"))
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
    if ((getGetMarketPriceByPairMethod = WalletGrpc.getGetMarketPriceByPairMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketPriceByPairMethod = WalletGrpc.getGetMarketPriceByPairMethod) == null) {
          WalletGrpc.getGetMarketPriceByPairMethod = getGetMarketPriceByPairMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.MarketOrderPair, org.example.protos.Protocol.MarketPriceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketPriceByPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.MarketOrderPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.MarketPriceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketPriceByPair"))
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
    if ((getGetMarketOrderListByPairMethod = WalletGrpc.getGetMarketOrderListByPairMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderListByPairMethod = WalletGrpc.getGetMarketOrderListByPairMethod) == null) {
          WalletGrpc.getGetMarketOrderListByPairMethod = getGetMarketOrderListByPairMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.MarketOrderPair, org.example.protos.Protocol.MarketOrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderListByPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.MarketOrderPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.MarketOrderList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderListByPair"))
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
    if ((getGetMarketPairListMethod = WalletGrpc.getGetMarketPairListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketPairListMethod = WalletGrpc.getGetMarketPairListMethod) == null) {
          WalletGrpc.getGetMarketPairListMethod = getGetMarketPairListMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.MarketOrderPairList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketPairList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.MarketOrderPairList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketPairList"))
              .build();
        }
      }
    }
    return getGetMarketPairListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.NodeList> getListNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNodes",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.NodeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.NodeList> getListNodesMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.NodeList> getListNodesMethod;
    if ((getListNodesMethod = WalletGrpc.getListNodesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListNodesMethod = WalletGrpc.getListNodesMethod) == null) {
          WalletGrpc.getListNodesMethod = getListNodesMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.NodeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NodeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListNodes"))
              .build();
        }
      }
    }
    return getListNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.Protocol.Account,
      org.example.api.GrpcAPI.AssetIssueList> getGetAssetIssueByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueByAccount",
      requestType = org.example.protos.Protocol.Account.class,
      responseType = org.example.api.GrpcAPI.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.Protocol.Account,
      org.example.api.GrpcAPI.AssetIssueList> getGetAssetIssueByAccountMethod() {
    io.grpc.MethodDescriptor<org.example.protos.Protocol.Account, org.example.api.GrpcAPI.AssetIssueList> getGetAssetIssueByAccountMethod;
    if ((getGetAssetIssueByAccountMethod = WalletGrpc.getGetAssetIssueByAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByAccountMethod = WalletGrpc.getGetAssetIssueByAccountMethod) == null) {
          WalletGrpc.getGetAssetIssueByAccountMethod = getGetAssetIssueByAccountMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.Account, org.example.api.GrpcAPI.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Account.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueByAccount"))
              .build();
        }
      }
    }
    return getGetAssetIssueByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.Protocol.Account,
      org.example.api.GrpcAPI.AccountNetMessage> getGetAccountNetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountNet",
      requestType = org.example.protos.Protocol.Account.class,
      responseType = org.example.api.GrpcAPI.AccountNetMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.Protocol.Account,
      org.example.api.GrpcAPI.AccountNetMessage> getGetAccountNetMethod() {
    io.grpc.MethodDescriptor<org.example.protos.Protocol.Account, org.example.api.GrpcAPI.AccountNetMessage> getGetAccountNetMethod;
    if ((getGetAccountNetMethod = WalletGrpc.getGetAccountNetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountNetMethod = WalletGrpc.getGetAccountNetMethod) == null) {
          WalletGrpc.getGetAccountNetMethod = getGetAccountNetMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.Account, org.example.api.GrpcAPI.AccountNetMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountNet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Account.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.AccountNetMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountNet"))
              .build();
        }
      }
    }
    return getGetAccountNetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.Protocol.Account,
      org.example.api.GrpcAPI.AccountResourceMessage> getGetAccountResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountResource",
      requestType = org.example.protos.Protocol.Account.class,
      responseType = org.example.api.GrpcAPI.AccountResourceMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.Protocol.Account,
      org.example.api.GrpcAPI.AccountResourceMessage> getGetAccountResourceMethod() {
    io.grpc.MethodDescriptor<org.example.protos.Protocol.Account, org.example.api.GrpcAPI.AccountResourceMessage> getGetAccountResourceMethod;
    if ((getGetAccountResourceMethod = WalletGrpc.getGetAccountResourceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountResourceMethod = WalletGrpc.getGetAccountResourceMethod) == null) {
          WalletGrpc.getGetAccountResourceMethod = getGetAccountResourceMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.Account, org.example.api.GrpcAPI.AccountResourceMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Account.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.AccountResourceMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountResource"))
              .build();
        }
      }
    }
    return getGetAccountResourceMethod;
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
    if ((getGetAssetIssueByNameMethod = WalletGrpc.getGetAssetIssueByNameMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByNameMethod = WalletGrpc.getGetAssetIssueByNameMethod) == null) {
          WalletGrpc.getGetAssetIssueByNameMethod = getGetAssetIssueByNameMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueByName"))
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
    if ((getGetAssetIssueListByNameMethod = WalletGrpc.getGetAssetIssueListByNameMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueListByNameMethod = WalletGrpc.getGetAssetIssueListByNameMethod) == null) {
          WalletGrpc.getGetAssetIssueListByNameMethod = getGetAssetIssueListByNameMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.api.GrpcAPI.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueListByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueListByName"))
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
    if ((getGetAssetIssueByIdMethod = WalletGrpc.getGetAssetIssueByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByIdMethod = WalletGrpc.getGetAssetIssueByIdMethod) == null) {
          WalletGrpc.getGetAssetIssueByIdMethod = getGetAssetIssueByIdMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueById"))
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
    if ((getGetNowBlockMethod = WalletGrpc.getGetNowBlockMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNowBlockMethod = WalletGrpc.getGetNowBlockMethod) == null) {
          WalletGrpc.getGetNowBlockMethod = getGetNowBlockMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNowBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNowBlock"))
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
    if ((getGetNowBlock2Method = WalletGrpc.getGetNowBlock2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNowBlock2Method = WalletGrpc.getGetNowBlock2Method) == null) {
          WalletGrpc.getGetNowBlock2Method = getGetNowBlock2Method =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNowBlock2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BlockExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNowBlock2"))
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
    if ((getGetBlockByNumMethod = WalletGrpc.getGetBlockByNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByNumMethod = WalletGrpc.getGetBlockByNumMethod) == null) {
          WalletGrpc.getGetBlockByNumMethod = getGetBlockByNumMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NumberMessage, org.example.protos.Protocol.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByNum"))
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
    if ((getGetBlockByNum2Method = WalletGrpc.getGetBlockByNum2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByNum2Method = WalletGrpc.getGetBlockByNum2Method) == null) {
          WalletGrpc.getGetBlockByNum2Method = getGetBlockByNum2Method =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NumberMessage, org.example.api.GrpcAPI.BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByNum2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BlockExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByNum2"))
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
    if ((getGetTransactionCountByBlockNumMethod = WalletGrpc.getGetTransactionCountByBlockNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionCountByBlockNumMethod = WalletGrpc.getGetTransactionCountByBlockNumMethod) == null) {
          WalletGrpc.getGetTransactionCountByBlockNumMethod = getGetTransactionCountByBlockNumMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NumberMessage, org.example.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionCountByBlockNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionCountByBlockNum"))
              .build();
        }
      }
    }
    return getGetTransactionCountByBlockNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.Block> getGetBlockByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockById",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.protos.Protocol.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.Block> getGetBlockByIdMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.Block> getGetBlockByIdMethod;
    if ((getGetBlockByIdMethod = WalletGrpc.getGetBlockByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByIdMethod = WalletGrpc.getGetBlockByIdMethod) == null) {
          WalletGrpc.getGetBlockByIdMethod = getGetBlockByIdMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockById"))
              .build();
        }
      }
    }
    return getGetBlockByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BlockLimit,
      org.example.api.GrpcAPI.BlockList> getGetBlockByLimitNextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLimitNext",
      requestType = org.example.api.GrpcAPI.BlockLimit.class,
      responseType = org.example.api.GrpcAPI.BlockList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BlockLimit,
      org.example.api.GrpcAPI.BlockList> getGetBlockByLimitNextMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BlockLimit, org.example.api.GrpcAPI.BlockList> getGetBlockByLimitNextMethod;
    if ((getGetBlockByLimitNextMethod = WalletGrpc.getGetBlockByLimitNextMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLimitNextMethod = WalletGrpc.getGetBlockByLimitNextMethod) == null) {
          WalletGrpc.getGetBlockByLimitNextMethod = getGetBlockByLimitNextMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BlockLimit, org.example.api.GrpcAPI.BlockList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLimitNext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BlockLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BlockList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLimitNext"))
              .build();
        }
      }
    }
    return getGetBlockByLimitNextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BlockLimit,
      org.example.api.GrpcAPI.BlockListExtention> getGetBlockByLimitNext2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLimitNext2",
      requestType = org.example.api.GrpcAPI.BlockLimit.class,
      responseType = org.example.api.GrpcAPI.BlockListExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BlockLimit,
      org.example.api.GrpcAPI.BlockListExtention> getGetBlockByLimitNext2Method() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BlockLimit, org.example.api.GrpcAPI.BlockListExtention> getGetBlockByLimitNext2Method;
    if ((getGetBlockByLimitNext2Method = WalletGrpc.getGetBlockByLimitNext2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLimitNext2Method = WalletGrpc.getGetBlockByLimitNext2Method) == null) {
          WalletGrpc.getGetBlockByLimitNext2Method = getGetBlockByLimitNext2Method =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BlockLimit, org.example.api.GrpcAPI.BlockListExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLimitNext2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BlockLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BlockListExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLimitNext2"))
              .build();
        }
      }
    }
    return getGetBlockByLimitNext2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage,
      org.example.api.GrpcAPI.BlockList> getGetBlockByLatestNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLatestNum",
      requestType = org.example.api.GrpcAPI.NumberMessage.class,
      responseType = org.example.api.GrpcAPI.BlockList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage,
      org.example.api.GrpcAPI.BlockList> getGetBlockByLatestNumMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage, org.example.api.GrpcAPI.BlockList> getGetBlockByLatestNumMethod;
    if ((getGetBlockByLatestNumMethod = WalletGrpc.getGetBlockByLatestNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLatestNumMethod = WalletGrpc.getGetBlockByLatestNumMethod) == null) {
          WalletGrpc.getGetBlockByLatestNumMethod = getGetBlockByLatestNumMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NumberMessage, org.example.api.GrpcAPI.BlockList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLatestNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BlockList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLatestNum"))
              .build();
        }
      }
    }
    return getGetBlockByLatestNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage,
      org.example.api.GrpcAPI.BlockListExtention> getGetBlockByLatestNum2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLatestNum2",
      requestType = org.example.api.GrpcAPI.NumberMessage.class,
      responseType = org.example.api.GrpcAPI.BlockListExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage,
      org.example.api.GrpcAPI.BlockListExtention> getGetBlockByLatestNum2Method() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NumberMessage, org.example.api.GrpcAPI.BlockListExtention> getGetBlockByLatestNum2Method;
    if ((getGetBlockByLatestNum2Method = WalletGrpc.getGetBlockByLatestNum2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLatestNum2Method = WalletGrpc.getGetBlockByLatestNum2Method) == null) {
          WalletGrpc.getGetBlockByLatestNum2Method = getGetBlockByLatestNum2Method =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NumberMessage, org.example.api.GrpcAPI.BlockListExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLatestNum2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BlockListExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLatestNum2"))
              .build();
        }
      }
    }
    return getGetBlockByLatestNum2Method;
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
    if ((getGetTransactionByIdMethod = WalletGrpc.getGetTransactionByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionByIdMethod = WalletGrpc.getGetTransactionByIdMethod) == null) {
          WalletGrpc.getGetTransactionByIdMethod = getGetTransactionByIdMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionById"))
              .build();
        }
      }
    }
    return getGetTransactionByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.CreateSmartContract,
      org.example.api.GrpcAPI.TransactionExtention> getDeployContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeployContract",
      requestType = org.example.protos.contract.SmartContractOuterClass.CreateSmartContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.CreateSmartContract,
      org.example.api.GrpcAPI.TransactionExtention> getDeployContractMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.CreateSmartContract, org.example.api.GrpcAPI.TransactionExtention> getDeployContractMethod;
    if ((getDeployContractMethod = WalletGrpc.getDeployContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getDeployContractMethod = WalletGrpc.getDeployContractMethod) == null) {
          WalletGrpc.getDeployContractMethod = getDeployContractMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.SmartContractOuterClass.CreateSmartContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeployContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.SmartContractOuterClass.CreateSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("DeployContract"))
              .build();
        }
      }
    }
    return getDeployContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.contract.SmartContractOuterClass.SmartContract> getGetContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContract",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.protos.contract.SmartContractOuterClass.SmartContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.contract.SmartContractOuterClass.SmartContract> getGetContractMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.protos.contract.SmartContractOuterClass.SmartContract> getGetContractMethod;
    if ((getGetContractMethod = WalletGrpc.getGetContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetContractMethod = WalletGrpc.getGetContractMethod) == null) {
          WalletGrpc.getGetContractMethod = getGetContractMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.contract.SmartContractOuterClass.SmartContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.SmartContractOuterClass.SmartContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetContract"))
              .build();
        }
      }
    }
    return getGetContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.contract.SmartContractOuterClass.SmartContractDataWrapper> getGetContractInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContractInfo",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.protos.contract.SmartContractOuterClass.SmartContractDataWrapper.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.contract.SmartContractOuterClass.SmartContractDataWrapper> getGetContractInfoMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.protos.contract.SmartContractOuterClass.SmartContractDataWrapper> getGetContractInfoMethod;
    if ((getGetContractInfoMethod = WalletGrpc.getGetContractInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetContractInfoMethod = WalletGrpc.getGetContractInfoMethod) == null) {
          WalletGrpc.getGetContractInfoMethod = getGetContractInfoMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.contract.SmartContractOuterClass.SmartContractDataWrapper>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContractInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.SmartContractOuterClass.SmartContractDataWrapper.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetContractInfo"))
              .build();
        }
      }
    }
    return getGetContractInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract,
      org.example.api.GrpcAPI.TransactionExtention> getTriggerContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerContract",
      requestType = org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract,
      org.example.api.GrpcAPI.TransactionExtention> getTriggerContractMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract, org.example.api.GrpcAPI.TransactionExtention> getTriggerContractMethod;
    if ((getTriggerContractMethod = WalletGrpc.getTriggerContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTriggerContractMethod = WalletGrpc.getTriggerContractMethod) == null) {
          WalletGrpc.getTriggerContractMethod = getTriggerContractMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TriggerContract"))
              .build();
        }
      }
    }
    return getTriggerContractMethod;
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
    if ((getTriggerConstantContractMethod = WalletGrpc.getTriggerConstantContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTriggerConstantContractMethod = WalletGrpc.getTriggerConstantContractMethod) == null) {
          WalletGrpc.getTriggerConstantContractMethod = getTriggerConstantContractMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerConstantContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TriggerConstantContract"))
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
    if ((getEstimateEnergyMethod = WalletGrpc.getEstimateEnergyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEstimateEnergyMethod = WalletGrpc.getEstimateEnergyMethod) == null) {
          WalletGrpc.getEstimateEnergyMethod = getEstimateEnergyMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract, org.example.api.GrpcAPI.EstimateEnergyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateEnergy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EstimateEnergyMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EstimateEnergy"))
              .build();
        }
      }
    }
    return getEstimateEnergyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.ClearABIContract,
      org.example.api.GrpcAPI.TransactionExtention> getClearContractABIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearContractABI",
      requestType = org.example.protos.contract.SmartContractOuterClass.ClearABIContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.ClearABIContract,
      org.example.api.GrpcAPI.TransactionExtention> getClearContractABIMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.SmartContractOuterClass.ClearABIContract, org.example.api.GrpcAPI.TransactionExtention> getClearContractABIMethod;
    if ((getClearContractABIMethod = WalletGrpc.getClearContractABIMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getClearContractABIMethod = WalletGrpc.getClearContractABIMethod) == null) {
          WalletGrpc.getClearContractABIMethod = getClearContractABIMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.SmartContractOuterClass.ClearABIContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearContractABI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.SmartContractOuterClass.ClearABIContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ClearContractABI"))
              .build();
        }
      }
    }
    return getClearContractABIMethod;
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
    if ((getListWitnessesMethod = WalletGrpc.getListWitnessesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListWitnessesMethod = WalletGrpc.getListWitnessesMethod) == null) {
          WalletGrpc.getListWitnessesMethod = getListWitnessesMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.WitnessList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWitnesses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.WitnessList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListWitnesses"))
              .build();
        }
      }
    }
    return getListWitnessesMethod;
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
    if ((getGetDelegatedResourceMethod = WalletGrpc.getGetDelegatedResourceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceMethod = WalletGrpc.getGetDelegatedResourceMethod) == null) {
          WalletGrpc.getGetDelegatedResourceMethod = getGetDelegatedResourceMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.DelegatedResourceMessage, org.example.api.GrpcAPI.DelegatedResourceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DelegatedResourceMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DelegatedResourceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResource"))
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
    if ((getGetDelegatedResourceV2Method = WalletGrpc.getGetDelegatedResourceV2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceV2Method = WalletGrpc.getGetDelegatedResourceV2Method) == null) {
          WalletGrpc.getGetDelegatedResourceV2Method = getGetDelegatedResourceV2Method =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.DelegatedResourceMessage, org.example.api.GrpcAPI.DelegatedResourceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResourceV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DelegatedResourceMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DelegatedResourceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResourceV2"))
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
    if ((getGetDelegatedResourceAccountIndexMethod = WalletGrpc.getGetDelegatedResourceAccountIndexMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceAccountIndexMethod = WalletGrpc.getGetDelegatedResourceAccountIndexMethod) == null) {
          WalletGrpc.getGetDelegatedResourceAccountIndexMethod = getGetDelegatedResourceAccountIndexMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.DelegatedResourceAccountIndex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResourceAccountIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.DelegatedResourceAccountIndex.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResourceAccountIndex"))
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
    if ((getGetDelegatedResourceAccountIndexV2Method = WalletGrpc.getGetDelegatedResourceAccountIndexV2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceAccountIndexV2Method = WalletGrpc.getGetDelegatedResourceAccountIndexV2Method) == null) {
          WalletGrpc.getGetDelegatedResourceAccountIndexV2Method = getGetDelegatedResourceAccountIndexV2Method =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.DelegatedResourceAccountIndex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResourceAccountIndexV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.DelegatedResourceAccountIndex.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResourceAccountIndexV2"))
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
    if ((getGetCanDelegatedMaxSizeMethod = WalletGrpc.getGetCanDelegatedMaxSizeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetCanDelegatedMaxSizeMethod = WalletGrpc.getGetCanDelegatedMaxSizeMethod) == null) {
          WalletGrpc.getGetCanDelegatedMaxSizeMethod = getGetCanDelegatedMaxSizeMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.CanDelegatedMaxSizeRequestMessage, org.example.api.GrpcAPI.CanDelegatedMaxSizeResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCanDelegatedMaxSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.CanDelegatedMaxSizeRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.CanDelegatedMaxSizeResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetCanDelegatedMaxSize"))
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
    if ((getGetAvailableUnfreezeCountMethod = WalletGrpc.getGetAvailableUnfreezeCountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAvailableUnfreezeCountMethod = WalletGrpc.getGetAvailableUnfreezeCountMethod) == null) {
          WalletGrpc.getGetAvailableUnfreezeCountMethod = getGetAvailableUnfreezeCountMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.GetAvailableUnfreezeCountRequestMessage, org.example.api.GrpcAPI.GetAvailableUnfreezeCountResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailableUnfreezeCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.GetAvailableUnfreezeCountRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.GetAvailableUnfreezeCountResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAvailableUnfreezeCount"))
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
    if ((getGetCanWithdrawUnfreezeAmountMethod = WalletGrpc.getGetCanWithdrawUnfreezeAmountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetCanWithdrawUnfreezeAmountMethod = WalletGrpc.getGetCanWithdrawUnfreezeAmountMethod) == null) {
          WalletGrpc.getGetCanWithdrawUnfreezeAmountMethod = getGetCanWithdrawUnfreezeAmountMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage, org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCanWithdrawUnfreezeAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetCanWithdrawUnfreezeAmount"))
              .build();
        }
      }
    }
    return getGetCanWithdrawUnfreezeAmountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.ProposalList> getListProposalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProposals",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.ProposalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.ProposalList> getListProposalsMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.ProposalList> getListProposalsMethod;
    if ((getListProposalsMethod = WalletGrpc.getListProposalsMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListProposalsMethod = WalletGrpc.getListProposalsMethod) == null) {
          WalletGrpc.getListProposalsMethod = getListProposalsMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.ProposalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProposals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.ProposalList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListProposals"))
              .build();
        }
      }
    }
    return getListProposalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PaginatedMessage,
      org.example.api.GrpcAPI.ProposalList> getGetPaginatedProposalListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedProposalList",
      requestType = org.example.api.GrpcAPI.PaginatedMessage.class,
      responseType = org.example.api.GrpcAPI.ProposalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PaginatedMessage,
      org.example.api.GrpcAPI.ProposalList> getGetPaginatedProposalListMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PaginatedMessage, org.example.api.GrpcAPI.ProposalList> getGetPaginatedProposalListMethod;
    if ((getGetPaginatedProposalListMethod = WalletGrpc.getGetPaginatedProposalListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedProposalListMethod = WalletGrpc.getGetPaginatedProposalListMethod) == null) {
          WalletGrpc.getGetPaginatedProposalListMethod = getGetPaginatedProposalListMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.PaginatedMessage, org.example.api.GrpcAPI.ProposalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedProposalList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.ProposalList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedProposalList"))
              .build();
        }
      }
    }
    return getGetPaginatedProposalListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.Proposal> getGetProposalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProposalById",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.protos.Protocol.Proposal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.Proposal> getGetProposalByIdMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.Proposal> getGetProposalByIdMethod;
    if ((getGetProposalByIdMethod = WalletGrpc.getGetProposalByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetProposalByIdMethod = WalletGrpc.getGetProposalByIdMethod) == null) {
          WalletGrpc.getGetProposalByIdMethod = getGetProposalByIdMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.Proposal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProposalById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Proposal.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetProposalById"))
              .build();
        }
      }
    }
    return getGetProposalByIdMethod;
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
    if ((getListExchangesMethod = WalletGrpc.getListExchangesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListExchangesMethod = WalletGrpc.getListExchangesMethod) == null) {
          WalletGrpc.getListExchangesMethod = getListExchangesMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.ExchangeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExchanges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.ExchangeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListExchanges"))
              .build();
        }
      }
    }
    return getListExchangesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PaginatedMessage,
      org.example.api.GrpcAPI.ExchangeList> getGetPaginatedExchangeListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedExchangeList",
      requestType = org.example.api.GrpcAPI.PaginatedMessage.class,
      responseType = org.example.api.GrpcAPI.ExchangeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PaginatedMessage,
      org.example.api.GrpcAPI.ExchangeList> getGetPaginatedExchangeListMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PaginatedMessage, org.example.api.GrpcAPI.ExchangeList> getGetPaginatedExchangeListMethod;
    if ((getGetPaginatedExchangeListMethod = WalletGrpc.getGetPaginatedExchangeListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedExchangeListMethod = WalletGrpc.getGetPaginatedExchangeListMethod) == null) {
          WalletGrpc.getGetPaginatedExchangeListMethod = getGetPaginatedExchangeListMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.PaginatedMessage, org.example.api.GrpcAPI.ExchangeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedExchangeList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.ExchangeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedExchangeList"))
              .build();
        }
      }
    }
    return getGetPaginatedExchangeListMethod;
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
    if ((getGetExchangeByIdMethod = WalletGrpc.getGetExchangeByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetExchangeByIdMethod = WalletGrpc.getGetExchangeByIdMethod) == null) {
          WalletGrpc.getGetExchangeByIdMethod = getGetExchangeByIdMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.Exchange>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExchangeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Exchange.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetExchangeById"))
              .build();
        }
      }
    }
    return getGetExchangeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.protos.Protocol.ChainParameters> getGetChainParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChainParameters",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.protos.Protocol.ChainParameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.protos.Protocol.ChainParameters> getGetChainParametersMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.ChainParameters> getGetChainParametersMethod;
    if ((getGetChainParametersMethod = WalletGrpc.getGetChainParametersMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetChainParametersMethod = WalletGrpc.getGetChainParametersMethod) == null) {
          WalletGrpc.getGetChainParametersMethod = getGetChainParametersMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.ChainParameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChainParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.ChainParameters.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetChainParameters"))
              .build();
        }
      }
    }
    return getGetChainParametersMethod;
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
    if ((getGetAssetIssueListMethod = WalletGrpc.getGetAssetIssueListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueListMethod = WalletGrpc.getGetAssetIssueListMethod) == null) {
          WalletGrpc.getGetAssetIssueListMethod = getGetAssetIssueListMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueList"))
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
    if ((getGetPaginatedAssetIssueListMethod = WalletGrpc.getGetPaginatedAssetIssueListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedAssetIssueListMethod = WalletGrpc.getGetPaginatedAssetIssueListMethod) == null) {
          WalletGrpc.getGetPaginatedAssetIssueListMethod = getGetPaginatedAssetIssueListMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.PaginatedMessage, org.example.api.GrpcAPI.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedAssetIssueList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedAssetIssueList"))
              .build();
        }
      }
    }
    return getGetPaginatedAssetIssueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.NumberMessage> getTotalTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalTransaction",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.NumberMessage> getTotalTransactionMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.NumberMessage> getTotalTransactionMethod;
    if ((getTotalTransactionMethod = WalletGrpc.getTotalTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTotalTransactionMethod = WalletGrpc.getTotalTransactionMethod) == null) {
          WalletGrpc.getTotalTransactionMethod = getTotalTransactionMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TotalTransaction"))
              .build();
        }
      }
    }
    return getTotalTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNextMaintenanceTime",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod;
    if ((getGetNextMaintenanceTimeMethod = WalletGrpc.getGetNextMaintenanceTimeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNextMaintenanceTimeMethod = WalletGrpc.getGetNextMaintenanceTimeMethod) == null) {
          WalletGrpc.getGetNextMaintenanceTimeMethod = getGetNextMaintenanceTimeMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNextMaintenanceTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNextMaintenanceTime"))
              .build();
        }
      }
    }
    return getGetNextMaintenanceTimeMethod;
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
    if ((getGetTransactionInfoByIdMethod = WalletGrpc.getGetTransactionInfoByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionInfoByIdMethod = WalletGrpc.getGetTransactionInfoByIdMethod) == null) {
          WalletGrpc.getGetTransactionInfoByIdMethod = getGetTransactionInfoByIdMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.TransactionInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionInfoById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.TransactionInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionInfoById"))
              .build();
        }
      }
    }
    return getGetTransactionInfoByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.AccountPermissionUpdateContract,
      org.example.api.GrpcAPI.TransactionExtention> getAccountPermissionUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountPermissionUpdate",
      requestType = org.example.protos.contract.AccountContract.AccountPermissionUpdateContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.AccountPermissionUpdateContract,
      org.example.api.GrpcAPI.TransactionExtention> getAccountPermissionUpdateMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.AccountContract.AccountPermissionUpdateContract, org.example.api.GrpcAPI.TransactionExtention> getAccountPermissionUpdateMethod;
    if ((getAccountPermissionUpdateMethod = WalletGrpc.getAccountPermissionUpdateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getAccountPermissionUpdateMethod = WalletGrpc.getAccountPermissionUpdateMethod) == null) {
          WalletGrpc.getAccountPermissionUpdateMethod = getAccountPermissionUpdateMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.AccountContract.AccountPermissionUpdateContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountPermissionUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.AccountContract.AccountPermissionUpdateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("AccountPermissionUpdate"))
              .build();
        }
      }
    }
    return getAccountPermissionUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.Protocol.Transaction,
      org.example.api.GrpcAPI.TransactionSignWeight> getGetTransactionSignWeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSignWeight",
      requestType = org.example.protos.Protocol.Transaction.class,
      responseType = org.example.api.GrpcAPI.TransactionSignWeight.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.Protocol.Transaction,
      org.example.api.GrpcAPI.TransactionSignWeight> getGetTransactionSignWeightMethod() {
    io.grpc.MethodDescriptor<org.example.protos.Protocol.Transaction, org.example.api.GrpcAPI.TransactionSignWeight> getGetTransactionSignWeightMethod;
    if ((getGetTransactionSignWeightMethod = WalletGrpc.getGetTransactionSignWeightMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSignWeightMethod = WalletGrpc.getGetTransactionSignWeightMethod) == null) {
          WalletGrpc.getGetTransactionSignWeightMethod = getGetTransactionSignWeightMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.Transaction, org.example.api.GrpcAPI.TransactionSignWeight>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSignWeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionSignWeight.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSignWeight"))
              .build();
        }
      }
    }
    return getGetTransactionSignWeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.Protocol.Transaction,
      org.example.api.GrpcAPI.TransactionApprovedList> getGetTransactionApprovedListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionApprovedList",
      requestType = org.example.protos.Protocol.Transaction.class,
      responseType = org.example.api.GrpcAPI.TransactionApprovedList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.Protocol.Transaction,
      org.example.api.GrpcAPI.TransactionApprovedList> getGetTransactionApprovedListMethod() {
    io.grpc.MethodDescriptor<org.example.protos.Protocol.Transaction, org.example.api.GrpcAPI.TransactionApprovedList> getGetTransactionApprovedListMethod;
    if ((getGetTransactionApprovedListMethod = WalletGrpc.getGetTransactionApprovedListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionApprovedListMethod = WalletGrpc.getGetTransactionApprovedListMethod) == null) {
          WalletGrpc.getGetTransactionApprovedListMethod = getGetTransactionApprovedListMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.Transaction, org.example.api.GrpcAPI.TransactionApprovedList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionApprovedList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionApprovedList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionApprovedList"))
              .build();
        }
      }
    }
    return getGetTransactionApprovedListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.protos.Protocol.NodeInfo> getGetNodeInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNodeInfo",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.protos.Protocol.NodeInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.protos.Protocol.NodeInfo> getGetNodeInfoMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.NodeInfo> getGetNodeInfoMethod;
    if ((getGetNodeInfoMethod = WalletGrpc.getGetNodeInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNodeInfoMethod = WalletGrpc.getGetNodeInfoMethod) == null) {
          WalletGrpc.getGetNodeInfoMethod = getGetNodeInfoMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.protos.Protocol.NodeInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNodeInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.NodeInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNodeInfo"))
              .build();
        }
      }
    }
    return getGetNodeInfoMethod;
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
    if ((getGetRewardInfoMethod = WalletGrpc.getGetRewardInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetRewardInfoMethod = WalletGrpc.getGetRewardInfoMethod) == null) {
          WalletGrpc.getGetRewardInfoMethod = getGetRewardInfoMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRewardInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetRewardInfo"))
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
    if ((getGetBrokerageInfoMethod = WalletGrpc.getGetBrokerageInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBrokerageInfoMethod = WalletGrpc.getGetBrokerageInfoMethod) == null) {
          WalletGrpc.getGetBrokerageInfoMethod = getGetBrokerageInfoMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBrokerageInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBrokerageInfo"))
              .build();
        }
      }
    }
    return getGetBrokerageInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.contract.StorageContract.UpdateBrokerageContract,
      org.example.api.GrpcAPI.TransactionExtention> getUpdateBrokerageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBrokerage",
      requestType = org.example.protos.contract.StorageContract.UpdateBrokerageContract.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.contract.StorageContract.UpdateBrokerageContract,
      org.example.api.GrpcAPI.TransactionExtention> getUpdateBrokerageMethod() {
    io.grpc.MethodDescriptor<org.example.protos.contract.StorageContract.UpdateBrokerageContract, org.example.api.GrpcAPI.TransactionExtention> getUpdateBrokerageMethod;
    if ((getUpdateBrokerageMethod = WalletGrpc.getUpdateBrokerageMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getUpdateBrokerageMethod = WalletGrpc.getUpdateBrokerageMethod) == null) {
          WalletGrpc.getUpdateBrokerageMethod = getUpdateBrokerageMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.StorageContract.UpdateBrokerageContract, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBrokerage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.StorageContract.UpdateBrokerageContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("UpdateBrokerage"))
              .build();
        }
      }
    }
    return getUpdateBrokerageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PrivateParameters,
      org.example.api.GrpcAPI.TransactionExtention> getCreateShieldedTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedTransaction",
      requestType = org.example.api.GrpcAPI.PrivateParameters.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PrivateParameters,
      org.example.api.GrpcAPI.TransactionExtention> getCreateShieldedTransactionMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PrivateParameters, org.example.api.GrpcAPI.TransactionExtention> getCreateShieldedTransactionMethod;
    if ((getCreateShieldedTransactionMethod = WalletGrpc.getCreateShieldedTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedTransactionMethod = WalletGrpc.getCreateShieldedTransactionMethod) == null) {
          WalletGrpc.getCreateShieldedTransactionMethod = getCreateShieldedTransactionMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.PrivateParameters, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShieldedTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.PrivateParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedTransaction"))
              .build();
        }
      }
    }
    return getCreateShieldedTransactionMethod;
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
    if ((getGetMerkleTreeVoucherInfoMethod = WalletGrpc.getGetMerkleTreeVoucherInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMerkleTreeVoucherInfoMethod = WalletGrpc.getGetMerkleTreeVoucherInfoMethod) == null) {
          WalletGrpc.getGetMerkleTreeVoucherInfoMethod = getGetMerkleTreeVoucherInfoMethod =
              io.grpc.MethodDescriptor.<org.example.protos.contract.ShieldContract.OutputPointInfo, org.example.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMerkleTreeVoucherInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.ShieldContract.OutputPointInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.contract.ShieldContract.IncrementalMerkleVoucherInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMerkleTreeVoucherInfo"))
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
    if ((getScanNoteByIvkMethod = WalletGrpc.getScanNoteByIvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanNoteByIvkMethod = WalletGrpc.getScanNoteByIvkMethod) == null) {
          WalletGrpc.getScanNoteByIvkMethod = getScanNoteByIvkMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.IvkDecryptParameters, org.example.api.GrpcAPI.DecryptNotes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanNoteByIvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.IvkDecryptParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DecryptNotes.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanNoteByIvk"))
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
    if ((getScanAndMarkNoteByIvkMethod = WalletGrpc.getScanAndMarkNoteByIvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanAndMarkNoteByIvkMethod = WalletGrpc.getScanAndMarkNoteByIvkMethod) == null) {
          WalletGrpc.getScanAndMarkNoteByIvkMethod = getScanAndMarkNoteByIvkMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.IvkDecryptAndMarkParameters, org.example.api.GrpcAPI.DecryptNotesMarked>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanAndMarkNoteByIvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.IvkDecryptAndMarkParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DecryptNotesMarked.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanAndMarkNoteByIvk"))
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
    if ((getScanNoteByOvkMethod = WalletGrpc.getScanNoteByOvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanNoteByOvkMethod = WalletGrpc.getScanNoteByOvkMethod) == null) {
          WalletGrpc.getScanNoteByOvkMethod = getScanNoteByOvkMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.OvkDecryptParameters, org.example.api.GrpcAPI.DecryptNotes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanNoteByOvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.OvkDecryptParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DecryptNotes.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanNoteByOvk"))
              .build();
        }
      }
    }
    return getScanNoteByOvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.BytesMessage> getGetSpendingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpendingKey",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.BytesMessage> getGetSpendingKeyMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.BytesMessage> getGetSpendingKeyMethod;
    if ((getGetSpendingKeyMethod = WalletGrpc.getGetSpendingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetSpendingKeyMethod = WalletGrpc.getGetSpendingKeyMethod) == null) {
          WalletGrpc.getGetSpendingKeyMethod = getGetSpendingKeyMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpendingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetSpendingKey"))
              .build();
        }
      }
    }
    return getGetSpendingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.api.GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExpandedSpendingKey",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.api.GrpcAPI.ExpandedSpendingKeyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.api.GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.api.GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod;
    if ((getGetExpandedSpendingKeyMethod = WalletGrpc.getGetExpandedSpendingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetExpandedSpendingKeyMethod = WalletGrpc.getGetExpandedSpendingKeyMethod) == null) {
          WalletGrpc.getGetExpandedSpendingKeyMethod = getGetExpandedSpendingKeyMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.api.GrpcAPI.ExpandedSpendingKeyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExpandedSpendingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.ExpandedSpendingKeyMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetExpandedSpendingKey"))
              .build();
        }
      }
    }
    return getGetExpandedSpendingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.api.GrpcAPI.BytesMessage> getGetAkFromAskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAkFromAsk",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.api.GrpcAPI.BytesMessage> getGetAkFromAskMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.api.GrpcAPI.BytesMessage> getGetAkFromAskMethod;
    if ((getGetAkFromAskMethod = WalletGrpc.getGetAkFromAskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAkFromAskMethod = WalletGrpc.getGetAkFromAskMethod) == null) {
          WalletGrpc.getGetAkFromAskMethod = getGetAkFromAskMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAkFromAsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAkFromAsk"))
              .build();
        }
      }
    }
    return getGetAkFromAskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.api.GrpcAPI.BytesMessage> getGetNkFromNskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNkFromNsk",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.api.GrpcAPI.BytesMessage> getGetNkFromNskMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.api.GrpcAPI.BytesMessage> getGetNkFromNskMethod;
    if ((getGetNkFromNskMethod = WalletGrpc.getGetNkFromNskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNkFromNskMethod = WalletGrpc.getGetNkFromNskMethod) == null) {
          WalletGrpc.getGetNkFromNskMethod = getGetNkFromNskMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNkFromNsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNkFromNsk"))
              .build();
        }
      }
    }
    return getGetNkFromNskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.ViewingKeyMessage,
      org.example.api.GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIncomingViewingKey",
      requestType = org.example.api.GrpcAPI.ViewingKeyMessage.class,
      responseType = org.example.api.GrpcAPI.IncomingViewingKeyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.ViewingKeyMessage,
      org.example.api.GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.ViewingKeyMessage, org.example.api.GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod;
    if ((getGetIncomingViewingKeyMethod = WalletGrpc.getGetIncomingViewingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetIncomingViewingKeyMethod = WalletGrpc.getGetIncomingViewingKeyMethod) == null) {
          WalletGrpc.getGetIncomingViewingKeyMethod = getGetIncomingViewingKeyMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.ViewingKeyMessage, org.example.api.GrpcAPI.IncomingViewingKeyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIncomingViewingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.ViewingKeyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.IncomingViewingKeyMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetIncomingViewingKey"))
              .build();
        }
      }
    }
    return getGetIncomingViewingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.DiversifierMessage> getGetDiversifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDiversifier",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.DiversifierMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.DiversifierMessage> getGetDiversifierMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.DiversifierMessage> getGetDiversifierMethod;
    if ((getGetDiversifierMethod = WalletGrpc.getGetDiversifierMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDiversifierMethod = WalletGrpc.getGetDiversifierMethod) == null) {
          WalletGrpc.getGetDiversifierMethod = getGetDiversifierMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.DiversifierMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDiversifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DiversifierMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDiversifier"))
              .build();
        }
      }
    }
    return getGetDiversifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNewShieldedAddress",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.ShieldedAddressInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod;
    if ((getGetNewShieldedAddressMethod = WalletGrpc.getGetNewShieldedAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNewShieldedAddressMethod = WalletGrpc.getGetNewShieldedAddressMethod) == null) {
          WalletGrpc.getGetNewShieldedAddressMethod = getGetNewShieldedAddressMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.ShieldedAddressInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNewShieldedAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.ShieldedAddressInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNewShieldedAddress"))
              .build();
        }
      }
    }
    return getGetNewShieldedAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.IncomingViewingKeyDiversifierMessage,
      org.example.api.GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZenPaymentAddress",
      requestType = org.example.api.GrpcAPI.IncomingViewingKeyDiversifierMessage.class,
      responseType = org.example.api.GrpcAPI.PaymentAddressMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.IncomingViewingKeyDiversifierMessage,
      org.example.api.GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.IncomingViewingKeyDiversifierMessage, org.example.api.GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod;
    if ((getGetZenPaymentAddressMethod = WalletGrpc.getGetZenPaymentAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetZenPaymentAddressMethod = WalletGrpc.getGetZenPaymentAddressMethod) == null) {
          WalletGrpc.getGetZenPaymentAddressMethod = getGetZenPaymentAddressMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.IncomingViewingKeyDiversifierMessage, org.example.api.GrpcAPI.PaymentAddressMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZenPaymentAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.IncomingViewingKeyDiversifierMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.PaymentAddressMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetZenPaymentAddress"))
              .build();
        }
      }
    }
    return getGetZenPaymentAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.BytesMessage> getGetRcmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRcm",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.BytesMessage> getGetRcmMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.BytesMessage> getGetRcmMethod;
    if ((getGetRcmMethod = WalletGrpc.getGetRcmMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetRcmMethod = WalletGrpc.getGetRcmMethod) == null) {
          WalletGrpc.getGetRcmMethod = getGetRcmMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRcm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetRcm"))
              .build();
        }
      }
    }
    return getGetRcmMethod;
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
    if ((getIsSpendMethod = WalletGrpc.getIsSpendMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getIsSpendMethod = WalletGrpc.getIsSpendMethod) == null) {
          WalletGrpc.getIsSpendMethod = getIsSpendMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NoteParameters, org.example.api.GrpcAPI.SpendResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsSpend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NoteParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.SpendResult.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("IsSpend"))
              .build();
        }
      }
    }
    return getIsSpendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PrivateParametersWithoutAsk,
      org.example.api.GrpcAPI.TransactionExtention> getCreateShieldedTransactionWithoutSpendAuthSigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedTransactionWithoutSpendAuthSig",
      requestType = org.example.api.GrpcAPI.PrivateParametersWithoutAsk.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PrivateParametersWithoutAsk,
      org.example.api.GrpcAPI.TransactionExtention> getCreateShieldedTransactionWithoutSpendAuthSigMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PrivateParametersWithoutAsk, org.example.api.GrpcAPI.TransactionExtention> getCreateShieldedTransactionWithoutSpendAuthSigMethod;
    if ((getCreateShieldedTransactionWithoutSpendAuthSigMethod = WalletGrpc.getCreateShieldedTransactionWithoutSpendAuthSigMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedTransactionWithoutSpendAuthSigMethod = WalletGrpc.getCreateShieldedTransactionWithoutSpendAuthSigMethod) == null) {
          WalletGrpc.getCreateShieldedTransactionWithoutSpendAuthSigMethod = getCreateShieldedTransactionWithoutSpendAuthSigMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.PrivateParametersWithoutAsk, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShieldedTransactionWithoutSpendAuthSig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.PrivateParametersWithoutAsk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedTransactionWithoutSpendAuthSig"))
              .build();
        }
      }
    }
    return getCreateShieldedTransactionWithoutSpendAuthSigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.Protocol.Transaction,
      org.example.api.GrpcAPI.BytesMessage> getGetShieldTransactionHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetShieldTransactionHash",
      requestType = org.example.protos.Protocol.Transaction.class,
      responseType = org.example.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.Protocol.Transaction,
      org.example.api.GrpcAPI.BytesMessage> getGetShieldTransactionHashMethod() {
    io.grpc.MethodDescriptor<org.example.protos.Protocol.Transaction, org.example.api.GrpcAPI.BytesMessage> getGetShieldTransactionHashMethod;
    if ((getGetShieldTransactionHashMethod = WalletGrpc.getGetShieldTransactionHashMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetShieldTransactionHashMethod = WalletGrpc.getGetShieldTransactionHashMethod) == null) {
          WalletGrpc.getGetShieldTransactionHashMethod = getGetShieldTransactionHashMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.Transaction, org.example.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetShieldTransactionHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetShieldTransactionHash"))
              .build();
        }
      }
    }
    return getGetShieldTransactionHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.SpendAuthSigParameters,
      org.example.api.GrpcAPI.BytesMessage> getCreateSpendAuthSigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSpendAuthSig",
      requestType = org.example.api.GrpcAPI.SpendAuthSigParameters.class,
      responseType = org.example.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.SpendAuthSigParameters,
      org.example.api.GrpcAPI.BytesMessage> getCreateSpendAuthSigMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.SpendAuthSigParameters, org.example.api.GrpcAPI.BytesMessage> getCreateSpendAuthSigMethod;
    if ((getCreateSpendAuthSigMethod = WalletGrpc.getCreateSpendAuthSigMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateSpendAuthSigMethod = WalletGrpc.getCreateSpendAuthSigMethod) == null) {
          WalletGrpc.getCreateSpendAuthSigMethod = getCreateSpendAuthSigMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.SpendAuthSigParameters, org.example.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSpendAuthSig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.SpendAuthSigParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateSpendAuthSig"))
              .build();
        }
      }
    }
    return getCreateSpendAuthSigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NfParameters,
      org.example.api.GrpcAPI.BytesMessage> getCreateShieldNullifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldNullifier",
      requestType = org.example.api.GrpcAPI.NfParameters.class,
      responseType = org.example.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NfParameters,
      org.example.api.GrpcAPI.BytesMessage> getCreateShieldNullifierMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.NfParameters, org.example.api.GrpcAPI.BytesMessage> getCreateShieldNullifierMethod;
    if ((getCreateShieldNullifierMethod = WalletGrpc.getCreateShieldNullifierMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldNullifierMethod = WalletGrpc.getCreateShieldNullifierMethod) == null) {
          WalletGrpc.getCreateShieldNullifierMethod = getCreateShieldNullifierMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NfParameters, org.example.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShieldNullifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NfParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldNullifier"))
              .build();
        }
      }
    }
    return getCreateShieldNullifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PrivateShieldedTRC20Parameters,
      org.example.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedContractParameters",
      requestType = org.example.api.GrpcAPI.PrivateShieldedTRC20Parameters.class,
      responseType = org.example.api.GrpcAPI.ShieldedTRC20Parameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PrivateShieldedTRC20Parameters,
      org.example.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PrivateShieldedTRC20Parameters, org.example.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod;
    if ((getCreateShieldedContractParametersMethod = WalletGrpc.getCreateShieldedContractParametersMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedContractParametersMethod = WalletGrpc.getCreateShieldedContractParametersMethod) == null) {
          WalletGrpc.getCreateShieldedContractParametersMethod = getCreateShieldedContractParametersMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.PrivateShieldedTRC20Parameters, org.example.api.GrpcAPI.ShieldedTRC20Parameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShieldedContractParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.PrivateShieldedTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.ShieldedTRC20Parameters.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedContractParameters"))
              .build();
        }
      }
    }
    return getCreateShieldedContractParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
      org.example.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedContractParametersWithoutAsk",
      requestType = org.example.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk.class,
      responseType = org.example.api.GrpcAPI.ShieldedTRC20Parameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
      org.example.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk, org.example.api.GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod;
    if ((getCreateShieldedContractParametersWithoutAskMethod = WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedContractParametersWithoutAskMethod = WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod) == null) {
          WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod = getCreateShieldedContractParametersWithoutAskMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk, org.example.api.GrpcAPI.ShieldedTRC20Parameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShieldedContractParametersWithoutAsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.ShieldedTRC20Parameters.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedContractParametersWithoutAsk"))
              .build();
        }
      }
    }
    return getCreateShieldedContractParametersWithoutAskMethod;
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
    if ((getScanShieldedTRC20NotesByIvkMethod = WalletGrpc.getScanShieldedTRC20NotesByIvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanShieldedTRC20NotesByIvkMethod = WalletGrpc.getScanShieldedTRC20NotesByIvkMethod) == null) {
          WalletGrpc.getScanShieldedTRC20NotesByIvkMethod = getScanShieldedTRC20NotesByIvkMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.IvkDecryptTRC20Parameters, org.example.api.GrpcAPI.DecryptNotesTRC20>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanShieldedTRC20NotesByIvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.IvkDecryptTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DecryptNotesTRC20.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanShieldedTRC20NotesByIvk"))
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
    if ((getScanShieldedTRC20NotesByOvkMethod = WalletGrpc.getScanShieldedTRC20NotesByOvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanShieldedTRC20NotesByOvkMethod = WalletGrpc.getScanShieldedTRC20NotesByOvkMethod) == null) {
          WalletGrpc.getScanShieldedTRC20NotesByOvkMethod = getScanShieldedTRC20NotesByOvkMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.OvkDecryptTRC20Parameters, org.example.api.GrpcAPI.DecryptNotesTRC20>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanShieldedTRC20NotesByOvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.OvkDecryptTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.DecryptNotesTRC20.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanShieldedTRC20NotesByOvk"))
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
    if ((getIsShieldedTRC20ContractNoteSpentMethod = WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getIsShieldedTRC20ContractNoteSpentMethod = WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod) == null) {
          WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod = getIsShieldedTRC20ContractNoteSpentMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NfTRC20Parameters, org.example.api.GrpcAPI.NullifierResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsShieldedTRC20ContractNoteSpent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NfTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NullifierResult.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("IsShieldedTRC20ContractNoteSpent"))
              .build();
        }
      }
    }
    return getIsShieldedTRC20ContractNoteSpentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.ShieldedTRC20TriggerContractParameters,
      org.example.api.GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTriggerInputForShieldedTRC20Contract",
      requestType = org.example.api.GrpcAPI.ShieldedTRC20TriggerContractParameters.class,
      responseType = org.example.api.GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.ShieldedTRC20TriggerContractParameters,
      org.example.api.GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.ShieldedTRC20TriggerContractParameters, org.example.api.GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod;
    if ((getGetTriggerInputForShieldedTRC20ContractMethod = WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTriggerInputForShieldedTRC20ContractMethod = WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod) == null) {
          WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod = getGetTriggerInputForShieldedTRC20ContractMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.ShieldedTRC20TriggerContractParameters, org.example.api.GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTriggerInputForShieldedTRC20Contract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.ShieldedTRC20TriggerContractParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTriggerInputForShieldedTRC20Contract"))
              .build();
        }
      }
    }
    return getGetTriggerInputForShieldedTRC20ContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protos.Protocol.Transaction,
      org.example.api.GrpcAPI.TransactionExtention> getCreateCommonTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCommonTransaction",
      requestType = org.example.protos.Protocol.Transaction.class,
      responseType = org.example.api.GrpcAPI.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protos.Protocol.Transaction,
      org.example.api.GrpcAPI.TransactionExtention> getCreateCommonTransactionMethod() {
    io.grpc.MethodDescriptor<org.example.protos.Protocol.Transaction, org.example.api.GrpcAPI.TransactionExtention> getCreateCommonTransactionMethod;
    if ((getCreateCommonTransactionMethod = WalletGrpc.getCreateCommonTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateCommonTransactionMethod = WalletGrpc.getCreateCommonTransactionMethod) == null) {
          WalletGrpc.getCreateCommonTransactionMethod = getCreateCommonTransactionMethod =
              io.grpc.MethodDescriptor.<org.example.protos.Protocol.Transaction, org.example.api.GrpcAPI.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCommonTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateCommonTransaction"))
              .build();
        }
      }
    }
    return getCreateCommonTransactionMethod;
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
    if ((getGetTransactionInfoByBlockNumMethod = WalletGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionInfoByBlockNumMethod = WalletGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
          WalletGrpc.getGetTransactionInfoByBlockNumMethod = getGetTransactionInfoByBlockNumMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.NumberMessage, org.example.api.GrpcAPI.TransactionInfoList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionInfoByBlockNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionInfoList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionInfoByBlockNum"))
              .build();
        }
      }
    }
    return getGetTransactionInfoByBlockNumMethod;
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
    if ((getGetBurnTrxMethod = WalletGrpc.getGetBurnTrxMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBurnTrxMethod = WalletGrpc.getGetBurnTrxMethod) == null) {
          WalletGrpc.getGetBurnTrxMethod = getGetBurnTrxMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBurnTrx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBurnTrx"))
              .build();
        }
      }
    }
    return getGetBurnTrxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.Transaction> getGetTransactionFromPendingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionFromPending",
      requestType = org.example.api.GrpcAPI.BytesMessage.class,
      responseType = org.example.protos.Protocol.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage,
      org.example.protos.Protocol.Transaction> getGetTransactionFromPendingMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.Transaction> getGetTransactionFromPendingMethod;
    if ((getGetTransactionFromPendingMethod = WalletGrpc.getGetTransactionFromPendingMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionFromPendingMethod = WalletGrpc.getGetTransactionFromPendingMethod) == null) {
          WalletGrpc.getGetTransactionFromPendingMethod = getGetTransactionFromPendingMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BytesMessage, org.example.protos.Protocol.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionFromPending"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protos.Protocol.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionFromPending"))
              .build();
        }
      }
    }
    return getGetTransactionFromPendingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.TransactionIdList> getGetTransactionListFromPendingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionListFromPending",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.TransactionIdList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.TransactionIdList> getGetTransactionListFromPendingMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.TransactionIdList> getGetTransactionListFromPendingMethod;
    if ((getGetTransactionListFromPendingMethod = WalletGrpc.getGetTransactionListFromPendingMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionListFromPendingMethod = WalletGrpc.getGetTransactionListFromPendingMethod) == null) {
          WalletGrpc.getGetTransactionListFromPendingMethod = getGetTransactionListFromPendingMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.TransactionIdList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionListFromPending"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.TransactionIdList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionListFromPending"))
              .build();
        }
      }
    }
    return getGetTransactionListFromPendingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.NumberMessage> getGetPendingSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPendingSize",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.NumberMessage> getGetPendingSizeMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.NumberMessage> getGetPendingSizeMethod;
    if ((getGetPendingSizeMethod = WalletGrpc.getGetPendingSizeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPendingSizeMethod = WalletGrpc.getGetPendingSizeMethod) == null) {
          WalletGrpc.getGetPendingSizeMethod = getGetPendingSizeMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPendingSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPendingSize"))
              .build();
        }
      }
    }
    return getGetPendingSizeMethod;
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
    if ((getGetBlockMethod = WalletGrpc.getGetBlockMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockMethod = WalletGrpc.getGetBlockMethod) == null) {
          WalletGrpc.getGetBlockMethod = getGetBlockMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.BlockReq, org.example.api.GrpcAPI.BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BlockReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.BlockExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlock"))
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
    if ((getGetBandwidthPricesMethod = WalletGrpc.getGetBandwidthPricesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBandwidthPricesMethod = WalletGrpc.getGetBandwidthPricesMethod) == null) {
          WalletGrpc.getGetBandwidthPricesMethod = getGetBandwidthPricesMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.PricesResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBandwidthPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.PricesResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBandwidthPrices"))
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
    if ((getGetEnergyPricesMethod = WalletGrpc.getGetEnergyPricesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetEnergyPricesMethod = WalletGrpc.getGetEnergyPricesMethod) == null) {
          WalletGrpc.getGetEnergyPricesMethod = getGetEnergyPricesMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.PricesResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnergyPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.PricesResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetEnergyPrices"))
              .build();
        }
      }
    }
    return getGetEnergyPricesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.PricesResponseMessage> getGetMemoFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMemoFee",
      requestType = org.example.api.GrpcAPI.EmptyMessage.class,
      responseType = org.example.api.GrpcAPI.PricesResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage,
      org.example.api.GrpcAPI.PricesResponseMessage> getGetMemoFeeMethod() {
    io.grpc.MethodDescriptor<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.PricesResponseMessage> getGetMemoFeeMethod;
    if ((getGetMemoFeeMethod = WalletGrpc.getGetMemoFeeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMemoFeeMethod = WalletGrpc.getGetMemoFeeMethod) == null) {
          WalletGrpc.getGetMemoFeeMethod = getGetMemoFeeMethod =
              io.grpc.MethodDescriptor.<org.example.api.GrpcAPI.EmptyMessage, org.example.api.GrpcAPI.PricesResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMemoFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.api.GrpcAPI.PricesResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMemoFee"))
              .build();
        }
      }
    }
    return getGetMemoFeeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletStub>() {
        @java.lang.Override
        public WalletStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletStub(channel, callOptions);
        }
      };
    return WalletStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletBlockingStub>() {
        @java.lang.Override
        public WalletBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletBlockingStub(channel, callOptions);
        }
      };
    return WalletBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletFutureStub>() {
        @java.lang.Override
        public WalletFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletFutureStub(channel, callOptions);
        }
      };
    return WalletFutureStub.newStub(factory, channel);
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
    default void getAccountBalance(org.example.protos.contract.BalanceContract.AccountBalanceRequest request,
        io.grpc.stub.StreamObserver<org.example.protos.contract.BalanceContract.AccountBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountBalanceMethod(), responseObserver);
    }

    /**
     */
    default void getBlockBalanceTrace(org.example.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier request,
        io.grpc.stub.StreamObserver<org.example.protos.contract.BalanceContract.BlockBalanceTrace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockBalanceTraceMethod(), responseObserver);
    }

    /**
     * <pre>
     *Please use CreateTransaction2 instead of this function.
     * </pre>
     */
    default void createTransaction(org.example.protos.contract.BalanceContract.TransferContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateTransaction.
     * </pre>
     */
    default void createTransaction2(org.example.protos.contract.BalanceContract.TransferContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTransaction2Method(), responseObserver);
    }

    /**
     */
    default void broadcastTransaction(org.example.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.Return> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBroadcastTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     *Please use UpdateAccount2 instead of this function.
     * </pre>
     */
    default void updateAccount(org.example.protos.contract.AccountContract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccountMethod(), responseObserver);
    }

    /**
     */
    default void setAccountId(org.example.protos.contract.AccountContract.SetAccountIdContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccountIdMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAccount.
     * </pre>
     */
    default void updateAccount2(org.example.protos.contract.AccountContract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAccount2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use VoteWitnessAccount2 instead of this function.
     * </pre>
     */
    default void voteWitnessAccount(org.example.protos.contract.WitnessContract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteWitnessAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     *modify the consume_user_resource_percent
     * </pre>
     */
    default void updateSetting(org.example.protos.contract.SmartContractOuterClass.UpdateSettingContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSettingMethod(), responseObserver);
    }

    /**
     * <pre>
     *modify the energy_limit
     * </pre>
     */
    default void updateEnergyLimit(org.example.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEnergyLimitMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of VoteWitnessAccount.
     * </pre>
     */
    default void voteWitnessAccount2(org.example.protos.contract.WitnessContract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteWitnessAccount2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use CreateAssetIssue2 instead of this function.
     * </pre>
     */
    default void createAssetIssue(org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAssetIssueMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateAssetIssue.
     * </pre>
     */
    default void createAssetIssue2(org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAssetIssue2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use UpdateWitness2 instead of this function.
     * </pre>
     */
    default void updateWitness(org.example.protos.contract.WitnessContract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWitnessMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UpdateWitness.
     * </pre>
     */
    default void updateWitness2(org.example.protos.contract.WitnessContract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWitness2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use CreateAccount2 instead of this function.
     * </pre>
     */
    default void createAccount(org.example.protos.contract.AccountContract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateAccount.
     * </pre>
     */
    default void createAccount2(org.example.protos.contract.AccountContract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccount2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use CreateWitness2 instead of this function.
     * </pre>
     */
    default void createWitness(org.example.protos.contract.WitnessContract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWitnessMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateWitness.
     * </pre>
     */
    default void createWitness2(org.example.protos.contract.WitnessContract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWitness2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use TransferAsset2 instead of this function.
     * </pre>
     */
    default void transferAsset(org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferAssetMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of TransferAsset.
     * </pre>
     */
    default void transferAsset2(org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferAsset2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use ParticipateAssetIssue2 instead of this function.
     * </pre>
     */
    default void participateAssetIssue(org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParticipateAssetIssueMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of ParticipateAssetIssue.
     * </pre>
     */
    default void participateAssetIssue2(org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParticipateAssetIssue2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use FreezeBalance2 instead of this function.
     * </pre>
     */
    default void freezeBalance(org.example.protos.contract.BalanceContract.FreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFreezeBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of FreezeBalance.
     * </pre>
     */
    default void freezeBalance2(org.example.protos.contract.BalanceContract.FreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFreezeBalance2Method(), responseObserver);
    }

    /**
     * <pre>
     *Use this function when FreezeBalanceV2.
     * </pre>
     */
    default void freezeBalanceV2(org.example.protos.contract.BalanceContract.FreezeBalanceV2Contract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFreezeBalanceV2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use UnfreezeBalance2 instead of this function.
     * </pre>
     */
    default void unfreezeBalance(org.example.protos.contract.BalanceContract.UnfreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnfreezeBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeBalance.
     * </pre>
     */
    default void unfreezeBalance2(org.example.protos.contract.BalanceContract.UnfreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnfreezeBalance2Method(), responseObserver);
    }

    /**
     * <pre>
     *Use this function when UnfreezeBalanceV2.
     * </pre>
     */
    default void unfreezeBalanceV2(org.example.protos.contract.BalanceContract.UnfreezeBalanceV2Contract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnfreezeBalanceV2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use UnfreezeAsset2 instead of this function.
     * </pre>
     */
    default void unfreezeAsset(org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnfreezeAssetMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeAsset.
     * </pre>
     */
    default void unfreezeAsset2(org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnfreezeAsset2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use WithdrawBalance2 instead of this function.
     * </pre>
     */
    default void withdrawBalance(org.example.protos.contract.BalanceContract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of WithdrawBalance.
     * </pre>
     */
    default void withdrawBalance2(org.example.protos.contract.BalanceContract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawBalance2Method(), responseObserver);
    }

    /**
     */
    default void withdrawExpireUnfreeze(org.example.protos.contract.BalanceContract.WithdrawExpireUnfreezeContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawExpireUnfreezeMethod(), responseObserver);
    }

    /**
     */
    default void delegateResource(org.example.protos.contract.BalanceContract.DelegateResourceContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegateResourceMethod(), responseObserver);
    }

    /**
     */
    default void unDelegateResource(org.example.protos.contract.BalanceContract.UnDelegateResourceContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnDelegateResourceMethod(), responseObserver);
    }

    /**
     */
    default void cancelAllUnfreezeV2(org.example.protos.contract.BalanceContract.CancelAllUnfreezeV2Contract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelAllUnfreezeV2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use UpdateAsset2 instead of this function.
     * </pre>
     */
    default void updateAsset(org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAssetMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAsset.
     * </pre>
     */
    default void updateAsset2(org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAsset2Method(), responseObserver);
    }

    /**
     */
    default void proposalCreate(org.example.protos.contract.ProposalContract.ProposalCreateContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalCreateMethod(), responseObserver);
    }

    /**
     */
    default void proposalApprove(org.example.protos.contract.ProposalContract.ProposalApproveContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalApproveMethod(), responseObserver);
    }

    /**
     */
    default void proposalDelete(org.example.protos.contract.ProposalContract.ProposalDeleteContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalDeleteMethod(), responseObserver);
    }

    /**
     */
    default void buyStorage(org.example.protos.contract.StorageContract.BuyStorageContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyStorageMethod(), responseObserver);
    }

    /**
     */
    default void buyStorageBytes(org.example.protos.contract.StorageContract.BuyStorageBytesContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyStorageBytesMethod(), responseObserver);
    }

    /**
     */
    default void sellStorage(org.example.protos.contract.StorageContract.SellStorageContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellStorageMethod(), responseObserver);
    }

    /**
     */
    default void exchangeCreate(org.example.protos.contract.ExchangeContract.ExchangeCreateContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeCreateMethod(), responseObserver);
    }

    /**
     */
    default void exchangeInject(org.example.protos.contract.ExchangeContract.ExchangeInjectContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeInjectMethod(), responseObserver);
    }

    /**
     */
    default void exchangeWithdraw(org.example.protos.contract.ExchangeContract.ExchangeWithdrawContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeWithdrawMethod(), responseObserver);
    }

    /**
     */
    default void exchangeTransaction(org.example.protos.contract.ExchangeContract.ExchangeTransactionContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeTransactionMethod(), responseObserver);
    }

    /**
     */
    default void marketSellAsset(org.example.protos.contract.MarketContract.MarketSellAssetContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarketSellAssetMethod(), responseObserver);
    }

    /**
     */
    default void marketCancelOrder(org.example.protos.contract.MarketContract.MarketCancelOrderContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarketCancelOrderMethod(), responseObserver);
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
    default void listNodes(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NodeList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNodesMethod(), responseObserver);
    }

    /**
     */
    default void getAssetIssueByAccount(org.example.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AssetIssueList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetIssueByAccountMethod(), responseObserver);
    }

    /**
     */
    default void getAccountNet(org.example.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AccountNetMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountNetMethod(), responseObserver);
    }

    /**
     */
    default void getAccountResource(org.example.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AccountResourceMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountResourceMethod(), responseObserver);
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
    default void getBlockById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Block> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     *Please use GetBlockByLimitNext2 instead of this function.
     * </pre>
     */
    default void getBlockByLimitNext(org.example.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByLimitNextMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLimitNext.
     * </pre>
     */
    default void getBlockByLimitNext2(org.example.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockListExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByLimitNext2Method(), responseObserver);
    }

    /**
     * <pre>
     *Please use GetBlockByLatestNum2 instead of this function.
     * </pre>
     */
    default void getBlockByLatestNum(org.example.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByLatestNumMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLatestNum.
     * </pre>
     */
    default void getBlockByLatestNum2(org.example.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockListExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByLatestNum2Method(), responseObserver);
    }

    /**
     */
    default void getTransactionById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionByIdMethod(), responseObserver);
    }

    /**
     */
    default void deployContract(org.example.protos.contract.SmartContractOuterClass.CreateSmartContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeployContractMethod(), responseObserver);
    }

    /**
     */
    default void getContract(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.contract.SmartContractOuterClass.SmartContract> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContractMethod(), responseObserver);
    }

    /**
     */
    default void getContractInfo(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.contract.SmartContractOuterClass.SmartContractDataWrapper> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContractInfoMethod(), responseObserver);
    }

    /**
     */
    default void triggerContract(org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTriggerContractMethod(), responseObserver);
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
    default void clearContractABI(org.example.protos.contract.SmartContractOuterClass.ClearABIContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearContractABIMethod(), responseObserver);
    }

    /**
     */
    default void listWitnesses(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.WitnessList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWitnessesMethod(), responseObserver);
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
    default void listProposals(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ProposalList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProposalsMethod(), responseObserver);
    }

    /**
     */
    default void getPaginatedProposalList(org.example.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ProposalList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPaginatedProposalListMethod(), responseObserver);
    }

    /**
     */
    default void getProposalById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Proposal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProposalByIdMethod(), responseObserver);
    }

    /**
     */
    default void listExchanges(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ExchangeList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListExchangesMethod(), responseObserver);
    }

    /**
     */
    default void getPaginatedExchangeList(org.example.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ExchangeList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPaginatedExchangeListMethod(), responseObserver);
    }

    /**
     */
    default void getExchangeById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Exchange> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExchangeByIdMethod(), responseObserver);
    }

    /**
     */
    default void getChainParameters(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.ChainParameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChainParametersMethod(), responseObserver);
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
    default void totalTransaction(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalTransactionMethod(), responseObserver);
    }

    /**
     */
    default void getNextMaintenanceTime(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNextMaintenanceTimeMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionInfoById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.TransactionInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionInfoByIdMethod(), responseObserver);
    }

    /**
     */
    default void accountPermissionUpdate(org.example.protos.contract.AccountContract.AccountPermissionUpdateContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountPermissionUpdateMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionSignWeight(org.example.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionSignWeight> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionSignWeightMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionApprovedList(org.example.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionApprovedList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionApprovedListMethod(), responseObserver);
    }

    /**
     */
    default void getNodeInfo(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.NodeInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNodeInfoMethod(), responseObserver);
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
    default void updateBrokerage(org.example.protos.contract.StorageContract.UpdateBrokerageContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBrokerageMethod(), responseObserver);
    }

    /**
     * <pre>
     * for shiededTransaction
     * </pre>
     */
    default void createShieldedTransaction(org.example.api.GrpcAPI.PrivateParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateShieldedTransactionMethod(), responseObserver);
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
    default void getSpendingKey(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSpendingKeyMethod(), responseObserver);
    }

    /**
     */
    default void getExpandedSpendingKey(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ExpandedSpendingKeyMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExpandedSpendingKeyMethod(), responseObserver);
    }

    /**
     */
    default void getAkFromAsk(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAkFromAskMethod(), responseObserver);
    }

    /**
     */
    default void getNkFromNsk(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNkFromNskMethod(), responseObserver);
    }

    /**
     */
    default void getIncomingViewingKey(org.example.api.GrpcAPI.ViewingKeyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.IncomingViewingKeyMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIncomingViewingKeyMethod(), responseObserver);
    }

    /**
     */
    default void getDiversifier(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DiversifierMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDiversifierMethod(), responseObserver);
    }

    /**
     */
    default void getNewShieldedAddress(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ShieldedAddressInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNewShieldedAddressMethod(), responseObserver);
    }

    /**
     */
    default void getZenPaymentAddress(org.example.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.PaymentAddressMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZenPaymentAddressMethod(), responseObserver);
    }

    /**
     */
    default void getRcm(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRcmMethod(), responseObserver);
    }

    /**
     */
    default void isSpend(org.example.api.GrpcAPI.NoteParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.SpendResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsSpendMethod(), responseObserver);
    }

    /**
     */
    default void createShieldedTransactionWithoutSpendAuthSig(org.example.api.GrpcAPI.PrivateParametersWithoutAsk request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateShieldedTransactionWithoutSpendAuthSigMethod(), responseObserver);
    }

    /**
     */
    default void getShieldTransactionHash(org.example.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetShieldTransactionHashMethod(), responseObserver);
    }

    /**
     */
    default void createSpendAuthSig(org.example.api.GrpcAPI.SpendAuthSigParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSpendAuthSigMethod(), responseObserver);
    }

    /**
     */
    default void createShieldNullifier(org.example.api.GrpcAPI.NfParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateShieldNullifierMethod(), responseObserver);
    }

    /**
     * <pre>
     *for shielded contract
     * </pre>
     */
    default void createShieldedContractParameters(org.example.api.GrpcAPI.PrivateShieldedTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateShieldedContractParametersMethod(), responseObserver);
    }

    /**
     */
    default void createShieldedContractParametersWithoutAsk(org.example.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateShieldedContractParametersWithoutAskMethod(), responseObserver);
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
    default void getTriggerInputForShieldedTRC20Contract(org.example.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTriggerInputForShieldedTRC20ContractMethod(), responseObserver);
    }

    /**
     */
    default void createCommonTransaction(org.example.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCommonTransactionMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionInfoByBlockNum(org.example.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionInfoList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionInfoByBlockNumMethod(), responseObserver);
    }

    /**
     */
    default void getBurnTrx(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBurnTrxMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionFromPending(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionFromPendingMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionListFromPending(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionIdList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionListFromPendingMethod(), responseObserver);
    }

    /**
     */
    default void getPendingSize(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPendingSizeMethod(), responseObserver);
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

    /**
     */
    default void getMemoFee(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.PricesResponseMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMemoFeeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Wallet.
   */
  public static abstract class WalletImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WalletGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Wallet.
   */
  public static final class WalletStub
      extends io.grpc.stub.AbstractAsyncStub<WalletStub> {
    private WalletStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletStub(channel, callOptions);
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
    public void getAccountBalance(org.example.protos.contract.BalanceContract.AccountBalanceRequest request,
        io.grpc.stub.StreamObserver<org.example.protos.contract.BalanceContract.AccountBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockBalanceTrace(org.example.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier request,
        io.grpc.stub.StreamObserver<org.example.protos.contract.BalanceContract.BlockBalanceTrace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockBalanceTraceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use CreateTransaction2 instead of this function.
     * </pre>
     */
    public void createTransaction(org.example.protos.contract.BalanceContract.TransferContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateTransaction.
     * </pre>
     */
    public void createTransaction2(org.example.protos.contract.BalanceContract.TransferContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTransaction2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void broadcastTransaction(org.example.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.Return> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use UpdateAccount2 instead of this function.
     * </pre>
     */
    public void updateAccount(org.example.protos.contract.AccountContract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAccountId(org.example.protos.contract.AccountContract.SetAccountIdContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccountIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAccount.
     * </pre>
     */
    public void updateAccount2(org.example.protos.contract.AccountContract.AccountUpdateContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAccount2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use VoteWitnessAccount2 instead of this function.
     * </pre>
     */
    public void voteWitnessAccount(org.example.protos.contract.WitnessContract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteWitnessAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *modify the consume_user_resource_percent
     * </pre>
     */
    public void updateSetting(org.example.protos.contract.SmartContractOuterClass.UpdateSettingContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *modify the energy_limit
     * </pre>
     */
    public void updateEnergyLimit(org.example.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEnergyLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of VoteWitnessAccount.
     * </pre>
     */
    public void voteWitnessAccount2(org.example.protos.contract.WitnessContract.VoteWitnessContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteWitnessAccount2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use CreateAssetIssue2 instead of this function.
     * </pre>
     */
    public void createAssetIssue(org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAssetIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateAssetIssue.
     * </pre>
     */
    public void createAssetIssue2(org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAssetIssue2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use UpdateWitness2 instead of this function.
     * </pre>
     */
    public void updateWitness(org.example.protos.contract.WitnessContract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWitnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UpdateWitness.
     * </pre>
     */
    public void updateWitness2(org.example.protos.contract.WitnessContract.WitnessUpdateContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWitness2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use CreateAccount2 instead of this function.
     * </pre>
     */
    public void createAccount(org.example.protos.contract.AccountContract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateAccount.
     * </pre>
     */
    public void createAccount2(org.example.protos.contract.AccountContract.AccountCreateContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccount2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use CreateWitness2 instead of this function.
     * </pre>
     */
    public void createWitness(org.example.protos.contract.WitnessContract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWitnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of CreateWitness.
     * </pre>
     */
    public void createWitness2(org.example.protos.contract.WitnessContract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWitness2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use TransferAsset2 instead of this function.
     * </pre>
     */
    public void transferAsset(org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of TransferAsset.
     * </pre>
     */
    public void transferAsset2(org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferAsset2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use ParticipateAssetIssue2 instead of this function.
     * </pre>
     */
    public void participateAssetIssue(org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParticipateAssetIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of ParticipateAssetIssue.
     * </pre>
     */
    public void participateAssetIssue2(org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParticipateAssetIssue2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use FreezeBalance2 instead of this function.
     * </pre>
     */
    public void freezeBalance(org.example.protos.contract.BalanceContract.FreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFreezeBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of FreezeBalance.
     * </pre>
     */
    public void freezeBalance2(org.example.protos.contract.BalanceContract.FreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFreezeBalance2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function when FreezeBalanceV2.
     * </pre>
     */
    public void freezeBalanceV2(org.example.protos.contract.BalanceContract.FreezeBalanceV2Contract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFreezeBalanceV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use UnfreezeBalance2 instead of this function.
     * </pre>
     */
    public void unfreezeBalance(org.example.protos.contract.BalanceContract.UnfreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnfreezeBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeBalance.
     * </pre>
     */
    public void unfreezeBalance2(org.example.protos.contract.BalanceContract.UnfreezeBalanceContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnfreezeBalance2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function when UnfreezeBalanceV2.
     * </pre>
     */
    public void unfreezeBalanceV2(org.example.protos.contract.BalanceContract.UnfreezeBalanceV2Contract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnfreezeBalanceV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use UnfreezeAsset2 instead of this function.
     * </pre>
     */
    public void unfreezeAsset(org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnfreezeAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeAsset.
     * </pre>
     */
    public void unfreezeAsset2(org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnfreezeAsset2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use WithdrawBalance2 instead of this function.
     * </pre>
     */
    public void withdrawBalance(org.example.protos.contract.BalanceContract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of WithdrawBalance.
     * </pre>
     */
    public void withdrawBalance2(org.example.protos.contract.BalanceContract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawBalance2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawExpireUnfreeze(org.example.protos.contract.BalanceContract.WithdrawExpireUnfreezeContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawExpireUnfreezeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delegateResource(org.example.protos.contract.BalanceContract.DelegateResourceContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegateResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unDelegateResource(org.example.protos.contract.BalanceContract.UnDelegateResourceContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnDelegateResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelAllUnfreezeV2(org.example.protos.contract.BalanceContract.CancelAllUnfreezeV2Contract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelAllUnfreezeV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use UpdateAsset2 instead of this function.
     * </pre>
     */
    public void updateAsset(org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAsset.
     * </pre>
     */
    public void updateAsset2(org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAsset2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proposalCreate(org.example.protos.contract.ProposalContract.ProposalCreateContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposalCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proposalApprove(org.example.protos.contract.ProposalContract.ProposalApproveContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposalApproveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void proposalDelete(org.example.protos.contract.ProposalContract.ProposalDeleteContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposalDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buyStorage(org.example.protos.contract.StorageContract.BuyStorageContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buyStorageBytes(org.example.protos.contract.StorageContract.BuyStorageBytesContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyStorageBytesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sellStorage(org.example.protos.contract.StorageContract.SellStorageContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeCreate(org.example.protos.contract.ExchangeContract.ExchangeCreateContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeInject(org.example.protos.contract.ExchangeContract.ExchangeInjectContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeInjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeWithdraw(org.example.protos.contract.ExchangeContract.ExchangeWithdrawContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exchangeTransaction(org.example.protos.contract.ExchangeContract.ExchangeTransactionContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void marketSellAsset(org.example.protos.contract.MarketContract.MarketSellAssetContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarketSellAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void marketCancelOrder(org.example.protos.contract.MarketContract.MarketCancelOrderContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarketCancelOrderMethod(), getCallOptions()), request, responseObserver);
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
    public void listNodes(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NodeList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueByAccount(org.example.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AssetIssueList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountNet(org.example.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AccountNetMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountNetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountResource(org.example.protos.Protocol.Account request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AccountResourceMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountResourceMethod(), getCallOptions()), request, responseObserver);
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
    public void getBlockById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Block> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use GetBlockByLimitNext2 instead of this function.
     * </pre>
     */
    public void getBlockByLimitNext(org.example.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByLimitNextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLimitNext.
     * </pre>
     */
    public void getBlockByLimitNext2(org.example.api.GrpcAPI.BlockLimit request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockListExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByLimitNext2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Please use GetBlockByLatestNum2 instead of this function.
     * </pre>
     */
    public void getBlockByLatestNum(org.example.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByLatestNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLatestNum.
     * </pre>
     */
    public void getBlockByLatestNum2(org.example.api.GrpcAPI.NumberMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockListExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByLatestNum2Method(), getCallOptions()), request, responseObserver);
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
    public void deployContract(org.example.protos.contract.SmartContractOuterClass.CreateSmartContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeployContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContract(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.contract.SmartContractOuterClass.SmartContract> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContractInfo(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.contract.SmartContractOuterClass.SmartContractDataWrapper> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContractInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerContract(org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTriggerContractMethod(), getCallOptions()), request, responseObserver);
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
    public void clearContractABI(org.example.protos.contract.SmartContractOuterClass.ClearABIContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearContractABIMethod(), getCallOptions()), request, responseObserver);
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
    public void listProposals(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ProposalList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProposalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedProposalList(org.example.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ProposalList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPaginatedProposalListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProposalById(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Proposal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProposalByIdMethod(), getCallOptions()), request, responseObserver);
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
    public void getPaginatedExchangeList(org.example.api.GrpcAPI.PaginatedMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ExchangeList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPaginatedExchangeListMethod(), getCallOptions()), request, responseObserver);
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
    public void getChainParameters(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.ChainParameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetChainParametersMethod(), getCallOptions()), request, responseObserver);
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
    public void totalTransaction(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNextMaintenanceTime(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNextMaintenanceTimeMethod(), getCallOptions()), request, responseObserver);
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
    public void accountPermissionUpdate(org.example.protos.contract.AccountContract.AccountPermissionUpdateContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountPermissionUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionSignWeight(org.example.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionSignWeight> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionSignWeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionApprovedList(org.example.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionApprovedList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionApprovedListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNodeInfo(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.NodeInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request, responseObserver);
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
    public void updateBrokerage(org.example.protos.contract.StorageContract.UpdateBrokerageContract request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBrokerageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * for shiededTransaction
     * </pre>
     */
    public void createShieldedTransaction(org.example.api.GrpcAPI.PrivateParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateShieldedTransactionMethod(), getCallOptions()), request, responseObserver);
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
    public void getSpendingKey(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSpendingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExpandedSpendingKey(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ExpandedSpendingKeyMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExpandedSpendingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAkFromAsk(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAkFromAskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNkFromNsk(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNkFromNskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIncomingViewingKey(org.example.api.GrpcAPI.ViewingKeyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.IncomingViewingKeyMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIncomingViewingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDiversifier(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DiversifierMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDiversifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNewShieldedAddress(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ShieldedAddressInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNewShieldedAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZenPaymentAddress(org.example.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.PaymentAddressMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZenPaymentAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRcm(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRcmMethod(), getCallOptions()), request, responseObserver);
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
    public void createShieldedTransactionWithoutSpendAuthSig(org.example.api.GrpcAPI.PrivateParametersWithoutAsk request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateShieldedTransactionWithoutSpendAuthSigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getShieldTransactionHash(org.example.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetShieldTransactionHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSpendAuthSig(org.example.api.GrpcAPI.SpendAuthSigParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSpendAuthSigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createShieldNullifier(org.example.api.GrpcAPI.NfParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateShieldNullifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *for shielded contract
     * </pre>
     */
    public void createShieldedContractParameters(org.example.api.GrpcAPI.PrivateShieldedTRC20Parameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createShieldedContractParametersWithoutAsk(org.example.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions()), request, responseObserver);
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
    public void getTriggerInputForShieldedTRC20Contract(org.example.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCommonTransaction(org.example.protos.Protocol.Transaction request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCommonTransactionMethod(), getCallOptions()), request, responseObserver);
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
    public void getBurnTrx(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBurnTrxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionFromPending(org.example.api.GrpcAPI.BytesMessage request,
        io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionFromPendingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionListFromPending(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionIdList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionListFromPendingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPendingSize(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPendingSizeMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public void getMemoFee(org.example.api.GrpcAPI.EmptyMessage request,
        io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.PricesResponseMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMemoFeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Wallet.
   */
  public static final class WalletBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WalletBlockingStub> {
    private WalletBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletBlockingStub(channel, callOptions);
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
    public org.example.protos.contract.BalanceContract.AccountBalanceResponse getAccountBalance(org.example.protos.contract.BalanceContract.AccountBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.contract.BalanceContract.BlockBalanceTrace getBlockBalanceTrace(org.example.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockBalanceTraceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use CreateTransaction2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Transaction createTransaction(org.example.protos.contract.BalanceContract.TransferContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateTransaction.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention createTransaction2(org.example.protos.contract.BalanceContract.TransferContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTransaction2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.Return broadcastTransaction(org.example.protos.Protocol.Transaction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBroadcastTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use UpdateAccount2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Transaction updateAccount(org.example.protos.contract.AccountContract.AccountUpdateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.Transaction setAccountId(org.example.protos.contract.AccountContract.SetAccountIdContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccountIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAccount.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention updateAccount2(org.example.protos.contract.AccountContract.AccountUpdateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAccount2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use VoteWitnessAccount2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Transaction voteWitnessAccount(org.example.protos.contract.WitnessContract.VoteWitnessContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteWitnessAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *modify the consume_user_resource_percent
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention updateSetting(org.example.protos.contract.SmartContractOuterClass.UpdateSettingContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSettingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *modify the energy_limit
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention updateEnergyLimit(org.example.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEnergyLimitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of VoteWitnessAccount.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention voteWitnessAccount2(org.example.protos.contract.WitnessContract.VoteWitnessContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteWitnessAccount2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use CreateAssetIssue2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Transaction createAssetIssue(org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAssetIssueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateAssetIssue.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention createAssetIssue2(org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAssetIssue2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use UpdateWitness2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Transaction updateWitness(org.example.protos.contract.WitnessContract.WitnessUpdateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWitnessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of UpdateWitness.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention updateWitness2(org.example.protos.contract.WitnessContract.WitnessUpdateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWitness2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use CreateAccount2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Transaction createAccount(org.example.protos.contract.AccountContract.AccountCreateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateAccount.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention createAccount2(org.example.protos.contract.AccountContract.AccountCreateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccount2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use CreateWitness2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Transaction createWitness(org.example.protos.contract.WitnessContract.WitnessCreateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWitnessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateWitness.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention createWitness2(org.example.protos.contract.WitnessContract.WitnessCreateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWitness2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use TransferAsset2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Transaction transferAsset(org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferAssetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of TransferAsset.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention transferAsset2(org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferAsset2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use ParticipateAssetIssue2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Transaction participateAssetIssue(org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParticipateAssetIssueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of ParticipateAssetIssue.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention participateAssetIssue2(org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParticipateAssetIssue2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use FreezeBalance2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Transaction freezeBalance(org.example.protos.contract.BalanceContract.FreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFreezeBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of FreezeBalance.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention freezeBalance2(org.example.protos.contract.BalanceContract.FreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFreezeBalance2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function when FreezeBalanceV2.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention freezeBalanceV2(org.example.protos.contract.BalanceContract.FreezeBalanceV2Contract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFreezeBalanceV2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use UnfreezeBalance2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Transaction unfreezeBalance(org.example.protos.contract.BalanceContract.UnfreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnfreezeBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeBalance.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention unfreezeBalance2(org.example.protos.contract.BalanceContract.UnfreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnfreezeBalance2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function when UnfreezeBalanceV2.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention unfreezeBalanceV2(org.example.protos.contract.BalanceContract.UnfreezeBalanceV2Contract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnfreezeBalanceV2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use UnfreezeAsset2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Transaction unfreezeAsset(org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnfreezeAssetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeAsset.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention unfreezeAsset2(org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnfreezeAsset2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use WithdrawBalance2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Transaction withdrawBalance(org.example.protos.contract.BalanceContract.WithdrawBalanceContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of WithdrawBalance.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention withdrawBalance2(org.example.protos.contract.BalanceContract.WithdrawBalanceContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawBalance2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention withdrawExpireUnfreeze(org.example.protos.contract.BalanceContract.WithdrawExpireUnfreezeContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawExpireUnfreezeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention delegateResource(org.example.protos.contract.BalanceContract.DelegateResourceContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegateResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention unDelegateResource(org.example.protos.contract.BalanceContract.UnDelegateResourceContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnDelegateResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention cancelAllUnfreezeV2(org.example.protos.contract.BalanceContract.CancelAllUnfreezeV2Contract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelAllUnfreezeV2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use UpdateAsset2 instead of this function.
     * </pre>
     */
    public org.example.protos.Protocol.Transaction updateAsset(org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAssetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAsset.
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention updateAsset2(org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAsset2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention proposalCreate(org.example.protos.contract.ProposalContract.ProposalCreateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposalCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention proposalApprove(org.example.protos.contract.ProposalContract.ProposalApproveContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposalApproveMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention proposalDelete(org.example.protos.contract.ProposalContract.ProposalDeleteContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposalDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention buyStorage(org.example.protos.contract.StorageContract.BuyStorageContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyStorageMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention buyStorageBytes(org.example.protos.contract.StorageContract.BuyStorageBytesContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyStorageBytesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention sellStorage(org.example.protos.contract.StorageContract.SellStorageContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellStorageMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention exchangeCreate(org.example.protos.contract.ExchangeContract.ExchangeCreateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention exchangeInject(org.example.protos.contract.ExchangeContract.ExchangeInjectContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeInjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention exchangeWithdraw(org.example.protos.contract.ExchangeContract.ExchangeWithdrawContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention exchangeTransaction(org.example.protos.contract.ExchangeContract.ExchangeTransactionContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention marketSellAsset(org.example.protos.contract.MarketContract.MarketSellAssetContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarketSellAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention marketCancelOrder(org.example.protos.contract.MarketContract.MarketCancelOrderContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarketCancelOrderMethod(), getCallOptions(), request);
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
    public org.example.api.GrpcAPI.NodeList listNodes(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.AssetIssueList getAssetIssueByAccount(org.example.protos.Protocol.Account request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetIssueByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.AccountNetMessage getAccountNet(org.example.protos.Protocol.Account request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountNetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.AccountResourceMessage getAccountResource(org.example.protos.Protocol.Account request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountResourceMethod(), getCallOptions(), request);
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
    public org.example.protos.Protocol.Block getBlockById(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use GetBlockByLimitNext2 instead of this function.
     * </pre>
     */
    public org.example.api.GrpcAPI.BlockList getBlockByLimitNext(org.example.api.GrpcAPI.BlockLimit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByLimitNextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLimitNext.
     * </pre>
     */
    public org.example.api.GrpcAPI.BlockListExtention getBlockByLimitNext2(org.example.api.GrpcAPI.BlockLimit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByLimitNext2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Please use GetBlockByLatestNum2 instead of this function.
     * </pre>
     */
    public org.example.api.GrpcAPI.BlockList getBlockByLatestNum(org.example.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByLatestNumMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLatestNum.
     * </pre>
     */
    public org.example.api.GrpcAPI.BlockListExtention getBlockByLatestNum2(org.example.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByLatestNum2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.Transaction getTransactionById(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention deployContract(org.example.protos.contract.SmartContractOuterClass.CreateSmartContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeployContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.contract.SmartContractOuterClass.SmartContract getContract(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.contract.SmartContractOuterClass.SmartContractDataWrapper getContractInfo(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContractInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention triggerContract(org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTriggerContractMethod(), getCallOptions(), request);
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
    public org.example.api.GrpcAPI.TransactionExtention clearContractABI(org.example.protos.contract.SmartContractOuterClass.ClearABIContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearContractABIMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.WitnessList listWitnesses(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWitnessesMethod(), getCallOptions(), request);
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
    public org.example.api.GrpcAPI.ProposalList listProposals(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProposalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.ProposalList getPaginatedProposalList(org.example.api.GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPaginatedProposalListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.Proposal getProposalById(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProposalByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.ExchangeList listExchanges(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListExchangesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.ExchangeList getPaginatedExchangeList(org.example.api.GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPaginatedExchangeListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.Exchange getExchangeById(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExchangeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.ChainParameters getChainParameters(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetChainParametersMethod(), getCallOptions(), request);
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
    public org.example.api.GrpcAPI.NumberMessage totalTransaction(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.NumberMessage getNextMaintenanceTime(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNextMaintenanceTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.TransactionInfo getTransactionInfoById(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionInfoByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention accountPermissionUpdate(org.example.protos.contract.AccountContract.AccountPermissionUpdateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountPermissionUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionSignWeight getTransactionSignWeight(org.example.protos.Protocol.Transaction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionSignWeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionApprovedList getTransactionApprovedList(org.example.protos.Protocol.Transaction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionApprovedListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.NodeInfo getNodeInfo(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNodeInfoMethod(), getCallOptions(), request);
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
    public org.example.api.GrpcAPI.TransactionExtention updateBrokerage(org.example.protos.contract.StorageContract.UpdateBrokerageContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBrokerageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * for shiededTransaction
     * </pre>
     */
    public org.example.api.GrpcAPI.TransactionExtention createShieldedTransaction(org.example.api.GrpcAPI.PrivateParameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateShieldedTransactionMethod(), getCallOptions(), request);
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
    public org.example.api.GrpcAPI.BytesMessage getSpendingKey(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSpendingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.ExpandedSpendingKeyMessage getExpandedSpendingKey(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExpandedSpendingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.BytesMessage getAkFromAsk(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAkFromAskMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.BytesMessage getNkFromNsk(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNkFromNskMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.IncomingViewingKeyMessage getIncomingViewingKey(org.example.api.GrpcAPI.ViewingKeyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIncomingViewingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.DiversifierMessage getDiversifier(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDiversifierMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.ShieldedAddressInfo getNewShieldedAddress(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNewShieldedAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.PaymentAddressMessage getZenPaymentAddress(org.example.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZenPaymentAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.BytesMessage getRcm(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRcmMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.SpendResult isSpend(org.example.api.GrpcAPI.NoteParameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsSpendMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention createShieldedTransactionWithoutSpendAuthSig(org.example.api.GrpcAPI.PrivateParametersWithoutAsk request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateShieldedTransactionWithoutSpendAuthSigMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.BytesMessage getShieldTransactionHash(org.example.protos.Protocol.Transaction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetShieldTransactionHashMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.BytesMessage createSpendAuthSig(org.example.api.GrpcAPI.SpendAuthSigParameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSpendAuthSigMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.BytesMessage createShieldNullifier(org.example.api.GrpcAPI.NfParameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateShieldNullifierMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *for shielded contract
     * </pre>
     */
    public org.example.api.GrpcAPI.ShieldedTRC20Parameters createShieldedContractParameters(org.example.api.GrpcAPI.PrivateShieldedTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateShieldedContractParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.ShieldedTRC20Parameters createShieldedContractParametersWithoutAsk(org.example.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions(), request);
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
    public org.example.api.GrpcAPI.BytesMessage getTriggerInputForShieldedTRC20Contract(org.example.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionExtention createCommonTransaction(org.example.protos.Protocol.Transaction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCommonTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionInfoList getTransactionInfoByBlockNum(org.example.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionInfoByBlockNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.NumberMessage getBurnTrx(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBurnTrxMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.protos.Protocol.Transaction getTransactionFromPending(org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionFromPendingMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.TransactionIdList getTransactionListFromPending(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionListFromPendingMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.api.GrpcAPI.NumberMessage getPendingSize(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPendingSizeMethod(), getCallOptions(), request);
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

    /**
     */
    public org.example.api.GrpcAPI.PricesResponseMessage getMemoFee(org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMemoFeeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Wallet.
   */
  public static final class WalletFutureStub
      extends io.grpc.stub.AbstractFutureStub<WalletFutureStub> {
    private WalletFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletFutureStub(channel, callOptions);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.contract.BalanceContract.AccountBalanceResponse> getAccountBalance(
        org.example.protos.contract.BalanceContract.AccountBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.contract.BalanceContract.BlockBalanceTrace> getBlockBalanceTrace(
        org.example.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockBalanceTraceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use CreateTransaction2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> createTransaction(
        org.example.protos.contract.BalanceContract.TransferContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateTransaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> createTransaction2(
        org.example.protos.contract.BalanceContract.TransferContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTransaction2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.Return> broadcastTransaction(
        org.example.protos.Protocol.Transaction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use UpdateAccount2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> updateAccount(
        org.example.protos.contract.AccountContract.AccountUpdateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> setAccountId(
        org.example.protos.contract.AccountContract.SetAccountIdContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccountIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAccount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> updateAccount2(
        org.example.protos.contract.AccountContract.AccountUpdateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAccount2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use VoteWitnessAccount2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> voteWitnessAccount(
        org.example.protos.contract.WitnessContract.VoteWitnessContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteWitnessAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *modify the consume_user_resource_percent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> updateSetting(
        org.example.protos.contract.SmartContractOuterClass.UpdateSettingContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSettingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *modify the energy_limit
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> updateEnergyLimit(
        org.example.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEnergyLimitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of VoteWitnessAccount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> voteWitnessAccount2(
        org.example.protos.contract.WitnessContract.VoteWitnessContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteWitnessAccount2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use CreateAssetIssue2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> createAssetIssue(
        org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAssetIssueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateAssetIssue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> createAssetIssue2(
        org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAssetIssue2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use UpdateWitness2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> updateWitness(
        org.example.protos.contract.WitnessContract.WitnessUpdateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWitnessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of UpdateWitness.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> updateWitness2(
        org.example.protos.contract.WitnessContract.WitnessUpdateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWitness2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use CreateAccount2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> createAccount(
        org.example.protos.contract.AccountContract.AccountCreateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateAccount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> createAccount2(
        org.example.protos.contract.AccountContract.AccountCreateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccount2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use CreateWitness2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> createWitness(
        org.example.protos.contract.WitnessContract.WitnessCreateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWitnessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of CreateWitness.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> createWitness2(
        org.example.protos.contract.WitnessContract.WitnessCreateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWitness2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use TransferAsset2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> transferAsset(
        org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferAssetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of TransferAsset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> transferAsset2(
        org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferAsset2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use ParticipateAssetIssue2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> participateAssetIssue(
        org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParticipateAssetIssueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of ParticipateAssetIssue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> participateAssetIssue2(
        org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParticipateAssetIssue2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use FreezeBalance2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> freezeBalance(
        org.example.protos.contract.BalanceContract.FreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFreezeBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of FreezeBalance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> freezeBalance2(
        org.example.protos.contract.BalanceContract.FreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFreezeBalance2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function when FreezeBalanceV2.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> freezeBalanceV2(
        org.example.protos.contract.BalanceContract.FreezeBalanceV2Contract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFreezeBalanceV2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use UnfreezeBalance2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> unfreezeBalance(
        org.example.protos.contract.BalanceContract.UnfreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnfreezeBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeBalance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> unfreezeBalance2(
        org.example.protos.contract.BalanceContract.UnfreezeBalanceContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnfreezeBalance2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function when UnfreezeBalanceV2.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> unfreezeBalanceV2(
        org.example.protos.contract.BalanceContract.UnfreezeBalanceV2Contract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnfreezeBalanceV2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use UnfreezeAsset2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> unfreezeAsset(
        org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnfreezeAssetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of UnfreezeAsset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> unfreezeAsset2(
        org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnfreezeAsset2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use WithdrawBalance2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> withdrawBalance(
        org.example.protos.contract.BalanceContract.WithdrawBalanceContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of WithdrawBalance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> withdrawBalance2(
        org.example.protos.contract.BalanceContract.WithdrawBalanceContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawBalance2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> withdrawExpireUnfreeze(
        org.example.protos.contract.BalanceContract.WithdrawExpireUnfreezeContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawExpireUnfreezeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> delegateResource(
        org.example.protos.contract.BalanceContract.DelegateResourceContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegateResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> unDelegateResource(
        org.example.protos.contract.BalanceContract.UnDelegateResourceContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnDelegateResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> cancelAllUnfreezeV2(
        org.example.protos.contract.BalanceContract.CancelAllUnfreezeV2Contract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelAllUnfreezeV2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use UpdateAsset2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> updateAsset(
        org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAssetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of UpdateAsset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> updateAsset2(
        org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAsset2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> proposalCreate(
        org.example.protos.contract.ProposalContract.ProposalCreateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposalCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> proposalApprove(
        org.example.protos.contract.ProposalContract.ProposalApproveContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposalApproveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> proposalDelete(
        org.example.protos.contract.ProposalContract.ProposalDeleteContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposalDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> buyStorage(
        org.example.protos.contract.StorageContract.BuyStorageContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyStorageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> buyStorageBytes(
        org.example.protos.contract.StorageContract.BuyStorageBytesContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyStorageBytesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> sellStorage(
        org.example.protos.contract.StorageContract.SellStorageContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellStorageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> exchangeCreate(
        org.example.protos.contract.ExchangeContract.ExchangeCreateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> exchangeInject(
        org.example.protos.contract.ExchangeContract.ExchangeInjectContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeInjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> exchangeWithdraw(
        org.example.protos.contract.ExchangeContract.ExchangeWithdrawContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> exchangeTransaction(
        org.example.protos.contract.ExchangeContract.ExchangeTransactionContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> marketSellAsset(
        org.example.protos.contract.MarketContract.MarketSellAssetContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarketSellAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> marketCancelOrder(
        org.example.protos.contract.MarketContract.MarketCancelOrderContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarketCancelOrderMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.NodeList> listNodes(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.AssetIssueList> getAssetIssueByAccount(
        org.example.protos.Protocol.Account request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.AccountNetMessage> getAccountNet(
        org.example.protos.Protocol.Account request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountNetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.AccountResourceMessage> getAccountResource(
        org.example.protos.Protocol.Account request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountResourceMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Block> getBlockById(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use GetBlockByLimitNext2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BlockList> getBlockByLimitNext(
        org.example.api.GrpcAPI.BlockLimit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByLimitNextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLimitNext.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BlockListExtention> getBlockByLimitNext2(
        org.example.api.GrpcAPI.BlockLimit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByLimitNext2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Please use GetBlockByLatestNum2 instead of this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BlockList> getBlockByLatestNum(
        org.example.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByLatestNumMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByLatestNum.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BlockListExtention> getBlockByLatestNum2(
        org.example.api.GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByLatestNum2Method(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> deployContract(
        org.example.protos.contract.SmartContractOuterClass.CreateSmartContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeployContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.contract.SmartContractOuterClass.SmartContract> getContract(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.contract.SmartContractOuterClass.SmartContractDataWrapper> getContractInfo(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContractInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> triggerContract(
        org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTriggerContractMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> clearContractABI(
        org.example.protos.contract.SmartContractOuterClass.ClearABIContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearContractABIMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.ProposalList> listProposals(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProposalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.ProposalList> getPaginatedProposalList(
        org.example.api.GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPaginatedProposalListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Proposal> getProposalById(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProposalByIdMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.ExchangeList> getPaginatedExchangeList(
        org.example.api.GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPaginatedExchangeListMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.ChainParameters> getChainParameters(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetChainParametersMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.NumberMessage> totalTransaction(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.NumberMessage> getNextMaintenanceTime(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNextMaintenanceTimeMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> accountPermissionUpdate(
        org.example.protos.contract.AccountContract.AccountPermissionUpdateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountPermissionUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionSignWeight> getTransactionSignWeight(
        org.example.protos.Protocol.Transaction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionSignWeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionApprovedList> getTransactionApprovedList(
        org.example.protos.Protocol.Transaction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionApprovedListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.NodeInfo> getNodeInfo(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> updateBrokerage(
        org.example.protos.contract.StorageContract.UpdateBrokerageContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBrokerageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * for shiededTransaction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> createShieldedTransaction(
        org.example.api.GrpcAPI.PrivateParameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateShieldedTransactionMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BytesMessage> getSpendingKey(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSpendingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.ExpandedSpendingKeyMessage> getExpandedSpendingKey(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExpandedSpendingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BytesMessage> getAkFromAsk(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAkFromAskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BytesMessage> getNkFromNsk(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNkFromNskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.IncomingViewingKeyMessage> getIncomingViewingKey(
        org.example.api.GrpcAPI.ViewingKeyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIncomingViewingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.DiversifierMessage> getDiversifier(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDiversifierMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.ShieldedAddressInfo> getNewShieldedAddress(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNewShieldedAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.PaymentAddressMessage> getZenPaymentAddress(
        org.example.api.GrpcAPI.IncomingViewingKeyDiversifierMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZenPaymentAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BytesMessage> getRcm(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRcmMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> createShieldedTransactionWithoutSpendAuthSig(
        org.example.api.GrpcAPI.PrivateParametersWithoutAsk request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateShieldedTransactionWithoutSpendAuthSigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BytesMessage> getShieldTransactionHash(
        org.example.protos.Protocol.Transaction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetShieldTransactionHashMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BytesMessage> createSpendAuthSig(
        org.example.api.GrpcAPI.SpendAuthSigParameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSpendAuthSigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BytesMessage> createShieldNullifier(
        org.example.api.GrpcAPI.NfParameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateShieldNullifierMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *for shielded contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.ShieldedTRC20Parameters> createShieldedContractParameters(
        org.example.api.GrpcAPI.PrivateShieldedTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.ShieldedTRC20Parameters> createShieldedContractParametersWithoutAsk(
        org.example.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.BytesMessage> getTriggerInputForShieldedTRC20Contract(
        org.example.api.GrpcAPI.ShieldedTRC20TriggerContractParameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionExtention> createCommonTransaction(
        org.example.protos.Protocol.Transaction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCommonTransactionMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.NumberMessage> getBurnTrx(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBurnTrxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protos.Protocol.Transaction> getTransactionFromPending(
        org.example.api.GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionFromPendingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.TransactionIdList> getTransactionListFromPending(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionListFromPendingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.NumberMessage> getPendingSize(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPendingSizeMethod(), getCallOptions()), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.api.GrpcAPI.PricesResponseMessage> getMemoFee(
        org.example.api.GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMemoFeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCOUNT = 0;
  private static final int METHODID_GET_ACCOUNT_BY_ID = 1;
  private static final int METHODID_GET_ACCOUNT_BALANCE = 2;
  private static final int METHODID_GET_BLOCK_BALANCE_TRACE = 3;
  private static final int METHODID_CREATE_TRANSACTION = 4;
  private static final int METHODID_CREATE_TRANSACTION2 = 5;
  private static final int METHODID_BROADCAST_TRANSACTION = 6;
  private static final int METHODID_UPDATE_ACCOUNT = 7;
  private static final int METHODID_SET_ACCOUNT_ID = 8;
  private static final int METHODID_UPDATE_ACCOUNT2 = 9;
  private static final int METHODID_VOTE_WITNESS_ACCOUNT = 10;
  private static final int METHODID_UPDATE_SETTING = 11;
  private static final int METHODID_UPDATE_ENERGY_LIMIT = 12;
  private static final int METHODID_VOTE_WITNESS_ACCOUNT2 = 13;
  private static final int METHODID_CREATE_ASSET_ISSUE = 14;
  private static final int METHODID_CREATE_ASSET_ISSUE2 = 15;
  private static final int METHODID_UPDATE_WITNESS = 16;
  private static final int METHODID_UPDATE_WITNESS2 = 17;
  private static final int METHODID_CREATE_ACCOUNT = 18;
  private static final int METHODID_CREATE_ACCOUNT2 = 19;
  private static final int METHODID_CREATE_WITNESS = 20;
  private static final int METHODID_CREATE_WITNESS2 = 21;
  private static final int METHODID_TRANSFER_ASSET = 22;
  private static final int METHODID_TRANSFER_ASSET2 = 23;
  private static final int METHODID_PARTICIPATE_ASSET_ISSUE = 24;
  private static final int METHODID_PARTICIPATE_ASSET_ISSUE2 = 25;
  private static final int METHODID_FREEZE_BALANCE = 26;
  private static final int METHODID_FREEZE_BALANCE2 = 27;
  private static final int METHODID_FREEZE_BALANCE_V2 = 28;
  private static final int METHODID_UNFREEZE_BALANCE = 29;
  private static final int METHODID_UNFREEZE_BALANCE2 = 30;
  private static final int METHODID_UNFREEZE_BALANCE_V2 = 31;
  private static final int METHODID_UNFREEZE_ASSET = 32;
  private static final int METHODID_UNFREEZE_ASSET2 = 33;
  private static final int METHODID_WITHDRAW_BALANCE = 34;
  private static final int METHODID_WITHDRAW_BALANCE2 = 35;
  private static final int METHODID_WITHDRAW_EXPIRE_UNFREEZE = 36;
  private static final int METHODID_DELEGATE_RESOURCE = 37;
  private static final int METHODID_UN_DELEGATE_RESOURCE = 38;
  private static final int METHODID_CANCEL_ALL_UNFREEZE_V2 = 39;
  private static final int METHODID_UPDATE_ASSET = 40;
  private static final int METHODID_UPDATE_ASSET2 = 41;
  private static final int METHODID_PROPOSAL_CREATE = 42;
  private static final int METHODID_PROPOSAL_APPROVE = 43;
  private static final int METHODID_PROPOSAL_DELETE = 44;
  private static final int METHODID_BUY_STORAGE = 45;
  private static final int METHODID_BUY_STORAGE_BYTES = 46;
  private static final int METHODID_SELL_STORAGE = 47;
  private static final int METHODID_EXCHANGE_CREATE = 48;
  private static final int METHODID_EXCHANGE_INJECT = 49;
  private static final int METHODID_EXCHANGE_WITHDRAW = 50;
  private static final int METHODID_EXCHANGE_TRANSACTION = 51;
  private static final int METHODID_MARKET_SELL_ASSET = 52;
  private static final int METHODID_MARKET_CANCEL_ORDER = 53;
  private static final int METHODID_GET_MARKET_ORDER_BY_ID = 54;
  private static final int METHODID_GET_MARKET_ORDER_BY_ACCOUNT = 55;
  private static final int METHODID_GET_MARKET_PRICE_BY_PAIR = 56;
  private static final int METHODID_GET_MARKET_ORDER_LIST_BY_PAIR = 57;
  private static final int METHODID_GET_MARKET_PAIR_LIST = 58;
  private static final int METHODID_LIST_NODES = 59;
  private static final int METHODID_GET_ASSET_ISSUE_BY_ACCOUNT = 60;
  private static final int METHODID_GET_ACCOUNT_NET = 61;
  private static final int METHODID_GET_ACCOUNT_RESOURCE = 62;
  private static final int METHODID_GET_ASSET_ISSUE_BY_NAME = 63;
  private static final int METHODID_GET_ASSET_ISSUE_LIST_BY_NAME = 64;
  private static final int METHODID_GET_ASSET_ISSUE_BY_ID = 65;
  private static final int METHODID_GET_NOW_BLOCK = 66;
  private static final int METHODID_GET_NOW_BLOCK2 = 67;
  private static final int METHODID_GET_BLOCK_BY_NUM = 68;
  private static final int METHODID_GET_BLOCK_BY_NUM2 = 69;
  private static final int METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM = 70;
  private static final int METHODID_GET_BLOCK_BY_ID = 71;
  private static final int METHODID_GET_BLOCK_BY_LIMIT_NEXT = 72;
  private static final int METHODID_GET_BLOCK_BY_LIMIT_NEXT2 = 73;
  private static final int METHODID_GET_BLOCK_BY_LATEST_NUM = 74;
  private static final int METHODID_GET_BLOCK_BY_LATEST_NUM2 = 75;
  private static final int METHODID_GET_TRANSACTION_BY_ID = 76;
  private static final int METHODID_DEPLOY_CONTRACT = 77;
  private static final int METHODID_GET_CONTRACT = 78;
  private static final int METHODID_GET_CONTRACT_INFO = 79;
  private static final int METHODID_TRIGGER_CONTRACT = 80;
  private static final int METHODID_TRIGGER_CONSTANT_CONTRACT = 81;
  private static final int METHODID_ESTIMATE_ENERGY = 82;
  private static final int METHODID_CLEAR_CONTRACT_ABI = 83;
  private static final int METHODID_LIST_WITNESSES = 84;
  private static final int METHODID_GET_DELEGATED_RESOURCE = 85;
  private static final int METHODID_GET_DELEGATED_RESOURCE_V2 = 86;
  private static final int METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX = 87;
  private static final int METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX_V2 = 88;
  private static final int METHODID_GET_CAN_DELEGATED_MAX_SIZE = 89;
  private static final int METHODID_GET_AVAILABLE_UNFREEZE_COUNT = 90;
  private static final int METHODID_GET_CAN_WITHDRAW_UNFREEZE_AMOUNT = 91;
  private static final int METHODID_LIST_PROPOSALS = 92;
  private static final int METHODID_GET_PAGINATED_PROPOSAL_LIST = 93;
  private static final int METHODID_GET_PROPOSAL_BY_ID = 94;
  private static final int METHODID_LIST_EXCHANGES = 95;
  private static final int METHODID_GET_PAGINATED_EXCHANGE_LIST = 96;
  private static final int METHODID_GET_EXCHANGE_BY_ID = 97;
  private static final int METHODID_GET_CHAIN_PARAMETERS = 98;
  private static final int METHODID_GET_ASSET_ISSUE_LIST = 99;
  private static final int METHODID_GET_PAGINATED_ASSET_ISSUE_LIST = 100;
  private static final int METHODID_TOTAL_TRANSACTION = 101;
  private static final int METHODID_GET_NEXT_MAINTENANCE_TIME = 102;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_ID = 103;
  private static final int METHODID_ACCOUNT_PERMISSION_UPDATE = 104;
  private static final int METHODID_GET_TRANSACTION_SIGN_WEIGHT = 105;
  private static final int METHODID_GET_TRANSACTION_APPROVED_LIST = 106;
  private static final int METHODID_GET_NODE_INFO = 107;
  private static final int METHODID_GET_REWARD_INFO = 108;
  private static final int METHODID_GET_BROKERAGE_INFO = 109;
  private static final int METHODID_UPDATE_BROKERAGE = 110;
  private static final int METHODID_CREATE_SHIELDED_TRANSACTION = 111;
  private static final int METHODID_GET_MERKLE_TREE_VOUCHER_INFO = 112;
  private static final int METHODID_SCAN_NOTE_BY_IVK = 113;
  private static final int METHODID_SCAN_AND_MARK_NOTE_BY_IVK = 114;
  private static final int METHODID_SCAN_NOTE_BY_OVK = 115;
  private static final int METHODID_GET_SPENDING_KEY = 116;
  private static final int METHODID_GET_EXPANDED_SPENDING_KEY = 117;
  private static final int METHODID_GET_AK_FROM_ASK = 118;
  private static final int METHODID_GET_NK_FROM_NSK = 119;
  private static final int METHODID_GET_INCOMING_VIEWING_KEY = 120;
  private static final int METHODID_GET_DIVERSIFIER = 121;
  private static final int METHODID_GET_NEW_SHIELDED_ADDRESS = 122;
  private static final int METHODID_GET_ZEN_PAYMENT_ADDRESS = 123;
  private static final int METHODID_GET_RCM = 124;
  private static final int METHODID_IS_SPEND = 125;
  private static final int METHODID_CREATE_SHIELDED_TRANSACTION_WITHOUT_SPEND_AUTH_SIG = 126;
  private static final int METHODID_GET_SHIELD_TRANSACTION_HASH = 127;
  private static final int METHODID_CREATE_SPEND_AUTH_SIG = 128;
  private static final int METHODID_CREATE_SHIELD_NULLIFIER = 129;
  private static final int METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS = 130;
  private static final int METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK = 131;
  private static final int METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK = 132;
  private static final int METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK = 133;
  private static final int METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT = 134;
  private static final int METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT = 135;
  private static final int METHODID_CREATE_COMMON_TRANSACTION = 136;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM = 137;
  private static final int METHODID_GET_BURN_TRX = 138;
  private static final int METHODID_GET_TRANSACTION_FROM_PENDING = 139;
  private static final int METHODID_GET_TRANSACTION_LIST_FROM_PENDING = 140;
  private static final int METHODID_GET_PENDING_SIZE = 141;
  private static final int METHODID_GET_BLOCK = 142;
  private static final int METHODID_GET_BANDWIDTH_PRICES = 143;
  private static final int METHODID_GET_ENERGY_PRICES = 144;
  private static final int METHODID_GET_MEMO_FEE = 145;

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
        case METHODID_GET_ACCOUNT_BALANCE:
          serviceImpl.getAccountBalance((org.example.protos.contract.BalanceContract.AccountBalanceRequest) request,
              (io.grpc.stub.StreamObserver<org.example.protos.contract.BalanceContract.AccountBalanceResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BALANCE_TRACE:
          serviceImpl.getBlockBalanceTrace((org.example.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier) request,
              (io.grpc.stub.StreamObserver<org.example.protos.contract.BalanceContract.BlockBalanceTrace>) responseObserver);
          break;
        case METHODID_CREATE_TRANSACTION:
          serviceImpl.createTransaction((org.example.protos.contract.BalanceContract.TransferContract) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_TRANSACTION2:
          serviceImpl.createTransaction2((org.example.protos.contract.BalanceContract.TransferContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_BROADCAST_TRANSACTION:
          serviceImpl.broadcastTransaction((org.example.protos.Protocol.Transaction) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.Return>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT:
          serviceImpl.updateAccount((org.example.protos.contract.AccountContract.AccountUpdateContract) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_SET_ACCOUNT_ID:
          serviceImpl.setAccountId((org.example.protos.contract.AccountContract.SetAccountIdContract) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT2:
          serviceImpl.updateAccount2((org.example.protos.contract.AccountContract.AccountUpdateContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_VOTE_WITNESS_ACCOUNT:
          serviceImpl.voteWitnessAccount((org.example.protos.contract.WitnessContract.VoteWitnessContract) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_UPDATE_SETTING:
          serviceImpl.updateSetting((org.example.protos.contract.SmartContractOuterClass.UpdateSettingContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_ENERGY_LIMIT:
          serviceImpl.updateEnergyLimit((org.example.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_VOTE_WITNESS_ACCOUNT2:
          serviceImpl.voteWitnessAccount2((org.example.protos.contract.WitnessContract.VoteWitnessContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_ASSET_ISSUE:
          serviceImpl.createAssetIssue((org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_ASSET_ISSUE2:
          serviceImpl.createAssetIssue2((org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_WITNESS:
          serviceImpl.updateWitness((org.example.protos.contract.WitnessContract.WitnessUpdateContract) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_UPDATE_WITNESS2:
          serviceImpl.updateWitness2((org.example.protos.contract.WitnessContract.WitnessUpdateContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_ACCOUNT:
          serviceImpl.createAccount((org.example.protos.contract.AccountContract.AccountCreateContract) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_ACCOUNT2:
          serviceImpl.createAccount2((org.example.protos.contract.AccountContract.AccountCreateContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_WITNESS:
          serviceImpl.createWitness((org.example.protos.contract.WitnessContract.WitnessCreateContract) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_CREATE_WITNESS2:
          serviceImpl.createWitness2((org.example.protos.contract.WitnessContract.WitnessCreateContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRANSFER_ASSET:
          serviceImpl.transferAsset((org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_TRANSFER_ASSET2:
          serviceImpl.transferAsset2((org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_PARTICIPATE_ASSET_ISSUE:
          serviceImpl.participateAssetIssue((org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_PARTICIPATE_ASSET_ISSUE2:
          serviceImpl.participateAssetIssue2((org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_FREEZE_BALANCE:
          serviceImpl.freezeBalance((org.example.protos.contract.BalanceContract.FreezeBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_FREEZE_BALANCE2:
          serviceImpl.freezeBalance2((org.example.protos.contract.BalanceContract.FreezeBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_FREEZE_BALANCE_V2:
          serviceImpl.freezeBalanceV2((org.example.protos.contract.BalanceContract.FreezeBalanceV2Contract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_UNFREEZE_BALANCE:
          serviceImpl.unfreezeBalance((org.example.protos.contract.BalanceContract.UnfreezeBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_UNFREEZE_BALANCE2:
          serviceImpl.unfreezeBalance2((org.example.protos.contract.BalanceContract.UnfreezeBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_UNFREEZE_BALANCE_V2:
          serviceImpl.unfreezeBalanceV2((org.example.protos.contract.BalanceContract.UnfreezeBalanceV2Contract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_UNFREEZE_ASSET:
          serviceImpl.unfreezeAsset((org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_UNFREEZE_ASSET2:
          serviceImpl.unfreezeAsset2((org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_WITHDRAW_BALANCE:
          serviceImpl.withdrawBalance((org.example.protos.contract.BalanceContract.WithdrawBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_WITHDRAW_BALANCE2:
          serviceImpl.withdrawBalance2((org.example.protos.contract.BalanceContract.WithdrawBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_WITHDRAW_EXPIRE_UNFREEZE:
          serviceImpl.withdrawExpireUnfreeze((org.example.protos.contract.BalanceContract.WithdrawExpireUnfreezeContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_DELEGATE_RESOURCE:
          serviceImpl.delegateResource((org.example.protos.contract.BalanceContract.DelegateResourceContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_UN_DELEGATE_RESOURCE:
          serviceImpl.unDelegateResource((org.example.protos.contract.BalanceContract.UnDelegateResourceContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_CANCEL_ALL_UNFREEZE_V2:
          serviceImpl.cancelAllUnfreezeV2((org.example.protos.contract.BalanceContract.CancelAllUnfreezeV2Contract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_UPDATE_ASSET:
          serviceImpl.updateAsset((org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_UPDATE_ASSET2:
          serviceImpl.updateAsset2((org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_PROPOSAL_CREATE:
          serviceImpl.proposalCreate((org.example.protos.contract.ProposalContract.ProposalCreateContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_PROPOSAL_APPROVE:
          serviceImpl.proposalApprove((org.example.protos.contract.ProposalContract.ProposalApproveContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_PROPOSAL_DELETE:
          serviceImpl.proposalDelete((org.example.protos.contract.ProposalContract.ProposalDeleteContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_BUY_STORAGE:
          serviceImpl.buyStorage((org.example.protos.contract.StorageContract.BuyStorageContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_BUY_STORAGE_BYTES:
          serviceImpl.buyStorageBytes((org.example.protos.contract.StorageContract.BuyStorageBytesContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_SELL_STORAGE:
          serviceImpl.sellStorage((org.example.protos.contract.StorageContract.SellStorageContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_CREATE:
          serviceImpl.exchangeCreate((org.example.protos.contract.ExchangeContract.ExchangeCreateContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_INJECT:
          serviceImpl.exchangeInject((org.example.protos.contract.ExchangeContract.ExchangeInjectContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_WITHDRAW:
          serviceImpl.exchangeWithdraw((org.example.protos.contract.ExchangeContract.ExchangeWithdrawContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_EXCHANGE_TRANSACTION:
          serviceImpl.exchangeTransaction((org.example.protos.contract.ExchangeContract.ExchangeTransactionContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_MARKET_SELL_ASSET:
          serviceImpl.marketSellAsset((org.example.protos.contract.MarketContract.MarketSellAssetContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_MARKET_CANCEL_ORDER:
          serviceImpl.marketCancelOrder((org.example.protos.contract.MarketContract.MarketCancelOrderContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
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
        case METHODID_LIST_NODES:
          serviceImpl.listNodes((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NodeList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_ACCOUNT:
          serviceImpl.getAssetIssueByAccount((org.example.protos.Protocol.Account) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_NET:
          serviceImpl.getAccountNet((org.example.protos.Protocol.Account) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AccountNetMessage>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_RESOURCE:
          serviceImpl.getAccountResource((org.example.protos.Protocol.Account) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AccountResourceMessage>) responseObserver);
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
        case METHODID_GET_BLOCK_BY_ID:
          serviceImpl.getBlockById((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Block>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LIMIT_NEXT:
          serviceImpl.getBlockByLimitNext((org.example.api.GrpcAPI.BlockLimit) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockList>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LIMIT_NEXT2:
          serviceImpl.getBlockByLimitNext2((org.example.api.GrpcAPI.BlockLimit) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockListExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LATEST_NUM:
          serviceImpl.getBlockByLatestNum((org.example.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockList>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LATEST_NUM2:
          serviceImpl.getBlockByLatestNum2((org.example.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BlockListExtention>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_BY_ID:
          serviceImpl.getTransactionById((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_DEPLOY_CONTRACT:
          serviceImpl.deployContract((org.example.protos.contract.SmartContractOuterClass.CreateSmartContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_CONTRACT:
          serviceImpl.getContract((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.contract.SmartContractOuterClass.SmartContract>) responseObserver);
          break;
        case METHODID_GET_CONTRACT_INFO:
          serviceImpl.getContractInfo((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.contract.SmartContractOuterClass.SmartContractDataWrapper>) responseObserver);
          break;
        case METHODID_TRIGGER_CONTRACT:
          serviceImpl.triggerContract((org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRIGGER_CONSTANT_CONTRACT:
          serviceImpl.triggerConstantContract((org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_ESTIMATE_ENERGY:
          serviceImpl.estimateEnergy((org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.EstimateEnergyMessage>) responseObserver);
          break;
        case METHODID_CLEAR_CONTRACT_ABI:
          serviceImpl.clearContractABI((org.example.protos.contract.SmartContractOuterClass.ClearABIContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_LIST_WITNESSES:
          serviceImpl.listWitnesses((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.WitnessList>) responseObserver);
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
        case METHODID_LIST_PROPOSALS:
          serviceImpl.listProposals((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ProposalList>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_PROPOSAL_LIST:
          serviceImpl.getPaginatedProposalList((org.example.api.GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ProposalList>) responseObserver);
          break;
        case METHODID_GET_PROPOSAL_BY_ID:
          serviceImpl.getProposalById((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Proposal>) responseObserver);
          break;
        case METHODID_LIST_EXCHANGES:
          serviceImpl.listExchanges((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ExchangeList>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_EXCHANGE_LIST:
          serviceImpl.getPaginatedExchangeList((org.example.api.GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ExchangeList>) responseObserver);
          break;
        case METHODID_GET_EXCHANGE_BY_ID:
          serviceImpl.getExchangeById((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Exchange>) responseObserver);
          break;
        case METHODID_GET_CHAIN_PARAMETERS:
          serviceImpl.getChainParameters((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.ChainParameters>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_LIST:
          serviceImpl.getAssetIssueList((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_ASSET_ISSUE_LIST:
          serviceImpl.getPaginatedAssetIssueList((org.example.api.GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.AssetIssueList>) responseObserver);
          break;
        case METHODID_TOTAL_TRANSACTION:
          serviceImpl.totalTransaction((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_NEXT_MAINTENANCE_TIME:
          serviceImpl.getNextMaintenanceTime((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_ID:
          serviceImpl.getTransactionInfoById((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.TransactionInfo>) responseObserver);
          break;
        case METHODID_ACCOUNT_PERMISSION_UPDATE:
          serviceImpl.accountPermissionUpdate((org.example.protos.contract.AccountContract.AccountPermissionUpdateContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN_WEIGHT:
          serviceImpl.getTransactionSignWeight((org.example.protos.Protocol.Transaction) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionSignWeight>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_APPROVED_LIST:
          serviceImpl.getTransactionApprovedList((org.example.protos.Protocol.Transaction) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionApprovedList>) responseObserver);
          break;
        case METHODID_GET_NODE_INFO:
          serviceImpl.getNodeInfo((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.NodeInfo>) responseObserver);
          break;
        case METHODID_GET_REWARD_INFO:
          serviceImpl.getRewardInfo((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_BROKERAGE_INFO:
          serviceImpl.getBrokerageInfo((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_UPDATE_BROKERAGE:
          serviceImpl.updateBrokerage((org.example.protos.contract.StorageContract.UpdateBrokerageContract) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_TRANSACTION:
          serviceImpl.createShieldedTransaction((org.example.api.GrpcAPI.PrivateParameters) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
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
        case METHODID_GET_SPENDING_KEY:
          serviceImpl.getSpendingKey((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_EXPANDED_SPENDING_KEY:
          serviceImpl.getExpandedSpendingKey((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ExpandedSpendingKeyMessage>) responseObserver);
          break;
        case METHODID_GET_AK_FROM_ASK:
          serviceImpl.getAkFromAsk((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_NK_FROM_NSK:
          serviceImpl.getNkFromNsk((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_INCOMING_VIEWING_KEY:
          serviceImpl.getIncomingViewingKey((org.example.api.GrpcAPI.ViewingKeyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.IncomingViewingKeyMessage>) responseObserver);
          break;
        case METHODID_GET_DIVERSIFIER:
          serviceImpl.getDiversifier((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.DiversifierMessage>) responseObserver);
          break;
        case METHODID_GET_NEW_SHIELDED_ADDRESS:
          serviceImpl.getNewShieldedAddress((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ShieldedAddressInfo>) responseObserver);
          break;
        case METHODID_GET_ZEN_PAYMENT_ADDRESS:
          serviceImpl.getZenPaymentAddress((org.example.api.GrpcAPI.IncomingViewingKeyDiversifierMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.PaymentAddressMessage>) responseObserver);
          break;
        case METHODID_GET_RCM:
          serviceImpl.getRcm((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_IS_SPEND:
          serviceImpl.isSpend((org.example.api.GrpcAPI.NoteParameters) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.SpendResult>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_TRANSACTION_WITHOUT_SPEND_AUTH_SIG:
          serviceImpl.createShieldedTransactionWithoutSpendAuthSig((org.example.api.GrpcAPI.PrivateParametersWithoutAsk) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_SHIELD_TRANSACTION_HASH:
          serviceImpl.getShieldTransactionHash((org.example.protos.Protocol.Transaction) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_CREATE_SPEND_AUTH_SIG:
          serviceImpl.createSpendAuthSig((org.example.api.GrpcAPI.SpendAuthSigParameters) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_CREATE_SHIELD_NULLIFIER:
          serviceImpl.createShieldNullifier((org.example.api.GrpcAPI.NfParameters) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS:
          serviceImpl.createShieldedContractParameters((org.example.api.GrpcAPI.PrivateShieldedTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ShieldedTRC20Parameters>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK:
          serviceImpl.createShieldedContractParametersWithoutAsk((org.example.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.ShieldedTRC20Parameters>) responseObserver);
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
        case METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT:
          serviceImpl.getTriggerInputForShieldedTRC20Contract((org.example.api.GrpcAPI.ShieldedTRC20TriggerContractParameters) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_CREATE_COMMON_TRANSACTION:
          serviceImpl.createCommonTransaction((org.example.protos.Protocol.Transaction) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM:
          serviceImpl.getTransactionInfoByBlockNum((org.example.api.GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionInfoList>) responseObserver);
          break;
        case METHODID_GET_BURN_TRX:
          serviceImpl.getBurnTrx((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_FROM_PENDING:
          serviceImpl.getTransactionFromPending((org.example.api.GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.example.protos.Protocol.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_LIST_FROM_PENDING:
          serviceImpl.getTransactionListFromPending((org.example.api.GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.example.api.GrpcAPI.TransactionIdList>) responseObserver);
          break;
        case METHODID_GET_PENDING_SIZE:
          serviceImpl.getPendingSize((org.example.api.GrpcAPI.EmptyMessage) request,
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
        case METHODID_GET_MEMO_FEE:
          serviceImpl.getMemoFee((org.example.api.GrpcAPI.EmptyMessage) request,
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
          getGetAccountBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.AccountBalanceRequest,
              org.example.protos.contract.BalanceContract.AccountBalanceResponse>(
                service, METHODID_GET_ACCOUNT_BALANCE)))
        .addMethod(
          getGetBlockBalanceTraceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.BlockBalanceTrace.BlockIdentifier,
              org.example.protos.contract.BalanceContract.BlockBalanceTrace>(
                service, METHODID_GET_BLOCK_BALANCE_TRACE)))
        .addMethod(
          getCreateTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.TransferContract,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_CREATE_TRANSACTION)))
        .addMethod(
          getCreateTransaction2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.TransferContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_CREATE_TRANSACTION2)))
        .addMethod(
          getBroadcastTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.Protocol.Transaction,
              org.example.api.GrpcAPI.Return>(
                service, METHODID_BROADCAST_TRANSACTION)))
        .addMethod(
          getUpdateAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AccountContract.AccountUpdateContract,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_UPDATE_ACCOUNT)))
        .addMethod(
          getSetAccountIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AccountContract.SetAccountIdContract,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_SET_ACCOUNT_ID)))
        .addMethod(
          getUpdateAccount2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AccountContract.AccountUpdateContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_UPDATE_ACCOUNT2)))
        .addMethod(
          getVoteWitnessAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.WitnessContract.VoteWitnessContract,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_VOTE_WITNESS_ACCOUNT)))
        .addMethod(
          getUpdateSettingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.SmartContractOuterClass.UpdateSettingContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_UPDATE_SETTING)))
        .addMethod(
          getUpdateEnergyLimitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.SmartContractOuterClass.UpdateEnergyLimitContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_UPDATE_ENERGY_LIMIT)))
        .addMethod(
          getVoteWitnessAccount2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.WitnessContract.VoteWitnessContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_VOTE_WITNESS_ACCOUNT2)))
        .addMethod(
          getCreateAssetIssueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_CREATE_ASSET_ISSUE)))
        .addMethod(
          getCreateAssetIssue2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AssetIssueContractOuterClass.AssetIssueContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_CREATE_ASSET_ISSUE2)))
        .addMethod(
          getUpdateWitnessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.WitnessContract.WitnessUpdateContract,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_UPDATE_WITNESS)))
        .addMethod(
          getUpdateWitness2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.WitnessContract.WitnessUpdateContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_UPDATE_WITNESS2)))
        .addMethod(
          getCreateAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AccountContract.AccountCreateContract,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_CREATE_ACCOUNT)))
        .addMethod(
          getCreateAccount2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AccountContract.AccountCreateContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_CREATE_ACCOUNT2)))
        .addMethod(
          getCreateWitnessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.WitnessContract.WitnessCreateContract,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_CREATE_WITNESS)))
        .addMethod(
          getCreateWitness2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.WitnessContract.WitnessCreateContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_CREATE_WITNESS2)))
        .addMethod(
          getTransferAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_TRANSFER_ASSET)))
        .addMethod(
          getTransferAsset2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AssetIssueContractOuterClass.TransferAssetContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_TRANSFER_ASSET2)))
        .addMethod(
          getParticipateAssetIssueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_PARTICIPATE_ASSET_ISSUE)))
        .addMethod(
          getParticipateAssetIssue2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AssetIssueContractOuterClass.ParticipateAssetIssueContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_PARTICIPATE_ASSET_ISSUE2)))
        .addMethod(
          getFreezeBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.FreezeBalanceContract,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_FREEZE_BALANCE)))
        .addMethod(
          getFreezeBalance2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.FreezeBalanceContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_FREEZE_BALANCE2)))
        .addMethod(
          getFreezeBalanceV2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.FreezeBalanceV2Contract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_FREEZE_BALANCE_V2)))
        .addMethod(
          getUnfreezeBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.UnfreezeBalanceContract,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_UNFREEZE_BALANCE)))
        .addMethod(
          getUnfreezeBalance2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.UnfreezeBalanceContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_UNFREEZE_BALANCE2)))
        .addMethod(
          getUnfreezeBalanceV2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.UnfreezeBalanceV2Contract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_UNFREEZE_BALANCE_V2)))
        .addMethod(
          getUnfreezeAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_UNFREEZE_ASSET)))
        .addMethod(
          getUnfreezeAsset2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AssetIssueContractOuterClass.UnfreezeAssetContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_UNFREEZE_ASSET2)))
        .addMethod(
          getWithdrawBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.WithdrawBalanceContract,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_WITHDRAW_BALANCE)))
        .addMethod(
          getWithdrawBalance2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.WithdrawBalanceContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_WITHDRAW_BALANCE2)))
        .addMethod(
          getWithdrawExpireUnfreezeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.WithdrawExpireUnfreezeContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_WITHDRAW_EXPIRE_UNFREEZE)))
        .addMethod(
          getDelegateResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.DelegateResourceContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_DELEGATE_RESOURCE)))
        .addMethod(
          getUnDelegateResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.UnDelegateResourceContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_UN_DELEGATE_RESOURCE)))
        .addMethod(
          getCancelAllUnfreezeV2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.BalanceContract.CancelAllUnfreezeV2Contract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_CANCEL_ALL_UNFREEZE_V2)))
        .addMethod(
          getUpdateAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_UPDATE_ASSET)))
        .addMethod(
          getUpdateAsset2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AssetIssueContractOuterClass.UpdateAssetContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_UPDATE_ASSET2)))
        .addMethod(
          getProposalCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.ProposalContract.ProposalCreateContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_PROPOSAL_CREATE)))
        .addMethod(
          getProposalApproveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.ProposalContract.ProposalApproveContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_PROPOSAL_APPROVE)))
        .addMethod(
          getProposalDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.ProposalContract.ProposalDeleteContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_PROPOSAL_DELETE)))
        .addMethod(
          getBuyStorageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.StorageContract.BuyStorageContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_BUY_STORAGE)))
        .addMethod(
          getBuyStorageBytesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.StorageContract.BuyStorageBytesContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_BUY_STORAGE_BYTES)))
        .addMethod(
          getSellStorageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.StorageContract.SellStorageContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_SELL_STORAGE)))
        .addMethod(
          getExchangeCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.ExchangeContract.ExchangeCreateContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_EXCHANGE_CREATE)))
        .addMethod(
          getExchangeInjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.ExchangeContract.ExchangeInjectContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_EXCHANGE_INJECT)))
        .addMethod(
          getExchangeWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.ExchangeContract.ExchangeWithdrawContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_EXCHANGE_WITHDRAW)))
        .addMethod(
          getExchangeTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.ExchangeContract.ExchangeTransactionContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_EXCHANGE_TRANSACTION)))
        .addMethod(
          getMarketSellAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.MarketContract.MarketSellAssetContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_MARKET_SELL_ASSET)))
        .addMethod(
          getMarketCancelOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.MarketContract.MarketCancelOrderContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_MARKET_CANCEL_ORDER)))
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
          getListNodesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.NodeList>(
                service, METHODID_LIST_NODES)))
        .addMethod(
          getGetAssetIssueByAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.Protocol.Account,
              org.example.api.GrpcAPI.AssetIssueList>(
                service, METHODID_GET_ASSET_ISSUE_BY_ACCOUNT)))
        .addMethod(
          getGetAccountNetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.Protocol.Account,
              org.example.api.GrpcAPI.AccountNetMessage>(
                service, METHODID_GET_ACCOUNT_NET)))
        .addMethod(
          getGetAccountResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.Protocol.Account,
              org.example.api.GrpcAPI.AccountResourceMessage>(
                service, METHODID_GET_ACCOUNT_RESOURCE)))
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
          getGetBlockByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.Protocol.Block>(
                service, METHODID_GET_BLOCK_BY_ID)))
        .addMethod(
          getGetBlockByLimitNextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BlockLimit,
              org.example.api.GrpcAPI.BlockList>(
                service, METHODID_GET_BLOCK_BY_LIMIT_NEXT)))
        .addMethod(
          getGetBlockByLimitNext2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BlockLimit,
              org.example.api.GrpcAPI.BlockListExtention>(
                service, METHODID_GET_BLOCK_BY_LIMIT_NEXT2)))
        .addMethod(
          getGetBlockByLatestNumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.NumberMessage,
              org.example.api.GrpcAPI.BlockList>(
                service, METHODID_GET_BLOCK_BY_LATEST_NUM)))
        .addMethod(
          getGetBlockByLatestNum2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.NumberMessage,
              org.example.api.GrpcAPI.BlockListExtention>(
                service, METHODID_GET_BLOCK_BY_LATEST_NUM2)))
        .addMethod(
          getGetTransactionByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_GET_TRANSACTION_BY_ID)))
        .addMethod(
          getDeployContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.SmartContractOuterClass.CreateSmartContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_DEPLOY_CONTRACT)))
        .addMethod(
          getGetContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.contract.SmartContractOuterClass.SmartContract>(
                service, METHODID_GET_CONTRACT)))
        .addMethod(
          getGetContractInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.contract.SmartContractOuterClass.SmartContractDataWrapper>(
                service, METHODID_GET_CONTRACT_INFO)))
        .addMethod(
          getTriggerContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.SmartContractOuterClass.TriggerSmartContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_TRIGGER_CONTRACT)))
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
          getClearContractABIMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.SmartContractOuterClass.ClearABIContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_CLEAR_CONTRACT_ABI)))
        .addMethod(
          getListWitnessesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.WitnessList>(
                service, METHODID_LIST_WITNESSES)))
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
          getListProposalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.ProposalList>(
                service, METHODID_LIST_PROPOSALS)))
        .addMethod(
          getGetPaginatedProposalListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.PaginatedMessage,
              org.example.api.GrpcAPI.ProposalList>(
                service, METHODID_GET_PAGINATED_PROPOSAL_LIST)))
        .addMethod(
          getGetProposalByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.Protocol.Proposal>(
                service, METHODID_GET_PROPOSAL_BY_ID)))
        .addMethod(
          getListExchangesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.ExchangeList>(
                service, METHODID_LIST_EXCHANGES)))
        .addMethod(
          getGetPaginatedExchangeListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.PaginatedMessage,
              org.example.api.GrpcAPI.ExchangeList>(
                service, METHODID_GET_PAGINATED_EXCHANGE_LIST)))
        .addMethod(
          getGetExchangeByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.Protocol.Exchange>(
                service, METHODID_GET_EXCHANGE_BY_ID)))
        .addMethod(
          getGetChainParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.protos.Protocol.ChainParameters>(
                service, METHODID_GET_CHAIN_PARAMETERS)))
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
          getTotalTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.NumberMessage>(
                service, METHODID_TOTAL_TRANSACTION)))
        .addMethod(
          getGetNextMaintenanceTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.NumberMessage>(
                service, METHODID_GET_NEXT_MAINTENANCE_TIME)))
        .addMethod(
          getGetTransactionInfoByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.Protocol.TransactionInfo>(
                service, METHODID_GET_TRANSACTION_INFO_BY_ID)))
        .addMethod(
          getAccountPermissionUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.AccountContract.AccountPermissionUpdateContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_ACCOUNT_PERMISSION_UPDATE)))
        .addMethod(
          getGetTransactionSignWeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.Protocol.Transaction,
              org.example.api.GrpcAPI.TransactionSignWeight>(
                service, METHODID_GET_TRANSACTION_SIGN_WEIGHT)))
        .addMethod(
          getGetTransactionApprovedListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.Protocol.Transaction,
              org.example.api.GrpcAPI.TransactionApprovedList>(
                service, METHODID_GET_TRANSACTION_APPROVED_LIST)))
        .addMethod(
          getGetNodeInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.protos.Protocol.NodeInfo>(
                service, METHODID_GET_NODE_INFO)))
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
          getUpdateBrokerageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.contract.StorageContract.UpdateBrokerageContract,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_UPDATE_BROKERAGE)))
        .addMethod(
          getCreateShieldedTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.PrivateParameters,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_CREATE_SHIELDED_TRANSACTION)))
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
          getGetSpendingKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.BytesMessage>(
                service, METHODID_GET_SPENDING_KEY)))
        .addMethod(
          getGetExpandedSpendingKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.api.GrpcAPI.ExpandedSpendingKeyMessage>(
                service, METHODID_GET_EXPANDED_SPENDING_KEY)))
        .addMethod(
          getGetAkFromAskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.api.GrpcAPI.BytesMessage>(
                service, METHODID_GET_AK_FROM_ASK)))
        .addMethod(
          getGetNkFromNskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.api.GrpcAPI.BytesMessage>(
                service, METHODID_GET_NK_FROM_NSK)))
        .addMethod(
          getGetIncomingViewingKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.ViewingKeyMessage,
              org.example.api.GrpcAPI.IncomingViewingKeyMessage>(
                service, METHODID_GET_INCOMING_VIEWING_KEY)))
        .addMethod(
          getGetDiversifierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.DiversifierMessage>(
                service, METHODID_GET_DIVERSIFIER)))
        .addMethod(
          getGetNewShieldedAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.ShieldedAddressInfo>(
                service, METHODID_GET_NEW_SHIELDED_ADDRESS)))
        .addMethod(
          getGetZenPaymentAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.IncomingViewingKeyDiversifierMessage,
              org.example.api.GrpcAPI.PaymentAddressMessage>(
                service, METHODID_GET_ZEN_PAYMENT_ADDRESS)))
        .addMethod(
          getGetRcmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.BytesMessage>(
                service, METHODID_GET_RCM)))
        .addMethod(
          getIsSpendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.NoteParameters,
              org.example.api.GrpcAPI.SpendResult>(
                service, METHODID_IS_SPEND)))
        .addMethod(
          getCreateShieldedTransactionWithoutSpendAuthSigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.PrivateParametersWithoutAsk,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_CREATE_SHIELDED_TRANSACTION_WITHOUT_SPEND_AUTH_SIG)))
        .addMethod(
          getGetShieldTransactionHashMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.Protocol.Transaction,
              org.example.api.GrpcAPI.BytesMessage>(
                service, METHODID_GET_SHIELD_TRANSACTION_HASH)))
        .addMethod(
          getCreateSpendAuthSigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.SpendAuthSigParameters,
              org.example.api.GrpcAPI.BytesMessage>(
                service, METHODID_CREATE_SPEND_AUTH_SIG)))
        .addMethod(
          getCreateShieldNullifierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.NfParameters,
              org.example.api.GrpcAPI.BytesMessage>(
                service, METHODID_CREATE_SHIELD_NULLIFIER)))
        .addMethod(
          getCreateShieldedContractParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.PrivateShieldedTRC20Parameters,
              org.example.api.GrpcAPI.ShieldedTRC20Parameters>(
                service, METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS)))
        .addMethod(
          getCreateShieldedContractParametersWithoutAskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
              org.example.api.GrpcAPI.ShieldedTRC20Parameters>(
                service, METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK)))
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
          getGetTriggerInputForShieldedTRC20ContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.ShieldedTRC20TriggerContractParameters,
              org.example.api.GrpcAPI.BytesMessage>(
                service, METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT)))
        .addMethod(
          getCreateCommonTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protos.Protocol.Transaction,
              org.example.api.GrpcAPI.TransactionExtention>(
                service, METHODID_CREATE_COMMON_TRANSACTION)))
        .addMethod(
          getGetTransactionInfoByBlockNumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.NumberMessage,
              org.example.api.GrpcAPI.TransactionInfoList>(
                service, METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM)))
        .addMethod(
          getGetBurnTrxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.NumberMessage>(
                service, METHODID_GET_BURN_TRX)))
        .addMethod(
          getGetTransactionFromPendingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.BytesMessage,
              org.example.protos.Protocol.Transaction>(
                service, METHODID_GET_TRANSACTION_FROM_PENDING)))
        .addMethod(
          getGetTransactionListFromPendingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.TransactionIdList>(
                service, METHODID_GET_TRANSACTION_LIST_FROM_PENDING)))
        .addMethod(
          getGetPendingSizeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.NumberMessage>(
                service, METHODID_GET_PENDING_SIZE)))
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
        .addMethod(
          getGetMemoFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.api.GrpcAPI.EmptyMessage,
              org.example.api.GrpcAPI.PricesResponseMessage>(
                service, METHODID_GET_MEMO_FEE)))
        .build();
  }

  private static abstract class WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.api.GrpcAPI.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Wallet");
    }
  }

  private static final class WalletFileDescriptorSupplier
      extends WalletBaseDescriptorSupplier {
    WalletFileDescriptorSupplier() {}
  }

  private static final class WalletMethodDescriptorSupplier
      extends WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WalletMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WalletGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WalletFileDescriptorSupplier())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetAccountByIdMethod())
              .addMethod(getGetAccountBalanceMethod())
              .addMethod(getGetBlockBalanceTraceMethod())
              .addMethod(getCreateTransactionMethod())
              .addMethod(getCreateTransaction2Method())
              .addMethod(getBroadcastTransactionMethod())
              .addMethod(getUpdateAccountMethod())
              .addMethod(getSetAccountIdMethod())
              .addMethod(getUpdateAccount2Method())
              .addMethod(getVoteWitnessAccountMethod())
              .addMethod(getUpdateSettingMethod())
              .addMethod(getUpdateEnergyLimitMethod())
              .addMethod(getVoteWitnessAccount2Method())
              .addMethod(getCreateAssetIssueMethod())
              .addMethod(getCreateAssetIssue2Method())
              .addMethod(getUpdateWitnessMethod())
              .addMethod(getUpdateWitness2Method())
              .addMethod(getCreateAccountMethod())
              .addMethod(getCreateAccount2Method())
              .addMethod(getCreateWitnessMethod())
              .addMethod(getCreateWitness2Method())
              .addMethod(getTransferAssetMethod())
              .addMethod(getTransferAsset2Method())
              .addMethod(getParticipateAssetIssueMethod())
              .addMethod(getParticipateAssetIssue2Method())
              .addMethod(getFreezeBalanceMethod())
              .addMethod(getFreezeBalance2Method())
              .addMethod(getFreezeBalanceV2Method())
              .addMethod(getUnfreezeBalanceMethod())
              .addMethod(getUnfreezeBalance2Method())
              .addMethod(getUnfreezeBalanceV2Method())
              .addMethod(getUnfreezeAssetMethod())
              .addMethod(getUnfreezeAsset2Method())
              .addMethod(getWithdrawBalanceMethod())
              .addMethod(getWithdrawBalance2Method())
              .addMethod(getWithdrawExpireUnfreezeMethod())
              .addMethod(getDelegateResourceMethod())
              .addMethod(getUnDelegateResourceMethod())
              .addMethod(getCancelAllUnfreezeV2Method())
              .addMethod(getUpdateAssetMethod())
              .addMethod(getUpdateAsset2Method())
              .addMethod(getProposalCreateMethod())
              .addMethod(getProposalApproveMethod())
              .addMethod(getProposalDeleteMethod())
              .addMethod(getBuyStorageMethod())
              .addMethod(getBuyStorageBytesMethod())
              .addMethod(getSellStorageMethod())
              .addMethod(getExchangeCreateMethod())
              .addMethod(getExchangeInjectMethod())
              .addMethod(getExchangeWithdrawMethod())
              .addMethod(getExchangeTransactionMethod())
              .addMethod(getMarketSellAssetMethod())
              .addMethod(getMarketCancelOrderMethod())
              .addMethod(getGetMarketOrderByIdMethod())
              .addMethod(getGetMarketOrderByAccountMethod())
              .addMethod(getGetMarketPriceByPairMethod())
              .addMethod(getGetMarketOrderListByPairMethod())
              .addMethod(getGetMarketPairListMethod())
              .addMethod(getListNodesMethod())
              .addMethod(getGetAssetIssueByAccountMethod())
              .addMethod(getGetAccountNetMethod())
              .addMethod(getGetAccountResourceMethod())
              .addMethod(getGetAssetIssueByNameMethod())
              .addMethod(getGetAssetIssueListByNameMethod())
              .addMethod(getGetAssetIssueByIdMethod())
              .addMethod(getGetNowBlockMethod())
              .addMethod(getGetNowBlock2Method())
              .addMethod(getGetBlockByNumMethod())
              .addMethod(getGetBlockByNum2Method())
              .addMethod(getGetTransactionCountByBlockNumMethod())
              .addMethod(getGetBlockByIdMethod())
              .addMethod(getGetBlockByLimitNextMethod())
              .addMethod(getGetBlockByLimitNext2Method())
              .addMethod(getGetBlockByLatestNumMethod())
              .addMethod(getGetBlockByLatestNum2Method())
              .addMethod(getGetTransactionByIdMethod())
              .addMethod(getDeployContractMethod())
              .addMethod(getGetContractMethod())
              .addMethod(getGetContractInfoMethod())
              .addMethod(getTriggerContractMethod())
              .addMethod(getTriggerConstantContractMethod())
              .addMethod(getEstimateEnergyMethod())
              .addMethod(getClearContractABIMethod())
              .addMethod(getListWitnessesMethod())
              .addMethod(getGetDelegatedResourceMethod())
              .addMethod(getGetDelegatedResourceV2Method())
              .addMethod(getGetDelegatedResourceAccountIndexMethod())
              .addMethod(getGetDelegatedResourceAccountIndexV2Method())
              .addMethod(getGetCanDelegatedMaxSizeMethod())
              .addMethod(getGetAvailableUnfreezeCountMethod())
              .addMethod(getGetCanWithdrawUnfreezeAmountMethod())
              .addMethod(getListProposalsMethod())
              .addMethod(getGetPaginatedProposalListMethod())
              .addMethod(getGetProposalByIdMethod())
              .addMethod(getListExchangesMethod())
              .addMethod(getGetPaginatedExchangeListMethod())
              .addMethod(getGetExchangeByIdMethod())
              .addMethod(getGetChainParametersMethod())
              .addMethod(getGetAssetIssueListMethod())
              .addMethod(getGetPaginatedAssetIssueListMethod())
              .addMethod(getTotalTransactionMethod())
              .addMethod(getGetNextMaintenanceTimeMethod())
              .addMethod(getGetTransactionInfoByIdMethod())
              .addMethod(getAccountPermissionUpdateMethod())
              .addMethod(getGetTransactionSignWeightMethod())
              .addMethod(getGetTransactionApprovedListMethod())
              .addMethod(getGetNodeInfoMethod())
              .addMethod(getGetRewardInfoMethod())
              .addMethod(getGetBrokerageInfoMethod())
              .addMethod(getUpdateBrokerageMethod())
              .addMethod(getCreateShieldedTransactionMethod())
              .addMethod(getGetMerkleTreeVoucherInfoMethod())
              .addMethod(getScanNoteByIvkMethod())
              .addMethod(getScanAndMarkNoteByIvkMethod())
              .addMethod(getScanNoteByOvkMethod())
              .addMethod(getGetSpendingKeyMethod())
              .addMethod(getGetExpandedSpendingKeyMethod())
              .addMethod(getGetAkFromAskMethod())
              .addMethod(getGetNkFromNskMethod())
              .addMethod(getGetIncomingViewingKeyMethod())
              .addMethod(getGetDiversifierMethod())
              .addMethod(getGetNewShieldedAddressMethod())
              .addMethod(getGetZenPaymentAddressMethod())
              .addMethod(getGetRcmMethod())
              .addMethod(getIsSpendMethod())
              .addMethod(getCreateShieldedTransactionWithoutSpendAuthSigMethod())
              .addMethod(getGetShieldTransactionHashMethod())
              .addMethod(getCreateSpendAuthSigMethod())
              .addMethod(getCreateShieldNullifierMethod())
              .addMethod(getCreateShieldedContractParametersMethod())
              .addMethod(getCreateShieldedContractParametersWithoutAskMethod())
              .addMethod(getScanShieldedTRC20NotesByIvkMethod())
              .addMethod(getScanShieldedTRC20NotesByOvkMethod())
              .addMethod(getIsShieldedTRC20ContractNoteSpentMethod())
              .addMethod(getGetTriggerInputForShieldedTRC20ContractMethod())
              .addMethod(getCreateCommonTransactionMethod())
              .addMethod(getGetTransactionInfoByBlockNumMethod())
              .addMethod(getGetBurnTrxMethod())
              .addMethod(getGetTransactionFromPendingMethod())
              .addMethod(getGetTransactionListFromPendingMethod())
              .addMethod(getGetPendingSizeMethod())
              .addMethod(getGetBlockMethod())
              .addMethod(getGetBandwidthPricesMethod())
              .addMethod(getGetEnergyPricesMethod())
              .addMethod(getGetMemoFeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
