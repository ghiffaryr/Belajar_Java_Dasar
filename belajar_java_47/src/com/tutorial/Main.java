package com.tutorial;

public class Main {

    public static void main(String[] args) {

        //summation of matrix
        int[][] matrix_a = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        int[][] matrix_b = {
                {11,12,13},
                {14,15,16},
                {17,18,19},
        };

        printArray(matrix_a);
        printArray(matrix_b);

        int[][] resultAdd = add(matrix_a,matrix_b);

        printArray(resultAdd);

        //matrix multiplication
        int[][] matrix_c = {
                {1,2},
                {3,4},
                {5,6},
        };

        int[][] matrix_d = {
                {11,12},
                {13,14},
        };

        int[][] resultMultiply = multiply(matrix_c, matrix_d);

        printArray(resultMultiply);
    }

    private static int[][] multiply(int[][] matrix_1, int[][] matrix_2){
        int row_1 = matrix_1.length;
        int column_1 = matrix_1[0].length;

        int row_2 = matrix_2.length;
        int column_2 = matrix_2[0].length;

        int[][] result = new int[row_1][column_2];
        int buffer;

        if(column_1 == row_2){
            for(int i = 0; i < row_1; i++){
                for(int j = 0; j < column_2; j++){
                    buffer = 0;
                    for(int k = 0; k < column_2; k++){
                        buffer += matrix_1[i][k]*matrix_2[k][j];
                    }
                    result[i][j] = buffer;
                }
            }
        } else {
            System.out.println("amount of row of matrix 1 is not same to column of matrix 2");
        }
        return result;
    }

    private static int[][] add(int[][] matrix_1, int[][] matrix_2){
        int row_1 = matrix_1.length;
        int column_1 = matrix_1[0].length;

        int row_2 = matrix_2.length;
        int column_2 = matrix_2[0].length;

        int[][] result = new int[row_1][column_1];

        if(row_1 == row_2 && column_1 == column_2){
            for(int i = 0; i < row_1; i++){
                for(int j = 0; j < column_1; j++){
                    result[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }
            }
        } else {
            System.out.println("amount of row or column of both matrices are not equal");
        }
        return result;
    }

    private static void printArray(int[][] arrayData){
        int row = arrayData.length;
        int column = arrayData[0].length;

        for(int i = 0; i < row; i++){
            System.out.print("[");
            for(int j = 0; j < column; j++){
                System.out.print(arrayData[i][j]);

                if(j < (column - 1)){
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
