package com.amit.problemsolving;

import java.util.HashMap;

public class Occurrence {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(findOccurrence(s));
        findWordCount("Hello amit how are you amit i hope you are doing good good to meet you");
    }

    public static  int findOccurrence(String s) {
        int a[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            a[c - 'a']++;
        }
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if(a[c -'a'] == 1) return i;
//
//        }
        System.out.println(String.valueOf(a.toString()));
        return  -1;
    }

    public static void findWordCount(String str) {
        if(str.isEmpty())
            return ;
        String[] arr = str.split(" ");
        HashMap<String,Integer> counterMap = new HashMap<>();
        for(int i =0; i<arr.length;i++)
        {
            if(counterMap.containsKey(arr[i])) {
                counterMap.put(arr[i],counterMap.get(arr[i])+1);
            } else {
                counterMap.put(arr[i],1);
            }
        }
        System.out.println(counterMap);
    }
}
