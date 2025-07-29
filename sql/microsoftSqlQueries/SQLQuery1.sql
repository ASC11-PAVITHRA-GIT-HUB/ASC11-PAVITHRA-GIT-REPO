USE MyFriendDB;
SELECT * FROM Friend;
drop table Friend;
CREATE TABLE Friend(id INT PRIMARY KEY, name VARCHAR(50),email VARCHAR(100));
INSERT INTO Friend (id,name,email) VALUES
(123,'GNANY','143@gmail.com'),
(133,'Kiran','1432@gmail.com'),
(143,'Bavitha','1434@gmail.com');


