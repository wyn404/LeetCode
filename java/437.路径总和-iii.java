/*
 * @lc app=leetcode.cn id=437 lang=java
 *
 * [437] 路径总和 III
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
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){return 0;}
        return pathSum(root.left, targetSum) + pathSum(root.right, targetSum) + path(root, targetSum);
    }
    public int path(TreeNode root, int targetSum){
        if(root == null){return 0;}
        if(root.val == targetSum){
            return path(root.left, 0) + path(root.right, 0) + 1;
        }
        return path(root.left, targetSum - root.val) + path(root.right, targetSum - root.val);
    }
}
// @lc code=end

