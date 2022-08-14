/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){return head;}
        ListNode listl = new ListNode();
        ListNode listm = new ListNode();
        ListNode headl = listl, rearl = listl, headm = listm, rearm = listm;
        rearl.next = null;
        rearm.next = null;
        ListNode p = head, q = head;
        while(p != null){
            q = p.next;
            if(p.val < x){
                p.next = rearl.next;
                rearl.next = p;
                rearl = rearl.next;
            }
            else{
                p.next = rearm.next;
                rearm.next = p;
                rearm = rearm.next;
            }
            p = q;
        }
        rearl.next = headm.next;
        return headl.next;
    }
}
// @lc code=end

