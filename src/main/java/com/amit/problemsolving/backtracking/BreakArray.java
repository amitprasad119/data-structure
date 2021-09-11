package com.amit.problemsolving.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/***
 * Break the array for given length K
 * {1,2,3,4,5} k = 2 => {1,2},{2,3},{3,4},{4,5}
 */
public class BreakArray {
    public static void main(String[] args) {
      BreakArray br = new BreakArray();
      int[] arr = {1,2,3,4,5,6,7,8,9};
      int k = 3;
        ArrayList<ArrayList<Integer> > aList = new ArrayList<>(3);
        br.splitArray(arr,new ArrayList<>(),0,k);
      //  br.splitAr(arr,3,aList,new ArrayList<>(),0);
       // System.out.println(aList);
    }

    ArrayList<ArrayList<Integer>> splitAr(int[] arr,int k,ArrayList<ArrayList<Integer>> partial,ArrayList<Integer> subArray,int start) {
        if(subArray.size() == k ) {
             partial.add(new ArrayList<>(subArray));
             subArray.clear();
        }
        if( start == arr.length){
            return partial;

        }
        subArray.add(arr[start]);
        return splitAr(arr,k,partial,subArray,start+1);
    }

    void splitArray(int[] arr, ArrayList<Integer> partial, int start,int k) {
        if(partial.size() == k) {
            System.out.print(partial);
            return;
        }
        if(start == arr.length)
            return;
        for(int i = start;i<arr.length;i++) {
            partial.add(arr[start]);
            splitArray(arr, partial, start + 1, k);
            partial.remove(partial.size() - 1);
            splitArray(arr, partial, start+1 , k);
        }
        System.out.println();

    }

}
