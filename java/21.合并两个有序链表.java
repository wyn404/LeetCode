/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){return list2;}
        if(list2 == null){return list1;}
        ListNode p = list1, q = list2, list, head = null, rear = null;
        while(p != null && q != null){
            if(p.val < q.val){
                if(head == null){
                    list = p;
                    head = list;
                    rear = head;

                }
                else{
                    list = p;
                    rear.next = list;
                    rear = list;
                }
                p = p.next;
            }
            else{
                if(head == null){
                    list = q;
                    head = list;
                    rear = head;

                }
                else{
                    list = q;
                    rear.next = list;
                    rear = list;
                }
                q = q.next;
            }
        }
        if(p != null){
            rear.next = p;
        }
        if(q != null){
            rear.next = q;
        }
        return head;
    }
}
// @lc code=end

