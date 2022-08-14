/*
 * @lc app=leetcode.cn id=147 lang=java
 *
 * [147] 对链表进行插入排序
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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){return head;}
        ListNode h = new ListNode();
        h.next = null;
        ListNode p = h;
        while(head != null){
            ListNode q = head;
            head = head.next;
            p = h;
            while(p.next != null && p.next.val < q.val){
                p = p.next;
            }
            q.next = p.next;
            p.next = q;
        }
        return h.next;
    }
}
// @lc code=end

