package com.cz.TanXin;

/*
@author cz

*/
//一群孩子站成一排，每一个孩子有自己的评分。现在需要给这些孩子发糖果，
// 规则是如果一 个孩子的评分比自己身旁的一个孩子要高，
// 那么这个孩子就必须得到比身旁孩子更多的糖果；
// 所 有孩子至少要有一个糖果。求解最少需要多少个糖果。
//Input: [1,0,2] Output: 5
//在这个样例中，最少的糖果分法是 [2,1,2]。


import java.util.*;

import static java.lang.Math.max;

//思考：首先 先给每一个孩子一个 这是最少的标准
//重要的是 如果不是两端的话 左边和右边都是有人的  如果要是进行遍历比较的话要进行两次
//@@@第二次比较的时候是要加上一定的条件的
public class Candy {
    public static void main(String[] args) {
        int[] sore ={1,3,2,2,1};

        int res=Candy1(sore);
        System.out.println(res);

    }
    public static int Candy(int[] sore){
        //第一遍是从左边到右边的遍历
        //要求 如果右边的分数比左边高 ，则要右边的数量是左边—+1
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i :sore) {
            map.put(i,1);
        }
        for(int i=0;i<sore.length-1;i++){
            if (sore[i]<=sore[i+1]){
                map.put(sore[i+1], map.get(sore[i])+1);
            }
        }
        //第二次遍历的还有一个附加的条件
        //如果左边的分数比右边高且左边的candy数量小于右边的 才进行左边的数量是右边数量+1
        for (int i = sore.length-1; i >=1 ; i--) {
            if (sore[i-1]>sore[i]&&(map.get(sore[i-1])<= map.get(sore[i]))){
                map.put(sore[i-1],map.get(sore[i])+1);
            }
        }
        int res=0;
        for(Iterator it = map.entrySet().iterator(); it.hasNext();){
            Map.Entry ele = (Map.Entry)it.next();
            res+=(int)ele.getValue();
        }

        return res;
        //不能使用hashmap否则一样的数字就完了
    }
    public static int Candy1(int[] sore){
        int[] candy=new int[sore.length];
        for (int i = 0; i < sore.length; i++) {
            candy[i]=1;
        }
        for(int i=0;i<sore.length-1;i++) {
            if (sore[i] < sore[i + 1]) {
                candy[i + 1] = candy[i] + 1;
            }
        }
            for (int i = sore.length-1; i >=1 ; i--) {
                if (sore[i-1]>sore[i]&&candy[i-1]<=candy[i]){
                   candy[i-1]=candy[i]+1;
                }
            }
        int res=0;
        for (int i = 0; i < sore.length; i++) {
            res += candy[i];
        }
        return res;
    }
}
