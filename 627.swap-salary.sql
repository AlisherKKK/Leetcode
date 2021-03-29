--
-- @lc app=leetcode id=627 lang=mysql
--
-- [627] Swap Salary
--

-- @lc code=start
# Write your MySQL query statement below
update Salary set sex = case sex when 'f' then 'm' else 'f' end 
-- @lc code=end

