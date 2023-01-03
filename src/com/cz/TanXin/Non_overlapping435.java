package com.cz.TanXin;

/*
@author cz

*/

import java.util.Arrays;
import java.util.Comparator;

public class Non_overlapping435 {
    public static void main(String[] args) {
        int[][] a={{-2147483646,2},{3,4}};
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int tot=0;
        int pre = a[0][1];
        for (int i =1;i< a.length;i++){
            if (a[i][0]<=pre){
                tot++; //说明这是要去掉的
            }else {
                pre=a[i][1];//满足条件的结尾
            }
        }
        int res=a.length-tot;
        System.out.println(res);

    }
}
