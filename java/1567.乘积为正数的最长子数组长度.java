/*
 * @lc app=leetcode.cn id=1567 lang=java
 *
 * [1567] 乘积为正数的最长子数组长度
 */

// @lc code=start
class Solution {
    public int getMaxLen(int[] nums) {
        int n = nums.length;
        int positive = nums[0] > 0 ? 1 : 0;
        int negative = nums[0] < 0 ? 1 : 0;
        int maxLen = positive;
        for(int i = 1; i < n; i++){
            if(nums[i] > 0){
                positive++;
                negative = negative > 0 ? negative + 1 : 0;
            }
            else if(nums[i] < 0){
                int newPositive = negative > 0 ? negative+1 : 0;
                int newNegative = positive + 1;
                positive = newPositive;
                negative = newNegative;
            }
            else{
                positive = 0;
                negative = 0;
            }
            maxLen = Math.max(maxLen, positive);
        }
        return maxLen;
    }
}
// @lc code=end

