/*
 * @lc app=leetcode.cn id=73 lang=java
 *
 * [73] 矩阵置零
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0){return;}
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        if(list.size() != 0){
            for (int i = 0; i < list.size(); i = i + 2) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[list.get(i)][j] = 0;
                }
            }
            for (int i = 1; i < list.size(); i = i + 2) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][list.get(i)] = 0;
                }
            }
        }
    }
}
// @lc code=end

