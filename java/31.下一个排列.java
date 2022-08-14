/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 0){return;}
        int firstIndex = -1;
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                firstIndex = i;
                break;
            }
        }
        if(firstIndex == -1){
            reverse(nums, 0, nums.length-1);
            return;
        }
        int secondIndex = -1;
        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] > nums[firstIndex]){
                secondIndex = i;
                break;
            }
        }
        swap(nums, firstIndex, secondIndex);
        reverse(nums, firstIndex+1, nums.length-1);
        return;
    }

    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private void reverse(int[] nums, int i, int j){
        while(i < j){
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
    }
}
// @lc code=end

