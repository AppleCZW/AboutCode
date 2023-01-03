package com.cz.class1;

/*
@author cz

*/

import java.util.HashMap;

public class Count_common_words_with_one {
    public static void main(String[] args) {
        String[] words1=new String[]{"a","","as"};
        String[] words2= new String[]{"is","as"};
        int i = countWords(words1, words2);
        System.out.println(i);
    }
    public static  int countWords(String[] words1, String[] words2){
        HashMap<String, Integer> words1_map = new HashMap<>();
        for (String s :words1) {
            if (words1_map.containsKey(s)){
                words1_map.replace(s,words1_map.get(s)+1);
            }else {
                words1_map.put(s,1);
            }
        }
       for (String s:words2){
           Integer i = words1_map.get(s);
           if (i!=null&&i==1){ //word1中出现1次以上的无效
               words1_map.put(s,i-1);

           }
       }
        int res=0;
       for (int i:words1_map.values()){
           if (i==0) res++;
       }
        return res;
    }
}
