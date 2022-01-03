package com.amit.datastructure.practice2.collections.map;

import java.util.*;
import java.util.stream.Stream;

public class HashMapExample {
    public static void main(String[] args) {
      hashMapOpr();
    }

    public static void hashMapOpr() {
        Map<Integer,String> hm = new HashMap<>();
        Map<Character,Integer> stringMap = new HashMap<>();
        String a = "helllofromjava";
        hm.put(1,"Amit");
        hm.put(2,"Sumit");
        hm.put(4,"Suman");
        hm.put(3,"alec");
        hm.put(6,"Raj");
        hm.put(5,"Oram");

        hm.entrySet().forEach(System.out::println); // 1=Amit,2=Sumit,3=Suman
        hm.keySet().forEach(System.out::println); // print only ket sets
        hm.values().forEach(System.out::println); //print values Amit,Sumit,Suman,peter

        /**
         *  sort the map based on key/ value
         */
       // order by key in reverse order
        hm.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);

        //order by value in reverse order
                hm.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

                for(int i =0;i<a.length();i++) {
                    if(stringMap.containsKey(a.charAt(i))) {
                        stringMap.put(a.charAt(i),stringMap.get(a.charAt(i))+1);
                    } else {
                        stringMap.put(a.charAt(i), 1);
                    }
                }

        Optional<Map.Entry<Character, Integer>> x = stringMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .findFirst();


    }
}
