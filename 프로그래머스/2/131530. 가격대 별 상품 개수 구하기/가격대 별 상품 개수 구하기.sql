SELECT
    TRUNCATE(price, -4) AS price_group,
    COUNT(*) AS products
FROM product
GROUP BY 1
ORDER BY 1 ASC;