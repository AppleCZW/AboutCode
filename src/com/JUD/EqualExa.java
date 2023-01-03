package com.JUD;

/*
@author cz

*/

public class EqualExa {
    private int x;
    private int y;
    private int a;

    public EqualExa(int x, int y, int a) {
        this.x = x;
        this.y = y;
        this.a = a;
    }
    public int test1(){
        System.out.println("nihao");
        System.out.println("nihao");
        return  1;

    }
    public void test(){
        int a = 1;
        int b = 2;
    }
    @Override
    public boolean equals(Object obj) {
       if (getClass()!=obj.getClass()) return false;

       EqualExa that = (EqualExa) obj;
       if (that.x == x) {
           return false;
       }
       else {
           return true;
       }
    }
}
