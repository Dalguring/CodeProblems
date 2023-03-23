SELECT *
  FROM
(SELECT NAME, DATETIME
  FROM ANIMAL_INS
 WHERE ANIMAL_ID NOT IN (SELECT O.ANIMAL_ID
                           FROM ANIMAL_OUTS O
                           JOIN ANIMAL_INS I
                             ON O.ANIMAL_ID = I.ANIMAL_ID)                           
 ORDER BY DATETIME)
 WHERE ROWNUM <= 3;