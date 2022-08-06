/*
 * @lc app=leetcode.cn id=162 lang=java
 *
 * [162] 寻找峰值
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1){return 0;}
        int i = 0, j = nums.length-1;
        while(i < j){
            int mid = (j-i)/2 + i;
            if(nums[mid] < nums[1+mid]){
                i = mid + 1;
            }
            else{
                j = mid;
            }
        }
        return i;
    }
}
// @lc code=end

