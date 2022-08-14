/*
 * @lc app=leetcode.cn id=1103 lang=java
 *
 * [1103] 分糖果 II
 */

// @lc code=start
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int i = 0, num = 1;
        while(candies != 0){
            i = i % num_people;
            if(num > candies){
                res[i] += candies;
                break;
            }
            res[i++] += num;
            candies -= num;
            num += 1;
        }
        return res;
    }
}
// @lc code=end

