CREATE DATABASE MyFriendDB;
USE MyFriendDB;
CREATE TABLE Friend(id int PRIMARY KEY, name VARCHAR(100),email VARCHAR(100));
INSERT INTO Friend (id,name,email) VALUES(1,"Sahana","saha@123"),(2,"Sonu","sonu@123"),(3,"Usha","usha@123");
SELECT * FROM Friend;
