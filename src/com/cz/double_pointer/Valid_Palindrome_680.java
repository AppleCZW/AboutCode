package com.cz.double_pointer;

/*
@author cz

*/

public class Valid_Palindrome_680 {
    public static void main(String[] args) {
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        int length = s.length();
        boolean res = validPalindrome(s);
        System.out.println(res);
    }
    public static boolean validPalindrome(String s){
        char[] chars = s.toCharArray();
        int chance = 1;
        int high = s.length()-1;
        int low = 0;
        while (low <= high){
            if (chars[low]!=chars[high] && chance==1){
                chance=0;
                if (chars[low+1]==chars[high]){
                    low++;
                }else {
                    high--;
                }
            }
            if (chars[low]!=chars[high] && chance==0){
                return false;
            }
            low++;
            high--;
        }



        return true;
    }
}
