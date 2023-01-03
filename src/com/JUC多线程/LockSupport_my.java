package com.JUC多线程;

/*
@author cz

*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class LockSupport_my {
    public static void main(String[] args) {
        Lock Lock = new ReentrantLock();
        Lock.lock();
        System.out.println("你好");
        Lock.unlock();
        //LockSupport lockSupport = new LockSupport();
    }
}
