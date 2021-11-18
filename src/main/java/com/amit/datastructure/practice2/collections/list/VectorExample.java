package com.amit.datastructure.practice2.collections.list;

import java.util.Vector;

/**
 * 0. Implements List interface
 * 1. Synchronized
 * 2. Has method more than collection framework
 * 3. Maintains insertion order
 */
public class VectorExample {
    public static void main(String[] args) {
       vectorOpr();
    }

    public static void vectorOpr() {
        Vector<Integer> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(6);
        v.add(5);
        v.add(7);

        v.forEach(System.out::println);
        System.out.println(v.firstElement()); // returns first element from vector i.e 1
        System.out.println(v.lastElement()); // returns last element from vector i.e 7
        System.out.println("From 1 to 4-1");
        v.subList(1,4).forEach(System.out::println); // returns sublist from index 1 to 4
        System.out.println("element using legacy class");
        v.addElement(10);
        v.forEach(System.out::println);
    }
}
