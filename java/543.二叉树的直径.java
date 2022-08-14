/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){return 0;}
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int diameter = leftHeight + rightHeight;
        return Math.max(diameter, Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));
    }
    public int height(TreeNode root){
        if(root == null){return 0;}
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }
}
// @lc code=end

