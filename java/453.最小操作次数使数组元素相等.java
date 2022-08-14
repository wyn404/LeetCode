/*
 * @lc app=leetcode.cn id=453 lang=java
 *
 * [453] 最小操作次数使数组元素相等
 */

// @lc code=start
class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE, sum = 0;
        for (int num : nums) {
            if(min > num){
                min = num;
            }
        }
        for (int num : nums) {
            sum += num - min;
        }
        return sum;
    }
}
// @lc code=end

