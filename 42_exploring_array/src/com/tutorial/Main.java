package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayNum1 = {1,2,3,4,5};
        int[] arrayNum2 = new int[5];

        System.out.println(arrayNum1);
        System.out.println(arrayNum2);

        arrayNum2 = arrayNum1;

        System.out.println(arrayNum1);
        System.out.println(arrayNum2);

        System.out.println("array 1 -> " + Arrays.toString(arrayNum1));
        System.out.println("array 2 -> " + Arrays.toString(arrayNum2));

        arrayNum1[0] = 100;
        arrayNum2[4] = 400;
        System.out.println("array 1 -> " + Arrays.toString(arrayNum1));
        System.out.println("array 2 -> " + Arrays.toString(arrayNum2));

        arrayChange(arrayNum1);
        System.out.println("array 1 -> " + Arrays.toString(arrayNum1));
        System.out.println("array 2 -> " + Arrays.toString(arrayNum2));

    }

    private static void arrayChange(int[] arrayData){
        arrayData[0] = 125;
    }
}
