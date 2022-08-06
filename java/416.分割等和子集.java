/*
 * @lc app=leetcode.cn id=416 lang=java
 *
 * [416] 分割等和子集
 */

// @lc code=start
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(sum % 2 == 1){
            return false;
        }
        int len = sum / 2;
        boolean[] dp = new boolean[len+1];
        dp[0] = true;
        for (int i = 0; i < nums.length; i++) {
            for (int j = len; j >= nums[i]; j--) {
                dp[j] = dp[j] || dp[j-nums[i]];
            }
        }
        return dp[len];
    }
}
// @lc code=end

