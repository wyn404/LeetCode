/*
 * @lc app=leetcode.cn id=495 lang=java
 *
 * [495] 提莫攻击
 */

// @lc code=start
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            if(timeSeries[i]-timeSeries[i-1] <= duration){
                res += timeSeries[i] - timeSeries[i-1];
            }
            else{
                res += duration;
            }
        }
        res += duration;
        return res;
    }
}
// @lc code=end

