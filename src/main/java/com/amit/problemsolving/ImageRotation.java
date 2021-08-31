package com.amit.problemsolving;

public class ImageRotation {

    public static void main(String[] args) {

       int n = 3;
       int m = 3;
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int col = mat[0].length;
        int row = mat.length;
        for(int i = 0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
        // transpose of matrix
        for(int i = 0;i<3;i++) {
            for (int j = i; j < 3; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;

            }
        }
        System.out.println("After transpose");
        for(int i = 0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }

        for(int i = 0;i<n;i++) {
            for (int j = 0; j < col/2; j++) {
                int temp = mat[i][col-1-j];
                mat[i][col-1-j] = mat[i][j];
                mat[i][j] = temp;
            }
        }

        System.out.println("After rotation");
        for(int i = 0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }

    }
}
