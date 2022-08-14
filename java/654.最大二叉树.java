/*
 * @lc app=leetcode.cn id=654 lang=java
 *
 * [654] 最大二叉树
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTreeHelper(nums, 0, nums.length-1);
    }

    public TreeNode constructMaximumBinaryTreeHelper(int[] nums, int i, int j){
        if(i > j){
            return null;
        }
        int max = 0, index = i;
        for (int k = i; k <= j; k++) {
            if(max < nums[k]){
                index = k;
                max = nums[k];
            }
        }
        TreeNode root = new TreeNode();
        root.val = nums[index];
        root.left = constructMaximumBinaryTreeHelper(nums, i, index-1);
        root.right = constructMaximumBinaryTreeHelper(nums, index+1, j);
        return root;
    }
}
// @lc code=end

