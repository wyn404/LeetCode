/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){return 0;}
        Map<Character, Integer> map = new HashMap<>();
        int max = 0, j = -1;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(map.get(s.charAt(i)), j);
            }
            max = Math.max(max, i-j);
            map.put(s.charAt(i), i);
        }
        return max;
    }
}
// @lc code=end

