package com.amit.problemsolving.dp;

public class DigitDP {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        int acc = 0;
       // totalSum(a,b,a,0,0);
        mx(3);

    }

    static void mx(int n) {
        System.out.println("before :"+n);
        for(int i =0;i<n;i++)
        {
            mx(n-1);
            System.out.println("Inside:" +n);
        }
        System.out.println("after"+n);
    }


   static void totalSum(int start,int end,int n,int x,int acc) {
       if(n==0) {
           System.out.println("Acc:"+acc);
           return  ;
       }
       for(int i=start;i<=end+1;i++)
       {
           System.out.println("ACC:"+acc + " "+ i);
             totalSum(start+1,end,i/10,i%10,acc+ i%10);
       }
   }

}
