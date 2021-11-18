package com.amit.datastructure.practice2.collections.list;

import java.util.List;

/**
 *  0. Implements List
 *  1. Non synchronized
 *  2. Internal implementation as doubly linked list
 *  3. better for storing and data manipulation
 *  4. maintains insertion order
 */
public class LinkedList {
    public static void main(String[] args) {
        linkedListOperation();
    }

    public static void linkedListOperation() {
        List<Integer>  ll = new java.util.LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(6);
        ll.add(5);
        ll.forEach(System.out::println);
    }
}
