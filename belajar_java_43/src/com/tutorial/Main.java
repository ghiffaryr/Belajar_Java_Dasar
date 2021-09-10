package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] arrayNum1 = {1,2,3,4,5};

        //changing array to string
        System.out.println("\nchanging array to string\n");
        printArray(arrayNum1);

        //copying array
        System.out.println("\ncopying array");
        int[] arrayNum2 = new int[5];
        printArray(arrayNum1);
        printArray(arrayNum2);

        //copying using loop
        System.out.println("\ncopying using loop");
        for(int i = 0; i < arrayNum1.length; i++){
            arrayNum2[i] = arrayNum1[i];
        }
        printArray(arrayNum1);
        System.out.println(arrayNum1);
        printArray(arrayNum2);
        System.out.println(arrayNum2);

        //copying using copyOf
        System.out.println("\ncopying using copyOf");
        int[] arrayNum3 = Arrays.copyOf(arrayNum1,3);
        printArray(arrayNum1);
        System.out.println(arrayNum1);
        printArray(arrayNum3);
        System.out.println(arrayNum3);

        //copying using copyOfRange
        System.out.println("\ncopying using copyOfRange");
        int[] arrayNum4 = Arrays.copyOfRange(arrayNum1,2,5);
        printArray(arrayNum1);
        System.out.println(arrayNum1);
        printArray(arrayNum4);
        System.out.println(arrayNum4);

        //fill array
        System.out.println("\nfill array");
        int[] arrayNum5 = new int[10];
        printArray(arrayNum5);
        Arrays.fill(arrayNum5,5);
        printArray(arrayNum5);

        //array comparation
        System.out.println("\narray comparation");
        int[] arrayNum6 = {1,2,3,4,9};
        int[] arrayNum7 = {1,2,3,4,5};

        System.out.println("\ncomparing between two arrays");
        System.out.println(Arrays.equals(arrayNum6,arrayNum7));

        if(Arrays.equals(arrayNum6,arrayNum7)){
            System.out.println("those arrays are same");
        } else {
            System.out.println("those arrays are different");
        }

        //sorting array
        System.out.println("\nsorting array");
        int[] arrayNum8 = {1,6,4,5,3,5,2,6};
        printArray(arrayNum8);
        Arrays.sort(arrayNum8);
        printArray(arrayNum8);

        //searching in array
        System.out.println("\nsearch");
        int number = 3;
        int position = Arrays.binarySearch(arrayNum8, number);
        System.out.println("number " + number + " is in index " + position);

    }

    private static void printArray(int[] arrayData){
        System.out.println("array = " + Arrays.toString(arrayData));
    }
}
