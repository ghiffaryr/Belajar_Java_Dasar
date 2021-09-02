package com.tutorial;

public class Main {

    public static void main(String[] args){

        //data_type_conversion

        int intValue  = 256; //32bit
        System.out.println("int value = " + intValue);

        //int to long
        long longValue = intValue;
        System.out.println("long value = " + longValue);

        //int to byte
        byte byteValue = (byte)intValue; //the value restarts after the max reached
        System.out.println("byte value = " + byteValue);
        System.out.println("max byte value = " + Byte.MAX_VALUE);
        System.out.println("min byte value = " + Byte.MIN_VALUE);

        //casting of division
        int a = 10;
        float b = 4;

        float c = a/b;
        System.out.printf("%d / %f = %f\n",a,b,c);

        int x = 10;
        int y = 4;

        float z = (float)x/y;
        System.out.printf("%d / %d = %f\n",x,y,z);

    }

}
