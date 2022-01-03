package com.amit.datastructure.practice2.collections.set;

import com.amit.datastructure.practice2.collections.list.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * 0. Implements set
 * 1. doesn't accept null
 * 2. by default sorts the data in ascending order
 */
public class TreeSetExample {
    public static void main(String[] args) {
     treeSetExample();
    }

    public static void treeSetExample() {
        Set<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(90);
        treeSet.add(80);
        treeSet.add(50);
        treeSet.forEach(System.out::println); // 10,20,50,80,90 is the output and in ascending order
        treeSet.forEach(System.out::println);




    }
}
