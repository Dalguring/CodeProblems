SELECT HISTORY_ID
      , A.DAILY_FEE * (END_DATE - START_DATE + 1) 
                    * (1 - NVL((SELECT DISCOUNT_RATE
                                  FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                                 WHERE DURATION_TYPE = CASE WHEN END_DATE - START_DATE + 1 >= 90
                                                            THEN '90일 이상'
                                                            WHEN END_DATE - START_DATE + 1 >= 30
                                                            THEN '30일 이상'
                                                            WHEN END_DATE - START_DATE + 1 >= 7
                                                            THEN '7일 이상'
                                                            ELSE NULL
                                                             END
                                   AND CAR_TYPE = '트럭'), 0) / 100) AS FEE
  FROM CAR_RENTAL_COMPANY_CAR A
  JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY B
    ON A.CAR_ID = B.CAR_ID
 WHERE A.CAR_TYPE = '트럭'
 ORDER BY FEE DESC, HISTORY_ID DESC;