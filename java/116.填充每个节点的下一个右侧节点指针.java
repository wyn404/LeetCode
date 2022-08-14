/*
 * @lc app=leetcode.cn id=116 lang=java
 *
 * [116] 填充每个节点的下一个右侧节点指针
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        Node pre;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            pre = null;
            for(int i = 0; i < size; i++){
                Node node = queue.poll();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                if(pre == null){
                    pre = node;
                }
                else{
                    pre.next = node;
                    pre = node;
                }
            }
            pre.next = null;
        }
        return root;
    }
}
// @lc code=end

