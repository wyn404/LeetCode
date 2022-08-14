/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = -1;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                nums[++i] = nums[j];
            }
        }
        for(int j = i; j < nums.length-1; j++){
            nums[++i] = 0;
        }
    }
}
// @lc code=end

