package com.erykszlachetka;

public class Main {

    public static void main(String[] args) {

        String[] genesisTransactions = {"Bob sent Alice 500BTC (bitcoin)","Rob sent 10BTC (bitcoin) to Alice"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"Alice sent 10BTC (bitcoin) to Bob", "Bob sent 10BTC (bitcoin) to Mat"};
        Block block2 = new Block(genesisBlock.getHash(), block2Transactions);

        String[] block3Transactions = {"Alice sent 99BTC (bitcoin) to someone"};
        Block block3 = new Block(block2.getHash(), block3Transactions);

        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getHash());
    }
}
