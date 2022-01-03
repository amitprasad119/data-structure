package com.amit.problemsolving.backtracking;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        ArrayList<Integer> result = new ArrayList<>();
        printSubsets(a,0,result,new boolean[a.length]);
        //printPerm(a,new ArrayList<>(),new boolean[a.length]);
        System.out.println(result);
    }

   static void printSubsets(int[] arr, int start, ArrayList<Integer> partial, boolean[] used) {
        if(start == arr.length)
            return;
        for(int i = start;i< arr.length;i++) {
            if(!used[i]) {
                partial.add(arr[i]);
                used[i] = true;
                printSubsets(arr,i+1,partial,used);
               // System.out.println(partial);
                used[i] = false;
                partial.remove(partial.size() -1);
            }
        }
    }

    static void printPerm(int[] arr,ArrayList<Integer> partial,boolean[] used) {
        if(partial.size() == arr.length) {
            System.out.println(partial);
            return;
        }

        for(int i =0; i< arr.length;i++) {
            if(!used[i]) {
                used[i] = true;
                partial.add(arr[i]);
                printPerm(arr,partial,used);
                used[i] =false;
                partial.remove(partial.size()-1);
            }
        }
    }

}
