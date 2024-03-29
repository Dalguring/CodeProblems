SELECT A.*
  FROM FOOD_PRODUCT A
  JOIN (SELECT PRODUCT_ID, RANK() OVER(ORDER BY PRICE DESC) AS RNK
          FROM FOOD_PRODUCT) B
    ON A.PRODUCT_ID = B.PRODUCT_ID
 WHERE B.RNK = 1;