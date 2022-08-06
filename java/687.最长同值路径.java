import java.nio.file.Path;

/*
 * @lc app=leetcode.cn id=687 lang=java
 *
 * [687] 最长同值路径
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
    private int path = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null){
            return 0;
        }
        Path(root);
        return path;
    }
    private int Path(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Path(root.left);
        int right = Path(root.right);
        int leftPath = root.left != null && root.left.val == root.val ? left+1 : 0;
        int rightPath = root.right != null && root.right.val == root.val ? right + 1 : 0;
        path = Math.max(path, leftPath+rightPath);
        return Math.max(leftPath, rightPath);
    }
}
// @lc code=end

