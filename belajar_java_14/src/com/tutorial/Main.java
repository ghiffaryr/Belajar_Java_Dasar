package com.tutorial;

public class Main {

    public static void main(String[] args){

        //comparation_operator

        int a,b;
        boolean comparationResult;

        //equal operator
        System.out.println("Equal operator");
        a = 10;
        b = 10;
        comparationResult = (a == b);
        System.out.printf("%d == %d is %s\n",a,b,comparationResult);

        a = 12;
        b = 10;
        comparationResult = (a == b);
        System.out.printf("%d == %d is %s\n",a,b,comparationResult);

        //not equal operator
        System.out.println("Not equal operator");
        a = 10;
        b = 10;
        comparationResult = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, comparationResult);

        a = 12;
        b = 10;
        comparationResult = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, comparationResult);

        //less than operator
        System.out.println("Less than operator");
        a = 9;
        b = 10;
        comparationResult = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, comparationResult);

        a = 12;
        b = 10;
        comparationResult = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, comparationResult);

        //greater than operator
        System.out.println("Greater than operator");
        a = 9;
        b = 10;
        comparationResult = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, comparationResult);

        a = 12;
        b = 10;
        comparationResult = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, comparationResult);

        //less than equal operator
        System.out.println("Less than equal operator");
        a = 9;
        b = 10;
        comparationResult = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b, comparationResult);

        a = 10;
        b = 10;
        comparationResult = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b, comparationResult);

        a = 12;
        b = 10;
        comparationResult = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b, comparationResult);

        //greater than equal operator
        System.out.println("Greater than equal operator");
        a = 9;
        b = 10;
        comparationResult = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b, comparationResult);

        a = 10;
        b = 10;
        comparationResult = (a <= b);
        System.out.printf("%d >= %d --> %s \n",a,b, comparationResult);

        a = 12;
        b = 10;
        comparationResult = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b, comparationResult);

    }

}
