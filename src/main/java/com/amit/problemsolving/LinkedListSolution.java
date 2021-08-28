package com.amit.problemsolving;

public class LinkedListSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int rem = 0;
        ListNode retNode = new ListNode(0,null);
        while (l1.next!=null || l2.next != null) {
            int total = l1.val + l2.val;
             rem = (total > 10) ? total - 10 : total;
            ListNode l  = new ListNode(rem,null);
            retNode.next = l;
        }
        return  retNode;
    }

    public static void main(String[] args) {
        LinkedListSolution l  = new LinkedListSolution();
    }
}
