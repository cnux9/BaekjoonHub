SELECT car_type, COUNT(*) AS cars
FROM car_rental_company_car
WHERE options LIKE "%통풍시트%" OR options LIKE "%열선시트%" OR options LIKE "%가죽시트%"
GROUP BY 1
ORDER BY 1;