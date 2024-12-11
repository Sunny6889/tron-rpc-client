package org.example.common.utils;

import com.google.protobuf.ByteString;
import org.example.common.crypto.Sha256Sm3Hash;
import org.example.common.crypto.SignInterface;
import org.example.common.crypto.SignatureInterface;
import org.example.protos.Protocol;

public class TransactionUtils {
    public static Protocol.Transaction setExpirationTime(Protocol.Transaction transaction) {
        long expirationTime = System.currentTimeMillis() + 6 * 60 * 60 * 1000; // 6 hours
        Protocol.Transaction.Builder builder = transaction.toBuilder();
        Protocol.Transaction.raw.Builder rowBuilder = transaction.getRawData().toBuilder();
        rowBuilder.setExpiration(expirationTime);
        builder.setRawData(rowBuilder.build());
        return builder.build();
    }

    public static Protocol.Transaction sign(Protocol.Transaction transaction, SignInterface myKey) {
        Protocol.Transaction.Builder transactionBuilderSigned = transaction.toBuilder();
        byte[] hash = Sha256Sm3Hash.hash(transaction.getRawData().toByteArray());
        SignatureInterface signature = myKey.sign(hash);
        ByteString bsSign = ByteString.copyFrom(signature.toByteArray());
        transactionBuilderSigned.addSignature(bsSign);
        transaction = transactionBuilderSigned.build();
        return transaction;
    }
}
