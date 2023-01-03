package com.static_pack;

/*
@author cz

*/

import java.util.Vector;

class AA{
    public class Point{ public int x=1 , y=2 ; }
    public static class X11{};
    public Point getPoint(){ return new Point() ; }

    public void printPoint(){
        Point point = new Point();
        System.out.println("point.x="+point.x+";point.y="+point.y);
    }

}

public class InnerClass {

    public static void main(String[] args) {

        AA aa = new AA();
        aa.printPoint();
        //静态内部类实例化
        AA.X11 x11 = new AA.X11();

        //内部类实例化的声明类型可以打全路径名或者外部类.内部类的形式
        AA.Point point = aa.new Point();
        //如果实例话内部非静态的类的话 要new两次
        AA.Point point1 = new AA().new Point();

        System.out.println("point.x="+point.x+";point.y="+point.y);

        Vector<Integer> res = new Vector();
        res.add(1);
        res.add(2);
        System.out.println(res.add(res.get(0) + res.get(1)));
        System.out.println(res.get(2));

        int x =4 ;
        int y;
        y= x+ ++x;
        System.out.println(y);

    }
}
