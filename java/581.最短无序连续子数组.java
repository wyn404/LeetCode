/*
 * @lc app=leetcode.cn id=581 lang=java
 *
 * [581] 最短无序连续子数组
 */

// @lc code=start
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] res = Arrays.copyOf(nums, nums.length);
        Arrays.sort(res);
        int left = nums.length, right = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != res[i]){
                left = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] != res[i]){
                right = i;
                break;
            }
        }
        return left == nums.length ? 0 : (right - left + 1);
    }
}
// @lc code=end

