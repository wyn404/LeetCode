/*
 * @lc app=leetcode.cn id=1281 lang=java
 *
 * [1281] 整数的各位积和之差
 */

// @lc code=start
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while(n != 0){
            int i = n % 10;
            sum += i;
            product *= i;
            n /= 10;
        }
        return product - sum;
    }
}
// @lc code=end

