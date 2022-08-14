/*
 * @lc app=leetcode.cn id=84 lang=java
 *
 * [84] 柱状图中最大的矩形
 */

// @lc code=start
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] stack = new int[n+1];
        int area = 0, top = -1;
        stack[++top] = -1;
        for(int i = 0; i < n; i++){
            while(stack[top] != -1 && heights[stack[top]] >= heights[i]){
                area = Math.max(area, heights[stack[top--]] * (i-stack[top]-1));
            }
            stack[++top] = i;
        }
        while(stack[top] != -1){
            area = Math.max(area, heights[stack[top--]] * (n-stack[top]-1));
        }
        return area;
    }
}
// @lc code=end

