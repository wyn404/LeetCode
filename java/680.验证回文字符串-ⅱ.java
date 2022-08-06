/*
 * @lc app=leetcode.cn id=680 lang=java
 *
 * [680] 验证回文字符串 Ⅱ
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = s.length()-1;
        while(i < j){
            if(c[i] != c[j]){
                return validPalindromeHelper(c, i+1, j) || validPalindromeHelper(c, i, j-1);
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    private boolean validPalindromeHelper(char[] c, int i, int j){
        while(i < j){
            if(c[i] == c[j]){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

