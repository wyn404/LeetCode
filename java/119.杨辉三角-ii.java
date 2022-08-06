import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        int[] res = new int[rowIndex+1];
        for (int i = 0; i < rowIndex+1; i++) {
            res[i] = 1;
            for (int j = i; j > 1; j--) {
                res[j-1] += res[j-2];
            }
        }
        for (int i = 0; i < res.length; i++) {
            list.add(res[i]);
        }
        return list;
    }
}
// @lc code=end

