/*
 * @lc app=leetcode.cn id=82 lang=java
 *
 * [82] 删除排序链表中的重复元素 II
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){return head;}
        ListNode h = new ListNode();
        h.next = head;
        ListNode p = h, q = h;
        int t = Integer.MAX_VALUE;
        while(p.next != null && p.next.next != null){
            if(p.next.val == p.next.next.val){
                t = p.next.val;
                p.next = p.next.next.next;
            }
            else if(p.next.val == t){
                p.next = p.next.next;
            }
            else{
                p = p.next;
            }
        }
        if(p.next != null && p.next.val == t){
            p.next = null;
        }
        return h.next;
    }
}
// @lc code=end

