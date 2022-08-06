/*
 * @lc app=leetcode.cn id=154 lang=java
 *
 * [154] 寻找旋转排序数组中的最小值 II
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int i = 0, j = nums.length-1;
        while(i < j){
            int mid = (j-i)/2 + i;
            if(nums[mid] == nums[j]){
                j--;
            }
            else if(nums[mid] < nums[j]){
                j = mid;
            }
            else{
                i = mid + 1;
            }
        }
        return nums[i];
    }
}
// @lc code=end

