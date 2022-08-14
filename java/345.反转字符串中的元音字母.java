/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        char[] cc = s.toCharArray();
        int i = 0, j = cc.length-1;
        while(i < j){
            while(i < s.length() && !isVowel(cc[i])){i++;}
            while(j >= 0 && !isVowel(cc[j])){j--;}
            if(i < j){
                char t = cc[i];
                cc[i] = cc[j];
                cc[j] = t;
                i++;
                j--;
            }
        }
        return new String(cc);
    }

    public boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c) >= 0;
    }
}
// @lc code=end

