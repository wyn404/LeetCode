/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = leftIndex(nums, target);
        res[1] = rightIndex(nums, target);
        return res;
    }
    private int leftIndex(int[] nums, int target){
        int i = 0, j = nums.length;
        while(i < j){
            int mid = (j-i)/2 + i;
            if(nums[mid] == target){
                j = mid;
            }
            else if(nums[mid] < target){
                i = mid + 1;
            }
            else{
                j = mid;
            }
        }
        if(i == nums.length){return -1;}
        return nums[i] == target ? i : -1;
    }
    private int rightIndex(int[] nums, int target){
        int i = 0, j = nums.length;
        while(i < j){
            int mid = (j-i)/2 + i;
            if(nums[mid] == target){
                i = mid + 1;
            }
            else if(nums[mid] < target){
                i = mid + 1;
            }
            else{
                j = mid;
            }
        }
        if(i == 0){return -1;}
        return nums[i-1] == target ? i-1 : -1;
    }
}
// @lc code=end

