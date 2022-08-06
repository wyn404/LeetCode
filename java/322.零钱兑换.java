/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0 || coins.length == 0){return 0;}
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if(j == coins[i]){
                    dp[j] = 1;
                }
                else if(dp[j] == 0 && dp[j-coins[i]] != 0){
                    dp[j] = dp[j-coins[i]] + 1;
                }
                else if(dp[j-coins[i]] != 0){
                    dp[j] = Math.min(dp[j-coins[i]]+1, dp[j]);
                }
            }
        }
        return dp[amount] == 0 ? -1 : dp[amount];
    }
}
// @lc code=end

