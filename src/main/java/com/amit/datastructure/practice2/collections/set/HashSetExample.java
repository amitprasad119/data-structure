package com.amit.datastructure.practice2.collections.set;

import java.util.HashSet;
import java.util.Set;

/**
 *  0. Implements set interface
 *  1. it contains unique items
 *  2. does not maintains the insertion order
 *  3. allows only one null , if multiple nulls then it will get ignored
 */
public class HashSetExample {
    public static void main(String[] args) {
            hashSetOpr();
    }

    public static void hashSetOpr() {
        Set<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        hs.add(null);
        hs.add(null);
        hs.forEach(System.out::println);
        System.out.println("My hashset values: "+hs);

    }
}
