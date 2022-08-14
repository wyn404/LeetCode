/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combination = new ArrayList<>();
        List<Integer> tempCombination = new ArrayList<>();
        if(n < k){return combination;}
        backtracking(combination, tempCombination, n, k, 1);
        return combination;
    }
    private void backtracking(List<List<Integer>> combination, List<Integer> tempCombination, int n, int k, int start){
        if(tempCombination.size() == k){
            combination.add(new ArrayList<>(tempCombination));
        }
        for(int i = start; i <= n; i++){
            tempCombination.add(i);
            backtracking(combination, tempCombination, n, k, i+1);
            tempCombination.remove(tempCombination.size()-1);
        }
    }
}
// @lc code=end

