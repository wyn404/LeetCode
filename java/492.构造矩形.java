/*
 * @lc app=leetcode.cn id=492 lang=java
 *
 * [492] 构造矩形
 */

// @lc code=start
class Solution {
    public int[] constructRectangle(int area) {
        int i = 1, j = area;
        int[] res = new int[2];
        while(i <= j){
            if(i * j < area){
                i++;
            }
            else if(i * j > area){
                j--;
            }
            else{
                res[0] = j;
                res[1] = i;
                i++;
                j--;
            }
        }
        return res;
    }
}
// @lc code=end

