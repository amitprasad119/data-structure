package com.amit.problemsolving.recursion;

public class SubArrayBySum {
    public static void main(String[] args) {
        int [] a = {1,4,20,3,10,5};
        int sum = 20;
        findSubArray(a,sum);
    }

    public static void findSubArray(int[] a,int sum) {
       int start = 0;
       int curSum = a[0];
       int n = a.length;
       for(int i=1;i<=n;i++) {

           while (curSum > sum && start <i-1) {
               System.out.println("inside"+curSum);

               curSum-=a[start];
               start++;
           }
           if(curSum == sum) {
               System.out.println("Found at start - end"+start + " , " + (i-1));
               return;
           }

           if (i < n)
          curSum+= a[i];
       }
    }
}
