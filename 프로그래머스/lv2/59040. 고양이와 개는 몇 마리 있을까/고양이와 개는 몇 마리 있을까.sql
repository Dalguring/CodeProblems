SELECT DISTINCT ANIMAL_TYPE, COUNT(*) OVER(PARTITION BY ANIMAL_TYPE) AS 'count'
  FROM ANIMAL_INS
 WHERE ANIMAL_TYPE IN ('Cat', 'Dog')
 ORDER BY ANIMAL_TYPE;