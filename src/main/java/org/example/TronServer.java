package org.example;

import com.google.protobuf.ByteString;
import io.grpc.*;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.example.api.GrpcAPI;
import org.example.api.WalletGrpc;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Slf4j
public class TronServer extends WalletGrpc.WalletImplBase {

    private final Server server;
    private int port = 8902;

    public TronServer() {
        super();
        this.bindService();
        ServerBuilder serverBuilder = Grpc.newServerBuilderForPort(port, InsecureServerCredentials.create());
        server = serverBuilder.addService(this)
                .build();
    }

    @Override
    public void getNowBlock2(GrpcAPI.EmptyMessage request, StreamObserver<GrpcAPI.BlockExtention> responseObserver) {
        GrpcAPI.BlockExtention.Builder blockExtention = GrpcAPI.BlockExtention.newBuilder();
        blockExtention.setBlockid(ByteString.fromHex("1001"));
        responseObserver.onNext(blockExtention.build());
        responseObserver.onCompleted();
    }

    public void start() throws IOException {
        server.start();
        log.info("Server started, listening on " + port);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                try {
                    TronServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("*** server shut down");
            }
        });
    }

    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

}
