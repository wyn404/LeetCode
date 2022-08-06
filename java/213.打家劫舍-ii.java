/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){return nums[0];}
        int n = nums.length;
        return Math.max(robHelper(nums, 0, n-2), robHelper(nums, 1, n-1));
    }
    private int robHelper(int[] nums, int i, int j){
        int first = 0, second = 0;
        for (int k = i; k <= j; k++) {
            int third = Math.max(first+nums[k], second);
            first = second;
            second = third;
        }
        return second;
    }
}
// @lc code=end

