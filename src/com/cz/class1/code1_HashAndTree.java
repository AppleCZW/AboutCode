package com.cz.class1;

/*
@author cz

*/


import java.util.*;

public class code1_HashAndTree {
    public static class Node {
        public int value;
        public Node next;

        public Node(int val) {
            value = val;
        }
    }

    public static void main(String[] args) {
        Node nodeA = null;
        Node nodeB = null;
        Node nodeC = null;

        //hashset1的key是基础类型-》int类型 set是没有伴随元素的
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(3);
        System.out.println(hashSet1.contains(3));
        System.out.println(hashSet1);
        hashSet1.remove(3);
        System.out.println(hashSet1.contains(3));

        HashMap<Integer, String> mapTest = new HashMap<>();
        mapTest.put(1, "zuo");
        System.out.println(mapTest);
        System.out.println(mapTest.get(1));
        mapTest.replace(1,"zzz");
        System.out.println(mapTest.get(1));
        // hash表在使用的时候 查询的时间复杂度都是常数级别

        System.out.println("======1=======");

        //hashset2的key是非基础类型->node类型
        //A和B是内部不同的地址来区分不同的值 如果是基础类型就是值传递
        nodeA = new Node(1);
        nodeB = new Node(2);
        nodeC = new Node(3);
        HashSet<Node> hashSet2 = new HashSet<>();
        hashSet2.add(nodeA);
        System.out.println(hashSet2.contains(nodeA));
        //传进来的是地址
        System.out.println(hashSet2);

        System.out.println("======2========");

        //有顺表 在java中是TreeSet
        // 是根据key有顺序的组织起来的
        TreeMap<Integer, String> treemap1 = new TreeMap<>();
        treemap1.put(7, "我是7");
        treemap1.put(5, "我是5");
        treemap1.put(4, "我是4");
        treemap1.put(3, "我是3");
        treemap1.put(1, "我是1");
        System.out.println(treemap1.get(5));
        //由于是有序的 可以得到新的功能
        System.out.println(treemap1.firstKey());
        System.out.println(treemap1.get(treemap1.firstKey()));

        // 如果是自己的类型 就需要提供比较器
//        TreeSet<Node> treeSet = new TreeSet<>();
//        treeSet.add(nodeA);
//        treeSet.add(nodeB);//这是没有比较器

        TreeSet<Node> treeSet = new TreeSet<>(new NodeComparator());
        treeSet.add(nodeA);
        treeSet.add(nodeB);
        treeSet.add(nodeC);
        System.out.println(treeSet.first().value);
        System.out.println(treeSet.last().value);

    }

    public static class NodeComparator implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2) {
            return o1.value-o2.value;
        }
    }
}


