package com.cz.TanXin;

/*
@author cz

*/

public class Best_time_to_buy122 {
    public static void main(String[] args) {
    int[] a={7,1,3,5,6,4};
    int res=maxProfit(a);
        System.out.println(res);
        System.out.println(3/2);

    }
    public static int maxProfit(int[] prices) {
        //我的思想是局部最优解 如果第二天是降的不买 第二天是升的就买入
        //是可以在同一天购买的
        int res=0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i+1]>=prices[i]){
                res+=prices[i+1]-prices[i];
            }
        }
        return res;
    }
}
