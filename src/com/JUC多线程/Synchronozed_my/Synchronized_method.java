package com.JUC多线程.Synchronozed_my;

/*
@author cz

*/

public class Synchronized_method implements Runnable{
    static Synchronized_method instence1 =new Synchronized_method();
    static Synchronized_method instence2 =new Synchronized_method();
    @Override
    public void run() {
        method();
    }
    //synchronized 用在普通的方法上，默认的锁就是this 当前的实例
    public synchronized void method() {
        System.out.println("我是线程" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "结束");
    }

    public static void main(String[] args) {
        //t1和t2对于的是两个不一样的实例，所以代码不会串行
        Thread t1 = new Thread(instence1);
        Thread t2 = new Thread(instence1);

        Thread t3 = new Thread(instence2);
        Thread t4 = new Thread(instence2);

        t1.start();
        t2.start();

        t3.start();
        t4.start();
    }

}
