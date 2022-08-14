/*
 * @lc app=leetcode.cn id=530 lang=java
 *
 * [530] 二叉搜索树的最小绝对差
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
    private int minDiff = Integer.MAX_VALUE;
    private TreeNode preNode = null;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minDiff;
    }
    public void inOrder(TreeNode root){
        if(root == null){return;}
        inOrder(root.left);
        if(preNode == null){
            preNode = root;
        }
        else{
            minDiff = Math.min(minDiff, root.val - preNode.val);
            preNode = root;
        }
        inOrder(root.right);
    }
}
// @lc code=end

