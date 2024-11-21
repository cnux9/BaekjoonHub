SELECT ugu.user_id, ugu.nickname, SUM(ugb.price) AS total_sales
FROM used_goods_user AS ugu INNER JOIN used_goods_board AS ugb ON ugu.user_id=ugb.writer_id
WHERE ugb.status="DONE"
GROUP BY 1
HAVING total_sales>=700000
ORDER BY 3 ASC;