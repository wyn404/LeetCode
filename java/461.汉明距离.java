/*
 * @lc app=leetcode.cn id=461 lang=java
 *
 * [461] 汉明距离
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        int sum = 0;
        while(x != 0 || y != 0){
            if((x&1) != (y&1)){
                sum++;
            }
            x >>= 1;
            y >>= 1;
        }
        return sum;
    }
}
// @lc code=end

