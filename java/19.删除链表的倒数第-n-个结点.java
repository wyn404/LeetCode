/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode h = new ListNode();
        h.next = head;
        ListNode p = h, q = h;
        while(p.next != null){
            if(len < n){
                len++;
            }
            else{
                q = q.next;
            }
            p = p.next;
        }
        q.next = q.next.next;
        return h.next;
    }
}
// @lc code=end

