# Write your MySQL query statement below
SELECT ROUND(SUM(tiv_2016),2) as tiv_2016 FROM(
    SELECT tiv_2015, tiv_2016 FROM Insurance GROUP BY lat, lon HAVING COUNT(lat) < 2 AND COUNT(lon) < 2 AND tiv_2015 IN (SELECT tiv_2015 FROM Insurance GROUP BY tiv_2015 HAVING COUNT(tiv_2015)>1))as table1