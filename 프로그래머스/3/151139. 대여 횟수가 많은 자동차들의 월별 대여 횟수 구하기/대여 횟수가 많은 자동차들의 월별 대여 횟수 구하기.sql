SELECT MONTH(h.start_date) AS "month", h.car_id, COUNT(*) AS records
FROM car_rental_company_rental_history AS h INNER JOIN (
    SELECT car_id
    FROM car_rental_company_rental_history
    WHERE MONTH(start_date) in (8,9,10)
    GROUP BY 1
    HAVING COUNT(*)>=5
) AS c ON h.car_id = c.car_id
WHERE MONTH(start_date) in (8,9,10)
GROUP BY 1, 2
HAVING records>0
ORDER BY 1 ASC, 2 DESC;