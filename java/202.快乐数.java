/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        int num, sum = 0;
        while(n != 1){
            num = Number(n);
            n = num;
            sum++;
            if(sum == 100){break;}
        }
        return n == 1 ? true : false;
    }

    public int Number(int n){
        int mod, num = 0;
        while(n != 0){
            mod = n % 10;
            num += mod * mod;
            n = n / 10;
        }
        return num;
    }
}
// @lc code=end

