package com.tutorial;

public class Main {

    public static void main(String[] args) {

        int[] arrayNum = {11,12,13,14,15,16,17,18,19,20};

        //standard looping
        System.out.println("standard looping");
        for(int i = 0; i < 10; i++){
            System.out.println("index no-" + i + " is " + arrayNum[i]);
        }

        //looping with array property
        System.out.println("\nstandard looping");
        for(int i = 0; i < arrayNum.length; i++){
            System.out.println("index no-" + i + " is " + arrayNum[i]);
        }

        //looping for each
        System.out.println("\nlooping for each");
        for(int num : arrayNum){
            System.out.println("number in this loop = " + num);
        }

    }
}
