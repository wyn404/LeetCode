/*
 * @lc app=leetcode.cn id=572 lang=java
 *
 * [572] 另一棵树的子树
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null && root == null){
            return true;
        }
        if(root == null){
            return false;
        }
        return isSubtreeHelper(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public boolean isSubtreeHelper(TreeNode root, TreeNode subRoot){
        if(subRoot == null && root == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.val == subRoot.val){
            return isSubtreeHelper(root.left, subRoot.left) && isSubtreeHelper(root.right, subRoot.right);
        }
        return false;
    }
}
// @lc code=end

