package com.amit.problemsolving;

public class ZeroOneSegregation {

    public static void main(String[] args) {
        int[] a = {0,1,1,2,1,0,1,0,1,2};
        int[] b = {0,1,0,1,0,1,1,0,1};
        segregateZeroOneTwo(a);
        segregateZeroOne(b);
        System.out.println("segregation using mid pointer");

        for(int e: segregateZeroOneTwoUsingMid(a))
            System.out.print(e + ",");
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

 // approach one
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

//approach two
 public static int[] segregateZeroOneTwoUsingMid(int[] a) {
        int mid,start;
        int end = a.length - 1;
        mid = start = 0;

        while(mid <= end) {
            switch (a[mid]) {
                case 0 : swap(a,start,mid);
                         start++;
                         mid++;
                         break;
                case 1 : mid++;
                          break;
                case 2 : swap(a,mid,end);
                          end--;
                          break;
            }
        }
     return a;
 }

 public static void swap(int a[],int index1,int index2){
      int temp = a[index1];
      a[index1] = a[index2];
      a[index2] = temp;
 }

}
