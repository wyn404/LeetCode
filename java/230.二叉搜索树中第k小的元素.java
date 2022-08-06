/*
 * @lc app=leetcode.cn id=230 lang=java
 *
 * [230] 二叉搜索树中第K小的元素
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
    public int kthSmallest(TreeNode root, int k) {
        int num = leftNum(root.left);
        if(num == k-1){
            return root.val;
        }
        else if(num > k-1){
            return kthSmallest(root.left, k);
        }
        else{
            return kthSmallest(root.right, k-num-1);
        }
    }
    private int leftNum(TreeNode root){
        if(root == null){
            return 0;
        }
        return leftNum(root.left) + leftNum(root.right) + 1;
    }
}
// @lc code=end

