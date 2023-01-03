package com.JVM;

/*
@author cz

*/

public class Demo1 {
    public static void main(String[] args) {
        m1();
    }
    private static void m1(){
        m2(1,2);
    }
    private static int m2(int a,int b){
        int c;
        return c=a+b;
    }
}
