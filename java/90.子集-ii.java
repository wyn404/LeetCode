/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> tempSubsets = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        for(int size = 0; size <= nums.length; size++) {
            backTracking(subsets, tempSubsets, visited, nums, 0, size);
        }
        return subsets;
    }
    private void backTracking(List<List<Integer>> subsets, List<Integer> tempSubsets, boolean[] visited, int[] nums, int start, int size){
        if(tempSubsets.size() == size){
            subsets.add(new ArrayList<>(tempSubsets));
        }
        for (int i = start; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i-1] && !visited[i-1]){
                continue;
            }
            tempSubsets.add(nums[i]);
            visited[i] = true;
            backTracking(subsets, tempSubsets, visited, nums, i+1, size);
            visited[i] = false;
            tempSubsets.remove(tempSubsets.size() - 1);
        }
    }
}
// @lc code=end

