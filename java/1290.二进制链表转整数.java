/*
 * @lc app=leetcode.cn id=1290 lang=java
 *
 * [1290] 二进制链表转整数
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
    public int getDecimalValue(ListNode head) {
        if(head == null){return 0;}
        ListNode p = head;
        int res = 0;
        while(p != null){
            res <<= 1;
            res += p.val;
            p = p.next;
        }
        return res;
    }
}
// @lc code=end

