/*
 * @lc app=leetcode.cn id=540 lang=java
 *
 * [540] 有序数组中的单一元素
 */

// @lc code=start
class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){return nums[0];}
        int left = 0, right = nums.length - 1;
        while(left < right){
            int mid = (right - left) / 2 + left;
            if(mid % 2 == 1){
                mid--;
            }
            if(nums[mid] == nums[mid+1]){
                left = mid + 2;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }
}
// @lc code=end

