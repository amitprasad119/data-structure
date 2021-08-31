package com.amit.problemsolving.dp;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
       String text1 = "abcde", text2 = "ace";
        LongestCommonSubsequence lobj = new LongestCommonSubsequence();
        int l = lobj.longestCommonSubsequence(text1,text2);
        System.out.println("Total:"+l);
    }
    public int longestCommonSubsequence(String text1, String text2) {
        char tArray1[] = text1.toCharArray();
        char tArray2[] = text2.toCharArray();
        int n = tArray1.length;
        int m = tArray2.length;
        int lcs[][] = new int[tArray1.length + 1][tArray2.length + 1];
         for(int i =0;i<= n;i++) {
             for (int j = 0; j <= m; j++) {
                 if( i ==0 || j== 0)
                     lcs[i][j] = 0;
               else if(tArray1[i-1] == tArray2[j-1])
                    lcs[i][j] = 1 + lcs[i-1][j-1];
                else
                    lcs[i][j]= Math.max(lcs[i-1][j],lcs[i][j-1]);
             }
             System.out.println();
         }
         return  lcs[n][m];
    }


}
