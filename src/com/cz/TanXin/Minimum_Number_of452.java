package com.cz.TanXin;

/*
@author cz

*/

import java.util.Arrays;

public class Minimum_Number_of452 {
    public static void main(String[] args) {

    }
    public int findMinArrowShots(int[][] points) {
        /**
         贪心法, 气球只少需要一支箭, 先按照右端点排序, 然后每次
         从最小的右端点射出一支箭, 去掉被射爆的气球, 重复该过程.
         **/
        if(points.length < 1) return 0;
        Arrays.sort(points, (a, b) -> (a[1] - b[1]));
        int count = 1;
        int axis = points[0][1];

        for(int i = 1; i < points.length; ++i) {
            if(axis < points[i][0]) {
                count++;
                axis = points[i][1];
            }
        }

        return count;
    }
}
