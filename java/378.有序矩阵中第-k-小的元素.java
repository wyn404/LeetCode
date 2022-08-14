/*
 * @lc app=leetcode.cn id=378 lang=java
 *
 * [378] 有序矩阵中第 K 小的元素
 */

// @lc code=start
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0], right = matrix[n-1][n-1];
        int count = 0, mid;
        while(left < right){
            mid = left + (right-left)/2;
            count = foundNotBiggerThanMin(matrix, mid);
            if(count < k){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return right;
    }
    private int foundNotBiggerThanMin(int[][] matrix, int mid){
        int i = matrix.length-1, j = 0, count = 0;
        while(i >= 0 && j < matrix.length){
            if(matrix[i][j] > mid){
                i--;
            }
            else{
                count += i+1;
                j++;
            }
        }
        return count;
    }
}
// @lc code=end

