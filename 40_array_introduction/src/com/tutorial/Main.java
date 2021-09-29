package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("array assignment");

        int[] arrayInt = {1,2,3,4};
        arrayInt[0] = 11;

        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[1]);
        System.out.println(arrayInt[2]);
        System.out.println(arrayInt[3]);

        System.out.println("array declaration");
        float[] arrayFloat = new float[5];

        arrayFloat[3] = 11.5f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayFloat));
    }
}
