package com.amit.problemsolving.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Combination {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,5,8,9,4,6};
        int[] arr2 = new int[] {1,2,3};

        Combination p = new Combination();
       // p.targetCombination(arr,new HashSet<>(),6 ,0);
       // p.combinations(arr2,new ArrayList<Integer> (),2,0);
        p.combinations2(arr2,new ArrayList<>(),0,new boolean[arr2.length]);
    }

    void combinations(int [] arr,ArrayList<Integer> partial,int k,int start) {
        if(partial.size() ==k){
            System.out.println(partial);
            return;
        }
        if(start == arr.length)
            return;
        for(int i = start;i< arr.length;i++)
        {
                 partial.add(arr[i]);
                 combinations(arr,partial,k,i+1);
                 partial.remove(partial.size()-1);
        }
    }



    public void targetCombination(int[] arr,HashSet<Integer> combinations,int target,int i) {
        if(combinations.stream().mapToInt(Integer ::intValue).sum() == target) {
            System.out.println(combinations);
            return;
        }
        if(i == arr.length) return;
               combinations.add(arr[i]);
               targetCombination(arr, combinations, target,i+1);
               combinations.remove(arr[i]);
               targetCombination(arr, combinations, target,i+1);

    }

    void combinations2(int[] arr,ArrayList<Integer> partial,int start,boolean[] used) {
        if(start == arr.length)
            return;

      for(int i = start;i<arr.length;i++) {
          if (!used[i]) {
              used[i] = true;
              partial.add(arr[i]);
              combinations2(arr, partial, start + 1,used);
              System.out.println(partial);
              used[i] = false;
              partial.remove(partial.size() - 1);
          }
      }
    }
}
