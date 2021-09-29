package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args){

        //Object to catch input from user
        Scanner inputUser = new Scanner(System.in);

        //Simple program to guess number
        int correctValue = 6;
        int guessNumber;
        boolean guessStatus;

        System.out.print("enter your guess number: ");
        guessNumber = inputUser.nextInt();
        System.out.println("your guess number is " + guessNumber);

        //logical operation
        guessStatus = (guessNumber == correctValue);
        System.out.println("your guessing: " + guessStatus);

        //boolean algebra operation (AND / OR)
        System.out.print("input number between 4 and 9: ");
        guessNumber = inputUser.nextInt();

        guessStatus = (guessNumber > 4) && (guessNumber < 9);
        System.out.println("your guessing: " + guessStatus);

    }

}
