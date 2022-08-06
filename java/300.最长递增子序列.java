/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长递增子序列
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        int res = 0;
        int[] tail = new int[nums.length];
        for (int k = 0; k < tail.length; k++) {
            int i = 0, j = res;
            while(i < j){
                int mid = (j-i)/2 + i;
                if(tail[mid] < nums[k]){
                    i = mid + 1;
                }
                else{
                    j = mid;
                }
            }
            tail[i] = nums[k];
            if(j == res){
                res++;
            }
        }
        return res;
    }
}
// @lc code=end

