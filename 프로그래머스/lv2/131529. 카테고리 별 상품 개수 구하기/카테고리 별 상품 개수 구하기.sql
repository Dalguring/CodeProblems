SELECT SUBSTR(PRODUCT_CODE, 1, 2) AS CATEGORY, COUNT(*) AS PRODUCTS
  FROM PRODUCT
 GROUP BY SUBSTR(PRODUCT_CODE, 1, 2)
 ORDER BY CATEGORY;