/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0], preSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            preSum = preSum > 0 ? preSum + nums[i] : nums[i];
            max = Math.max(max, preSum);
        }
        return max;
    }
}
// @lc code=end

