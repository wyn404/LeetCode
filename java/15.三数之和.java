/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int k = 0; k < nums.length - 2; k++){
            if(nums[k] > 0){break;}
            if(k > 0 && nums[k] == nums[k-1]){
                continue;
            }
            int i = k+1, j = nums.length-1;
            while(i < j){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    while(i < j && nums[i] == nums[++i]);
                }
                else if(sum > 0){
                    while(i < j && nums[j] == nums[--j]);
                }
                else{
                    list.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while(i < j && nums[i] == nums[++i]);
                    while(i < j && nums[j] == nums[--j]);
                }
            }
        }
        return list;
    }
}
// @lc code=end

