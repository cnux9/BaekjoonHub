SELECT book.category AS category, SUM(book_sales.sales) AS total_sales
FROM book LEFT JOIN book_sales ON book.book_id = book_sales.book_id
WHERE YEAR(sales_date)="2022" AND MONTH(sales_date)="1"
GROUP BY book.category
ORDER BY book.category ASC;