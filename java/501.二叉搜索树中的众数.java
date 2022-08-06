import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=501 lang=java
 *
 * [501] 二叉搜索树中的众数
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
    private Integer max = 1, sum = 1;
    private TreeNode pre = null;

    public int[] findMode(TreeNode root) {
        if(root == null){return null;}
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private void inOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left, list);
        if(pre != null){
            if(pre.val == root.val){
                sum++;
            }
            else{
                sum = 1;
            }
        }
        if(sum > max){
            max = sum;
            list.clear();
            list.add(root.val);
        }
        else if(sum == max){
            list.add(root.val);
        }
        pre = root;
        inOrder(root.right, list);
    }
}
// @lc code=end

