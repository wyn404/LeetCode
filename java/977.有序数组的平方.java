/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        int min = Integer.MAX_VALUE, index = 0;
        for (int i = 0; i < res.length; i++) {
            if(min > nums[i]){
                min = nums[i];
                index = i;
            }
        }
        int pre = index - 1, next = index, k = 0;
        while(pre >= 0 && next < nums.length){
            if(nums[pre] < nums[next]){
                res[k++] = nums[pre--];
            }
            else{
                res[k++] = nums[next++];
            }
        }
        while(pre >= 0){
            res[k++] = nums[pre--];
        }
        while(next < nums.length){
            res[k++] = nums[next++];
        }
        return res;
    }
}
// @lc code=end

