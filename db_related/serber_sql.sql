CREATE TABLE users(U_ID SERIAL PRIMARY KEY,
                  first_name varchar(255) NOT NULL,
                  last_name varchar(255) NOT NULL,
                  U_email varchar(255) NOT NULL UNIQUE,
                  U_password varchar(255) NOT NULL)

-- Forgot Relation between User and Station
-- "Preferred Stations", need to rework ERD
-- Anyhow, Insert a new table as relation
-- M:N (i.e. Separate Table)
-- Where U_ID + S_ID (User ID, Station ID)
-- are compound keys
