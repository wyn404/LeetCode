/*
 * @lc app=leetcode.cn id=263 lang=java
 *
 * [263] 丑数
 */

// @lc code=start
class Solution {
    public boolean isUgly(int n) {
        if(n <= 0){return false;}
        if(n == 1){return true;}
        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
            }
            else if(n % 3 == 0){
                n /= 3;
            }
            else if(n % 5 == 0){
                n /= 5;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

