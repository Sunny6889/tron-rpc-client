package org.example;


import java.io.IOException;

public class Main {
    private static String myAddress = "TBEJewE3MWBbW9t7F4s875yvMHrhqBAZfB";
    private static String myAddress2 = "TWxhM3gR8A8tyMqCU6Z4bJzdBQLCBe25Bs";

    private static TronServer server;
    private static Tron rpcClient;

    private static String nileNet = "grpc.nile.trongrid.io:50051";
    private static String localNet = "127.0.0.1:8902";

    public static void main(String[] args) throws IOException, InterruptedException {
        rpcClient = new Tron(nileNet);
     //   rpcClient.transferTRX(myAddress, myAddress2, 100);
        rpcClient.getNowBlock();

//        server = new TronServer();
//        server.start();
//        server.blockUntilShutdown();
    }

}