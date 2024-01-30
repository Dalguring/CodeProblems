SELECT CAR_ID, 
       CASE WHEN DIVISION = 1
            THEN '대여중'
            ELSE '대여 가능'
             END AS AVAILABILITY
  FROM (SELECT DISTINCT CAR_ID, MAX(AVAILABILITY) OVER(PARTITION BY CAR_ID) AS DIVISION
          FROM (SELECT 
                    CAR_ID,
                    CASE WHEN TO_DATE('2022-10-16', 'YYYY-MM-DD') BETWEEN START_DATE AND END_DATE
                         THEN 1
                         ELSE 0
                         END AS AVAILABILITY
                 FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY))
 ORDER BY CAR_ID DESC;