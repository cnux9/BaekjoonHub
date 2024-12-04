# SELECT fp.product_id, fp.product_name, COUNT(*)*fp.price AS total_sales
# FROM food_order AS fo LEFT JOIN food_product AS fp ON fo.product_id=fp.product_id
# WHERE YEAR(fo.produce_date)=2022 AND MONTH(fo.produce_date)=5
# GROUP BY 1
# ORDER BY 3 DESC, 1 ASC;

SELECT fp.product_id, fp.product_name, fo.count*fp.price AS total_sales
FROM (
    SELECT product_id, SUM(amount) AS count
    FROM food_order
    WHERE YEAR(produce_date)=2022 AND MONTH(produce_date)=5
    GROUP BY 1
) AS fo
INNER JOIN food_product AS fp ON fo.product_id=fp.product_id
ORDER BY 3 DESC, 1 ASC;

# SELECT *
# FROM food_product