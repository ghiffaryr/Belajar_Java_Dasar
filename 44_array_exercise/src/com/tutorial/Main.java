package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayNum1 = {2,3,5,1,12,7,60,6,8,9};
        int[] arrayNum2 = {0,4,3,2,1,5,9,8,7,4};

        //summation of 2 arrays
        int[] arrayResult1 = addArray(arrayNum1, arrayNum2);
        printArray(arrayNum1, "array 1");
        printArray(arrayNum2, "array 2");
        printArray(arrayResult1, "result 1");

        //concate 2 arrays
        int[] arrayResult2 = new int[arrayNum1.length + arrayNum2.length];

        for(int i = 0; i < arrayNum1.length; i++){
            arrayResult2[i] = arrayNum1[i];
        }

        for(int i = 0; i < arrayNum1.length; i++){
            arrayResult2[i + arrayNum1.length] = arrayNum2[i];
        }

        printArray(arrayNum1, "array 1");
        printArray(arrayNum2, "array 2");
        printArray(arrayResult2, "result 2");

        //sorting reverse
        printArray(arrayNum1, "array 1");
        reverse(arrayNum1);
        printArray(arrayNum1, "reverse 1");

        printArray(arrayNum2, "array 2");
        reverse2(arrayNum2);
        printArray(arrayNum2, "reverse 2");

    }

    private static void reverse2(int[] arrayData){
        Arrays.sort(arrayData);
        int buffer;

        for(int i = 0; i < arrayData.length/2; i++){
            buffer = arrayData[i];
            arrayData[i] = arrayData[(arrayData.length - 1) - i];
            arrayData[(arrayData.length - 1) - i] = buffer;
        }
    }

    private static void reverse(int[] arrayData){
        Arrays.sort(arrayData);
        int[] arrayBuffer = Arrays.copyOf(arrayData, arrayData.length);

        for(int i = 0; i < arrayData.length; i++){
            arrayData[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }

    private static int[] addArray(int[] arrayInt1, int[] arrayInt2){
        int[] arrayResult = new int[arrayInt1.length];
        for(int i = 0; i < arrayInt1.length; i++){
            arrayResult[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayResult;
    }

    private static void printArray(int[] arrayData, String message){
        System.out.println(message + " = " + Arrays.toString(arrayData));
    }
}
