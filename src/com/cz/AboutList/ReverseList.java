package com.cz.AboutList;

/*
@author cz

*/



public class ReverseList {
    public static void main(String[] args) {
        ListNode N1 = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode head = N1;

        ListNode res= reverseList(head);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }


    }
    public static ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp ;
        //接下来会tmp去存储 cur的数据
        while (cur!=null){
            tmp = cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;
        }
        return pre;


    }




}
