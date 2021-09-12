package com.amit.problemsolving;
/**
   for all i < n if array of elements <= n
 */
public class DuplicateInArray {
    public static void main(String[] args) {
      int arr[] = new int[] {2,3,4,2,1,3};
      printDuplicates(arr);
    }

    static  void printDuplicates(int[] a) {

        for(int i =0;i<a.length;i++) {
            if(a[Math.abs(a[i])] > 0) {
                a[Math.abs(a[i])] =  -a[Math.abs(a[i])];
            }
            else {
                System.out.println("Found duplicate for:"+Math.abs(a[i]) + "at " + i+1);
            }
        }
    }
}
