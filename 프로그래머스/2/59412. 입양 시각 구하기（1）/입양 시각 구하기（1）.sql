select date_format(DATETIME, "%H") as HOUR,
       count(*) as COUNT
from ANIMAL_OUTS 
where TIME(DATETIME) between "09:00" and "19:59"
group by HOUR
order by HOUR