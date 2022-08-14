/*
 * @lc app=leetcode.cn id=81 lang=java
 *
 * [81] 搜索旋转排序数组 II
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0){
            return false;
        }
        int i = 0, j = nums.length-1;
        while(i <= j){
            int mid = (j-i)/2 + i;
            if(nums[mid] == target){
                return true;
            }
            if(nums[mid] == nums[i]){
                i++;
            }
            else if(nums[i] < nums[mid]){
                if(nums[i] <= target && target < nums[mid]){
                    j = mid - 1;
                }
                else{
                    i = mid + 1;
                }
            }
            else{
                if(nums[mid] < target && target <= nums[j]){
                    i = mid + 1;
                }
                else{
                    j = mid - 1;
                }
            }
        }
        return false;
    }
}
// @lc code=end

