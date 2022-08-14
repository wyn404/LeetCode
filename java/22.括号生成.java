/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        if(n == 0){
            return list;
        }
        dfs(list, n, n, "");
        return list;
    }
    private void dfs(List<String> list, int left, int right, String s){
        if(left == 0 && right == 0){
            list.add(s);
            return;
        }
        if(left == right){
            dfs(list, left-1, right, s + "(");
        }
        else{
            if(left > 0){
                dfs(list, left-1, right, s + "(");
            }
            dfs(list, left, right-1, s + ")");
        }
    }
}
// @lc code=end

