package com.cz.diffSize;

/*
@author cz

*/

public class Create_diff {
    public  static int[] create_diff(int[] nums){
        int[] diff = new int[nums.length];
        diff[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            diff[i]=nums[i]=nums[i-1];
        }
        return diff;
    }
}
