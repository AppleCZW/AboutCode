package com.cz.class1;

/*
@author cz

*/

import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
      int[] a=new int[]{2,3,1,0,2,5,3};
      dup(a);
        for (Object o :a) {
            System.out.println(o);
        }
        System.out.println("===========");



    }
    //找到给的数组中重复的元素
    public static boolean dup(int[] arr){
        if (arr.length<=0){
            return false;
        }
        for (int i=0;i<arr.length;i++){
            while(arr[i]!=i){
                if (arr[i]==arr[arr[i]]){
                    return true;
                }
                int t=arr[i];
                arr[i]=arr[t];
                arr[t]=t;
            }
        }
        return false;
    }
    public static int[] sort(int[] arr){

        Arrays.stream(arr).sorted();
        return arr;
    }
}
