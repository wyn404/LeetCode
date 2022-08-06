/*
 * @lc app=leetcode.cn id=413 lang=java
 *
 * [413] 等差数列划分
 */

// @lc code=start
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length <= 1){
            return 0;
        }
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 2; i < n; i++) {
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                dp[i] = dp[i-1] + 1;
            }
        }
        int sum = 0;
        for (int i : dp) {
            sum += i;
        }
        return sum;
    }
}
// @lc code=end

