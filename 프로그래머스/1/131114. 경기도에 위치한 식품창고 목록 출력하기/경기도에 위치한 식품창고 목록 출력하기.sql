select  WAREHOUSE_ID, 
        WAREHOUSE_NAME, 
        ADDRESS, 
        coalesce(FREEZER_YN, "N") as "FREEZER_YN"
from FOOD_WAREHOUSE
where ADDRESS like "경기도%"
order by WAREHOUSE_ID