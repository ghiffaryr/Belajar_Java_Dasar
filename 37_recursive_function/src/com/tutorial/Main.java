package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("enter any number: ");
        int value = userInput.nextInt();
        System.out.println("your entered value = " + value);
        printValue(value);

        System.out.println();
        int sum = sum(value);
        System.out.println("sum = " + sum);

        System.out.println();
        int factorial = calcFactorial(value);
        System.out.println("factorial result = " + factorial);

    }

    private static int calcFactorial(int parameter){
        System.out.println("parameter = " + parameter);

        if(parameter == 1){
            return parameter;
        }

        return parameter * calcFactorial(parameter - 1);
    }

    private static int sum(int parameter){
        System.out.println("parameter = " + parameter);

        if(parameter == 0){
            return parameter;
        }

        return parameter + sum(parameter - 1);
    }

    private static void printValue(int parameter){
        System.out.println("parameter = " + parameter);

        if(parameter == 0){
            return;
        }

        parameter--;

        printValue(parameter);
    }
}
