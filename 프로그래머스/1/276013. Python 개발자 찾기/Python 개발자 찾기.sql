SELECT ID
     , EMAIL
     , FIRST_NAME
     , LAST_NAME
  FROM DEVELOPER_INFOS A
 WHERE 'Python' IN (SKILL_1, SKILL_2, SKILL_3)
 ORDER BY ID;