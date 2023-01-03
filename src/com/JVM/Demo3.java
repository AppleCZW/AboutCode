package com.JVM;

/*
@author cz

*/
//StringTable ["a","b","ab"] hashtable 结构 串池
public class Demo3 {
    public static void main(String[] args) {
        //常量池中的信息，会被加载到运行的常量池中，这时 a b ab都是常量池中的符号 还没有变成java字符串对象
        //ldc 会把a 符号变成 "a" 字符串
        //"a"+"b"会被直接理解成"ab"
        //只有当是变量的时候 会被new出来的StringBuilder接管
        String s1 = "a";
        String s2 = "b";
        String s3 = "a"+"b";
        String s4 = "a"+s2;
        //String s5 ="ab";
        System.out.println(s3==s4);
        //System.out.println(s3==s5);
    }
}
