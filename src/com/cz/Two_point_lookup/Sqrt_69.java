package com.cz.Two_point_lookup;

/*
@author cz

*/

import java.util.Arrays;

public class Sqrt_69 {
    public static void main(String[] args) {
        int test = 80;
        System.out.println(mySqrt(test));
    }
    public static int mySqrt(int x){
      if (x==0){
          return 0;
      }
      int low = 1;
      int high = x;
      while (low<=high){
          int mid = low+(high-low)/2;
          int sqrt =  x/mid;
          if (sqrt==mid){
              return mid;
          }
          if (sqrt>mid){
              low = mid +1;
          }
          if (sqrt<mid){
              high = mid-1;
          }
      }
      return high;
    }
}
