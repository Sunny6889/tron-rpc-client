package org.example;

import com.google.protobuf.ByteString;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.example.api.GrpcAPI;
import org.example.api.WalletGrpc;
import org.example.common.crypto.ECKey;
import org.example.common.utils.ByteArray;
import org.example.common.utils.TransactionUtils;
import org.example.common.utils.Utils;
import org.example.protos.Protocol;
import org.example.protos.contract.BalanceContract;

@Slf4j
public class Tron {
    private WalletGrpc.WalletBlockingStub blockingStub;

    public Tron(String target) {
        Channel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
        blockingStub = WalletGrpc.newBlockingStub(channel);
    }

    public void getNowBlock() {
        GrpcAPI.BlockExtention block = blockingStub.getNowBlock2(GrpcAPI.EmptyMessage.newBuilder().build());
        log.info("Here getNowBlock Result");
        log.info(String.valueOf(block.getBlockid()));
    }

    public void GetTransactionInfoByBlockNum() {
        GrpcAPI.NumberMessage.Builder number = GrpcAPI.NumberMessage.newBuilder();
        number.setNum(63800);
        GrpcAPI.TransactionInfoList transInfo = blockingStub.getTransactionInfoByBlockNum(number.build());
        log.info("Here getTransactionInfoByBlockNum Result");
        log.info(transInfo.toString());
    }

    public void transferTRX(String from, String to, long amount) {
        byte[] ownerAddress = Utils.decodeFromBase58Check(from);
        byte[] toAddress = Utils.decodeFromBase58Check(to);

        BalanceContract.TransferContract.Builder builder = BalanceContract.TransferContract.newBuilder();
        builder.setAmount(amount);
        builder.setOwnerAddress(ByteString.copyFrom(ownerAddress));
        builder.setToAddress(ByteString.copyFrom(toAddress));
        GrpcAPI.TransactionExtention trans = blockingStub.createTransaction2(builder.build());
        System.out.println("creat transaction is " + trans);
        broadcastTrans(trans);
    }

    public void broadcastTrans(GrpcAPI.TransactionExtention transExtention) {
        Protocol.Transaction transaction = transExtention.getTransaction();
        System.out.println("before sign transaction hex string is " + ByteArray.toHexString(transaction.toByteArray()));

        // 重新设置过期时间
        transaction = TransactionUtils.setExpirationTime(transaction);

        // 私钥加密
        ECKey ecKey = ECKey.fromPrivate(ByteArray.fromHexString("54cc631f7ff8009607c736d096c9f23359a617ddb04379eaf25243588dec7794"));
        Protocol.Transaction signaturedTransaction = TransactionUtils.sign(transaction, ecKey);
        System.out.println("after sign transaction hex string is " + ByteArray.toHexString(transaction.toByteArray()));

        // 检查权限是否足够
        GrpcAPI.TransactionSignWeight weight = getTransactionSignWeight(transaction);
        if (weight.getResult().getCode() == GrpcAPI.TransactionSignWeight.Result.response_code.ENOUGH_PERMISSION) {
            System.out.println("weight is also enough");
        }

        // 广播交易
        GrpcAPI.Return response = blockingStub.broadcastTransaction(signaturedTransaction);
        System.out.println(response);
    }

    public GrpcAPI.TransactionSignWeight getTransactionSignWeight(Protocol.Transaction transaction) {
        return blockingStub.getTransactionSignWeight(transaction);
    }

}
