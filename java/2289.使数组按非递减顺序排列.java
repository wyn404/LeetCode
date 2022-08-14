/*
 * @lc app=leetcode.cn id=2289 lang=java
 *
 * [2289] 使数组按非递减顺序排列
 */

// @lc code=start
class Solution {
    public int totalSteps(int[] nums) {
        int ans = 0;
        Deque<int[]> st = new LinkedList<>();
        for(int num : nums){
            int maxT = 0;
            while(!st.isEmpty() && st.peek()[0] <= num){
                maxT = Math.max(maxT, st.pop()[1]);
            }
            maxT = st.isEmpty() ? 0 : maxT + 1;
            ans = Math.max(ans, maxT);
            st.push(new int[]{num, maxT});
        }
        return ans;
    }
}
// @lc code=end

