#
# @lc app=leetcode id=414 lang=python3
#
# [414] Third Maximum Number
#

# @lc code=start
class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        a = []
        nums = self.rem_dup(nums)
        if len(nums)<3:
            return max(nums)
        while True:
            ma = (-2)**(31)
            for j in nums:
                if j>ma and j not in a:
                    ma = j
            if len(a)==2:
                return ma
            a.append(ma)
        return a[0]
    
    def rem_dup(self, nums):
        a = []
        for i in nums:
            if i not in a:
                a.append(i)
        return a
            
# @lc code=end

