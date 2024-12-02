SELECT food_type, rest_id, rest_name, favorites
FROM (
    SELECT *, ROW_NUMBER() OVER (PARTITION BY food_type ORDER BY favorites DESC) AS rn
    FROM rest_info
) AS t
WHERE rn=1
ORDER BY 1 DESC;