https://school.programmers.co.kr/learn/courses/30/lessons/144856
저자 별 카테고리 별 매출액 집계하기 제출 내역

SELECT
a.AUTHOR_ID,
a.AUTHOR_NAME,
b.CATEGORY,
SUM(bs.SALES * b.PRICE) AS TOTAL_SALES
FROM
AUTHOR a
JOIN
BOOK b ON a.AUTHOR_ID = b.AUTHOR_ID
JOIN
BOOK_SALES bs ON b.BOOK_ID = bs.BOOK_ID
WHERE
bs.SALES_DATE BETWEEN '2022-01-01' AND '2022-01-31'
GROUP BY
a.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY
ORDER BY
a.AUTHOR_ID ASC, b.CATEGORY DESC;