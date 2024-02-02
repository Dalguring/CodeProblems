SELECT DISTINCT EXTRACT(HOUR FROM CAST(DATETIME AS TIMESTAMP)) AS HOUR
     , COUNT(*) OVER(PARTITION BY EXTRACT(HOUR FROM CAST(DATETIME AS TIMESTAMP))) AS COUNT
  FROM ANIMAL_OUTS
 WHERE EXTRACT(HOUR FROM CAST(DATETIME AS TIMESTAMP)) BETWEEN 9 AND 19
 ORDER BY HOUR;