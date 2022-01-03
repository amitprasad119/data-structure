package com.amit.problemsolving.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationTarget {

    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int a[] = new int[] {2,3,6,7,1};
        int target = 7;
         subsetTarget(a,result,new ArrayList<>(), target,0,0);
        System.out.println(result);
    }

   static void subsetTarget(int arr[],  List<List<Integer>> result, ArrayList<Integer> partial,int target,int sum,int start) {
        if(sum > target) {
            return;
        }
        if(sum == target) {
            result.add(new ArrayList<>(partial));
            //sum = 0;
            return;
        }


         for(int i = 0;i<arr.length;i++) {
             partial.add(arr[i]);
             subsetTarget(arr,result,partial, target,sum+arr[i],i);
             partial.remove(partial.size() -1);
         }
   }
}
