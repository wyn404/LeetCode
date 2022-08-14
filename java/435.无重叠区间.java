/*
 * @lc app=leetcode.cn id=435 lang=java
 *
 * [435] 无重叠区间
 */

// @lc code=start
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0){
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparing(o -> o[1]));
        int end = intervals[0][1];
        int cnt = 1;
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < end){
                continue;
            }
            cnt++;
            end = intervals[i][1];
        }
        return intervals.length - cnt;
    }
}
// @lc code=end

