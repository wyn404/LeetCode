/*
 * @lc app=leetcode.cn id=1295 lang=java
 *
 * [1295] 统计位数为偶数的数字
 */

// @lc code=start
class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] / 10 == 0){
                continue;
            }
            if(nums[i] / 100 == 0){
                res++;
                continue;
            }
            if(nums[i] / 1000 == 0){
                continue;
            }
            if(nums[i] / 10000 == 0){
                res++;
                continue;
            }
            if(nums[i] / 100000 == 0){
                continue;
            }
            if(nums[i] / 1000000 == 0){
                res++;
                continue;
            }
        }
        return res;
    }
}
// @lc code=end

