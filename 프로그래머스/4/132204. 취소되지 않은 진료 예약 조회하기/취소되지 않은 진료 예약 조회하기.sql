SELECT APNT_NO, PT_NAME, A.PT_NO, A.MCDP_CD, DR_NAME, APNT_YMD
  FROM APPOINTMENT A
  JOIN DOCTOR B
    ON MDDR_ID = DR_ID
  JOIN PATIENT C
    ON A.PT_NO = C.PT_NO
 WHERE A.MCDP_CD = 'CS'
   AND APNT_CNCL_YN = 'N'
   AND TO_CHAR(APNT_YMD, 'YYYYMMDD') = '20220413'
 ORDER BY APNT_YMD;