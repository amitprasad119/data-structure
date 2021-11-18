package com.amit.datastructure.practice2.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Array List
 * 0. Implements the list iterface
 * 1. Maintains the insertion oder
 * 2. non synchronized
 * 3. good for store and retrieval
 */

public class Array {
    public static void main(String[] args) {
       arrayOperations();
    }

    public static void arrayOperations() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(6);

        /**
         * iterate using loop
         */

        for(int i =0;i<arrayList.size();i++) {
            System.out.println( arrayList.get(i));
        }

         /***
         * Using iterable traverse
         */

        Iterator<Integer> i = arrayList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        /**
         * using lambda
         */

       arrayList.forEach(System.out::println);

       /**
        *  remove operations
        */
       arrayList.remove(1); // 2 got deleted
       arrayList.forEach(System.out::println);

       arrayList.clear(); // removes all the element
        System.out.println("After clear");
        arrayList.forEach(System.out::println); // nothing prints

    }
}
