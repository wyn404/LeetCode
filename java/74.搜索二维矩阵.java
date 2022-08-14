/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0){return false;}
        int i = matrix.length - 1, j = 0;
        while(i < matrix.length && j < matrix[0].length && i >= 0 && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }
            else if(matrix[i][j] > target){
                i--;
            }
            else{
                j++;
            }
        }
        return false;
    }
}
// @lc code=end

