/*
 * @lc app=leetcode.cn id=342 lang=java
 *
 * [342] 4的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0 && ((n-1)&n) == 0 && (n & 0b01010101010101010101010101010101) != 0;
    }
}
// @lc code=end

