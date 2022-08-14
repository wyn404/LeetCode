/*
 * @lc app=leetcode.cn id=650 lang=java
 *
 * [650] 只有两个键的键盘
 */

// @lc code=start
class Solution {
    public int minSteps(int n) {
        if(n == 1){return 0;}
        if(isPrime(n) == true){
            return n;
        }
        return minSteps(n / num(n)) + num(n);
    }

    public boolean isPrime(int n){
        for (int i = 2; i < Math.sqrt(n)+1; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public int num(int n){
        int i = 0;
        for (i = 2; i <= n / 2; i++) {
            if(n % i == 0){
                break;
            }
        }
        return i;
    }
}
// @lc code=end

