CREATE DATABASE IF NOT EXISTS country_data;
USE country_data;

-- SHOW VARIABLES LIKE "local_infile";
-- SET GLOBAL local_infile = 1;

 
-- SECURITY --

DROP TABLE IF EXISTS DOMESTIC_CREDS;
DROP TABLE IF EXISTS EST_GNI_F;
DROP TABLE IF EXISTS EST_GNI_M;
DROP TABLE IF EXISTS GNI_PER_CAPITA;
DROP TABLE IF EXISTS GDP_PER_CAPITA;
DROP TABLE IF EXISTS TOTAL_GDP;
DROP TABLE IF EXISTS GFCF;
DROP TABLE IF EXISTS LSHGDP;
DROP TABLE IF EXISTS INCOME_INDEX;
DROP TABLE IF EXISTS MORTALITY_LIFE_EXPECTANCY;
DROP TABLE IF EXISTS MIDYEAR_POP_5YR;
DROP TABLE IF EXISTS MIDYEAR_POPULATION_AGE_SEX;
DROP TABLE IF EXISTS MIDYEAR_POPULATION;
DROP TABLE IF EXISTS BIRTH_DEATH_GROWTH_RATES;
DROP TABLE IF EXISTS AGE_SPECIFIC_FERTILITY_RATES;
DROP TABLE IF EXISTS COUNTRY;


-- TABLE COUNTRY --
-- countries.csv and country_names_area.csv --
CREATE TABLE COUNTRY (
	ISO VARCHAR(2),
	ISO3 VARCHAR(3),
    COUNTRY_ID INTEGER UNIQUE NOT NULL,
	FIPS VARCHAR(2),
	DISPLAY_NAME VARCHAR(50),
	-- OFFICIAL_NAME VARCHAR(20),	
	CAPITAL VARCHAR(40),
	CONTINENT VARCHAR(40),
	CURRENCY_CODE VARCHAR(40),
	CURRENCY_NAME VARCHAR(40),
	PHONE INTEGER,
	REGION_CODE INTEGER,
	REGION_NAME VARCHAR(40),
	SUBREGION_CODE INTEGER,
	SUBREGION_NAME VARCHAR(40),
	INTERMEDIATE_REGION_CODE INTEGER,
	INTERMEDIATE_REGION_NAME VARCHAR(40),
	C_STATUS VARCHAR(40),
	DEVELOPMENT VARCHAR(40),
	SIDS VARCHAR(4),	-- SMALL ISLAND DEVELOPING STATES
	LLDC VARCHAR(4),	-- LAND LOCKED DEVELOPING COUNTRIES
	LDC VARCHAR(4),	-- LEAST DEVELOPED COUNTRIES
	AREA_SQKM INTEGER,
	POPULATION INTEGER,
    COUNTRY_AREA VARCHAR(20),
	PRIMARY KEY(COUNTRY_ID)
)ENGINE=InnoDB;

-- TABLE AGE_SPECIFIC_FERTILITY_RATES --
CREATE TABLE AGE_SPECIFIC_FERTILITY_RATES (
	FR_COUNTRY_CODE VARCHAR(2),
    COUNTRY_NAME VARCHAR(40),
    FR_YEAR INTEGER NOT NULL,
    FERTILITY_RATE_15_19 FLOAT(8),
	FERTILITY_RATE_20_24 FLOAT(8),
	FERTILITY_RATE_25_29 FLOAT(8),
	FERTILITY_RATE_30_34 FLOAT(8),
	FERTILITY_RATE_35_39 FLOAT(8),
	FERTILITY_RATE_40_44 FLOAT(8),
	FERTILITY_RATE_45_49 FLOAT(8),
	TOTAL_FERTILITY_RATE FLOAT(16),
	GROSS_REPRODUCTION_RATE FLOAT(8),
	SEX_RATIO_AT_BIRTH FLOAT(8),
    FR_COUNTRY_ID INTEGER NOT NULL,
    FOREIGN KEY (FR_COUNTRY_ID) REFERENCES COUNTRY(COUNTRY_ID),
	PRIMARY KEY(FR_COUNTRY_ID, FR_YEAR)
)ENGINE=InnoDB;

