package com.JVM;

/*
@author cz

*/

public class Demo2_stack {
    public static void main(String[] args) throws Exception {
        System.out.println("1111");
        Thread.sleep(30000);
        //如果使用的new 关键字 是在堆空间出现
        byte[] bytes = new byte[1024 * 1024 * 10];
        System.out.println("22222");
        Thread.sleep(30000);

        bytes=null;
        System.gc();
        System.out.println("3333");
        Thread.sleep(1000000L);

    }
}
