package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //program to add number with range

        int initialValue, finalValue, total;

        Scanner userInput = new Scanner(System.in);
        System.out.print("enter the initial value = ");
        initialValue = userInput.nextInt();
        System.out.print("enter the final value = ");
        finalValue = userInput.nextInt();

        total = 0;
        while(initialValue <= finalValue){
            total = total + initialValue;
            System.out.println("added with " + initialValue + " being " + total);
            initialValue++;
        }

    }
}
