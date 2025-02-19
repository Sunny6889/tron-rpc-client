package org.example;


import java.io.IOException;

public class Main {
    private static String myAddress1 = "TBEJewE3MWBbW9t7F4s875yvMHrhqBAZfB";
    private static String privateKey1 = "xx";
    private static String smcAddress1 = "TLDN155fRL5oXNfAwS8pzwdEeVaSKz2A64"; // created by myAddress1

    private static String myAddress2 = "TWxhM3gR8A8tyMqCU6Z4bJzdBQLCBe25Bs";
    private static String privateKey2 = "xx";

    //private static TronServer server;
    private static Tron rpcClient;

    private static String nileNet = "grpc.nile.trongrid.io:50051";
   // private static String localNet = "127.0.0.1:8902";

    public static void main(String[] args) throws IOException, InterruptedException {
        rpcClient = new Tron(nileNet, privateKey2);
        rpcClient.triggerSmartContract(myAddress2, smcAddress1, 100000000, "receive()");
      //  rpcClient.GetTransactionInfoByBlockNum();

//        server = new TronServer();
//        server.start();
//        server.blockUntilShutdown();
    }

}

/*
docker run -it --name tron -d -p 8090:8090 -p 18888:18888 -p 18888:18888/udp -p 50051:50051 \
        -v /Users/sunnyjiao/Documents/java/java-tron/config:/java-tron/conf \
tronprotocol/java-tron \
        -jvm "{-Xmx10g -Xms10g}" \
        -c /java-tron/conf/private_net_config_witness.conf \
        -w

docker run -it --name tron2 -d -p 18889:18889 \
        -v /Users/sunnyjiao/Documents/java/java-tron/config:/java-tron/conf \
tronprotocol/java-tron \
        -jvm "{-Xmx10g -Xms10g}" \
        -c /java-tron/conf/private_net_config_nodes.conf \

 */

