/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){return 0;}
        int max = 0;
        int pre = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(pre > prices[i]){
                pre = prices[i];
            }
            else{
                max = Math.max(prices[i] - pre, max);
            }
        }
        return max;
    }
}
// @lc code=end

