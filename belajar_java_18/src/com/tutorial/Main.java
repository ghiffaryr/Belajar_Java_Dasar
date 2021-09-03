package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //parenthesis first then multiplication/division then from the left to the right

        int result = 5 * 10 / 2;
        System.out.println(result);
        result = 5 + 2 - 10;
        System.out.println(result);

        //using ( )
        result = 60 / (2 + 10);
        System.out.println(result);

        Scanner userInput = new Scanner(System.in);
        //quadratic equation
        System.out.println("Calculation of quadratic equation");
        int m,x,c;

        System.out.print("x value = ");
        x = userInput.nextInt();
        System.out.print("m gradient = ");
        m = userInput.nextInt();
        System.out.print("c bias = ");
        c = userInput.nextInt();
        int y = (m * x * x) + c;

        System.out.println("y value = " + y);

    }

}
