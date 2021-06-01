package com.amit.problemsolving;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(20);
        ArrayList<Integer> arr2 = new ArrayList<Integer>(List.of(30,40,50,60,70));
        arr.add(10);
        arr.add(0,5);
        arr.addAll(arr2);
        System.out.println( arr);
        System.out.println(arr);
        for(Integer a : arr)
            System.out.println(a);
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
