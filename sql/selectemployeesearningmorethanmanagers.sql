# Write your MySQL query statement below
SELECT name AS Employee FROM Employee AS E WHERE E.salary > (SELECT salary FROM Employee AS E2 WHERE E2.id = E.managerId)