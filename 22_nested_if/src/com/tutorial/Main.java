package com.tutorial;

public class Main {

    public static void main(String[] args) {

        //nested_if

        int a = 2;
        int b = 10;

        System.out.println("this is the initial program");

        if (a == 5){

            if (b == 10){

                System.out.println("where a = 5 and b = 10");

            } else {

                System.out.println("where a = 5 but b is not 10");
            }

        } else {

            System.out.println("where the a is not 5");

        }

        System.out.println("end of the program");

    }
}
