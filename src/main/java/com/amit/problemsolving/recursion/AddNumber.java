package com.amit.problemsolving.recursion;

import java.util.Arrays;
import java.util.Collections;

public class AddNumber {
    public static void main(String[] args) {
        System.out.println(add(123457));
        System.out.println("reverse::"+reverseNum(123));
        int a[] = {1,2,3};

    }

    public static int add(int number) {

        if(number == 0)
        {
            return 0;
        }
        int rem , sum =0;
        int n = number;
        while (n >0) {
            rem = n % 10 ;
            sum += rem;
           n = n / 10;
        }
       return sum;
    }

    public static int reverseNum(int number) {
        System.out.println("inside reverse");
        if(number == 0)
        {
            return 0;
        }
      int result=0 , n = number;
        int rem;
        while (n > 0) {
            rem = n % 10;
            result = result * 10 + rem;
            n = n / 10;
        }
        return result;
    }
}
