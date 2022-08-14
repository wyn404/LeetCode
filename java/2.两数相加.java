/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0, i = 0;
        ListNode p = l1, q = l2, head = null, rear = null;
        while(p != null && q != null){
            sum += p.val + q.val;
            ListNode r = new ListNode();
            r.val = sum % 10;
            sum /= 10;
            if(head == null){
                head = r;
                rear = head;
            }
            else{
                rear.next = r;
                rear = r;
            }
            p = p.next;
            q = q.next;
        }
        while(p != null){
            sum += p.val;
            ListNode r = new ListNode();
            r.val = sum % 10;
            sum /= 10;
            if(head == null){
                head = r;
                rear = head;
            }
            else{
                rear.next = r;
                rear = r;
            }
            p = p.next;
        }
        while(q != null){
            sum += q.val;
            ListNode r = new ListNode();
            r.val = sum % 10;
            sum /= 10;
            if(head == null){
                head = r;
                rear = head;
            }
            else{
                rear.next = r;
                rear = r;
            }
            q = q.next;
        }
        if(sum != 0){
            ListNode r = new ListNode();
            r.val = sum;
            rear.next = r;
            rear = r;
        }
        rear.next = null;
        return head;
    }
}
// @lc code=end

