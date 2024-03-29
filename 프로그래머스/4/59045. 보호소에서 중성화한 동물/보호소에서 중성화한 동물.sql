SELECT A.ANIMAL_ID, A.ANIMAL_TYPE, A.NAME
  FROM ANIMAL_INS A
  JOIN ANIMAL_OUTS B
    ON A.ANIMAL_ID = B.ANIMAL_ID
 WHERE INSTR(A.SEX_UPON_INTAKE, 'Intact') > 0
   AND (INSTR(B.SEX_UPON_OUTCOME, 'Spayed') > 0 OR INSTR(B.SEX_UPON_OUTCOME, 'Neutered') > 0)
 ORDER BY ANIMAL_ID;