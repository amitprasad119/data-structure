package com.amit.problemsolving;

public class Occurrence {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(findOccurrence(s));
    }

    public static  int findOccurrence(String s) {
        int a[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            a[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(a[c -'a'] == 1) return i;

        }
        return  -1;
    }
}
