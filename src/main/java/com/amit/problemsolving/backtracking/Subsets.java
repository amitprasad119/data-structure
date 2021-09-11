package com.amit.problemsolving.backtracking;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        printSubsets(a,0,new ArrayList<>(),new boolean[a.length]);
    }

   static void printSubsets(int[] arr, int start, ArrayList<Integer> partial, boolean[] used) {
        if(start == arr.length)
            return;
        for(int i = start;i< arr.length;i++) {
            if(!used[i]) {
                partial.add(arr[i]);
                used[i] = true;
                printSubsets(arr,i+1,partial,used);
                System.out.println(partial);
                used[i] = false;
                partial.remove(partial.size() -1);
            }
        }
    }
}
