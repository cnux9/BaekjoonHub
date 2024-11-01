SELECT HOUR(datetime) AS hour, COUNT(*) AS "count"
FROM animal_outs
WHERE HOUR(datetime) BETWEEN 9 AND 19
GROUP BY 1
ORDER BY 1;