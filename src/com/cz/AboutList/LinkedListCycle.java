package com.cz.AboutList;

/*
@author cz

*/



public class LinkedListCycle {
    public static void main(String[] args) {
    ListNode n1 = new ListNode(3);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(0);
    ListNode n4 = new ListNode(4);
    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    n4.next=n2;
    ListNode head= n1;

    ListNode res= detectCycle(head);
        System.out.println(res.val);
    }

    /**
     * 思想是快慢指针
     * @param head
     * @return
     */
    public static ListNode detectCycle(ListNode head){
        ListNode slow =head;
        ListNode fast = head;
        do{
            if (fast==null||fast.next==null) return null;
            fast = fast.next.next;
            slow = slow.next;
        }while (fast!=slow);
        //说明存在回路
        fast=head;
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }


        return fast;
    }
}
