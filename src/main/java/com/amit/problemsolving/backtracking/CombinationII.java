package com.amit.problemsolving.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CombinationII {
    public static void main(String[] args) {
        //Input: n = 4, k = 2
        ArrayList<Integer> inputArray = new ArrayList<>();
        int n = 4;
        int k = 2;
        for(int i =1;i<=n;i++)
            inputArray.add(i);
        List<List<Integer>> holder = new ArrayList<>();
        CombinationII combII = new CombinationII();
        combII.combination(inputArray,k,0,new ArrayList<>(),holder,new boolean[inputArray.size()]);
        System.out.println(holder);
        System.out.println(doReverse(534,0));
         int x = -123;
        boolean isNegative = n < 0 ? true : false;
        int reverseValue = doReverse(x,0);
        System.out.println("Reverse:"+reverseValue);
    }


   static public int doReverse(int n,int res) {
        if(n == 0) {
            return res;
        }
        int rem = res *10 + (n%10)  ;
        return doReverse(n/10,rem) ;
    }

    void combination(ArrayList<Integer> input,int k,int startPtr ,ArrayList<Integer> partial,List<List<Integer>> holder,boolean used[]) {
        if(partial.size() == k) {
            holder.add(new ArrayList<>(partial));
            return;
        }
        if(input.size() == startPtr) {
           return;
        }

        for(int i = startPtr;i<input.size();i++ ) {
               partial.add(input.get(i));
               combination(input,k,i+1,partial,holder,used);
               partial.remove(partial.size()-1);
        }
    }
}
