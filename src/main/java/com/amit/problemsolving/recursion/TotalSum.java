package com.amit.problemsolving.recursion;

public class TotalSum {
    public static void main(String[] args) {
        TotalSum ts = new TotalSum();
        System.out.println(ts.totalSum(11,0));
    }

    int totalSum(int n,int x) {
        if(n == 0)
            return x;
        return x + totalSum(n/10,n%10);
    }
}