-- TABLE BIRTH_DEATH_GROWTH_RATES --
CREATE TABLE BIRTH_DEATH_GROWTH_RATES(
	BD_COUNTRY_CODE VARCHAR(2),
	COUNTRY_NAME VARCHAR(40),
    BD_YEAR INTEGER NOT NULL,
	CRUDE_BIRTH_RATE FLOAT(8),
	CRUDE_DEATH_RATE FLOAT(8),
	NET_MIGRATION FLOAT(8),
	NET_NATURAL_INCREASE FLOAT(16),
	GROWTH_RATE FLOAT(16),
    BD_COUNTRY_ID INTEGER NOT NULL,
    FOREIGN KEY (BD_COUNTRY_ID) REFERENCES COUNTRY(COUNTRY_ID),
	PRIMARY KEY(BD_COUNTRY_ID, BD_YEAR)
)ENGINE=InnoDB;

-- TABLE MIDYEAR_POPULATION --
CREATE TABLE MIDYEAR_POPULATION(
	COUNTRY_CODE VARCHAR(2),
	COUNTRY_NAME VARCHAR(40),
    P_YEAR INTEGER NOT NULL,
	MIDYEAR_POPULATION_ INTEGER,
    P_COUNTRY_ID INTEGER NOT NULL,
    FOREIGN KEY (P_COUNTRY_ID) REFERENCES COUNTRY(COUNTRY_ID),
	PRIMARY KEY(P_COUNTRY_ID, P_YEAR)
)ENGINE=InnoDB;

