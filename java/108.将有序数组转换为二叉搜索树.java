/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){return null;}
        return sortedArrayToBSTHelper(nums, 0, nums.length-1);
    }
    public TreeNode sortedArrayToBSTHelper(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode();
        root.val = nums[mid];
        root.left = sortedArrayToBSTHelper(nums, start, mid-1);
        root.right = sortedArrayToBSTHelper(nums, mid+1, end);
        return root;
    }
}
// @lc code=end

