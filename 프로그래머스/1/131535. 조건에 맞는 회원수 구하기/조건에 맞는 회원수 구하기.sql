select count(USER_ID) as "USERS"
from USER_INFO
where AGE between 20 and 29 
and year(JOINED) = '2021'