/*
 * @lc app=leetcode.cn id=965 lang=java
 *
 * [965] 单值二叉树
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
    private TreeNode node = null;
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){return true;}
        if(node == null){
            node = root;
        }
        if(node.val == root.val){
            return isUnivalTree(root.left) && isUnivalTree(root.right);
        }
        else{
            return false;
        }
    }
}
// @lc code=end

