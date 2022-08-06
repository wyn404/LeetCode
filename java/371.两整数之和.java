/*
 * @lc app=leetcode.cn id=371 lang=java
 *
 * [371] 两整数之和
 */

// @lc code=start
class Solution {
    public int getSum(int a, int b) {
        if(b == 0){
            return a;
        }
        return getSum(a ^ b, (a & b) << 1);
    }
}
// @lc code=end

