package com.amit.problemsolving.recursion;

public class NumberSequence {
    public static void main(String[] args) {
         NumberSequence ns  = new NumberSequence();
         int[] arr = new int[] {1,2,3,4,5,6,7};
        System.out.println(ns.isNumberSequence(arr,0));
    }

    boolean isNumberSequence(int[] a,int i) {
        if(i == a.length -1)
            return true;

        return  a[i]+1 == a[i+1] &&  isNumberSequence(a , i+1);
    }
}
