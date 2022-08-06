import java.util.Stack;

/*
 * @lc app=leetcode.cn id=962 lang=java
 *
 * [962] 最大宽度坡
 */

// @lc code=start
class Solution {
    public int maxWidthRamp(int[] nums) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] <= nums[stack.peek()]){
                stack.add(i);
            }
        }
        for (int i = nums.length-1; i >= 0; i--) {
            while(!stack.isEmpty() && nums[i] >= nums[stack.peek()]){
                max = Math.max(max, i-stack.peek());
                stack.pop();
            }
        }
        return max;
    }
}
// @lc code=end

