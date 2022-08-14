/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> tempCombinations = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        backTracking(combinations, tempCombinations, visited, nums);
        return combinations;
    }
    private void backTracking(List<List<Integer>> combinations, List<Integer> tempCombintions, boolean[] visited, int[] nums){
        if(tempCombintions.size() == nums.length){
            combinations.add(new ArrayList<>(tempCombintions));
        }
        for (int i = 0; i < nums.length; i++) {
            if(visited[i]){
                continue;
            }
            if(i != 0 && nums[i] == nums[i-1] && !visited[i-1]){
                continue;
            }
            visited[i] = true;
            tempCombintions.add(nums[i]);
            backTracking(combinations, tempCombintions, visited, nums);
            tempCombintions.remove(tempCombintions.size() - 1);
            visited[i] = false;
        }
    }
}
// @lc code=end

