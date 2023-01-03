package com.JVM;

/*
@author cz

*/

public class Demo4_intern {
    public static void main(String[] args) {
//        //["a","b"]
//        String s = new String("a")+ new String("b");// new String("ab")
//
//        //现在是放在堆中 new String（"a") new String("b")
//        //如果想放在串池中的话
//        //需要借助intern
//        String s1 = s.intern();//如果没有则放入串池中，将串池中的对象返回
//        System.out.println(s1=="ab");
//



        //["a","b","ab]
        String x="ab";
        //上面说明在串池中以后有了 ab 后面已经放不了 ab进行了
        //说明sx还好是在堆中
        String sx = new String("a")+ new String("b");// new String("ab")
        String sx1 = sx.intern();//如果没有则放入串池中，将串池中的对象返回，如果提前有了 不会放在串池了
        System.out.println(sx=="ab");

    }
}
