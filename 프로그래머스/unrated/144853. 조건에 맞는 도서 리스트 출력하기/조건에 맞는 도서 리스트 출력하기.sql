SELECT BOOK_ID, TO_CHAR(PUBLISHED_DATE, 'YYYY-MM-DD') PUBLISEHD_DATE
  FROM BOOK
 WHERE EXTRACT(YEAR FROM PUBLISHED_DATE) = 2021
   AND CATEGORY = '인문'
 ORDER BY PUBLISHED_DATE;