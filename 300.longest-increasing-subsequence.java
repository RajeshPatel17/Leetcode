/*
 * @lc app=leetcode id=300 lang=java
 *
 * [300] Longest Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        int LISVal = 1;
        int[] LIS = new int[nums.length];
        for(int i = nums.length-1; i>=0; i--){
            LIS[i] = 1;
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    LIS[i] = Math.max(LIS[j]+1,LIS[i]);
                }
            }
        }

        for (int i : LIS) {
            LISVal = Math.max(LISVal, i);
        }
        return LISVal;
    }
}
// @lc code=end

