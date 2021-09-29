package com.tutorial;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //open file

        //byte stream -> FileInputStream
        //character stream ->FileReader

        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader      charFileInput = new FileReader("input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
        FileWriter      charFileOutput = new FileWriter("ouputChar.txt");

        //read file

        //byte file
        int buffer = byteFileInput.read();

        while(buffer != -1){
            System.out.println((char)buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }

        System.out.println("\n");
        //char file
        buffer = charFileInput.read();

        while(buffer != -1){
            System.out.println((char)buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }

        //close file
        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();

    }

}
