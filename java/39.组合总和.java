/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> tempCombinations = new ArrayList<>();
        backTraking(combinations, tempCombinations, 0, candidates, target);
        return combinations;
    }

    private void backTraking(List<List<Integer>> combinations, List<Integer> tempCombinations, int start, int[] candidates, int target){
        if(target == 0){
            combinations.add(new ArrayList<>(tempCombinations));
        }
        for (int i = start; i < candidates.length; i++) {
            if(candidates[i] <= target){
                tempCombinations.add(candidates[i]);
                backTraking(combinations, tempCombinations, i, candidates, target - candidates[i]);
                tempCombinations.remove(tempCombinations.size() - 1);
            }
        }
    }
}
// @lc code=end

