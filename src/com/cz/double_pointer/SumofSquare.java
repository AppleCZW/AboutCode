package com.cz.double_pointer;

/*
@author cz

*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SumofSquare {
    public static void main(String[] args) {

        boolean res = judgeSquareSum(17);
        System.out.println(res);

    }
    public static boolean judgeSquareSum(int c){


        int n =(int) Math.sqrt(c);
        ArrayList<Double> l1 = new ArrayList<>();
        for (int i = 0; i <=n; i++) {
            l1.add((double) i);
        }

        int low =0 ;
        int high = n;
        while (low < high){
            if (Math.pow(l1.get(low),2)+Math.pow(l1.get(high),2) > c ){
                high--;

            }else if (Math.pow(l1.get(low),2)+Math.pow(l1.get(high),2) < c){
                low++;

            }
           if (Math.pow(l1.get(low),2)+Math.pow(l1.get(high),2) == c ){
               return true;
           }

        }

        return false;
    }
}
