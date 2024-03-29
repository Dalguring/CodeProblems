SELECT DISTINCT CATEGORY, SUM(SALES) OVER(PARTITION BY CATEGORY) AS TOTAL_SALES
  FROM BOOK A
  JOIN BOOK_SALES B
    ON A.BOOK_ID = B.BOOK_ID
 WHERE EXTRACT(YEAR FROM SALES_DATE) = 2022
   AND EXTRACT(MONTH FROM SALES_DATE) = 1
 ORDER BY CATEGORY;