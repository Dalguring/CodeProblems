SELECT USER_ID, PRODUCT_ID 
  FROM (
        SELECT DISTINCT USER_ID, PRODUCT_ID, COUNT(*) OVER(PARTITION BY USER_ID, PRODUCT_ID 
                                                           ORDER BY USER_ID, PRODUCT_ID DESC) CNT
          FROM ONLINE_SALE
         ORDER BY CNT DESC
  )
 WHERE CNT > 1
 ORDER BY USER_ID, PRODUCT_ID DESC
