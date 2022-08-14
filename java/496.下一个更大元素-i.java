/*
 * @lc app=leetcode.cn id=496 lang=java
 *
 * [496] 下一个更大元素 I
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = nums2.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && nums2[stack.peek()] <= nums2[i]){
                stack.pop();
            }
            map.put(nums2[i], stack.isEmpty() ? -1 : nums2[stack.peek()]);
            stack.push(i);
        }
        int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
// @lc code=end

