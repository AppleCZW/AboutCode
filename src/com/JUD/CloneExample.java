package com.JUD;

/*
@author cz

*/

/**
 * clone 这个方法是一个pro方法 只能去显式的重写clone方法
 * 如果不实现这个Cloneable这个接口会导致出现CloneNotSupportedException
 */
public class CloneExample implements Cloneable{
    public int a;
    public int b;

    public CloneExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //调用clone这个方法才可以进行实现
    @Override
    protected CloneExample clone() throws CloneNotSupportedException {
        return (CloneExample) super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
