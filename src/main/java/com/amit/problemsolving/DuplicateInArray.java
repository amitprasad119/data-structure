package com.amit.problemsolving;
/**
   for all i < n if array of elements <= n
 */
public class DuplicateInArray {
    public static void main(String[] args) {
      int arr[] = new int[] {2,3,4,2,1,3};
    //  printDuplicates(arr);
      reverse();
    }

    static  void printDuplicates(int[] a) {

        for(int i =0;i<a.length;i++) {
            if(a[Math.abs(a[i])] > 0) {
                a[Math.abs(a[i])] =  -a[Math.abs(a[i])];
            }
            else {
                System.out.println("Found duplicate for:"+Math.abs(a[i]) + "at " + (i+1));
            }
        }
    }

   static void reverse() {
       int a[] = new int[]{1, 2, 3, 4, 5, 6, 7}; // 7,6,5,4,3,2,1
       int head = 0;
       int tail = a.length-1;
       System.out.println("Before reverse:");
       for(int i:a){
           System.out.print(" "+i);
       }
       System.out.println();
       while (head < tail) {
           int temp = a[head];
           a[head] = a[tail];
           a[tail] = temp;
           head++;
           tail--;
       }
       System.out.println("After reverse");
       for(int i:a){
           System.out.print( " " +i);
       }
       System.out.println();
    }
}
