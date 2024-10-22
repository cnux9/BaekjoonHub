SELECT warehouse_id, warehouse_name, address, IF(freezer_yn IS NULL, 'N', freezer_yn) AS freezer_yn
FROM food_warehouse
WHERE warehouse_name LIKE '창고_경기%'
ORDER BY warehouse_id ASC;