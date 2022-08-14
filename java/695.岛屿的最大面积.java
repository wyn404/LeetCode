/*
 * @lc app=leetcode.cn id=695 lang=java
 *
 * [695] 岛屿的最大面积
 */

// @lc code=start
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        if(m == 0 || n == 0){
            return 0;
        }
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 1){
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length){
            return 0;
        }
        if(grid[i][j] == 1){
            grid[i][j] = 0;
            return dfs(grid, i-1, j) + dfs(grid, i, j-1) +
            dfs(grid, i+1, j) + dfs(grid, i, j+1) + 1;
        }
        return 0;
    }
}
// @lc code=end

