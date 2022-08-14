/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        if(head == null && head.next == null){return false;}
        ListNode slow = head, fast = head, pre = null, q = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            q = slow.next;
            slow.next = pre;
            pre = slow;
            slow = q;
        }
        if(fast != null){
            slow = slow.next;
        }
        while(slow != null){
            if(slow.val != pre.val){
                return false;
            }
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }
}
// @lc code=end

