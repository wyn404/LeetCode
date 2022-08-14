/*
 * @lc app=leetcode.cn id=2357 lang=java
 *
 * [2357] 使数组中所有元素都等于零
 */

// @lc code=start
class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int preVal = 0;
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                continue;
            }
            else if(nums[i] != preVal){
                preVal = nums[i];
                cnt++;
            }
        }
        return cnt;
    }
}
// @lc code=end

