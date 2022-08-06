import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

/*
 * @lc app=leetcode.cn id=714 lang=java
 *
 * [714] 买卖股票的最佳时机含手续费
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int sum = 0;
        int minPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            if(prices[i] - minPrice > fee){
                sum += prices[i] - minPrice - fee;
                minPrice = prices[i] - fee;
            }
        }
        return sum;
    }
}
// @lc code=end

