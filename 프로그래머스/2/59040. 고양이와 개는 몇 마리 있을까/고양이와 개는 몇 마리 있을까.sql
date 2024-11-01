SELECT animal_type, COUNT(*) AS "count"
FROM animal_ins
GROUP BY 1
ORDER BY animal_type ASC;