package com.amit.datastructure.practice2.collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
     treeSetOpr();
    }

    public static void treeSetOpr() {
        Map<Integer,String> treeMap = new TreeMap<>();

        treeMap.put(1, "Amit");
        treeMap.put(2,"Bablu");
        treeMap.put(4,"Chandan");
        treeMap.put(5,"Erich");
        treeMap.put(3,"Deepak");
        //System.out.println(treeMap);
       // treeMap.entrySet().forEach(System.out::println);
        treeMap.entrySet().stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(1)
                .forEach(System.out::println);




    }

}
