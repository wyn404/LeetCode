/*
 * @lc app=leetcode.cn id=653 lang=java
 *
 * [653] 两数之和 IV - 输入 BST
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
    public boolean findTarget(TreeNode root, int k) {
        if(root == null){return false;}
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        int i = 0, j = list.size() - 1;
        while(i < j){
            int sum = list.get(i) + list.get(j);
            if(sum < k){
                i++;
            }
            else if(sum > k){
                j--;
            }
            else{
                return true;
            }
        }
        return false;
    }

    public void inOrder(TreeNode root, List<Integer> list){
        if(root == null){return;}
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}
// @lc code=end

