SELECT book_id, DATE_FORMAT(published_date, "%Y-%m-%d") AS published_date
FROM book
WHERE category="인문" AND YEAR(published_date)=2021
ORDER BY published_date ASC;