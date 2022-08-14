/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0){return -1;}
        int i = 0, j = nums.length - 1;
        while(i <= j){
            int mid = (j-i)/2 + i;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }
        return -1;
    }
}
// @lc code=end

