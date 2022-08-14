/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_tank = 0, cur_tank = 0, start = 0;
        for (int i = 0; i < cost.length; i++) {
            total_tank += gas[i] - cost[i];
            cur_tank += gas[i] - cost[i];
            if(cur_tank < 0){
                cur_tank = 0;
                start = i+1;
            }
        }
        return total_tank >= 0 ? start : -1;
    }
}
// @lc code=end

