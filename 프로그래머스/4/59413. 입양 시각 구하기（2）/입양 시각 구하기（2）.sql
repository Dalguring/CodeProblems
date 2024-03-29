SELECT HOUR, COUNT(A.ANIMAL_ID) AS COUNT
  FROM ANIMAL_OUTS A
 RIGHT OUTER JOIN (SELECT LEVEL - 1 AS HOUR
                     FROM DUAL 
                  CONNECT BY LEVEL <= 24) B
    ON EXTRACT(HOUR FROM CAST(A.DATETIME AS TIMESTAMP)) = B.HOUR
 GROUP BY HOUR
 ORDER BY HOUR;