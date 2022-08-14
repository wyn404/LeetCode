/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int num = 1;
        int[][] res = new int[n][n];
        int r1 = 0, r2 = n-1, c1 = 0, c2 = n-1;
        while(r1 <= r2 && c1 <= c2){
            for (int i = c1; i <= c2; i++) {
                res[r1][i] = num++;
            }
            for (int i = r1+1; i < r2; i++) {
                res[i][c2] = num++;
            }
            if(r1 < r2){
                for (int i = c2; i >= c1; i--) {
                    res[r2][i] = num++;
                }
                for (int i = r2-1; i > r1; i--) {
                    res[i][c1] = num++;
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return res;
    }
}
// @lc code=end

