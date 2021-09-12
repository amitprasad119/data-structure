package com.amit.problemsolving.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlindromeStringSubset {
    public static void main(String[] args) {
        String s = "aabb";
        ArrayList<Character> a = new ArrayList<>();
        a.add('a');
        a.add('a');
        a.add('b');
      //  System.out.println(getStringRepresentationReverse(a));
        palindromicString(s,new ArrayList<>(),0);
    }

   static String getStringRepresentation(ArrayList<String> list)
    {
        StringBuilder builder = new StringBuilder(list.size());
        for(String ch: list)
        {
            builder.append(ch);
        }
        return builder.toString();
    }

   static String getStringRepresentationReverse(List<String> list)
    {
        StringBuilder builder = new StringBuilder(list.size());
         for(int i = list.size()-1;i>= 0;i--) {
             builder.append(list.get(i));
         }

        return builder.toString();
    }

  static   void palindromicString(String str, ArrayList<String> partial,int start) {
        if(getStringRepresentation(partial).equalsIgnoreCase(getStringRepresentationReverse(partial)) && partial.size() !=0) {
            System.out.println("Match::"+getStringRepresentation(partial));
            return;
        }
      if(start >= str.length()) {
          return;
      }
      for(int i = start;i<str.length();i++) {
          partial.add(str.substring(i,start));
          palindromicString(str.substring(i),partial,i+1);
          partial.remove(partial.size() -1);
      }
    }
}
