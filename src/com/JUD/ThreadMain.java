package com.JUD;

/*
@author cz

*/

import java.util.concurrent.CountDownLatch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadMain {
    public static void main(String[] args) throws Exception {


        Integer m = 1223;
        Integer n = 1223;
        //缓存池的范围中的基本类型还是使用的valueOf（）方法进行的自动装箱
        System.out.println(m==n);

        String s1 = new String("123");
        String s2 = "123";//会自动将新建立的对象放在String Pool中
        System.out.println(s1==s2);
        String s3 = s1.intern();
        System.out.println(s1.intern()==s3);


        System.out.println("==============");

        EqualExa e1 = new EqualExa(1, 2, 3);
        EqualExa e2 = new EqualExa(1, 22, 33);
        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        System.out.println("调用clone这个方法");
        CloneExample c1 = new CloneExample(1, 2);
        CloneExample c2 = c1.clone();
        System.out.println(c2.a);

        System.out.println("浅拷贝的测试");
        ShallowCloneExample se1 = new ShallowCloneExample();
        ShallowCloneExample se2 = se1.clone();
        System.out.println("改变之前"+se1.get(2));
        se1.set(2,222);
        System.out.println("e2的变化"+se2.get(2));

        System.out.println("深拷贝的测试");
        DeepCloneExample d1 = new DeepCloneExample();
        DeepCloneExample d2 = d1.clone();
        d1.set(2,222);
        System.out.println("d2的变换"+d2.get(2));
        System.out.println("d1的变换"+d1.get(2));
    }
}
