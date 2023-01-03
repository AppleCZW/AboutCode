package com.cz.class1;

/*
@author cz

*/

import java.util.List;

public class Linked_list {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        listNode.next=listNode1;
        listNode1.next=listNode2;

        ListNode p = new ListNode();
        p.next=listNode;
        ListNode p2= new ListNode();
        p2=reverseList(p);
        while (p2.next!=null){
            System.out.println(p2.val);
            p2=p2.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            // 为了反转完之后可以到达后面的节点 我们需要一个临时的变量
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //这个时候curr已经变成了null
        return prev;
    }

}
