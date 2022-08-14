/*
 * @lc app=leetcode.cn id=343 lang=java
 *
 * [343] 整数拆分
 */

// @lc code=start
class Solution {
    public int integerBreak(int n) {
        if(n <= 3){return n-1;}
        int s = n % 3, t = n / 3;
        if(s == 0){return (int)Math.pow(3, t);}
        else if(s == 1){return (int)Math.pow(3, t-1) * 4;}
        return (int)Math.pow(3, t) * 2;
    }
}
// @lc code=end

