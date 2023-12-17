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
                  );

-- Table for Stations
-- S_ID    => Station ID in fashion of: 3xx denotes taking both lines 1 and 2,
--                                      2xx denotes taking Line 2 Only,
--                                      1xx denotes taking Line 1 Only.
-- name_ar => Station's name in Arabic
-- name_en => Station's name in English
-- tram_lines (DEPRICATE FROM ERD) => Would've denoted which lines are allowed
-- geo_loc => Geographical Location (Latitude, Longitude)

-- Comment regarding the "GEOGRAPHY" data type
-- https://stackoverflow.com/questions/30322924/how-to-store-longitude-latitude-as-a-geography-in-sql-server-2014
-- Double check for later purposes
CREATE TABLE stations(S_ID SERIAL PRIMARY KEY,
                      name_ar varchar(255) NOT NULL,
                      name_en varchar(255) NOT NULL,
                      -- Debating whether or not to denote
                      -- Tram lines as 1, 2, or 3
                      -- instead of multiple values
                      location GEOGRAPHY
                      );

-- Forgot Relation between User and Station
-- "Preferred Stations", need to rework ERD
-- Anyhow, Insert a new table as relation
-- M:N (i.e. Separate Table)
-- Where U_ID + S_ID (User ID, Station ID)
-- are compound keys

CREATE TABLE prefers(pref_UID SERIAL,
                     pref_SID SERIAL,
                     CONSTRAINT fk1 FOREIGN KEY (pref_UID) REFERENCES users(U_ID),
                     CONSTRAINT fk2 FOREIGN KEY (pref_SID) REFERENCES stations(S_ID),
                     CONSTRAINT pk1 PRIMARY KEY (pref_UID, pref_SID)
                     );

-- Ought to create table for "Arrival"
-- Except I dond see how it'd be implemented properly
-- but do take a look at whatever the mcfuck i write below

-- Documenting the Table
-- time_of_day => Time object, nanosecond accuracy, y'all handle it idk
-- week_day    => varchar as {Mon, Tue, Wed}, Could probs just encode with 0 -> 6
-- tram_line   => int ranging 1 -> 4
-- direction => Boolean, 1 full, 0 not as full
CREATE TABLE arrival(time_of_day TIME,
                     week_day INTEGER,
                     tram_line INTEGER,
                     direction BOOLEAN
                     CONSTRAINT ck PRIMARY KEY (week_day,tram_line)
                     CONSTRAINT in_week CHECK (week_day >= 0 AND week_day <= 6)
                     CONSTRAINT valid_line CHECK (tram_line >= 1 AND tram_line <= 4)
                     );
