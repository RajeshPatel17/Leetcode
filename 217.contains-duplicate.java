import java.util.HashSet;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> answerSet = new HashSet<Integer>();
        for (int num: nums) {
            if(answerSet.contains(num)) {
                return true;
            }
            answerSet.add(num);
        }
        return false;
    }
}
// @lc code=end

