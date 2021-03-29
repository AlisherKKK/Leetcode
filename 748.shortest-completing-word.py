#
# @lc app=leetcode id=748 lang=python3
#
# [748] Shortest Completing Word
#

# @lc code=start
class Solution:
    def shortestCompletingWord(self, licensePlate: str, words: List[str]) -> str:
        lets = ''
        for i in licensePlate:
            if i.isalpha():
                lets+=i
        lets = lets.lower()
        ans = ''
        c = 0
        for i in words:
            count = 0
            ls = []
            ind = 0
            lss = lets
            for j in range(len(i)):
                if i[j] in lss and j not in ls:
                    count+=1
                    ls.append(j)
                    fi = lss.find(i[j])
                    if fi != len(lss)-1:
                        lss = lss[0:fi]+lss[fi+1:]
                    else:
                        lss = lss[0:fi]

            if count > c:
                ans = i
                c = count
            elif count == c and len(ans) > len(i):
                ans = i
                c=count
        return ans
# @lc code=end

