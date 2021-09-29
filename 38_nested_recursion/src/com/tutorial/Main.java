package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("enter value of n = ");
        int value = userInput.nextInt();
        int fibonacci_value = fibonacci(value, "top");
        System.out.println("fibonacci no-" + value + " is " + fibonacci_value);

    }

    private static int fibonacci(int n, String leaf){
        System.out.println("leaf " + leaf);
        System.out.println("fibonacci no-" + n);
        if(n == 1 || n == 0){
            return n;
        } else {
            return fibonacci(n-1, "left") + fibonacci(n-2, "right");
        }
    }
}
