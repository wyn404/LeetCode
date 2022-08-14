/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){return head;}
        ListNode h = new ListNode();
        ListNode p = head, q = head, rear = h;
        rear.next = null;
        while(head != null && head.next != null){
            p = head;
            q = head.next;
            head = head.next.next;
            p.next = rear.next;
            rear.next = p;
            q.next = rear.next;
            rear.next = q;
            rear = rear.next.next;
        }
        if(head != null){
            rear.next = head;
        }
        return h.next;
    }
}
// @lc code=end

