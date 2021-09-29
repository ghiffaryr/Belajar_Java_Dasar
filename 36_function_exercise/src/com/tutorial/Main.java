package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("length = ");
        int inputLength = userInput.nextInt();
        System.out.print("wide = ");
        int inputWide = userInput.nextInt();

        System.out.println("\nthe shape");
        draw(inputLength, inputWide);

        System.out.println("\nwide = " + wide(inputLength, inputWide));
        System.out.println("circumference = " + circumference(inputLength, inputWide));

        System.out.println("\nusing deep function");
        showCircumferenceWide(inputLength, inputWide);

    }

    private static void showCircumferenceWide(int length, int width){
        System.out.println("wide = " + wide(length, width));
        System.out.println("circumference = " + circumference(length, width));
    }

    private static int circumference(int length, int width){
        int result = (length + width) * 2;
        return result;
    }

    private static int wide(int length, int width){
        int result = length * width;
        return result;
    }

    private static void draw(int length, int width){
        for(int i = 0; i < width; i++){
            for(int j = 0; j < length; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
