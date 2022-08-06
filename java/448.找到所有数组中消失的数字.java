import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=448 lang=java
 *
 * [448] 找到所有数组中消失的数字
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int t = Math.abs(nums[i])-1;
            if(nums[t] > 0){
                nums[t] *= -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;
    }
}
// @lc code=end

