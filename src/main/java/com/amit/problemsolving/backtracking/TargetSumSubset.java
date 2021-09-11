package com.amit.problemsolving.backtracking;

import java.util.ArrayList;

public class TargetSumSubset {
    public static void main(String[] args) {
        int b[] = {2, 4, 6, 8 };
        printSubsetsSum(b,0,new ArrayList<>(),0,8);
    }

    static void printSubsetsSum(int[] arr, int start, ArrayList<Integer> partial, int sum,int k ) {
        if( sum > k)
            return;
        if(sum == k){
            System.out.println(partial);
            return;
        }
        for(int i = start; i< arr.length;i++){
            partial.add(arr[i]);
            printSubsetsSum(arr,i,partial,sum + arr[i], k);
            partial.remove(partial.size() -1);
        }

    }
}
