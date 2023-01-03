package com.JUC多线程.Synchronozed_my;

/*
@author cz

*/

public class Synchronized_method_static implements Runnable{
    static Synchronized_method_static instence1 = new Synchronized_method_static();
    static Synchronized_method_static instence2 = new Synchronized_method_static();

    @Override
    public void run() {
        method();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //还有一种制定锁对象为class对象
        synchronized (Synchronized_method_static.class){
            System.out.println("来到方式2！！！！！");
            System.out.println("我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "结束");
        }

    }

    // synchronized用在静态方法上，默认的锁就是当前所在的Class类，
    // 所以无论是哪个线程访问它，需要的锁都只有一把
    public static synchronized void method() {
        System.out.println("我是线程" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "结束");
    }

    public static void main(String[] args) {
        //由于Synchronized 修饰的是静态的方法，只要是一个class都是一个的锁
        Thread t1 = new Thread(instence1);
        Thread t2 = new Thread(instence2);
        t1.start();
        t2.start();
    }

}
