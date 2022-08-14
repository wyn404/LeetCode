/*
 * @lc app=leetcode.cn id=771 lang=java
 *
 * [771] 宝石与石头
 */

// @lc code=start
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int res = 0;
        char[] jews = jewels.toCharArray();
        char[] sts = stones.toCharArray();
        for (int i = 0; i < jews.length; i++) {
            set.add(jews[i]);
        }
        for (int i = 0; i < sts.length; i++) {
            if(set.contains(sts[i])){
                res++;
            }
        }
        return res;
    }
}
// @lc code=end

