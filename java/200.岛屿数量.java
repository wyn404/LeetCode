/*
 * @lc app=leetcode.cn id=200 lang=java
 *
 * [200] 岛屿数量
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == '1'){
                    ans++;
                    dfs(grid, i, j, m, n);
                }
            }
        }
        return ans;
    }
    private void dfs(char[][] grid, int i, int j, int m, int n){
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i+1, j, m, n);
        dfs(grid, i-1, j, m, n);
        dfs(grid, i, j-1, m, n);
        dfs(grid, i, j+1, m, n);
    }
}
// @lc code=end

