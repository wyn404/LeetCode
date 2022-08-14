/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = head;
        int preVal = head.val;
        while(p.next != null){
            if(p.next.val == preVal){
                p.next = p.next.next;
            }
            else{
                preVal = p.next.val;
                p = p.next;
            }
        }
        return head;
    }
}
// @lc code=end

