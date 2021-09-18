package com.amit.problemsolving;

import java.util.BitSet;

public class BitSetExample {
    public static void main(String[] args) {
        BitSet bs = new BitSet();
        bs.set(2);
        bs.set(5);
        bs.set(4);
        bs.set(2);
        bs.set(9);

        System.out.println("BS:"+bs);
        System.out.println(bs.get(1));

        BitSet bs1 = new BitSet();
        bs1.set(1);
        bs1.set(2);
        bs1.set(3);
        bs1.set(4);
        bs1.set(5);
        bs1.set(6);
        bs1.set(7);
        bs1.set(8);
        bs1.set(9);
        bs1.set(10);
        System.out.println("BS2:"+bs1);
        bs.and(bs1);

        System.out.println("BS after AND with BS1:"+bs);
        bs.or(bs1);
        System.out.println("BS after OR with BS1:"+bs);

        bs.flip(0,bs.length());
        System.out.println("BS after flipping all bits:"+bs);

    }
}
