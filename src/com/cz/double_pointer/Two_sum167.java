package com.cz.double_pointer;

/*
@author cz

*/

public class Two_sum167 {
    public static void main(String[] args) {
        int[] a={2,7,11,15};
        int target=13;
        int[] res=TwoSum(a,target);
        for (int re : res) {
            System.out.print(re);
        }


    }
    public static int[] twoSum(int[] numbers, int target) {
        //最简单就是双指针一个一个去找
        int[] res=new int[2];
        int flag=1;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = numbers.length-1; j >=1 ; j--) {
                if (numbers[i]+numbers[j]==target){
                    res[0]=i+1;
                    res[1]=j+1;
                    flag=0;
                    break;
                }
            }
            if (flag==0)break;
        }
        return res;
    }
    public static int Sum(int[] number,int target){
        int l =0;
        int h = number.length-1;
        int mid = (l+h)/2;
        while (l<h){
            if (number[h]==target) return h;
            if (number[l]==target) return l;
            if (number[mid]<target){
                l=mid+1;
                mid = (l+h)/2;
            } else if (number[mid]>target) {
                h=mid-1;
                mid = (l+h)/2;
            } else  {
                return mid;
            }
        }
        return -1;
    }
    public static int[] TwoSum(int[] numbers,int target){
        int l=0;
        int h=numbers.length-1;
        int[] res= new int[2];
        while (l<=h){
            if (numbers[l]+numbers[h]<target){
                l++;
                continue;
            }
            if (numbers[l]+numbers[h]>target) {
                h--;
                continue;
            }
            if (numbers[l]+numbers[h]==target){
                res[0]=l+1;
                res[1]=h+1;
                break;
            }
        }
        return res;
    }
}
