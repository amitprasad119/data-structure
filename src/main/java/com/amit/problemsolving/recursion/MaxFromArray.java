package com.amit.problemsolving.recursion;

public class MaxFromArray {
    public static void main(String[] args) {
      MaxFromArray ma = new MaxFromArray();
      int a[] = new int[] {1,2,3,43,5,6,7,89};
        System.out.println("Max:"+ ma.getMax(a,a.length-1));
        System.out.println(ma.getMin(a,a.length-1));

    }

    int getMax(int a[],int i) {
        if(i == 1)
            return a[0];
        return Math.max(a[i],getMax(a,i-1));
    }

    int getMin(int a[],int i) {
        if(i == 1)
            return a[0];
        return Math.min(a[i],getMin(a,i-1));
    }



}
