package com.amit.problemsolving;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int[] b = {1,2,3,4,5,6,7};

       // reverseArray(a,0,a.length-1);
        Arrays.stream(a).forEach(System.out::print);
        leftRotateArray(a,3);
        System.out.println(" ");
        Arrays.stream(a).forEach(System.out::print);
        rightRotateArray(b,3);
        Arrays.stream(b).forEach(System.out::print);
    }

   public  static void leftRotateArray(int[] a , int d) {
        reverseArray(a,0,d-1);
        reverseArray(a,d,a.length-1);
        reverseArray(a,0,a.length-1);
   }

    public  static void rightRotateArray(int[] a , int d) {
        reverseArray(a,0,a.length-1);
        reverseArray(a,0,d-1);
        reverseArray(a,d,a.length-1);
    }
    public static void reverseArray(int[] a,int start, int end) {


        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            end--;
            start++;
        }
    }
}
