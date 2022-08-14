/*
 * @lc app=leetcode.cn id=414 lang=java
 *
 * [414] 第三大的数
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE, max2 = Long.MIN_VALUE, max3 = Long.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(max1 < nums[i]){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            else if(max2 < nums[i] && nums[i] < max1){
                max3 = max2;
                max2 = nums[i];
            }
            else if(max3 < nums[i] && nums[i] < max2){
                max3 = nums[i];
            }
        }
        return max3 == Long.MIN_VALUE ? (int)max1 : (int)max3;
    }
}
// @lc code=end

