package com.tutorial;

public class Main {

    public static void main(String[] args) {

//      while (kondisi) {
//          aksi
//      }

        int a = 0;
        boolean condition = true;

        System.out.println("initial of the program");

        while (condition) {
            System.out.println("while loop no-" + a);

            if (a == 10){
                condition = false;
            }

            a++;
        }

        System.out.println("end of the program");

    }

}
