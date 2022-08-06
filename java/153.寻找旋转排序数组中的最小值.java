/*
 * @lc app=leetcode.cn id=153 lang=java
 *
 * [153] 寻找旋转排序数组中的最小值
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int i = 0, j = nums.length-1;
        if(nums[i] < nums[j]){return nums[0];}
        while(i < j){
            int mid = (j-i)/2 + i;
            if(nums[mid] < nums[j]){
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

