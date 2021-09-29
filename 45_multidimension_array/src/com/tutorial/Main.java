package com.tutorial;

public class Main {

    public static void main(String[] args) {

        System.out.println("multi dimensional array");

        //how to make 2 dimension array
        int[][] array_2D = {
                {1,2},
                {3,4}
        };

        printArray2D(array_2D);

        //how to make 2 dimension array with declaration
        //int[row][column]
        int[][] arrayNum = new int[5][4];

        printArray2D(arrayNum);

        //manual looping
//        for(int i = 0; i < arrayNum.length; i++){
//           System.out.print("[");
//           for(int j = 0; j < arrayNum[i].length; j++){
//               System.out.print(arrayNum[i][j] + ",");
//           }
//            System.out.print("]\n");
//        }

        // looping for each
//        for (int[] row : arrayNum) {
//            System.out.print("[");
//            for(int value : row){
//                System.out.print(value + ",");
//            }
//            System.out.print("]\n");
//        }

        // array manual, proofing
        int[][] array_2D_2 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
        };

        printArray2D(array_2D_2);


        int[][] array_ragged = {
                {1,2,3},
                {4,5,6,7},
                {8},
        };

        printArray2D(array_ragged);
    }

    private static void printArray2D(int[][] arrayData){
        System.out.println("{\n");
        for(int[] row : arrayData){
            System.out.print("{");
            for(int value : row){
                System.out.print(value + ",");
            }
            System.out.print("}\n");
        }
        System.out.print("}\n");
    }
}
