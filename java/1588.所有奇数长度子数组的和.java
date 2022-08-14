/*
 * @lc app=leetcode.cn id=1588 lang=java
 *
 * [1588] 所有奇数长度子数组的和
 */

// @lc code=start
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int leftCount = i, rightCount = n -i - 1;
            int leftOdd = leftCount/2 + 1;
            int rightOdd = rightCount/2 + 1;
            int leftEven = (leftCount+1)/2;
            int rightEven = (rightCount+1)/2;
            res += arr[i] * (leftOdd * rightOdd + leftEven * rightEven);
        }
        return res;
    }
}
// @lc code=end

