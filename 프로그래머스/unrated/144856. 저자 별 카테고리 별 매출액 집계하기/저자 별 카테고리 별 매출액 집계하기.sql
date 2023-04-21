SELECT AUTHOR_ID, AUTHOR_NAME, CATEGORY, SUM(SALES * PRICE) AS TOTAL_SALES
  FROM
(
SELECT A.BOOK_ID, CATEGORY, A.AUTHOR_ID, PRICE, SALES, AUTHOR_NAME
  FROM BOOK A
  JOIN 
    (SELECT *
      FROM BOOK_SALES
     WHERE TO_CHAR(SALES_DATE, 'YYYYMM') = '202201') B
    ON A.BOOK_ID = B.BOOK_ID
  JOIN
    (SELECT *
      FROM AUTHOR) C
    ON A.AUTHOR_ID = C.AUTHOR_ID
) GROUP BY AUTHOR_ID, AUTHOR_NAME, CATEGORY
 ORDER BY AUTHOR_ID, CATEGORY DESC;