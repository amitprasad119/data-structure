package com.amit.problemsolving;

import java.util.ArrayList;

public class Stock {

    public static void main(String[] args) {
        int[] prices ={ 7,1,5,3,6,4};
        System.out.println(maxProfitBrute(prices));
        System.out.println(maxProfit(prices));

    }
    //brute force
    public static  int maxProfitBrute(int[] prices) {
        int maxProfit= 0;
     for(int i =0;i<prices.length;i++) {
         for(int j =i;j<prices.length;j++) {
             if(maxProfit < prices[j] - prices[i] )
                 maxProfit = prices[j] - prices[i];
         }
     }
     return maxProfit;
    }

   //optimal solution
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE,maxPrice=0;
        for (int price : prices) {
            if (minPrice > price) {
                minPrice = price;
            }

            if (maxPrice < price - minPrice) {
                maxPrice = price - minPrice;
            }
        }
       return  maxPrice;
    }
}
