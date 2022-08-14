/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续 1 的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                sum++;
            }
            else{
                max = Math.max(max, sum);
                sum = 0;
            }
        }
        max = Math.max(max, sum);
        return max;
    }
}
// @lc code=end

