package com.tutorial;

public class Main {

    public static void main(String[] args) {

        int resultInt;
        resultInt = add(4,5);
        printRes(resultInt);

        float resultFloat;
        resultFloat = add(4.5f,4);
        printRes(resultFloat);

        resultFloat = add(4,4.5f);
        printRes(resultFloat);

        resultInt = add(4,5,6);
        printRes(resultInt);

        printRes(10);
        printRes(10.5f);
        printRes(16.7d);
        printRes(16);

    }

    private static int add(int numInt1, int numInt2, int numInt3){
        return numInt1 + numInt2 + numInt3;
    }

    private static float add(int numInt1, float numFloat2){
        return numInt1 + numFloat2;
    }

    private static float add(float numFloat1, int numInt2){
        return numFloat1 + numInt2;
    }

    private static int add(int numInt1, int numInt2){
        return numInt1 + numInt2;
    }

    private static void printRes(double numDouble){
        System.out.println("this number is double with value = " + numDouble);
    }

    private static void printRes(float numFloat){
        System.out.println("this number is float with value = " + numFloat);
    }

    private static void printRes(int numInt){
        System.out.println("this number is integer with value = " + numInt);
    }

}
