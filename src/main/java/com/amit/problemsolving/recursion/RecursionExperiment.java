package com.amit.problemsolving.recursion;

import java.util.ArrayList;

public class RecursionExperiment {
    public static void main(String[] args) {
       // x(3,new ArrayList<>());
        RecursionExperiment r = new RecursionExperiment();
      //  r.print(10,"even-0");
      //  per(5);
        System.out.println(reverseString("Hello"));
    }

     static void y(int n) {
         System.out.println(n);
         y(n-1);
         System.out.println("End");
     }
  /*
     begin 5
     begin 4
     begin 3
     begin 2
     begin 1
     begin 0
     inside
     end

   */
    static void per(int n ) {
        System.out.println("Begin:"+n);
        for(int i =0;i<n;i++){
            per(n-1); //
            System.out.println("Inside");
        }
        System.out.println("End");
    }

    public static String reverseString(String s ) {
        if(s.isEmpty()) {
            return "";
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
    private static void x(int n,ArrayList<Integer> partial) {

        if(partial.size() == 3) {
            System.out.println(partial);
        }
        for (int i = 0; i < n; i++) {
            System.out.print( "  " + n  + " ") ;
            partial.add(n);
            x(n - 1,partial);
            System.out.println("Removing:"+ partial.get(partial.size() -1));
            partial.remove(partial.size() -1);
        }
        System.out.println();
    }
}
