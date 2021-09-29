package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arrayData = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        System.out.print("data no-:");
        int indexInput = userInput.nextInt();

        //standard exception
        System.out.println("standard exception");
        try{
            System.out.printf("data from array no-%d is %d\n\n",indexInput,arrayData[indexInput]);
        } catch (Exception  e){
            System.err.println(e);
        }

        //exception inside function
        System.out.println("\nexception inside function");
        int data = getDataFromArray(arrayData,indexInput);
        System.out.printf("data from array no-%d is %d\n\n",indexInput,data);

        //exception throws by method
        System.out.println("\nexception throws by method");
        int data2 = 0;

        try{
            data2 = getData(arrayData,indexInput);
        } catch (Exception  e){
            System.err.println(e);
        }

        System.out.printf("data from array no-%d is %d\n\n",indexInput,data2);
        System.out.println("\n\nend of the program");
    }

    private static int getData(int[] array, int index) throws Exception{
        int result = array[index];
        return result;
    }

    private static int getDataFromArray(int[] array, int index){
        int result = 0;

        try{
            result = array[index];
        } catch (Exception e){
            System.err.println(e);
        }
        return result;
    }
}
