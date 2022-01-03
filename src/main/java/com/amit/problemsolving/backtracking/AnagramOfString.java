package com.amit.problemsolving.backtracking;

import java.util.ArrayList;

public class AnagramOfString {
    public static void main(String[] args) {
        String str = "Amit";
       //stringAnagram(str,new ArrayList<>(),0,new boolean[str.length()]);
       stringAnagram2(str,new ArrayList<>(),new boolean[str.length()]);
    }

    static  void stringAnagram(String a, ArrayList<Character> partial,int index,boolean used[]) {
        if(partial.size() == a.length())
        {
            System.out.println(String.valueOf(partial));
            return;
        }
        if(index == a.length()) return;

        for(int i= 0;i<a.length();i++) {
            if (!used[i]) {
                used[i] = true;
                partial.add(a.charAt(i));
                stringAnagram(a, partial, index + 1, used);
                used[i] = false;
                partial.remove(partial.size() -1);
            }
        }
    }

   static  void stringAnagram2 (String str,ArrayList<Character> partial,boolean[] used) {
        if(partial.size() == str.length()) {
            System.out.println(partial);
            return;
        }

        for(int i=0;i<str.length();i++) {
            if(!used[i]) {
                used[i] = true;
                partial.add(str.charAt(i));
                stringAnagram2(str,partial,used);
                used[i] = false;
                partial.remove(partial.size() -1);
            }
        }
   }
}
