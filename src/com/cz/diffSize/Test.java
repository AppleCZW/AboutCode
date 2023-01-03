package com.cz.diffSize;

/*
@author cz

*/

public class Test {
    public static int n=5;
    public static void main(String[] args) {
        int[] ints = new int[n];
        int[] Test = {1,2,3,4,5};
        int[] diff = Create_diff.create_diff(Test);
        for (int i = 0; i < diff.length; i++) {
            System.out.println(diff[i]);
        }
    }
}
