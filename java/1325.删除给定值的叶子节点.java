/*
 * @lc app=leetcode.cn id=1325 lang=java
 *
 * [1325] 删除给定值的叶子节点
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
    private int flag = 0;
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null){return null;}
        flag = 1;
        while(flag == 1){
            flag = 0;
            root = removeLeafNodesHelper(root, target);
        }
        return root;
    }

    public TreeNode removeLeafNodesHelper(TreeNode root, int target){
        if(root == null){
            return null;
        }
        if(root.val == target && isLeaf(root) == true){
            flag = 1;
            return null;
        }
        root.left = removeLeafNodesHelper(root.left, target);
        root.right = removeLeafNodesHelper(root.right, target);
        return root;
    }

    public boolean isLeaf(TreeNode root){
        if(root == null){return false;}
        return root.left == null && root.right == null;
    }
}
// @lc code=end

