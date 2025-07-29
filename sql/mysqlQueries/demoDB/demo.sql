CREATE DATABASE demoDB;
USE demoDB;
CREATE TABLE product(id int PRIMARY KEY, name varchar(50),price float,quantity int);
INSERT INTO product(id,name,price,quantity) VALUES(1,"BOOKS",300.0,2);
SELECT * FROM product;