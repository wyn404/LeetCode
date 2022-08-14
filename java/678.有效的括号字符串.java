/*
 * @lc app=leetcode.cn id=678 lang=java
 *
 * [678] 有效的括号字符串
 */

// @lc code=start
class Solution {
    public boolean checkValidString(String s) {
        Deque<Integer> leftStack = new LinkedList<>();
        Deque<Integer> asterisStack = new LinkedList<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == '('){
                leftStack.push(i);
            }
            else if(c == '*'){
                asterisStack.push(i);
            }
            else{
                if(!leftStack.isEmpty()){
                    leftStack.pop();
                }
                else if(!asterisStack.isEmpty()){
                    asterisStack.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!leftStack.isEmpty() && !asterisStack.isEmpty()){
            int leftIndex = leftStack.pop();
            int asterisIndex = asterisStack.pop();
            if(leftIndex > asterisIndex){
                return false;
            }
        }
        return leftStack.isEmpty();
    }
}
// @lc code=end

