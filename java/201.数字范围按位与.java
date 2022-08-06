/*
 * @lc app=leetcode.cn id=201 lang=java
 *
 * [201] 数字范围按位与
 */

// @lc code=start
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        while(left < right){
            right = right & (right - 1);
        }
        return right;
    }
}
// @lc code=end

