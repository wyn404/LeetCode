/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix[0].length == 0 || matrix.length == 0){return null;}
        List<Integer> list = new ArrayList<>();
        int r1 = 0, r2 = matrix.length-1, c1 = 0, c2 = matrix[0].length-1;
        while(r1 <= r2 && c1 <= c2){
            for(int i = c1; i <= c2; i++){
                list.add(matrix[r1][i]);
            }
            for(int i = r1 + 1; i <= r2; i++){
                list.add(matrix[i][c2]);
            }
            if(r1 < r2 && c1 < c2){
                for(int i = c2 - 1; i >= c1; i--){
                    list.add(matrix[r2][i]);
                }
                for(int i = r2 - 1; i > r1; i--){
                    list.add(matrix[i][c1]);
                }
            }
            r1++;
            c1++;
            r2--;
            c2--;
        }
        return list;
    }
}
// @lc code=end

