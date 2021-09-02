package com.tutorial;

public class Main {

    public static void main(String[] args){

        //unary_operator

        //unary + and -
        int value = 1;
        System.out.printf("unary '+', %d being %d\n",value,+value);
        System.out.printf("unary '-', %d being %d\n",value,-value);

        //unary decrement and increment
        int value2 = 10;
        value2++;
        System.out.println("value with '++' being = " + value2);

        int value3 = 10;
        value3--;
        System.out.println("value with '--' being = " + value3);

        int a = 5;
        System.out.printf("value with '++' prefix being = %d\n",++a);
        int b = 5;
        System.out.printf("value with '++' postfix being = %d\n",b++);
        System.out.printf("result value from postfix being = %d\n",b);

        //unary boolean with !negation
        boolean cup = true;
        System.out.println("boolean value = " + cup);
        System.out.println("boolean value = " + !cup);

    }
}
