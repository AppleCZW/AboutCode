package com.cz.TanXin;

/*
@author cz

*/

import java.util.Arrays;

public class TanXin {
    public static void main(String[] args) {
        int[] children={1,20,30};
        int[] cookies={1,2};
        Arrays.sort(children);
        Arrays.sort(cookies);
        int child=0;
        int cookie=0;
        while(child<children.length&&cookie<cookies.length){
            if (children[child]<=cookies[cookie]) {
                child++;
            //如果可以满足最小孩子的 则加一 否则 不加
            }
            //贪心原则 ：先满足的是饥饿度最小的孩子
                cookie++;

        }
        System.out.println(child);
    }
}
