package com.amit.problemsolving.dp;

public class FibonacciExample {

    //using recursion
    long fiboCalculate(int n) {
       if(n == 0) return 0;
       if(n == 1) return 1;
       return fiboCalculate(n-2) + fiboCalculate(n-1);

    }

    // using dynamic programming [tabulation]
    long fiboByDP(int n) {
        long cache[] = new long[n+1];
        cache[0] = 0;
        cache[1] = 1;
        if(n == 0) return  cache[0];
        if(n == 1) return  cache[1];
        for(int i =2;i<=n;i++){
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[n];
    }
    // using dynamic programming [Memoization]
    long fiByMemo(int n, long[] cache) {
        if(n == 0) return  0;
        if(n == 1) return  1;
        if(cache[n] != 0) {
            return cache[n];
        }
        long res = fiByMemo(n-1,cache) + fiByMemo(n-2,cache);
        cache[n] = res;
        return  cache[n];
    }
    public static void main(String[] args) {
        FibonacciExample f = new FibonacciExample();

        System.out.println("By dp[tabulation]:"+f.fiboByDP(10));
        System.out.println("By dp[memo]:"+f.fiByMemo(200,new long[201]));

        System.out.println("by recursion:"+f.fiboCalculate(50));

    }
}
