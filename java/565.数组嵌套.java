/*
 * @lc app=leetcode.cn id=565 lang=java
 *
 * [565] 数组嵌套
 */

// @lc code=start
class Solution {
    public int arrayNesting(int[] nums) {
        int max = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            int t = i;
            while(nums[t] >= 0){
                sum++;
                int j = nums[t];
                nums[t] = -1;
                t = j;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
// @lc code=end

