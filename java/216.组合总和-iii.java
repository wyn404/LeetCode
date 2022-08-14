/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> combination = new ArrayList<>();
        List<Integer> tempCombination = new ArrayList<>();
        backtracking(combination, tempCombination, 1, k, n);
        return combination;
    }
    public void backtracking(List<List<Integer>> combination, List<Integer> tempCombinations, int start, int k, int n){
        if(n == 0 && k == 0){
            combination.add(new ArrayList<>(tempCombinations));
        }
        if(n == 0 || k == 0){
            return;
        }
        for (int i = start; i < 10; i++) {
            tempCombinations.add(i);
            backtracking(combination, tempCombinations, i+1, k-1, n-i);
            tempCombinations.remove(tempCombinations.size() - 1);
        }
    }
}
// @lc code=end