-- TABLE MIDYEAR_POPULATION_AGE_SEX --
CREATE TABLE MIDYEAR_POPULATION_AGE_SEX(
	COUNTRY_CODE VARCHAR(10),
	COUNTRY_NAME VARCHAR(40),
    PAS_YEAR INTEGER NOT NULL,
	SEX VARCHAR(10),
	MAX_AGE INTEGER,
	POPULATION_AGE_0 INTEGER,
	POPULATION_AGE_1 INTEGER,
	POPULATION_AGE_2 INTEGER,
	POPULATION_AGE_3 INTEGER,
	POPULATION_AGE_4 INTEGER,
	POPULATION_AGE_5 INTEGER,
	POPULATION_AGE_6 INTEGER,
	POPULATION_AGE_7 INTEGER,
	POPULATION_AGE_8 INTEGER,
	POPULATION_AGE_9 INTEGER,
	POPULATION_AGE_10 INTEGER,
	POPULATION_AGE_11 INTEGER,
	POPULATION_AGE_12 INTEGER,
	POPULATION_AGE_13 INTEGER,
	POPULATION_AGE_14 INTEGER,
	POPULATION_AGE_15 INTEGER,
	POPULATION_AGE_16 INTEGER,
	POPULATION_AGE_17 INTEGER,
	POPULATION_AGE_18 INTEGER,
	POPULATION_AGE_19 INTEGER,
	POPULATION_AGE_20 INTEGER,
	POPULATION_AGE_21 INTEGER,
	POPULATION_AGE_22 INTEGER,
	POPULATION_AGE_23 INTEGER,
	POPULATION_AGE_24 INTEGER,
	POPULATION_AGE_25 INTEGER,
	POPULATION_AGE_26 INTEGER,
	POPULATION_AGE_27 INTEGER,
	POPULATION_AGE_28 INTEGER,
	POPULATION_AGE_29 INTEGER,
	POPULATION_AGE_30 INTEGER,
	POPULATION_AGE_31 INTEGER,
	POPULATION_AGE_32 INTEGER,
	POPULATION_AGE_33 INTEGER,
	POPULATION_AGE_34 INTEGER,
	POPULATION_AGE_35 INTEGER,
	POPULATION_AGE_36 INTEGER,
	POPULATION_AGE_37 INTEGER,
	POPULATION_AGE_38 INTEGER,
	POPULATION_AGE_39 INTEGER,
	POPULATION_AGE_40 INTEGER,
	POPULATION_AGE_41 INTEGER,
	POPULATION_AGE_42 INTEGER,
	POPULATION_AGE_43 INTEGER,
	POPULATION_AGE_44 INTEGER,
	POPULATION_AGE_45 INTEGER,
	POPULATION_AGE_46 INTEGER,
	POPULATION_AGE_47 INTEGER,
	POPULATION_AGE_48 INTEGER,
	POPULATION_AGE_49 INTEGER,
	POPULATION_AGE_50 INTEGER,
	POPULATION_AGE_51 INTEGER,
	POPULATION_AGE_52 INTEGER,
	POPULATION_AGE_53 INTEGER,
	POPULATION_AGE_54 INTEGER,
	POPULATION_AGE_55 INTEGER,
	POPULATION_AGE_56 INTEGER,
	POPULATION_AGE_57 INTEGER,
	POPULATION_AGE_58 INTEGER,
	POPULATION_AGE_59 INTEGER,
	POPULATION_AGE_60 INTEGER,
	POPULATION_AGE_61 INTEGER,
	POPULATION_AGE_62 INTEGER,
	POPULATION_AGE_63 INTEGER,
	POPULATION_AGE_64 INTEGER,
	POPULATION_AGE_65 INTEGER,
	POPULATION_AGE_66 INTEGER,
	POPULATION_AGE_67 INTEGER,
	POPULATION_AGE_68 INTEGER,
	POPULATION_AGE_69 INTEGER,
	POPULATION_AGE_70 INTEGER,
	POPULATION_AGE_71 INTEGER,
	POPULATION_AGE_72 INTEGER,
	POPULATION_AGE_73 INTEGER,
	POPULATION_AGE_74 INTEGER,
	POPULATION_AGE_75 INTEGER,
	POPULATION_AGE_76 INTEGER,
	POPULATION_AGE_77 INTEGER,
	POPULATION_AGE_78 INTEGER,
	POPULATION_AGE_79 INTEGER,
	POPULATION_AGE_80 INTEGER,
	POPULATION_AGE_81 INTEGER,
	POPULATION_AGE_82 INTEGER,
	POPULATION_AGE_83 INTEGER,
	POPULATION_AGE_84 INTEGER,
	POPULATION_AGE_85 INTEGER,
	POPULATION_AGE_86 INTEGER,
	POPULATION_AGE_87 INTEGER,
	POPULATION_AGE_88 INTEGER,
	POPULATION_AGE_89 INTEGER,
	POPULATION_AGE_90 INTEGER,
	POPULATION_AGE_91 INTEGER,
	POPULATION_AGE_92 INTEGER,
	POPULATION_AGE_93 INTEGER,
	POPULATION_AGE_94 INTEGER,
	POPULATION_AGE_95 INTEGER,
	POPULATION_AGE_96 INTEGER,
	POPULATION_AGE_97 INTEGER,
	POPULATION_AGE_98 INTEGER,
	POPULATION_AGE_99 INTEGER,
	POPULATION_AGE_100 INTEGER,
    PAS_COUNTRY_ID INTEGER NOT NULL,
    FOREIGN KEY (PAS_COUNTRY_ID) REFERENCES COUNTRY(COUNTRY_ID),
	PRIMARY KEY(PAS_COUNTRY_ID, PAS_YEAR, SEX)
)ENGINE=InnoDB;

-- TABLE MIDYEAR_POPULATION_5YR_AGE_SEX --
CREATE TABLE MIDYEAR_POP_5YR(
	COUNTRY_CODE VARCHAR(10),
    COUNTRY_NAME VARCHAR(40),
    P5YR_YEAR INTEGER NOT NULL,
    TOTAL_FLAG VARCHAR(1),
    STARTING_AGE INTEGER,
    AGE_GROUP_INDICATOR VARCHAR(1),
    ENDING_AGE INTEGER,
    MIDYEAR_POP INTEGER,
    MIDYEAR_POP_M INT,
    MIDYEAR_POP_F INT,
    P5YR_COUNTRY_ID INTEGER NOT NULL,
    FOREIGN KEY(P5YR_COUNTRY_ID) REFERENCES COUNTRY(COUNTRY_ID),
    PRIMARY KEY(P5YR_COUNTRY_ID, P5YR_YEAR, STARTING_AGE, AGE_GROUP_INDICATOR)
)ENGINE=InnoDB;

