package com.amit.problemsolving;

import java.util.Arrays;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        int a[] = {2,3,4,6,10,12,15};
        segregate(a);
        Arrays.stream(a).forEach(System.out::println);
    }

    public static void segregate(int[] a ) {
      int start = 0;
      int end = a.length-1;

      while (start < end) {
          if(a[start] % 2 == 0)
              start++;
          if(a[end] %2 !=0)
              end--;
          if(a[start] %2 !=0 && a[end] %2 == 0 && start < end) {
              int temp = a[start];
              a[start] = a[end];
              a[end] = temp;
          }
      }
    }
}
