/*
 * @lc app=leetcode.cn id=647 lang=java
 *
 * [647] 回文子串
 */

// @lc code=start
class Solution {
    private int cnt = 0;
    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            extendSubStrings(s, i, i);
            extendSubStrings(s, i, i+1);
        }
        return cnt;
    }
    public void extendSubStrings(String s, int i, int j){
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            cnt++;
            i--;
            j++;
        }
    }
}
// @lc code=end

