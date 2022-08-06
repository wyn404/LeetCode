import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=279 lang=java
 *
 * [279] 完全平方数
 */

// @lc code=start
class Solution {
    public int numSquares(int n) {
        List<Integer> list = generateList(n);
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i = 2; i < n+1; i++) {
            int min = Integer.MAX_VALUE;
            for (int square : list) {
                if(square > i){
                    break;
                }
                min = Math.min(min, dp[i-square]+1);
            }
            dp[i] = min;
        }
        return dp[n];
    }
    public List<Integer> generateList(int n){
        List<Integer> list = new ArrayList<>();
        int diff = 3;
        int square = 1;
        while(square <= n){
            list.add(square);
            square += diff;
            diff += 2;
        }
        return list;
    }
}
// @lc code=end

