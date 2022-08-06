/*
 * @lc app=leetcode.cn id=396 lang=java
 *
 * [396] 旋转函数
 */

// @lc code=start
class Solution {
    public int maxRotateFunction(int[] nums) {
        if(nums.length == 1){return 0;}
        int sum = 0, f = 0, max = 0;
        int k = nums.length;
        for (int i = 0; i < nums.length; i++) {
            f += i * nums[i];
            sum += nums[i];
        }
        max = f;
        for (int i = 1; i < nums.length; i++) {
            int fk = f + sum - k * nums[k-i];
            max = Math.max(max, fk);
            f = fk;
        }
        return max;
    }
}
// @lc code=end

