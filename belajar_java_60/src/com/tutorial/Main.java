package com.tutorial;

import com.util.Cooking;

public class Main {
    public static void main(String[] args) {
        //public (can be accessed anywhere)
        //private (class level access)
        //default (class, package access)
        //protected (class, package, subclass access)

        //with public access modifier, can be accessed
        Other.methodPublic();

        //with private access modifier, can't be accessed
        //Other.methodPrivate();

        //because in the same package, can be accessed
        Other.methodDefault();

        //because in the same package, can be accessed
        Other.methodProtected();

        Cooking.meatPublic();
//        Cooking.meatPublic(); won't work
//        Cooking.meatPublic(); won't work
//        Cooking.meatPublic(); won't work


    }
}
