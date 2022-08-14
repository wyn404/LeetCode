/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        if(height.length == 0){return 0;}
        int max = 0;
        int i = 0, j = height.length - 1;
        while(i < j){
            if(height[i] < height[j]){
                int area = height[i] * (j - i);
                max = Math.max(area, max);
                i++;
            }
            else{
                int area = height[j] * (j - i);
                max = Math.max(area, max);
                j--;
            }
        }
        return max;
    }
}
// @lc code=end

