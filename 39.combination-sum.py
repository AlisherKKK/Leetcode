#
# @lc app=leetcode id=39 lang=python3
#
# [39] Combination Sum
#

# @lc code=start
class Solution:
    r = list()
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        l = list()
        l.append(candidates[0])
        self.recursion(candidates, 0, l, target)
        return self.r
    
    def recursion(self, c, st, l, t):
        for i in range(st, len(c)):
            l.append(c[i])
            sum = 0
            for j in l: 
                sum+=j  # 0 3 0 1 6 8
            if sum==t:
                print(l, sum, t)
                if l not in self.r:
                    self.r.append(l)
                l = list()
                sum = 0
                continue
            if sum<t:
                self.recursion(c,i,l,t)
            else:
                if len(l)>1:
                    l=l[:len(l)-2]
            
# @lc code=end

