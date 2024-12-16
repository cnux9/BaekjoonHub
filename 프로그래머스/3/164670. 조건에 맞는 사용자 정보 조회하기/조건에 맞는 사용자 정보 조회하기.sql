SELECT u.user_id, u.nickname,
    CONCAT(u.city, " ", u.street_address1, " ", u.street_address2) AS "전체주소",
    CONCAT(
        SUBSTRING(u.tlno, 1, 3),
        "-",
        SUBSTRING(u.tlno, 4, 4),
        "-",
        SUBSTRING(u.tlno, 8)        
    ) AS "전화번호"
FROM used_goods_board AS b LEFT JOIN used_goods_user AS u ON b.writer_id = u.user_id
GROUP BY 1
HAVING COUNT(*)>=3
ORDER BY 1 DESC;