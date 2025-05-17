#
# @lc app=leetcode id=21 lang=python3
#
# [21] Merge Two Sorted Lists
#

# @lc code=start
# Definition for singly-linked list.
from typing import Optional


class ListNode:
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        head = list1
        while(list1 is not None and list2 is not None):
            if(list2.val<=list1.val):
                temp = list1.next
                temp2 = list2.next
                list1.next = list2
                list2.next = temp
                list2 = temp2
            else:
                list1 = list1.next
                
        return head
    
Solution.mergeTwoLists(None,[1,2,4],[1,3,4])

# @lc code=end

