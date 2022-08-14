/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length-1;
        while(i <= j){
            int mid = (i+j) / 2;
            if(target == nums[mid]){
                return mid;
            }
            if(nums[i] <= nums[mid]){
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
        return -1;
    }
}
// @lc code=end

