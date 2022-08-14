/*
 * @lc app=leetcode.cn id=1304 lang=java
 *
 * [1304] 和为零的N个唯一整数
 */

// @lc code=start
class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int len = 0;
        n /= 2;
        for (int i = -n; i < 0; i++) {
            res[len++] = i;
        }
        for (int i = 1; i <= n; i++) {
            res[len++] = i;
        }
        return res;
    }
}
// @lc code=end

