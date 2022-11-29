# Write your MySQL query statement below
select e.name as Employee from Employee as e where e.managerId is not NULL and salary > (select salary from Employee where id = e.managerId);