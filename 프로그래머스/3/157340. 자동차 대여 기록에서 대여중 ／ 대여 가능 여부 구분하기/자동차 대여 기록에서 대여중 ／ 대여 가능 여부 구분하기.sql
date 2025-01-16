WITH unavailable_car_id_on_specific_day AS (
    SELECT car_id, FALSE AS unavailability
    FROM car_rental_company_rental_history
    WHERE start_date <= '2022-10-16' AND '2022-10-16' <= end_date
    GROUP BY car_id
)
SELECT h.car_id, IF(u.unavailability IS NULL, "대여 가능", "대여중") AS availability
FROM car_rental_company_rental_history AS h
    LEFT JOIN unavailable_car_id_on_specific_day AS u
        ON h.car_id = u.car_id
GROUP BY h.car_id
ORDER BY h.car_id DESC;


# SELECT *
# FROM car_rental_company_rental_history AS h
# ORDER BY h.car_id DESC;