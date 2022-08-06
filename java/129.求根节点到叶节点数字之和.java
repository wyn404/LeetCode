import javax.sound.midi.Track;

/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根节点到叶节点数字之和
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
    private int sum = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null){return 0;}
        sumNumbers(root);
        return sum;
    }
    private void sumNumbersHelper(TreeNode root, int preSum){
        if(root.left == null && root.right == null){
            sum += preSum * 10 + root.val;
            return;
        }
        if(root.left != null){
            sumNumbersHelper(root.left, preSum*10 + root.val);
        }
        if(root.right != null){
            sumNumbersHelper(root.right, preSum*10 + root.val);
        }
    }
}
// @lc code=end

