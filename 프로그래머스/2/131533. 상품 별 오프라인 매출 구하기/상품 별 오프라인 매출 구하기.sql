SELECT p.product_code AS product_code, SUM(os.sales_amount*p.price) AS sales 
FROM product AS p LEFT JOIN offline_sale AS os ON p.product_id = os.product_id
GROUP BY p.product_id
ORDER BY 2 DESC, 1 ASC;