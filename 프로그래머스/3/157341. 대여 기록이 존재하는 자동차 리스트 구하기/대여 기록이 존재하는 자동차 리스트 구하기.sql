SELECT i.car_id
FROM car_rental_company_rental_history AS h LEFT JOIN car_rental_company_car AS i ON i.car_id=h.car_id
WHERE MONTH(h.start_date)=10 AND i.car_type="세단"
GROUP BY i.car_id
ORDER BY i.car_id DESC;