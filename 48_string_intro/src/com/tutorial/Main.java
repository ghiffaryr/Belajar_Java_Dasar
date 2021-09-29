package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //create String
        String wordString = "hallo";
        char[] wordChar = {'h','a','l','l','o'};

        //show String
        System.out.println(wordString);
        System.out.println(Arrays.toString(wordChar));

        //access component from String
        System.out.println("first component from char[] = " + wordChar[0]);
        System.out.println("first component from String = " + wordString.charAt(0));

        //change component from String
        //impossible coz String in java is immutable
        wordChar[0] = 'c';
        System.out.println(Arrays.toString(wordChar));

        //wordString[0] = "c"; <---- doesn't allowed
        //wordString.charAt(0) = "c" <---- doesnt allowed

        //we can change the component indirectly

        printAddress("wordString",wordString);

        wordString = "c" + wordString.substring(1,5);
        System.out.println(wordString);

        printAddress("wordString",wordString);

        //memory from string (String Pool)

        String str_1 = "hello";
        String str_2 = "test";
        String str_3 = "testing";

        printAddress("str_1",str_1);
        printAddress("str_2",str_2);
        printAddress("str_3",str_3);

        str_3 = str_3.substring(0,4);
        printAddress("str_3",str_3);

        String str_4 = "callo";
        printAddress("str_4",str_4);

        wordString = "callo";
        printAddress("wordString",wordString);

        //1. String in java is immutable
        //2. String in String Pool is reusable, so memory is more efficient
        //3. Create String using new method will take another memory, not in string pool

        String a = new String("hello");
        printAddress("a",a);
    }

    private static void printAddress(String name, String data){
        int address = System.identityHashCode(data);
        System.out.println(name + " = " + data + "\t|| address = " + Integer.toHexString(address));
    }
}
