/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    private static final String[] Keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return combinations;
        }
        trackbacking(new StringBuilder(), combinations, digits);
        return combinations;
    }

    private void trackbacking(StringBuilder prefix, List<String> combinations, String digits){
        if(prefix.length() == digits.length()){
            combinations.add(prefix.toString());
            return;
        }
        int curDigits = digits.charAt(prefix.length()) - '0';
        String letters = Keys[curDigits];
        for (char c : letters.toCharArray()) {
            prefix.append(c);
            trackbacking(prefix, combinations, digits);
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }
}
// @lc code=end

