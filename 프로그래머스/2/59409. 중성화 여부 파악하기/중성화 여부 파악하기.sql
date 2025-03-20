select  ANIMAL_ID, 
        NAME,
        case when SEX_UPON_INTAKE REGEXP 'Neutered|Spayed' then 'O'
        else 'X' end as "중성화"
from ANIMAL_INS 
order by ANIMAL_ID