package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.print("array value no: ");
        int index = userInput.nextInt();

        //exception handling (try,catch,finally)
        System.out.println("Handling out of bound");
        try{
            System.out.printf("index no-%d, is %d\n",index,array[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }

        //runtime error if file not found
        System.out.println("Handling IO not found");
        try{
            System.out.printf("index no-%d, is %d\n",index,array[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }

        //combine 2 exception
        System.out.println("combine 2 exception");
        try{
            System.out.printf("index no-%d, is %d\n",index,array[index]);
            fileInput = new FileInputStream("input.txt");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("the index is not located in range");
        } catch (IOException e){
            System.err.println("file not found");
        }

        //finally
        System.out.println("adding finally");
        try{
            System.out.printf("index no-%d, is %d\n",index,array[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("the index is not located in range");
        } finally {
            System.out.println("finally");
        }
        System.out.println("\nend of the program");
    }
}
