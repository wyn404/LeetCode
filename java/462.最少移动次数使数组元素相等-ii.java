/*
 * @lc app=leetcode.cn id=462 lang=java
 *
 * [462] 最少移动次数使数组元素相等 II
 */

// @lc code=start
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += Math.abs(nums[i] - nums[n / 2]);
        }
        return res;
    }
}
// @lc code=end
