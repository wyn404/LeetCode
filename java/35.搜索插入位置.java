/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0){return 0;}
        int i = 0, j = nums.length-1, mid = 0;
        while(i <= j){
            mid = (i + j) / 2;
            if(nums[mid] == target){
                break;
            }
            else if(nums[mid] < target){
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            return mid+1;
        }
        return mid;
    }
}
// @lc code=end

