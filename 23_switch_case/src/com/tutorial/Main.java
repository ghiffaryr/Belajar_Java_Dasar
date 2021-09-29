package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //switch_case

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("nickname: ");
        input = inputUser.next();

        //the expression such as unit of (int, long, byte, short), String, or enum
        switch (input){
            case "otong":
                System.out.println("I'm otong here");
                break;
            case "ucup":
                System.out.println("I'm ucup here");
                break;
            case "mario":
                System.out.println("I'm mario here");
                break;
            default:
                System.out.println(input + " no one's here");

        }

        System.out.println("end of the program");

    }

}
