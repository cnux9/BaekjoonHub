SELECT  order_id, product_id,
        DATE_FORMAT(out_date, "%Y-%m-%d"),
        IF(out_date IS NULL, 
            "출고미정", 
            IF(DATEDIFF(out_date, "2022-05-01")>0,
                "출고대기",
                "출고완료"))
        AS "출고여부"
FROM food_order
ORDER BY 1 ASC;