package com.amit.datastructure.practice2.collections.set;

import java.util.HashSet;
import java.util.Iterator;
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
        HashSet<String> result = new HashSet();
        result = getPerm("amit","",new HashSet());
        Iterator<String> i = result.iterator();
        System.out.println("size::"+result.size());
        while(i.hasNext()) {

            System.out.println( i.next());
        }

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
        System.out.println(hs.contains(10));
    }

//    public boolean checkInclusion(String s1, String s2) {
//
//        HashSet<String> result = new HashSet();
//        result = getPerm(s1,"",new HashSet());
//        Iterator<String> i = result.iterator();
//        while(i.hasNext()) {
//            String a = i.next();
//            if(s2.contains(a))
//                return true;
//        }
//        return false;
//    }

    public static HashSet<String> getPerm(String str,String ans,HashSet<String> result) {
        if(str.length() == 0) {
            result.add(ans);
            return result;
        }

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            String remainingStr = str.substring(0,i) + str.substring(i+1);
            getPerm(remainingStr,ans+ch,result);
        }
        return result;
    }
}
