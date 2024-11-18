SELECT ROUND(AVG(DAILY_FEE), 0) AS average_fee
FROM car_rental_company_car
WHERE car_type="SUV";