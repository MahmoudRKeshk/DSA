/* Write your T-SQL query statement below */
SELECT P.PRODUCT_NAME as product_name , S.YEAR as year, S.PRICE as price
FROM PRODUCT P INNER JOIN SALES S 
ON S.PRODUCT_ID = P.PRODUCT_ID 
