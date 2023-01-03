package com.JUC多线程.Synchronozed_my;

/*
@author cz

*/

public class SynchronizedDemo_rui {
    public static void main(String[] args) {
        SynchronizedDemo_rui demo =  new SynchronizedDemo_rui();
        demo.method1();
    }

    private synchronized void method1() {
        System.out.println(Thread.currentThread().getId() + ": method1()");
        method2();
    }

    private synchronized void method2() {
        System.out.println(Thread.currentThread().getId()+ ": method2()");
        method3();
    }

    private synchronized void method3() {
        System.out.println(Thread.currentThread().getId()+ ": method3()");
    }

}
