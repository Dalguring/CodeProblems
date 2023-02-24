SELECT CAR_TYPE, COUNT(CAR_TYPE) CNT
          FROM CAR_RENTAL_COMPANY_CAR
         WHERE (OPTIONS LIKE '%가죽시트%' OR
               OPTIONS LIKE '%열선시트%' OR
               OPTIONS LIKE '%통풍시트%')
         GROUP BY CAR_TYPE
         ORDER BY CAR_TYPE;