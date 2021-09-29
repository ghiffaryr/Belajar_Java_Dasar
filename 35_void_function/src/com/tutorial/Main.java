package com.tutorial;

public class Main {

    public static void main(String[] args) {

        System.out.println(simple());

        voidFunc("whatever");
        goodMorning("cuk");
        goodMorning("ngab");

    }

    private static void goodMorning(String name){
        System.out.println("good morning " + name);
    }

    private static void voidFunc(String input){
        System.out.println(input);
    }
    private static float simple(){
        return 10.0f;
    }
}
