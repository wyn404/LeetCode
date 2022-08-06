/*
 * @lc app=leetcode.cn id=328 lang=java
 *
 * [328] 奇偶链表
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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){return head;}
        int flag = 0;
        ListNode h = head;
        head = head.next;
        h.next = null;
        ListNode p = h, q = h, rear = h;
        while(head != null){
            p = head.next;
            if(flag == 0){
                head.next = rear.next;
                rear.next = head;
                rear = head;
                flag = 1;
            }
            else{
                head.next = q.next;
                q.next = head;
                q = head;
                flag = 0;
            }
            head = p;
        }
        return h;
    }
}
// @lc code=end

