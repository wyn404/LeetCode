/*
 * @lc app=leetcode.cn id=152 lang=java
 *
 * [152] 乘积最大子数组
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imin = 1, imax = 1;
        int t;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0){
                t = imin;
                imin = imax;
                imax = t;
            }
            imax = Math.max(nums[i] * imax, nums[i]);
            imin = Math.min(nums[i] * imin, nums[i]);
            max = Math.max(max, imax);
        }
        return max;
    }
}
// @lc code=end

