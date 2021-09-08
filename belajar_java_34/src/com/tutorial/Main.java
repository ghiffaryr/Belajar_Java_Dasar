package com.tutorial;

public class Main {

    public static void main(String[] args) {

        //y = (x + 2) * x

        int y,x;
        x = 5;
        y = calculate(x);

        System.out.println("x = " + x + ", y = " + y);

        x = 10;
        y = calculate(x);

        System.out.println("x = " + x + ", y = " + y);

        x = 15;
        y = calculate(x);

        System.out.println("x = " + x + ", y = " + y);

    }

    private static int calculate(int input){
        int result;

        result = input * input;

        return result;
    }
}
