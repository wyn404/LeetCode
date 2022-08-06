/*
 * @lc app=leetcode.cn id=287 lang=java
 *
 * [287] 寻找重复数
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast){
                break;
            }
        }
        int prt1 = nums[0], prt2 = slow;
        while(prt1 != prt2){
            prt1 = nums[prt1];
            prt2 = nums[prt2];
        }
        return prt1;
    }
}
// @lc code=end

