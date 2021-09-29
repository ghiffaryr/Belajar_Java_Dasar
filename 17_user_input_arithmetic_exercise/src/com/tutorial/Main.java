package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int length, width, area, height, volume;
        //rectangle area calculation

        System.out.println("Calculating area");
        System.out.print("length = ");
        length = userInput.nextInt();
        System.out.print("width = ");
        width = userInput.nextInt();

        area = length * width;
        System.out.println("area = " + area);

        System.out.println("Calculating volume");
        System.out.print("height = ");
        height = userInput.nextInt();
        volume = area * height;
        System.out.println("volume = "+ volume);
    }
}
