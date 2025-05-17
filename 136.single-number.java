/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length;i++){
            answer ^= nums[i];
        }
        /*HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i : nums) {
            if(map.containsKey(i)) {
                map.put(i, 2);
            } else {
                map.put(i, 1);
            }
        }

        for (Integer i : map.keySet()) {
            if(map.get(i).equals(1)) {
                answer = i;
                return i;
            }
        }*/

        return answer;
    }
}
// @lc code=end

