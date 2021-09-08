package com.tutorial;

public class Main {

    public static void main(String[] args) {

//      do {
//          aksi
//      } while (condition);

        System.out.println("this is initial of the program");

        int a = 0;
        boolean condition = true;

        do {
            a++;
            System.out.println("do while no-" + a);

            if (a == 1) {
                condition = false;
            }

        }while(condition);

        System.out.println("end of the program");

    }

}
