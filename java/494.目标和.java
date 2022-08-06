/*
 * @lc app=leetcode.cn id=494 lang=java
 *
 * [494] 目标和
 */

// @lc code=start
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if(sum < target || (sum - target) % 2 == 1){
            return 0;
        }
        int len = (sum - target) / 2;
        int[] dp = new int[len + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = len; i >= num; i--) {
                dp[i] += dp[i-num];
            }
        }
        return dp[len];
    }
}
// @lc code=end

