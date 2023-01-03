package com.cz.Two_point_lookup;

/*
@author cz

*/

public class FindFistAndLastPosition_34 {
    public static void main(String[] args) {
    int[] nums = new int[]{5, 7, 7, 8, 8, 10};
    int[] res = search(nums,8);


    }
    public static int[] search(int[] nums,int target){

        int lower = low(nums,target);
        System.out.println(lower);
        return new int[]{lower};


    }
    public static int low(int[] nums,int target){
        int low=0;
        int high = nums.length-1;
        int mid =-1;
        while (low<=high){
            mid = (low+high)/2;
            if (nums[mid]>=target){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return low;
    }
    public static int high(int[] nums,int target){
        int low=0;
        int high = nums.length-1;
        int mid =-1;
        while (low<=high){
            mid = (low+high)/2;
            if (nums[mid]>target){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return low;
    }
}
