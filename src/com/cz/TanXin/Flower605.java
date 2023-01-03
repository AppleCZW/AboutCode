package com.cz.TanXin;

/*
@author cz

*/

public class Flower605 {
    public static void main(String[] args) {
        int[] flow={0};
        int n=0;
        boolean b1=canPlaceFlowers(flow,n);
        System.out.println(b1);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int res=0;
        for (int i=0;i< flowerbed.length;i++){
            if (flowerbed[i]==0
                    && (i+1== flowerbed.length||flowerbed[i+1]==0)//这是针对于右边的溢出问题
                    && (i==0||flowerbed[i-1]==0)){ //这是针对左边的溢出问题
                res+=1;
            }
        }
        int liu = res-n;

        if (liu>=0){
            return true;
        }else {
            return false;
        }

    }
}
