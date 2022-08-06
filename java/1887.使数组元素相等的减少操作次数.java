import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1887 lang=java
 *
 * [1887] 使数组元素相等的减少操作次数
 */

// @lc code=start
class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                cnt++;
            }
            res += cnt;
        }
        return res;
    }
}
// @lc code=end

