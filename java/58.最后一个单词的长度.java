/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        int last = s.length()-1;
        while(last > 0 && s.charAt(last) == ' '){
            last--;
        }
        while(last >= 0 && s.charAt(last) != ' '){
            res++;
            last--;
        }
        return res;
    }
}
// @lc code=end

