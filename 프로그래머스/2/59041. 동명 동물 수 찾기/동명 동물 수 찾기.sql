select  NAME, count(NAME) as "COUNT"
from ANIMAL_INS
where NAME is not null  
group by NAME
having count(NAME) > 1
order by NAME
;