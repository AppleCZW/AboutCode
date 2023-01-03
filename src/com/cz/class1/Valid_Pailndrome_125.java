package com.cz.class1;

/*
@author cz

*/

public class Valid_Pailndrome_125 {
    public static void main(String[] args) {
        String s=".";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);
    }
    public static boolean isPalindrome(String s){
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
        return sgood.toString().equals(sgood_rev.toString());
    }


}
