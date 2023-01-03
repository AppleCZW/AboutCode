package com.JUC多线程.Synchronozed_my;

/*
@author cz

*/

public class Syn_test implements Runnable{
    public static int count = 100;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
        count=count-10;
        System.out.println(count);

    }

    public static void main(String[] args) {

        Syn_test syn = new Syn_test();
        Thread t1 = new Thread(syn);
        Thread t2 = new Thread(syn);
        t1.start();
        t2.start();


    }
}
