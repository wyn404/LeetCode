/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            backTracking(combinations, path, i, 0, nums);
        }
        return combinations;
    }
    public void backTracking(List<List<Integer>> combinations, List<Integer> path, int size, int start, int[] nums){
        if(path.size() == size){
            combinations.add(new ArrayList<>(path));
        }
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backTracking(combinations, path, size, i+1, nums);
            path.remove(path.size() - 1);
        }
    }
}
// @lc code=end

