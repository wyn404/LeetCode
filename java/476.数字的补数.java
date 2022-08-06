/*
 * @lc app=leetcode.cn id=476 lang=java
 *
 * [476] 数字的补数
 */

// @lc code=start
class Solution {
    public int findComplement(int num) {
        if(num == 0){return 1;}
        int mask = 1;
        mask = mask << 30;
        while((mask & num) == 0){
            mask = mask >> 1;
        }
        mask = (mask << 1) - 1;
        return mask ^ num;
    }
}
// @lc code=end

