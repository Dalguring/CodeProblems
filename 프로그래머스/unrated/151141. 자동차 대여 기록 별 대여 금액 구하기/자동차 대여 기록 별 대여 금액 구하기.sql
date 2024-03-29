SELECT A.HISTORY_ID
      ,B.DAILY_FEE*(A.END_DATE-A.START_DATE+1)
      *NVL(1-DISCOUNT_RATE/100,1)
      AS FEE
  FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY A
       INNER JOIN
       CAR_RENTAL_COMPANY_CAR B
    ON A.CAR_ID = B.CAR_ID
       LEFT OUTER JOIN
       CAR_RENTAL_COMPANY_DISCOUNT_PLAN C
    ON B.CAR_TYPE = C.CAR_TYPE
   AND C.DURATION_TYPE = (CASE WHEN (A.END_DATE-A.START_DATE+1)>='90' THEN '90일 이상'
                               WHEN (A.END_DATE-A.START_DATE+1)>='30' THEN '30일 이상'
                               WHEN (A.END_DATE-A.START_DATE+1)>='7' THEN '7일 이상'
                          ELSE NULL END)
 WHERE 1=1
   AND B.CAR_TYPE = '트럭'
 ORDER BY FEE DESC, A.HISTORY_ID DESC
 ;