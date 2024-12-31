SELECT a.author_id, a.author_name, b.category, SUM(b.price*bs.sales) AS total_sales
FROM book_sales AS bs
    LEFT JOIN book AS b ON bs.book_id = b.book_id
        LEFT JOIN author AS a ON b.author_id = a.author_id
WHERE YEAR(bs.sales_date) = 2022 AND MONTH(bs.sales_date) = 1
GROUP BY 1, 3
ORDER BY 1 ASC, 3 DESC;