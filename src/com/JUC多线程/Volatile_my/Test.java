package com.JUC多线程.Volatile_my;

/*
@author cz

*/

public class Test {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);

    }
}
