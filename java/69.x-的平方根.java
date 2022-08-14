/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        int left = 1, right = x;
        while(left <= right){
            int mid = (right-left) / 2 + left;
            int sqrt = x / mid;
            if(sqrt == mid){
                return mid;
            }
            else if(sqrt < mid){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return right;
    }
}
// @lc code=end

