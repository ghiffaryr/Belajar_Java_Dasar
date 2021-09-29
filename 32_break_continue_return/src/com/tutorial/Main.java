package com.tutorial;

public class Main {

    public static void main(String[] args) {

        //break, continue, return

        int a = 0;

        while(true){
            a++;

            if(a == 10){
                break;
                //keyword to force out from the loop
            } else if(a == 5){
                continue;
                //this is keyword to force restart the loop action
            } else if(a == 7){
                return;
            }

            System.out.println("looping no-" + a);
        }

        System.out.println("end of the loop");

    }
}
