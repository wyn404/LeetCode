/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int first = 0, second = 0;
        for (int i = 0; i < nums.length; i++) {
            int third = Math.max(first+nums[i], second);
            first = second;
            second = third;
        }
        return second;
    }
}
// @lc code=end

