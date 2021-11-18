package com.amit.datastructure.practice2.search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
       int[] arr = {1,2,3,5,7,9,12,18};
      int pos =  search(arr,0,arr.length-1,9);
      if(pos == -1) {
          System.out.println("Not found");
      } else {
          System.out.println("Item found at pos: " + (pos+1));
      }
        System.out.println("Reverse::"+reverseWords("i.like.this.program.very.much"));
    }


   static String reverseWords(String S)
    {
        String[] l = S.split("\\.");
        StringBuilder builder= new StringBuilder("");
        for(String s : l) {
            System.out.println(s);
        }
        for(int i = l.length-1;i>=0;i--) {
            System.out.println("Inside");
            builder.append(l[i]);
            if(i!=0)
            builder.append(".");
        }
        System.out.println(builder.toString());
        return builder.toString();
    }
    public static int search(int[] arr, int low, int high,int key) {
      int mid = (low + high ) / 2;
      if(high >= low) {


          if (arr[mid] == key) {
              return mid;
          }
          if (arr[mid] < key) {
             return search(arr, mid + 1, high, key);
          }
          if (arr[mid] > key) {
            return   search(arr, low, mid, key);
          }
      }
        return  -1;
    }
}
