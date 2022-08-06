/*
 * @lc app=leetcode.cn id=441 lang=java
 *
 * [441] 排列硬币
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        long left = 1, right = n;
        while(left <= right){
            long mid = left + (right-left)/2;
            long total = (mid+1) * mid / 2;
            if(total == n){
                return (int)mid;
            }
            else if(total > n){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return (int)right;
    }
}
// @lc code=end

