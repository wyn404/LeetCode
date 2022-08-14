/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int zero = -1, one = 0, two = nums.length;
        while(one < two){
            if(nums[one] == 0){
                swap(nums, ++zero, one++);
            }
            else if(nums[one] == 2){
                swap(nums, one, --two);
            }
            else{
                one++;
            }
        }
    }
    private void swap(int[] nums, int i ,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
// @lc code=end

