#
# @lc app=leetcode id=11 lang=python3
#
# [11] Container With Most Water
#

# @lc code=start
from typing import List


class Solution:

    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height)-1
        maxWater = 0
        while left<right:
            lh = height[left]
            rh = height[right]
            h = min(lh, rh)
            l = right-left
            maxWater = max(h*l, maxWater)

            if (lh < rh):
                left+=1
            else:
                right-=1
        return maxWater
    

        
# @lc code=end

