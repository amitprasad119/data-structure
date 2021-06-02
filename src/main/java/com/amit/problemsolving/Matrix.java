package com.amit.problemsolving;

public class Matrix {
    public static void main(String[] args) {

        /**
         *   90 degree image rotation problem
                Original image
                1 2 3
                4 5 6
                7 8 9

                After transpose
                1 4 7
                2 5 8
                3 6 9

                After flip rotation
                7 4 1
                8 5 2
                9 6 3

           **/
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int row = matrix.length;
        int col = matrix.length;
        System.out.println("Original image");
        for(int  i= 0;i< row; i++) {
            for(int j=0;j<col;j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

        // transpose the matrix
        for(int i =0;i<row;i++) {
            for(int j = i+1; j<col;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("After transpose");
        for(int  i= 0;i< row; i++) {
            for(int j=0;j<col;j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        // flip the matrix by swapping last column and first column and gradually
        for(int i =0;i<row;i++) {
            for(int j = 0; j< col/2;j++) {
                int temp = matrix[i][col-1-j]; // start swapping last and first column and likewise
                matrix[i][col-1-j] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        System.out.println("After rotation");
        for(int  i= 0;i< row; i++) {
            for(int j=0;j<col;j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

}
