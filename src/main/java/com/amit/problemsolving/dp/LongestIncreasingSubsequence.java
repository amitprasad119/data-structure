package com.amit.problemsolving.dp;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int arr[] = {10,22,9,33,21,50,41,60,80};
        int dp[][] = new int [arr.length + 1][arr.length];

        System.out.println(lisHelperRec( -1,0,dp,arr));
    }

    static int lisHelperRec(int prevCount, int currentCount, int[][] dp, int[] arr) {
        if(currentCount == arr.length)
            return  0;
        if(prevCount != -1 && dp[prevCount][currentCount] !=0)
            return  dp[prevCount][currentCount];

        int option1 = 0 ;
        if(prevCount == -1 || arr[prevCount] < arr[currentCount])
            option1 = 1 + lisHelperRec(currentCount,currentCount+1,dp,arr);

        int option2 = lisHelperRec(prevCount,currentCount+1,dp,arr);

        if(prevCount != -1)
            dp[prevCount][currentCount] = Math.max(option1,option2);

        return  Math.max(option1,option2);
    }
}
