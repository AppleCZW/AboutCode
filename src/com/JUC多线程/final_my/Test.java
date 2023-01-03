package com.JUC多线程.final_my;

/*
@author cz

*/

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    //编译期常量

    final int i = 1;
    final static int J = 1;
    final int[] a = {1,2,3,4};
    //非编译期常量
    static Random r = new Random();
    final int k = r.nextInt();
    //一个既是static又是final 的字段只占据一段不能改变的存储空间，
    // 它必须在定义的时候进行赋值，否则编译器将不予通过。
    static final int k2 = r.nextInt();

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.k);
        System.out.println(test.k2);

        Test test1 = new Test();
        System.out.println(test1.k);
        System.out.println(test1.k2);

        //你会发现k2都是一样的，也就是说可简单的理解为static final所修饰的字段仅占据内存的一个一份空间，
        // 一旦被初始化之后便不会被更改
    }
}
