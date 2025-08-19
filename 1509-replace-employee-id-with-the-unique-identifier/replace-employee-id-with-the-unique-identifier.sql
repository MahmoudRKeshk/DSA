/* Write your T-SQL query statement below */
SELECT EU.UNIQUE_ID as unique_id , E.NAME as name
FROM EMPLOYEEUNI EU RIGHT OUTER JOIN EMPLOYEES E 
ON EU.ID = E.ID