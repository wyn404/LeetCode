import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=131 lang=java
 *
 * [131] 分割回文串
 */

// @lc code=start
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> partitions = new ArrayList<>();
        List<String> tempPartition = new ArrayList<>();
        doPartition(s, partitions, tempPartition);
        return partitions;
    }
    private void doPartition(String s, List<List<String>> partitions, List<String> tempPartition){
        if(s.length() == 0){
            partitions.add(new ArrayList<>(tempPartition));
            return;
        }
        for(int i = 0; i < s.length(); i++){
            if(isPalindrome(s, 0, i)){
                tempPartition.add(s.substring(0, i+1));
                doPartition(s.substring(i+1), partitions, tempPartition);
                tempPartition.remove(tempPartition.size() - 1);
            }
        }
    }
    private boolean isPalindrome(String s, int i, int j){
        while(i < j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

