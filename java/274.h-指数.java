/*
 * @lc app=leetcode.cn id=274 lang=java
 *
 * [274] H 指数
 */

// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
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

