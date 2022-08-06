/*
 * @lc app=leetcode.cn id=746 lang=java
 *
 * [746] 使用最小花费爬楼梯
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] res = new int[n+1];
        res[0] = cost[0];
        res[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            res[i] = Math.min(res[i-1], res[i-2]) + cost[i];
        }
        res[n] = Math.min(res[n-1], res[n-2]);
        return res[n];
    }
}
// @lc code=end

