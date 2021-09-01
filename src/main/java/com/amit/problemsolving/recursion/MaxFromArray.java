package com.amit.problemsolving.recursion;

public class MaxFromArray {
    public static void main(String[] args) {
      MaxFromArray ma = new MaxFromArray();
      int a[] = new int[] {1,2,3,43,5,6,7,89};
        System.out.println("Max:"+ ma.getMax(a,0));

    }

    int getMax(int a[],int i) {
        if( i > a.length-1) {
            return -1;
        }
        return Math.max(a[i],getMax(a,i+1));
    }


}
