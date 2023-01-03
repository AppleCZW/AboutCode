package com.HashMap.Analysis;

/*
@author cz

*/

import java.util.*;

public class HashMap_A {
    public static void main(String[] args) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        String a="My field1";
        String b="My field1";
        System.out.println(a==b);

        int[] ints= new int[]{1, 2, 3, 4,5};
        for (int i :ints) {
            System.out.println(i);
        }
        int i=0;
        for (;i< ints.length;i++){
            if (ints[i]==3){
                break;
            }
        }
        System.out.println(i);
        LinkedList<Integer> res = new LinkedList<>();
        res.add(1);
        res.addAll(Collections.singleton(2));
        System.out.println(res.size());;
        LinkedList<Integer> q = new LinkedList<>();
        //offer是从后面插入
        q.offer(1);
        //poll是从前面取出
        Integer poll = q.poll();
        System.out.println(poll);
        System.out.println(q.size());


        System.out.println("============");

        List<List<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        lists.add(l1);
        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(1);
        System.out.println(q1.poll());

    }

    static void test(){
        Queue<Integer> q = new LinkedList<>();
        q.offer(3);
        q.offer(2);
        q.offer(10);
        int max= q.element();

        System.out.println(max);


    }

    public static void swap(int a,int b){
        System.out.println("交换前a"+a);
        System.out.println("交换前b"+b);
       int  t= a;
       a    = b;
       b    = t;
        System.out.println("交换a"+a);
        System.out.println("交换b"+b);

    }
}
