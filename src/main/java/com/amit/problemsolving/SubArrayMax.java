package com.amit.problemsolving;

public class SubArrayMax {
    public static void main(String[] args) {
      int a[] = {5,6,-8,2,-3,5};
      int b[] = {1,2,3};
        System.out.println(maxSubArray(a));
        System.out.println(maxSubArrayOptimal(a));
        System.out.println(sumOfAllSubArray(b));
        System.out.println(sumOfAllSubArrayOptimal(b));
    }

    // brute force

    public static int maxSubArray(int[] a) {
    int max = Integer.MIN_VALUE;
    for (int i =0;i<a.length;i++) {
        int currSum = 0;
        for (int j = i;j<a.length;j++) {
            currSum+=a[j];
            if(currSum > max) {
                max = currSum;
            }
        }
    }
    return max;
   }

    // optimal Kadane's algo

    public static int maxSubArrayOptimal(int[] a) {
     int max = Integer.MIN_VALUE;
     int currSum = 0;

     for (int i =0;i<a.length;i++) {
         currSum+=a[i];
         if(currSum > max) {
            max =  currSum;
         }
         if(currSum < 0) {
             currSum = 0;
         }
     }
        return max;
    }

    public static  int sumOfAllSubArray(int[] a ) {
        int sum = 0;
        int tempSum = 0;
        for(int i =0;i<a.length;i++) {
            tempSum = 0;
            for(int j =i;j<a.length;j++) {
                tempSum+=a[j];
                System.out.println("A[j], temp "+ a[j] +" , " + tempSum);

                sum+=tempSum;
            }

        }
        return sum;
    }

    // optimal sum array
    public static  int sumOfAllSubArrayOptimal(int[] a ) {
        int sum = 0;
        int n = a.length;
        for(int i =0;i<n;i++) {
          sum += (a[i] * (i+1) * (n-i));
        }
        return sum;
    }

}
