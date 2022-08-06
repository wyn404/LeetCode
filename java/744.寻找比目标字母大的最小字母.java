/*
 * @lc app=leetcode.cn id=744 lang=java
 *
 * [744] 寻找比目标字母大的最小字母
 */

// @lc code=start
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int i = 0, j = n-1;
        while(i <= j){
            int mid = (j-i)/2 + i;
            if(letters[mid] > target){
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        return i < n ? letters[i] : letters[0];
    }
}
// @lc code=end

