/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除有序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1, flag = 1;
        int preVal = nums[0];
        for(int j = 1; j < nums.length; j++){
            if(nums[j] == preVal){
                if(flag < 2){
                    nums[i++] = nums[j];
                    flag++;
                }
                else{
                    continue;
                }
            }
            else if(nums[j] != preVal){
                nums[i++] = nums[j];
                preVal = nums[j];
                flag = 1;
            }
        }
        return i;
    }
}
// @lc code=end

