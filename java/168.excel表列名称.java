/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */

// @lc code=start
class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber == 0){
            return "";
        }
        columnNumber--;
        return convertToTitle(columnNumber / 26) + (char)(columnNumber % 26 + 'A');
    }
}
// @lc code=end

