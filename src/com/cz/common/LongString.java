package com.cz.common;

/*
@author cz

*/

import java.util.HashMap;

public class LongString {
    public static void main(String[] args) {
        HashMap<String, Integer> Hash = new HashMap<>();
        Hash.put("a",1);
        Hash.put("a",Hash.get("a")+1);
        System.out.println(Hash.get("a"));

    }
}
