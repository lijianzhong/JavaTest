package com.lijz.datastruct.set;

import java.util.BitSet;

/**
 * Created by jianzhongli on 16/2/3.
 */
public class BitSetTest {

    public static void main(String[] args){

        BitSet bitSet =new BitSet();
        bitSet.set(1);
        bitSet.set(10);
        bitSet.set(30);

        System.out.println(bitSet.size());
        System.out.println(bitSet.get(1));
        System.out.println(bitSet.get(20));
    }
}
