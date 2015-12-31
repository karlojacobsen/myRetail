DROP TABLE IF EXISTS PRODUCT;

CREATE TABLE PRODUCT (ID BIGINT IDENTITY ,
                      NAME VARCHAR(255) NOT NULL,
                      SKU VARCHAR(20) NOT NULL,
                      CATEGORY VARCHAR(255) NOT NULL,
                      PRICE DOUBLE NOT NULL,
                      LAST_UPDATED DATE NOT NULL)