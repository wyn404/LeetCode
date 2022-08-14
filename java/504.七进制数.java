/*
 * @lc app=leetcode.cn id=504 lang=java
 *
 * [504] 七进制数
 */

// @lc code=start
class Solution {
    public String convertToBase7(int num) {
        if(num == 0){return "0";}
        StringBuilder sb = new StringBuilder();
        int flag = 1;
        if(num < 0){
            flag = 0;
            num *= -1;
        }
        while(num != 0){
            sb.append(num % 7);
            num /= 7;
        }
        if(flag == 0){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
// @lc code=end

