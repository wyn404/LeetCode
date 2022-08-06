import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> path = new ArrayList<>();
        if(root == null){return path;}
        List<Integer> list = new ArrayList<>();
        backTracking(root, path, list);
        return path;
    }
    private void backTracking(TreeNode root, List<String> path, List<Integer> list){
        if(root == null){return;}
        list.add(root.val);
        if(isLeaf(root)){
            path.add(Path(list));
        }
        else{
            backTracking(root.left, path, list);
            backTracking(root.right, path, list);
        }
        list.remove(list.size() - 1);
    }
    private boolean isLeaf(TreeNode root){
        if(root == null){return false;}
        if(root.left == null && root.right == null){
            return true;
        }
        return false;
    }
    public String Path(List<Integer> list){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if(i != list.size() - 1){
                sb.append("->");
            }
        }
        return sb.toString();
    }
}
// @lc code=end

