package com.tutorial;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String words = "I like to eat durian";

        //Get component from String
        System.out.println(words.charAt(5));

        //Substring
        String word = words.substring(10,15);
        System.out.println(word);

        //concate
        String words2 = word + "bakwan";
        System.out.println(words2);

        word = word + " cireng";
        System.out.println(word);

        //concat with nonstring
        int amount = 20;
        String words3 = word + " " + amount; //casting
        System.out.println(words3);
        System.out.println(word + " " + amount);

        //lowercase and uppercase
        System.out.println(words.toUpperCase());
        System.out.println(words.toLowerCase());

        //replace
        String words4 = words.replace("durian","sate");
        System.out.println(words);
        System.out.println(words4);

        //compare
        String motor1 = "dudu";
        String motor2 = "didi";
        System.out.println(motor1.compareTo(motor2));
        System.out.println(motor2.compareTo(motor1));

        //equality
        String wordInput = "test"; //this is in string pool
//        String wordInput = new String("test"); //this is not literal string, not in string pool
        String wordTest = "test"; //this is also in string pool

        System.out.println("\nequality of location in string pool");
        if(wordInput == wordTest){
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        Scanner userInput = new Scanner(System.in);
        System.out.print("\ngetting input string from user: ");
        wordInput = userInput.next();
        System.out.println("this is user input: " + wordInput);

        if(wordInput.equals(wordTest)){
            System.out.println("same");
        } else {
            System.out.println("not same");
        }




    }
}
