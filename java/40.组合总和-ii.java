/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> tempCombinations = new ArrayList<>();
        Arrays.sort(candidates);
        boolean[] hasVisited = new boolean[candidates.length];
        backTracking(combinations, tempCombinations, 0, hasVisited, candidates, target);
        return combinations;
    }
    private void backTracking(List<List<Integer>> combinations, List<Integer> tempCombinations, int start, boolean[] visited, int[] candidates, int target){
        if(target == 0){
            combinations.add(new ArrayList<>(tempCombinations));
        }
        for (int i = start; i < candidates.length; i++) {
            if(visited[i]){
                continue;
            }
            if(i != 0 && candidates[i] == candidates[i-1] && !visited[i-1]){
                continue;
            }
            if(candidates[i] <= target){
                visited[i] = true;
                tempCombinations.add(candidates[i]);
                backTracking(combinations, tempCombinations, i + 1 ,visited, candidates, target - candidates[i]);
                tempCombinations.remove(tempCombinations.size() - 1);
                visited[i] = false;
            }
        }
    }
}
// @lc code=end

