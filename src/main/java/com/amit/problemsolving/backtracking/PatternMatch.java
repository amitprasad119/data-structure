package com.amit.problemsolving.backtracking;

import java.util.ArrayList;
import java.util.HashSet;

public class PatternMatch {
    public static void main(String[] args) {
        String keyword = "AABA";
        String input =   "AABAACAADAABAABA";
        search(input,keyword);
    }

   // Window problem
   static void search(String input,String pat) {
      int patLength = pat.length();
      int n = input.length();

      for(int i =0;i<=n - patLength ;i++) {
          int j ;
          for( j=0;j<patLength;j++)
              if(input.charAt(i+j) != pat.charAt(j))
                  break;
           if(j == patLength)
               System.out.println("Found at: "+i);
      }
   }
}
