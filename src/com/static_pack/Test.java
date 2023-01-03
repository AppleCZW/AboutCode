package com.static_pack;

/*
@author cz

*/

public class Test{
    public static void main(String[] args) throws InterruptedException {
        new Test().go();
    }

    public static int x=0;
    public void go() throws InterruptedException {

        Thread t=new Thread(() -> x=x+1);
        t.start();
        Thread.sleep(100);
        System.out.println(x);

    }
}
