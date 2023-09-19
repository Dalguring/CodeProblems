SELECT I.ANIMAL_ID, I.NAME
  FROM ANIMAL_INS I
  JOIN ANIMAL_OUTS O
    ON I.ANIMAL_ID = O.ANIMAL_ID
 ORDER BY TO_NUMBER(TO_CHAR(O.DATETIME, 'YYYYMMDD')) - TO_NUMBER(TO_CHAR(I.DATETIME, 'YYYYMMDD')) DESC
 FETCH NEXT 2 ROWS ONLY;