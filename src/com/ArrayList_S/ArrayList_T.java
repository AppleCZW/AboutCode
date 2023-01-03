package com.ArrayList_S;

/*
@author cz

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayList_T {
    public static void main(String[] args) {
        int i=0;
        int a[]={3,6,4,8,5,6};
        do{
            a[i]-=3;
        }while(a[i++]<4);
        for(i=0;i<6;i++)
        {
            System.out.println(a[i]);
        }
        char myChar = 'g';
        String myStr = Character.toString(myChar);
        System.out.println("String is: "+myStr);
        myStr = String.valueOf(myChar);
        //转化成为string 的意思
        System.out.println("String is: "+myStr);


        int q = 5;
        int j = 10;
        System.out.println(~1);
        System.out.println(q + ~j);
        ThreadLocal<Object> objectThreadLocal = new ThreadLocal<>();
    }
}
