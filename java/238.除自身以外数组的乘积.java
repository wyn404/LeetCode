/*
 * @lc app=leetcode.cn id=238 lang=java
 *
 * [238] 除自身以外数组的乘积
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 1, right = 1;
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, 1);
        for(int i = 1; i < nums.length; i++){
            left *= nums[i-1];
            res[i] *= left;
        }
        for(int i = nums.length-2; i >= 0; i--){
            right *= nums[i+1];
            res[i] *= right;
        }
        return res;
    }
}
// @lc code=end

