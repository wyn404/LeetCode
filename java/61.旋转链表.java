/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){return null;}
        ListNode p = head, q = null, r = null;
        int len = Length(head);
        k = k % len;
        int i = 1;
        if(k == 0){
            return head;
        }
        while(i < len - k){
            p = p.next;
            i++;
        }
        q = p.next;
        r = head;
        head = q;
        p.next = null;
        while(q.next != null){
           q = q.next;
        }
        q.next = r;
        return head;
    }

    public int Length(ListNode head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
}
// @lc code=end

