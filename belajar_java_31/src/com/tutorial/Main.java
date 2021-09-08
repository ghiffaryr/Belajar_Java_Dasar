package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //calculating fibonacci no-n
        int f_n,f_n_1,f_n_2,n;

        Scanner userInput = new Scanner(System.in);
        System.out.print("taking fibonacci no-:");
        n = userInput.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for(int i = 1; i <= n; i++){
            System.out.println("value no-" + i + " is " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }

    }

}
