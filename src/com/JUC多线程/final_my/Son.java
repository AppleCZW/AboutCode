package com.JUC多线程.final_my;

/*
@author cz

*/

public class Son extends Base{
    //private 都隐式的制定为final
    //这里的test不会覆盖Base中的test 根本继承不下来
    //protected 是可以被继承的
     public void test(){
        System.out.println("son的test方法");
    }

    public static void main(String[] args) {
        Son son = new Son();
        Base father = son;
        //father.test();
        //只能转型成为Son去访问son的test方法
        ((Son) father).test();
    }

    //我们知道父类的final方法是不能够被子类重写的，那么final方法可以被重载吗? 答案是可以的
    //重写是发生在父类和子类之间的
    //重载是本类之间的方法，是多态的表现，参数类型不同、参数个数不同甚至是参数顺序不同 但是同名
}
