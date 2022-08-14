/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> tempCombinations = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backTracking(combinations, tempCombinations, visited, nums);
        return combinations;
    }
    private void backTracking(List<List<Integer>> combinations, List<Integer> tempCombinations, boolean[] visited,  int[] nums){
        if(tempCombinations.size() == nums.length){
            combinations.add(new ArrayList<>(tempCombinations));
        }
        for (int i = 0; i < nums.length; i++) {
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            tempCombinations.add(nums[i]);
            backTracking(combinations, tempCombinations, visited, nums);
            tempCombinations.remove(tempCombinations.size() - 1);
            visited[i] = false;
        }
    }
}
// @lc code=end

