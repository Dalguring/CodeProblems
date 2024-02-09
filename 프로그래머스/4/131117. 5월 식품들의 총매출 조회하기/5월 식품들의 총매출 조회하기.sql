SELECT DISTINCT A.PRODUCT_ID, PRODUCT_NAME, SUM(A.PRICE * B.AMOUNT) OVER(PARTITION BY A.PRODUCT_ID, PRODUCT_NAME) AS TOTAL_SALES
  FROM FOOD_PRODUCT A
  JOIN FOOD_ORDER B
    ON A.PRODUCT_ID = B.PRODUCT_ID
 WHERE EXTRACT(YEAR FROM B.PRODUCE_DATE) = 2022
   AND EXTRACT(MONTH FROM B.PRODUCE_DATE) = 05
 ORDER BY TOTAL_SALES DESC, PRODUCT_ID ASC;