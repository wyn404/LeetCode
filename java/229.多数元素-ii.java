/*
 * @lc app=leetcode.cn id=229 lang=java
 *
 * [229] 求众数 II
 */

// @lc code=start
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int element1 = 0, element2 = 0;
        int cnt1 = 0, cnt2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(cnt1 > 0 && element1 == nums[i]){
                cnt1++;
            }
            else if(cnt2 > 0 && element2 == nums[i]){
                cnt2++;
            }
            else if(cnt1 == 0){
                element1 = nums[i];
                cnt1++;
            }
            else if(cnt2 == 0){
                element2 = nums[i];
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(cnt1 > 0 && element1 == nums[i]){
                sum1++;
            }
            else if(cnt2 > 0 && element2 == nums[i]){
                sum2++;
            }
        }
        List<Integer> list = new ArrayList<>();
        if(cnt1 > 0 && sum1 > nums.length / 3){
            list.add(element1);
        }
        if(cnt2 > 0 && sum2 > nums.length / 3){
            list.add(element2);
        }
        return list;
    }
}
// @lc code=end