-- TABLE MORTALITY_LIFE_EXPECTANCY --
CREATE TABLE MORTALITY_LIFE_EXPECTANCY(
    COUNTRY_CODE VARCHAR(10),
	COUNTRY_NAME VARCHAR(40),
    M_YEAR INTEGER NOT NULL,
	INFANT_MORTALITY FLOAT(2),
	INFANT_MORTALITY_MALE FLOAT(2),
	INFANT_MORTALITY_FEMALE FLOAT(2),
	LIFE_EXPECTANCY FLOAT(2),
	LIFE_EXPECTANCY_MALE FLOAT(2),
	LIFE_EXPECTANCY_FEMALE FLOAT(2),
	MORTALITY_RATE_UNDER_5 FLOAT(2),
	MORTALITY_RATE_UNDER_5_MALE FLOAT(2),
	MORTALITY_RATE_UNDER_5_FEMALE FLOAT(2),
	MORTALITY_RATE_1TO4 FLOAT(2),
	MORTALITY_RATE_1TO4_MALE FLOAT(2),
	MORTALITY_RATE_1TO4_FEMALE FLOAT(2),
    M_COUNTRY_ID INTEGER NOT NULL,
	FOREIGN KEY (M_COUNTRY_ID) REFERENCES COUNTRY(COUNTRY_ID),
	PRIMARY KEY(M_COUNTRY_ID, M_YEAR)
)ENGINE=InnoDB;


-- TABLES FOR INCOME_BY_COUNTRY --
-- Income_by_country.csv --

CREATE TABLE INCOME_INDEX(
	COYNTRY_NAME VARCHAR(40),
	I_YEAR INTEGER NOT NULL,
	INCOME_INDEX_ FLOAT(3),
    I_COUNTRY_ID INTEGER NOT NULL,
    FOREIGN KEY(I_COUNTRY_ID) REFERENCES COUNTRY(COUNTRY_ID),
	PRIMARY KEY(I_COUNTRY_ID, I_YEAR)
)ENGINE=InnoDB;

CREATE TABLE LSHGDP(
	COYNTRY_NAME VARCHAR(40),
	L_YEAR INTEGER NOT NULL,
	LABOUR_SHARE_OF_GDP FLOAT(1),
    L_COUNTRY_ID INTEGER NOT NULL,
	FOREIGN KEY(L_COUNTRY_ID) REFERENCES COUNTRY(COUNTRY_ID),
	PRIMARY KEY(L_COUNTRY_ID, L_YEAR)
)ENGINE=InnoDB;

CREATE TABLE GFCF(
	COUNTRY_NAME VARCHAR(40),
	GFCF_YEAR INTEGER NOT NULL,
	GROSS_FIXED_CAPITAL_FORMATION FLOAT(3),	-- 5 YEAR MEASUREMENTS --  -----> OK! ENTRY FOR EVERY YEAR
    GFCF_COUNTRY_ID INTEGER NOT NULL,
	FOREIGN KEY(GFCF_COUNTRY_ID) REFERENCES COUNTRY(COUNTRY_ID),
	PRIMARY KEY(GFCF_COUNTRY_ID, GFCF_YEAR)
)ENGINE=InnoDB;

CREATE TABLE TOTAL_GDP(
	COUNTRY_NAME VARCHAR(40),
	GDP_YEAR INTEGER NOT NULL,
	GDP_TOTAL FLOAT(1),
    GDP_COUNTRY_ID INTEGER NOT NULL,
	FOREIGN KEY(GDP_COUNTRY_ID) REFERENCES COUNTRY(COUNTRY_ID),
	PRIMARY KEY(GDP_COUNTRY_ID, GDP_YEAR)
)ENGINE=InnoDB;

CREATE TABLE GDP_PER_CAPITA(
	COUNTRY_NAME VARCHAR(40),
	GDPC_YEAR INTEGER NOT NULL,
	GDP_PER_CAPITA_ INTEGER,
    GDPC_COUNTRY_ID INTEGER NOT NULL,
	FOREIGN KEY(GDPC_COUNTRY_ID) REFERENCES COUNTRY(COUNTRY_ID),
	PRIMARY KEY(GDPC_COUNTRY_ID, GDPC_YEAR)
)ENGINE=InnoDB;

CREATE TABLE GNI_PER_CAPITA(
	COUNTRY_NAME VARCHAR(40),
	GNI_YEAR INTEGER NOT NULL,
	GNI_PER_CAPITA_ INTEGER,
    GNI_COUNTRY_ID INTEGER NOT NULL,
	FOREIGN KEY(GNI_COUNTRY_ID) REFERENCES COUNTRY(COUNTRY_ID),
	PRIMARY KEY(GNI_COUNTRY_ID, GNI_YEAR)
)ENGINE=InnoDB;

