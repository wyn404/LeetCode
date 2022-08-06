/*
 * @lc app=leetcode.cn id=260 lang=java
 *
 * [260] 只出现一次的数字 III
 */

// @lc code=start
class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int diff = 0;
        for (int i = 0; i < nums.length; i++) {
            diff ^= nums[i];
        }
        diff &= -diff;
        for (int i = 0; i < nums.length; i++) {
            if((diff&nums[i]) != 0){
                res[0] ^= nums[i];
            }
            else{
                res[1] ^= nums[i];
            }
        }
        return res;
    }
}
// @lc code=end

