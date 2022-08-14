/*
 * @lc app=leetcode.cn id=137 lang=java
 *
 * [137] 只出现一次的数字 II
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int b1 = 0, b2 = 0;
        for (int i = 0; i < nums.length; i++) {
            b1 = (b1 ^ nums[i]) & ~b2;
            b2 = (b2 ^ nums[i]) & ~b1;
        }
        return b1;
    }
}
// @lc code=end
