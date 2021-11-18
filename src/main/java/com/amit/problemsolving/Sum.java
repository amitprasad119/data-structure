package com.amit.problemsolving;

import java.util.*;

public class Sum {
    public static void main(String[] args) {
        int[] parent1 = {-1,
                0,
                1,
                2,
                0},
                val1 = {-2,
                10,
                10,
                -3,
                10};
       // int[] parent2 = {-1, 0, 1, 2, 0}, val2 = {5, 7, -10, 4, 15};
        System.out.println(getMaxPath(parent1, val1));
      //  System.out.println(getMaxPath(parent2, val2));
    }

    static int res = Integer.MIN_VALUE;

    private static int getMaxPath(int[] parent, int[] val) {
        res = Integer.MIN_VALUE;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int root = -1;
        for(int i=0;i<parent.length;i++) {
            map.putIfAbsent(i, new ArrayList<>());
        }
        for(int i=0;i<parent.length;i++) {
            if(parent[i] < 0) {
                root = i;
                continue;
            }
            map.get(parent[i]).add(i);
        }
        dfs(map, val, root);
        return res;
    }

    private static int dfs(Map<Integer, ArrayList<Integer>> map, int[] val, int cur) {
        if(map.get(cur).size() == 0)
            return val[cur];
        List<Integer> lst = new ArrayList<>();
        for(int nei : map.get(cur)) {
            int curVal = val[cur];
            int next = dfs(map, val, nei);
            if(curVal + next < curVal) {
                return curVal;
            }else {
                curVal += next;
           }
            lst.add(curVal);
        }
        for(int n : lst)
            res = Math.max(res, n);
        return res;
    }
}
