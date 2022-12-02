# Write your MySQL query statement below
select w2.id from Weather w1, Weather w2 where w1.recordDate = date_add(w2.recordDate, Interval -1 day) and w2.temperature > w1.temperature;