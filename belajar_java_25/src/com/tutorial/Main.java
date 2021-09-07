package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //a operator b
        Scanner inputUser;
        float a,b,result;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("b = ");
        b = inputUser.nextFloat();

        System.out.println("user input: " + a + " " + operator + " " + b);

        //available operator * / + -

        if (operator == '+'){
            //summation
            result = a + b;
            System.out.println("result = " + result);
        } else if (operator == '-'){
            //substraction
            result = a - b;
            System.out.println("result = " + result);
        } else if (operator == '*'){
            //multiplication
            result = a * b;
            System.out.println("result = " + result);
        } else if (operator == '/'){
            //division
            if (b == 0){
                System.out.println("zero division resulting infinity");
            } else{
                result = a / b;
                System.out.println("result = " + result);
            }
        } else {
            System.out.println("operator not found");
        }


    }

}
