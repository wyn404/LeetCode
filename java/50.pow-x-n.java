/*
 * @lc app=leetcode.cn id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        long b = n;
        if(b < 0){
            b = -b;
            x = 1/ x;
        }
        double res = 1;
        while(b > 0){
            if((b&1) == 1){
                res *= x;
            }
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
// @lc code=end

