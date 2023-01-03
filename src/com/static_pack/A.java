package com.static_pack;

/*
@author cz

*/

import java.util.List;

/**
 * 静态变量: 又称为类变量，也就是说这个变量属于类的，类所有的实例都共享静态变量，
 * 可以直接通过类名来访问它；静态变量在内存中只存在一份。
 * 实例变量: 每创建一个实例就会产生一个实例变量，它与该实例同生共死
 * ------
 *
 */
public class A {
    private int x; //实例变量
    private static int y; //静态变量
    A(){
        System.out.println("我是构造方法");
    }


    public static void main(String[] args) {
        //int x= A.x; 这样是不可以的 没有创建A类的话就没有A.x

    }
}
