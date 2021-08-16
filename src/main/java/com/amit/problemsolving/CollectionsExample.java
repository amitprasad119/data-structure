package com.amit.problemsolving;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();

        list.add(0);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);

        System.out.println(list);
        System.out.println("after sort");
        Collections.sort(list);
        System.out.println(list);

    }
}
