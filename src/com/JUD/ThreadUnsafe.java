package com.JUD;

/*
@author cz

*/

public class ThreadUnsafe {
    private int cnt = 0;
    public void add(){
        cnt++;
    }
    public int get(){
        return cnt;
    }
}
