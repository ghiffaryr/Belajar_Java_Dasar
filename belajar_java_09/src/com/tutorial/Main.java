package com.tutorial;

public class Main {

    public static void main(String[] args){

        /*data type in java:
        integer, byte, short, long, double, float, char, boolean
         */

        //integer (satuan)
        int i = 2147483647;
        System.out.println("======INTEGER======");
        System.out.println("i integer value = " + (i + 1));
        System.out.println("max int value = " + Integer.MAX_VALUE);
        System.out.println("min int value = " + Integer.MIN_VALUE);
        System.out.println("i value = " + i);
        System.out.println("int byte size = " + Integer.BYTES + " bytes");
        System.out.println("int bit size = " + Integer.SIZE + " bit");

        // byte (satuan)
        byte b = 10;
        System.out.println("======BYTE======");
        System.out.println("b byte value = " + b);
        System.out.println("max byte value = " + Byte.MAX_VALUE);
        System.out.println("min byte value = " + Byte.MIN_VALUE);
        System.out.println("byte byte size = " + Byte.BYTES + " bytes");
        System.out.println("byte bit size = " + Byte.SIZE + " bit");

        // short (satuan)
        short s = 10;
        System.out.println("======SHORT======");
        System.out.println("s short value = " + s);
        System.out.println("max short value = " + Short.MAX_VALUE);
        System.out.println("min short value = " + Short.MIN_VALUE);
        System.out.println("short byte size = " + Short.BYTES + " bytes");
        System.out.println("short bit size = " + Short.SIZE + " bit");

        // long (satuan)
        long l = 10L;
        System.out.println("======LONG======");
        System.out.println("l long value = " + l);
        System.out.println("max long value = " + Long.MAX_VALUE);
        System.out.println("min long value = " + Long.MIN_VALUE);
        System.out.println("long byte size = " + Long.BYTES + " bytes");
        System.out.println("long bit size = " + Long.SIZE + " bit");

        // double (koma, bilangan real)
        double d = -10.5d;
        System.out.println("======DOUBLE======");
        System.out.println("d double value = " + d);
        System.out.println("max long value = " + Double.MAX_VALUE);
        System.out.println("min long value = " + Double.MIN_VALUE);
        System.out.println("double byte size = " + Double.BYTES + " bytes");
        System.out.println("double bit size = " + Double.SIZE + " bit");

        // float (koma, bilangan real)
        float f = -8.5f;
        System.out.println("======FLOAT======");
        System.out.println("f = " + f);
        System.out.println("max float value = " + Float.MAX_VALUE);
        System.out.println("min float value = " + Float.MIN_VALUE);
        System.out.println("float byte size = " + Float.BYTES + " bytes");
        System.out.println("float bit size = " + Float.SIZE + " bit");

        // char (karakter) berdasarkan ASCII
        char c = 'c';
        System.out.println("======CHAR======");
        System.out.println("c char value = " + c);
        System.out.println("max char value = " + Character.MAX_VALUE);
        System.out.println("min char value = " + Character.MIN_VALUE);
        System.out.println("char byte size = " + Character.BYTES + " bytes");
        System.out.println("char bit size = " + Character.SIZE + " bit");

        // boolean (nilai true atau false)
        boolean val = false;
        System.out.println("======BOOLEAN======");
        System.out.println("val boolean value = " + val);
        System.out.println("max boolean value = " + Boolean.TRUE);
        System.out.println("min boolean value = " + Boolean.FALSE);
    }
}
