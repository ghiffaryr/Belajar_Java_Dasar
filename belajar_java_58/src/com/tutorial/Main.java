package com.tutorial;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        //read file
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
        bufferedReader.mark(200);

        //read by iterating through string
        String data = bufferedReader.readLine();
        System.out.println(data);

        //read by iterating through char
        bufferedReader.reset();
        char[] dataChar = new char[25];
        bufferedReader.read(dataChar,0,25);
        System.out.println(Arrays.toString(dataChar));

        //readline
        bufferedReader.reset();
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

        //write file
        FileWriter fileOutput = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);

        bufferedReader.reset();
        String line1 = bufferedReader.readLine();

        bufferedWriter.write(line1,0,line1.length());
        bufferedWriter.flush();

        //add new line, enter
        bufferedWriter.newLine();

        String line2 = bufferedReader.readLine();
        bufferedWriter.write(line2,0,line2.length());
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
        fileInput.close();
        fileOutput.close();

    }
}
