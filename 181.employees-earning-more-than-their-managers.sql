--
-- @lc app=leetcode id=181 lang=mysql
--
-- [181] Employees Earning More Than Their Managers
--

-- @lc code=start
# Write your MySQL query statement below
select e.Name as Employee from Employee as e, Employee as ee where e.Salary > ee.Salary AND e.ManagerId = ee.Id
-- @lc code=end

