package com.JUC多线程.Volatile_my;

/*
@author cz

*/

/**
 * volatile不能保证完全的原子性，只能保证单次的读/写操作具有原子性
 *
 * 下面的的
 * 为什么会出现b=2;a=3和b=3;a=1这种结果呢?
 * 正常情况下，如果先执行change方法，再执行print方法，输出结果应该为b=3;a=3。
 * 相反，如果先执行的print方法，再执行change方法，结果应该是 b=2;a=1。那b=3;a=1的结果是怎么出来的?
 * 原因就是第一个线程将值a=3修改后，但是对第二个线程是不可见的，所以才出现这一结果。如果将a和b都改成volatile类型的变量再执行，
 * 则再也不会出现b=2;a=3和b=3;a=1的结果了
 * 如果加上了volatile就可以避免这种情况的发生
 */
public class VolatileTest {
    int a = 1;
    int b = 2;

    public void change(){
        a = 3;
        b = a;
    }

    public void print(){
        System.out.println("b="+b+";a="+a);
    }

    public static void main(String[] args) {
        while (true){
            final VolatileTest test = new VolatileTest();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test.change();
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    test.print();
                }
            }).start();
        }
    }
}

