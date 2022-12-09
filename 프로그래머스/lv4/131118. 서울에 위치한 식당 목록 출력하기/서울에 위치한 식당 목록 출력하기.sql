SELECT A.REST_ID, REST_NAME, FOOD_TYPE, FAVORITES, ADDRESS, ROUND(B.SCORE, 2) SCORE
  FROM (
        SELECT r.REST_ID, REST_NAME, FOOD_TYPE, FAVORITES, ADDRESS
        FROM REST_INFO i
        JOIN REST_REVIEW r ON r.REST_ID = i.REST_ID
        WHERE ADDRESS LIKE '서울%'
        GROUP BY r.REST_ID
        ORDER BY FAVORITES DESC
      ) A
  JOIN (SELECT AVG(REVIEW_SCORE) SCORE, REST_ID  FROM REST_REVIEW GROUP BY REST_ID) B
  ON A.REST_ID = B.REST_ID
  ORDER BY SCORE DESC, FAVORITES DESC;