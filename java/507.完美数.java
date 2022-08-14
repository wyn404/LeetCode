/*
 * @lc app=leetcode.cn id=507 lang=java
 *
 * [507] 完美数
 */

// @lc code=start
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 1){return false;}
        int mid, sum = 0;
        if(num <= 4){mid = num;}
        else{mid = num / 2;}
        for (int i = 1; i <= mid; i++) {
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num){return true;}
        return false;
    }
}
// @lc code=end

