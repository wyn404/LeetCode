/*
 * @lc app=leetcode.cn id=1122 lang=java
 *
 * [1122] 数组的相对排序
 */

// @lc code=start
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] map = new int[1001];
        for(int i = 0; i < arr1.length; i++){
            map[arr1[i]]++;
        }
        int len = 0;
        for(int i = 0; i < arr2.length; i++){
            int t = map[arr2[i]];
            map[arr2[i]] = 0;
            for(int j = 0; j < t; j++){
                arr1[len++] = arr2[i];
            }
        }
        for(int i = 0; i < map.length; i++){
            if(map[i] != 0){
                for(int j = 0; j < map[i]; j++){
                    arr1[len++] = i;
                }
            }
        }
        return arr1;
    }
}
// @lc code=end

