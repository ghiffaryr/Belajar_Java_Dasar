package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //ternary_operator

        int input, x;

        Scanner inputUser  = new Scanner(System.in);

        System.out.print("enter any value: ");
        input = inputUser.nextInt();

        // x variable = expression ? true_statement : false_statement

        x = (input == 10) ? (int)(Math.pow(input,2)) : (input/2);

//        //using if
//        if(input == 10){
//            x = (int)Math.pow(input,2);
//        } else {
//            x = input/2;
//        }

        System.out.println("the result "+ x);
    }
}
