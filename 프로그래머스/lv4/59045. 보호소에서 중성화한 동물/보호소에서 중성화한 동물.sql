SELECT I.ANIMAL_ID, I.ANIMAL_TYPE, I.NAME
  FROM ANIMAL_INS I
  JOIN ANIMAL_OUTS O
    ON I.ANIMAL_ID = O.ANIMAL_ID
 WHERE I.SEX_UPON_INTAKE != O.SEX_UPON_OUTCOME
 ORDER BY I.ANIMAL_ID