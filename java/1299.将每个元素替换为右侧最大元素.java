/*
 * @lc app=leetcode.cn id=1299 lang=java
 *
 * [1299] 将每个元素替换为右侧最大元素
 */

// @lc code=start
class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        int max = arr[arr.length - 1];
        res[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            res[i] = max;
            max = Math.max(arr[i], max);
        }
        return res;
    }
}
// @lc code=end

