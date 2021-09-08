package com.tutorial;

public class Main {

    public static void main(String[] args) {

//        for(initialization; condition; step){
//
//            action;
//
//        }

        System.out.println("initial of the program");

        System.out.println("first loop");

        for(int value = 0; value <= 10; value++){

            System.out.println("for loop no-" + value);

        }

        System.out.println("second loop");

        for(int value = 0; value<10; value++){

            System.out.println("for loop no-" + value);

        }

        System.out.println("third loop");

        for (int value = 10; value>=5; value--){

            System.out.println("for loop no-" + value);

        }

        System.out.println("fourth loop");

        int value = 0;

        for(; value<10;){

            System.out.println("for loop no-" + value);
            value++;

        }

        System.out.println("end of the program");
    }
}
