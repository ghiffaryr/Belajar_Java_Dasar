package com.tutorial;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        long timeStart, timeEnd;

        //read from file
        FileInputStream byteInput = new FileInputStream("input.txt");
        System.out.println(byteInput.available());

        //calculate reading time
        timeStart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        timeEnd = System.nanoTime();
        System.out.println("time = " + (timeEnd-timeStart));
        byteInput.close();

        //read from memory
        FileInputStream byteInput2 = new FileInputStream("input.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(byteInput2);

        bufferedInput.mark(200);
        //calculate reading time
        timeStart = System.nanoTime();
        System.out.println(bufferedInput.readAllBytes());
        timeEnd = System.nanoTime();
        System.out.println("time = " + (timeEnd-timeStart));

        //reread
        bufferedInput.reset();
        byte[] data = bufferedInput.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);
        bufferedInput.close();
        byteInput2.close();

        //writing using buffered output
        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);
        
        //write data as byte
        bufferedOutput.write(data,0,data.length);
        bufferedOutput.flush();

        bufferedOutput.close();
        byteOutput.close();

    }
}
