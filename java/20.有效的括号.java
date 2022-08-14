/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] cc = s.toCharArray();
        for(int i = 0; i < cc.length; i++){
            if(cc[i] == '(' || cc[i] == '{' || cc[i] == '['){
                stack.push(cc[i]);
            }
            else{
                if(stack.isEmpty()){return false;}
                char pop = stack.pop();
                boolean b1 = (pop != '(' && cc[i] == ')');
                boolean b2 = (pop != '{' && cc[i] == '}');
                boolean b3 = (pop != '[' && cc[i] == ']');
                if(b1 || b2 || b3){return false;}
            }
        }
        return stack.isEmpty();
    }
}
// @lc code=end

