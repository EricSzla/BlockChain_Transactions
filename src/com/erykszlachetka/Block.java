package com.erykszlachetka;

// A Block class which stores previous hash and transactions
import java.util.Arrays;

public class Block {
    private int prevHash; // Previous hash
    private String[] transax; // Transactions
    private int hash; // The block hash

    public Block(int prevH, String[] trx){
        this.prevHash = prevH;
        this.transax = trx;

        Object[] cont = {Arrays.hashCode(trx),prevH};
        this.hash = Arrays.hashCode(cont);
    }

    public int getPrevHash() {
        return prevHash;
    }

    public String[] getTransax() {
        return transax;
    }

    public int getHash() {
        return hash;
    }
}
