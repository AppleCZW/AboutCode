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
