/*
 * @lc app=leetcode.cn id=503 lang=java
 *
 * [503] 下一个更大元素 II
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        for (int i = 2 * n - 1; i >= 0; i--) {
            while(!stack.isEmpty() && nums[i % n] >= stack.peek()){
                stack.pop();
            }
            res[i%n] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i % n]);
        }
        return res;
    }
}
// @lc code=end

