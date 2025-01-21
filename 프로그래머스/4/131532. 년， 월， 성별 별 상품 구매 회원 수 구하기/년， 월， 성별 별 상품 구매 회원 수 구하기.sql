SELECT YEAR(os.sales_date) AS year, MONTH(os.sales_date) AS month, ui.gender, COUNT(DISTINCT os.user_id) users
FROM online_sale AS os INNER JOIN user_info AS ui ON os.user_id = ui.user_id
WHERE ui.gender IS NOT NULL
GROUP BY year, month, gender
ORDER BY year ASC, month ASC, gender ASC