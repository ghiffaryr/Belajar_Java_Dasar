package com.tutorial;

public class Other {
    //can be accessed by anyone
    public static void methodPublic(){
        System.out.println("Other:public");
    }

    //can only be accessed by related class
    private static void methodPrivate(){
        System.out.println("Other:private");
    }

    //can only be accessed by the same package
    static void methodDefault(){
        System.out.println("Other:default");
    }

    //can only be accessed by the class in the same package and the subclass
    protected static void methodProtected(){
        System.out.println("Other:protected");
    }
}
