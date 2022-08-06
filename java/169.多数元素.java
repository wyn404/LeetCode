/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0], sum = 0;
        for (int i = 0; i < nums.length; i++) {
            majority = sum > 0 ? majority : nums[i];
            sum = majority == nums[i] ? sum+1 : sum-1;
        }
        return majority;
    }
}
// @lc code=end

