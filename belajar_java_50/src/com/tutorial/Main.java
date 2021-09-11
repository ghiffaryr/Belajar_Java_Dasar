package com.tutorial;

public class Main {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("hello");
        printData(builder);

        //append
        builder.append(" all");
        printData(builder);

        builder.append(" Surabaya citizen");
        printData(builder);

        // insert
        builder.insert(18," City");
        printData(builder);

        // delete
        builder.delete(19,24);
        printData(builder);

        // rubah character pada index tertentu
        builder.setCharAt(14,'k');
        printData(builder);

        // replace
        builder.replace(19,26,"Bandung");
        printData(builder);

        // casting menjadi string
        String words = builder.toString();
        System.out.println(words);
        int addressString = System.identityHashCode(words);
        System.out.println("address = " + Integer.toHexString(addressString));

    }

    private static void printData(StringBuilder dataBuilder){
        System.out.println("data = " + dataBuilder);
        System.out.println("length = " + dataBuilder.length());
        System.out.println("capacity = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }
}
