package com.JUC多线程.CAS_unsafe;

import java.util.concurrent.atomic.AtomicInteger;

/*
@author cz

*/
//原子操作级别的Integer
public class AtomicIntegerTest {
    private volatile int count = 0;
    // 若要线程安全执行执行 count++，需要加锁
    public synchronized void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
    //使用Ato之后
    private final AtomicInteger count1 = new AtomicInteger();
    public void increment1() {
        count1.incrementAndGet();
    }
    // 使用 AtomicInteger 后，不需要加锁，也可以实现线程安全
    public int getCount1() {
        return count1.get();
    }



    public static void main(String[] args) {


    }
}
