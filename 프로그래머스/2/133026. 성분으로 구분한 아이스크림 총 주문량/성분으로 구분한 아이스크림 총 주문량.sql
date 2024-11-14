SELECT ii.ingredient_type, SUM(total_order) AS total_order
FROM first_half AS fh LEFT JOIN icecream_info AS ii ON fh.flavor=ii.flavor
GROUP BY 1
ORDER BY 2 ASC;
