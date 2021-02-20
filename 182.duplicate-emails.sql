--
-- @lc app=leetcode id=182 lang=mysql
--
-- [182] Duplicate Emails
--

-- @lc code=start
# Write your MySQL query statement below
select distinct p1.Email from Person p1, Person p2 where p1.id!=p2.id AND p1.Email=p2.Email 
-- @lc code=end

