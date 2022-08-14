/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){return 0;}
        int sum = 0;
        int pre = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(pre < prices[i]){
                sum += prices[i] - pre;
            }
            pre = prices[i];
        }
        return sum;
    }
}
// @lc code=end

