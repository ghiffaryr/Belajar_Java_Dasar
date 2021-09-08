package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser;
        float a,b,result;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next();
        System.out.print("b = ");
        b = inputUser.nextFloat();

        switch(operator){
            case "+":
                //summation
                result = a + b;
                System.out.println("result = " + result);
                break;
            case "-":
                //substraction
                result = a - b;
                System.out.println("result = " + result);
                break;
            case "*":
                //multiplication
                result = a * b;
                System.out.println("result = " + result);
                break;
            case "/":
                //division
                result = a / b;
                System.out.println("result = " + result);
                break;
            default:
                System.out.println("operator" + operator + "not found");
        }

    }
}
