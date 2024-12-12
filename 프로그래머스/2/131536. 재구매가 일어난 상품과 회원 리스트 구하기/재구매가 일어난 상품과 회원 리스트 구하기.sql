SELECT user_id, product_id
FROM (
    SELECT user_id, product_id, COUNT(*)>1 AS total_count
    FROM online_sale
    GROUP BY 1, 2
) AS t
WHERE total_count
ORDER BY 1 ASC, 2 DESC;