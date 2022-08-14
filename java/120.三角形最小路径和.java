/*
 * @lc app=leetcode.cn id=120 lang=java
 *
 * [120] 三角形最小路径和
 */

// @lc code=start
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] f = new int[n];
        f[0] = triangle.get(0).get(0);
        for(int i = 1; i < n; i++){
            f[i] = f[i-1] + triangle.get(i).get(i);
            for(int j = i-1; j > 0; j--){
                f[j] = Math.min(f[j-1], f[j]) + triangle.get(i).get(j);
            }
            f[0] += triangle.get(i).get(0);
        }
        int mintotal = f[0];
        for(int i = 1; i < n; i++){
            mintotal = Math.min(mintotal, f[i]);
        }
        return mintotal;
    }
}
// @lc code=end

