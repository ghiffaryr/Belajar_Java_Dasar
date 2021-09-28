package com.util;

public class Cooking {
    public static void meatPublic(){
        System.out.println("com.util.Cooking: public");
    }

    private static void meatPrivate(){
        System.out.println("com.util.Cooking: private");
    }

    static void meatDefault(){
        System.out.println("com.util.Cooking: default");
    }

    protected static void meatProtected(){
        System.out.println("com.util.Cooking: protected");
    }
}
