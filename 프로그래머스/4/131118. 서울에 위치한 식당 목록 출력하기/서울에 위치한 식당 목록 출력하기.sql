SELECT i.rest_id, i.rest_name, i.food_type, i.favorites, i.address, ROUND(AVG(r.review_score), 2) AS score
FROM rest_review AS r JOIN rest_info AS i ON i.rest_id = r.rest_id
GROUP BY rest_id
HAVING i.address LIKE '서울%'
ORDER BY score DESC, favorites DESC