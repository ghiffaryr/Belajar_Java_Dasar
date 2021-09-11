package com.tutorial;

import java.util.Formatter;

public class Main {

    public static void main(String[] args) {

        String name = "Yoyo";
        int age = 21;

        //output
        System.out.println("My name is " + name + ", I am " + age + " years old");

        //other way using format string
        System.out.printf("My name is %s, I am %d years old",name, age);

        //conversion: f=floating point, d=integer, c=character, s=string, b=boolean

        //format structure = %[index_argument$][flags][width][.precision]conversion

        //[index_argument]
        System.out.println("\n[index_argument]");

        //yoyo, hey yoyo, where you have been yoyo
        System.out.printf("%1$s, hey %1$s, where you have been %1$s\n",name);
        //how old are you, yoyo?, yoyo answered: 21, wow you're still young, 21 years old
        System.out.printf("\nhow old are you, %1$s ?, %1$s answered: %2$d, wow you're still young, %2$d years old\n ",name,age);

        //[flags]
        System.out.println("\n[flags]");
        int int1 = 5;
        int int2 = 8;
        int result = int1 - int2;
        System.out.printf("%d - %d = %+d\n",int1,int2,result);

        //[width]
        System.out.println("\n[width]");
        int int3 = 100;
        System.out.println("integer");
        System.out.printf("%d\n",int3);
        System.out.printf("%5d\n",int3);
        System.out.printf("%-5d\n",int3); //- means left align
        System.out.printf("%+5d\n",int3); //add + sign and right align
        System.out.printf("%+-6d\n",int3); //combination
        System.out.printf("%10d\n",int3);
        System.out.printf("% 10d\n",int3);
        System.out.printf("%010d\n",int3); //add leading 0
        System.out.printf("%+010d\n",int3);
        int int4 = 1000000000;
        System.out.printf("%-,15d\n",int4); //delimiter "," for each thousand

        //[.precision]
        System.out.println("\n[.precision]");
        float float2 = 15.678f;
        System.out.printf("%f\n",float2);
        System.out.printf("%.1f\n",float2);
        System.out.printf("%.2f\n",float2);
        System.out.printf("%8.2f\n",float2); //add width
        System.out.printf("%+08.2f\n",float2); //add width and flag

        //example
        String name2 = "Ucup";
        float GPA = 3.78731568f;

        //format structure = %[index_argument$][flags][width][.precision]conversion

        //save format to string variable
        String info_standard = "name: " + name2 + ", GPA = " + GPA;
        System.out.println("standard -> " + info_standard);

        String info_format = String.format("name: %1$s, GPA = %2$+5.2f",name2,GPA);
        System.out.println("string format -> " + info_format);

        //save format to string builder
        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder_info);

        formatBuilder.format("name: %1$s, GPA = %2$+5.2f",name2,GPA);
        System.out.println("string builder format -> " + builder_info);

    }
}
