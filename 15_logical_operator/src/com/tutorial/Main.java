package com.tutorial;

public class Main {

    public static void main(String[] args){

        //logical operator

        boolean a,b,c;

        //OR
        System.out.println("OR");
        a = false;
        b = false;
        c = a || b;
        System.out.println(a + " || " + b + " = " + c);

        a = false;
        b = true;
        c = a || b;
        System.out.println(a + " || " + b + " = " + c);

        a = true;
        b = false;
        c = a || b;
        System.out.println(a + " || " + b + " = " + c);

        a = true;
        b = true;
        c = a || b;
        System.out.println(a + " || " + b + " = " + c);

        //AND
        System.out.println("AND");
        a = false;
        b = false;
        c = a && b;
        System.out.println(a + " && " + b + " = " + c);

        a = false;
        b = true;
        c = a && b;
        System.out.println(a + " && " + b + " = " + c);

        a = true;
        b = false;
        c = a && b;
        System.out.println(a + " && " + b + " = " + c);

        a = true;
        b = true;
        c = a && b;
        System.out.println(a + " && " + b + " = " + c);

        //XOR
        System.out.println("XOR");
        a = false;
        b = false;
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = " + c);

        a = false;
        b = true;
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = " + c);

        a = true;
        b = false;
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = " + c);

        a = true;
        b = true;
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = " + c);

        //NOT
        System.out.println("Not");
        a = true;
        b = !a;
        System.out.println(a + "(!)  = " + b);

        a = false;
        b = !a;
        System.out.println(a + "(!)  = " + b);
    }

}
