package com.cz.class1;

/*
@author cz

*/

import java.util.HashMap;
import java.util.Objects;

public class First_Only_one {
    public static void main(String[] args) {
        String s="abaccdefff";
        Character first = First(s);
        System.out.println(first);

    }
    public static Character First(String s){
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length-1;i++){
            int j;
            for ( j=i+1;j<chars.length;++j){
                if (chars[i]==chars[j]){
                    break;
                }
                }
            if (j==chars.length){
                return chars[i];
            }
        }


        return null;
    }
}
