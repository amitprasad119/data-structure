package com.amit.problemsolving;

public class ZeroOneSegration {

    public static void main(String[] args) {
        int[] a = {0,1,1,2,1,0,1,0,1,2};
        int[] b = {0,1,0,1,0,1,1,0,1};
        segregateZeroOneTwo(a);
        segregateZeroOne(b);
    }

 public static void segregateZeroOne(int[] a) {
        int left = 0;
        int right = a.length - 1;
        while(left < right){
            if(a[left] == 0)
                left++;
            if(a[right] == 1)
                right--;
            if(a[right] ==0 && a[left] ==1 && left <right) {
                a[left] = 0;
                a[right] = 1;
            }
        }
     for(int ele: a) {
         System.out.print(ele + ",");
     }
     System.out.println();
 }

 public static void segregateZeroOneTwo(int[] a) {
     int oneCount = 0;
     int zeroCount = 0;
     for(int i =0;i<a.length;i++){
         if(a[i] == 0)
             zeroCount++;
         if(a[i] == 1)
             oneCount++;
     }
    for(int i = 0;i<zeroCount;i++){
        a[i]=0;
    }
    for(int i = zeroCount;i<(oneCount+zeroCount);i++){
        a[i] =1;
    }
    for(int i =oneCount+zeroCount;i<a.length;i++){
        a[i]=2;
    }
    for(int ele:a)
        System.out.print(ele +",");
     System.out.println();
 }

}
