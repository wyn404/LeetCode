/*
 * @lc app=leetcode.cn id=275 lang=java
 *
 * [275] H 指数 II
 */

// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
        int i = 0, j = citations.length-1;
        while(i <= j){
            int mid = (j-i)/2 + i;
            if(citations[mid] < citations.length - mid){
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }
        return citations.length - i;
    }
}
// @lc code=end

