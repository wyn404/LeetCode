/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length-1;
        if(n == 0){return;}
        while(m > 0 && n > 0){
            if(nums1[m-1] < nums2[n-1]){
                nums1[len--] = nums2[n-1];
                n--;
            }
            else{
                nums1[len--] = nums1[m-1];
                m--;
            }
        }
        while(n > 0){
            nums1[len--] = nums2[n-1];
            n--;
        }
    }
}
// @lc code=end

