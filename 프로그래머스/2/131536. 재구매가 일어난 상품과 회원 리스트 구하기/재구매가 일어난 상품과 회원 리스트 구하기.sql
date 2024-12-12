
SELECT user_id, product_id
FROM online_sale
GROUP BY 1, 2
HAVING COUNT(*)>1
ORDER BY 1 ASC, 2 DESC;