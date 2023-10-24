-- Table for Users
-- U_ID       => User ID, Primary Key
-- first_name => User's First Name
-- last_name  => User's Last Name
-- U_email    => User's Registered Email
-- U_password => User's Password
CREATE TABLE users(U_ID SERIAL PRIMARY KEY,
                  first_name varchar(255) NOT NULL,
                  last_name varchar(255) NOT NULL,
                  U_email varchar(255) NOT NULL UNIQUE,
                  U_password varchar(255) NOT NULL
                  )

-- Forgot Relation between User and Station
-- "Preferred Stations", need to rework ERD
-- Anyhow, Insert a new table as relation
-- M:N (i.e. Separate Table)
-- Where U_ID + S_ID (User ID, Station ID)
-- are compound keys

-- Table for Stations
-- S_IT    => Station ID in fashion of: 3xx denotes taking both lines 1 and 2,
--                                      2xx denotes taking Line 2 Only,
--                                      1xx denotes taking Line 1 Only.
-- name_ar => Station's name in Arabic
-- name_en => Station's name in English
-- tram_lines (DEPRICATE FROM ERD) => Would've denoted which lines are allowed
-- geo_loc => Geographical Location (Latitude, Longitude)

-- Comment regarding the "GEOGRAPHY" data type
-- https://stackoverflow.com/questions/30322924/how-to-store-longitude-latitude-as-a-geography-in-sql-server-2014
-- Double check for later purposes
-- linly pls no murder
CREATE TABLE stations(S_ID SERIAL PRIMARY KEY,
                      name_ar varchar(255) NOT NULL,
                      name_en varchar(255) NOT NULL,
                      -- Debating whether or not to denote
                      -- Tram lines as 1, 2, or 3
                      -- instead of multiple values
                      geo_loc GEOGRAPHY
                      )
