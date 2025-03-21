select  substr(PRODUCT_CODE, 1, 2) "CATEGORY",
        count(PRODUCT_ID) "PRODUCTS"
from PRODUCT 
group by CATEGORY