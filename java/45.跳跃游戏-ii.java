/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int cnt = 0, maxpos = -1, end = 0;
        for(int i = 0; i < nums.length-1; i++){
            maxpos = Math.max(maxpos, i + nums[i]);
            if(i == end){
                end = maxpos;
                cnt++;
            }
        }
        return cnt;
    }
}
// @lc code=end

