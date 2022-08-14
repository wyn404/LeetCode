/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricTree(root, root);
    }

    public boolean isSymmetricTree(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){return true;}
        if(root1 == null || root2 == null){return false;}
        if(root1.val == root2.val){
            return isSymmetricTree(root1.left, root2.right) && isSymmetricTree(root1.right, root2.left);
        }
        else{return false;}
    }
}
// @lc code=end

