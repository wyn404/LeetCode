/*
 * @lc app=leetcode.cn id=172 lang=java
 *
 * [172] 阶乘后的零
 */

// @lc code=start
class Solution {
    public int trailingZeroes(int n) {
        return n >= 5 ? (n / 5 + trailingZeroes(n / 5)) : 0;
    }
}
// @lc code=end

