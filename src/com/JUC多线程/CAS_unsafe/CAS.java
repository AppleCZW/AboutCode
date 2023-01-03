package com.JUC多线程.CAS_unsafe;

/*
@author cz

*/

import java.util.concurrent.atomic.AtomicInteger;

/**
 * CAS的全称为Compare-And-Swap，直译就是对比交换。
 * 是一条CPU的原子指令，其作用是让CPU先进行比较两个值是否相等，然后原子地更新某个位置的值，
 * 经过调查发现，其实现方式是基于硬件平台的汇编指令，
 * 就是说CAS是靠硬件实现的，JVM只是封装了汇编调用，那些AtomicInteger类便是使用了这些封装后的接口。
 * 简单解释：CAS操作需要输入两个数值，一个旧值(期望操作前的值)和一个新值，
 * 在操作期间先比较下在旧值有没有发生变化，如果没有发生变化，才交换成新值，发生了变化则不交换。
 */
public class CAS {
    private int i = 0;
    public synchronized int add(){
        return i++;
    }
    //java中为我们提供了AtomicInteger
    // 原子类(底层基于CAS进行更新数据的)，不需要加锁就在多线程并发场景下实现数据的一致性
    private AtomicInteger i1 = new AtomicInteger(0);
    public int add1(){
        return i1.addAndGet(1);
    }

}
