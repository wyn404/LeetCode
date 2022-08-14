/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int leftmax = 0, rightmax = 0;
        int i = 0, j = height.length-1;
        int area = 0;
        while(i < j){
            if(height[i] < height[j]){
                if(height[i] < leftmax){
                    area += leftmax - height[i];
                }
                else{
                    leftmax = height[i];
                }
                i++;
            }
            else{
                if(height[j] < rightmax){
                    area += rightmax - height[j];
                }
                else{
                    rightmax = height[j];
                }
                j--;
            }
        }
        return area;
    }
}
// @lc code=end