CREATE TABLE EST_GNI_M(
	COUNTRY_NAME VARCHAR(40),
	GNIM_YEAR INTEGER NOT NULL,
	ESTIMATED_GNI_MALE INTEGER,	-- 5 YEAR IN SOME CASES --	-----> OK! ENTRY FOR EVERY YEAR
    GNIM_COUNTRY_ID INTEGER NOT NULL,
	FOREIGN KEY(GNIM_COUNTRY_ID) REFERENCES COUNTRY(COUNTRY_ID),
	PRIMARY KEY(GNIM_COUNTRY_ID, GNIM_YEAR)
)ENGINE=InnoDB;

CREATE TABLE EST_GNI_F(
	COUNTRY_NAME VARCHAR(40),
	GNIF_YEAR INTEGER NOT NULL,
	ESTIMATED_GNI_FEMALE INTEGER,	-- 5 YEAR IN SOME CASES --	-----> OK! ENTRY FOR EVERY YEAR
    GNIF_COUNTRY_ID INTEGER NOT NULL,
	FOREIGN KEY(GNIF_COUNTRY_ID) REFERENCES COUNTRY(COUNTRY_ID),
	PRIMARY KEY(GNIF_COUNTRY_ID, GNIF_YEAR)
)ENGINE=InnoDB;

CREATE TABLE DOMESTIC_CREDS(
	COUNTRY_NAME VARCHAR(40),
	DC_YEAR INTEGER NOT NULL,
	DOMESTIC_CREDITS FLOAT(3), -- 5 YEAR MEASUREMENTS --	-----> OK! ENTRY FOR EVERY YEAR
    DC_COUNTRY_ID INTEGER NOT NULL,
	FOREIGN KEY(DC_COUNTRY_ID) REFERENCES COUNTRY(COUNTRY_ID),
	PRIMARY KEY(DC_COUNTRY_ID, DC_YEAR)
)ENGINE=InnoDB;


-- --------------------- LOAD DATA ---------------------- --
 
-- DEN TREXEI ----> LOAD DATA INFILE "C:/Users/Thomai/Desktop/UOI/ΠΘΤΕΒΔ/Project/WorldCountriesDatabaseInteractiveVisualization-main/WorldCountriesDatabaseInteractiveVisualization-main/Data/Sorting_Outputs/countries_output.csv"
LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/countries_output.csv"
INTO TABLE COUNTRY
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

-- SELECT * FROM COUNTRY;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/age_specific_fertility_rates_output.csv"
INTO TABLE AGE_SPECIFIC_FERTILITY_RATES
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/birth_death_growth_rates_output.csv"
INTO TABLE BIRTH_DEATH_GROWTH_RATES
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/midyear_population_output.csv"
INTO TABLE MIDYEAR_POPULATION
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/midyear_population_age_sex_output.csv"
INTO TABLE MIDYEAR_POPULATION_AGE_SEX
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/midyear_population_5yr_age_sex_output.csv"
INTO TABLE MIDYEAR_POP_5YR
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/mortality_life_expectancy_output.csv"
INTO TABLE MORTALITY_LIFE_EXPECTANCY
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Income Index_OUT.csv"
INTO TABLE INCOME_INDEX
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Labour share of GDP_OUT.csv"
INTO TABLE LSHGDP
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Gross fixed capital formation_OUT.csv"
INTO TABLE GFCF
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/GDP total_OUT.csv"
INTO TABLE TOTAL_GDP
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/GDP per capita_OUT.csv"
INTO TABLE GDP_PER_CAPITA
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/GNI per capita_OUT.csv"
INTO TABLE GNI_PER_CAPITA
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Estimated GNI male_OUT.csv"
INTO TABLE EST_GNI_M
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Estimated GNI female_OUT.csv"
INTO TABLE EST_GNI_F
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Domestic credits_OUT.csv"
INTO TABLE DOMESTIC_CREDS
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


-- SELECT DC_YEAR, DOMESTIC_CREDITS FROM DOMESTIC_CREDS;
-- SELECT * FROM COUNTRY;