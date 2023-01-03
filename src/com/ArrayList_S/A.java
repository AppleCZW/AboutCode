package com.ArrayList_S;

/*
@author cz

*/

import java.util.PriorityQueue;

public class A {
    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};
        int res = 0;
        for (int n : nums) {
            res ^= n;
            PriorityQueue<Object> objects = new PriorityQueue<>();
        }
    }
    public static ListNode_my addTwoNumbers(ListNode_my l1, ListNode_my l2) {
        int flag =0;//标示进位
        ListNode_my res = new ListNode_my();
        while (l1.next!=null&&l2.next!=null){

            if (l1.val+ l2.val+flag>=10){
                res.val = (l1.val+ l2.val)%10+flag;
                flag=1;
            }
            res.val = (l1.val+ l2.val)%10+flag;
            flag=0;
            l1=l1.next;
            l2=l2.next;
            ListNode_my now = new ListNode_my();
            res.next=now;
        }
        return res;
    }
}
