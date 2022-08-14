/*
 * @lc app=leetcode.cn id=852 lang=java
 *
 * [852] 山脉数组的峰顶索引
 */

// @lc code=start
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while(i < j){
            int mid = (j-i)/2 + i;
            if(arr[mid] < arr[mid+1]){
                i = mid + 1;
            }
            else{
                j = mid;
            }
        }
        return i;
    }
}
// @lc code=end

