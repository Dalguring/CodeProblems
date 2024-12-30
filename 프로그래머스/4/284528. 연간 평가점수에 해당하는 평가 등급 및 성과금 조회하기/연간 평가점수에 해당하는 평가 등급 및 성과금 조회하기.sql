WITH DT AS (
    SELECT EMP.EMP_NO
         , EMP.EMP_NAME
         , CASE WHEN AVG(SCORE) >= 96
                THEN 'S'
                WHEN AVG(SCORE) >= 90
                THEN 'A'
                WHEN AVG(SCORE) >= 80
                THEN 'B'
                ELSE 'C'
                 END AS GRADE
         , EMP.SAL
      FROM HR_EMPLOYEES EMP
      JOIN HR_GRADE HRG
        ON EMP.EMP_NO = HRG.EMP_NO
     GROUP BY EMP_NO
)
SELECT EMP_NO
     , EMP_NAME
     , GRADE
     , CASE WHEN GRADE = 'S'
            THEN SAL * 0.2
            WHEN GRADE = 'A'
            THEN SAL * 0.15
            WHEN GRADE = 'B'
            THEN SAL * 0.1
            ELSE 0
             END AS BONUS
  FROM DT
 ORDER BY EMP_NO;