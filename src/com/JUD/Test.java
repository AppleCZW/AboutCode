package com.JUD;

/*
@author cz

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("这是一个测试的代码");
        int[] ints;
        ints= new int[]{1, 2, 3};
        for (int i :ints) {
            System.out.println(i);

        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        res.add(3);
        res.add(2);
        System.out.println(order_not(res));
        HashMap<Integer, Integer> m1 = new HashMap<>();
        m1.put(1,1);
        System.out.printf("1是"+m1.get(1));
    }
    public static boolean order_not(ArrayList<Integer> list){
        for (int i = 0; i < list.size()-1; i++) {

            if (list.get(i)>list.get(i+1)){
                return false;
            }
        }
        return true;
    }
    Test(){
        System.out.println();
    }

}
