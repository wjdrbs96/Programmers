SELECT NAME, count(NAME) AS COUNT
FROM ANIMAL_INS
GROUP BY NAME
HAVING count(NAME) >= 2;