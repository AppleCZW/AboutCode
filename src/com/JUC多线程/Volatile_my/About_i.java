package com.JUC多线程.Volatile_my;

/*
@author cz

*/

/**
 * i++ 这个不能保证原子性
 * 因为本质上i++是读、写两次操作
 */
public class About_i {
    volatile int i;
    //下面实际上是三步
    //如果想保证同步的话，可以使用Synchronized
    public  void addI(){
        i++;

    }

    public static void main(String[] args) throws InterruptedException {
        final About_i test1 = new About_i();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                test1.addI();

            }).start();
        }
        Thread.sleep(1000);
        System.out.println(test1.i);
    }
}
