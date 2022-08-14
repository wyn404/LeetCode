/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = sloveTree(preorder, inorder, 0, preorder.length, 0, inorder.length);
        return root;
    }

    public TreeNode sloveTree(int[] preorder, int[] inorder, int prestart, int preend, int instart, int inend){
        if(prestart >= preend || instart >= inend){return null;}
        int i;
        for (i = instart; i < inend; i++) {
            if(preorder[prestart] == inorder[i]){
                break;
            }
        }
        TreeNode node = new TreeNode();
        node.val = preorder[prestart];
        node.left = sloveTree(preorder, inorder, prestart+1, prestart+1+i-instart, instart, i);
        node.right = sloveTree(preorder, inorder, prestart+1+i-instart, preend, i+1, inend);
        return node;
    }
}
// @lc code=end

