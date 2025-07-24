SELECT * FROM SalesLT.Customer;
SELECT * FROM SalesLT.SalesOrderHeader;
-- Query 1: Select all customers--
Select FirstName , MiddleName , LastName FROM SalesLT.Customer;
-- Query 2: Select all customers ordered by first name---
SELECT * FROM SalesLT.Customer ORDER BY FirstName;
-- Query 3: Select all customers ordered by first name ascending---
SELECT * FROM SalesLT.Customer ORDER BY FirstName ASC;
-- Query 4: Select all customers ordered by first name descending---
SELECT * FROM SalesLT.Customer ORDER BY FirstName DESC;
-- Query 5: Select all customers ordered by the third column---
SELECT * FROM SalesLT.Customer ORDER BY Title;
-- Query 6: Select all customers ordered by the third column descending---
SELECT * FROM SalesLT.Customer ORDER BY Title DESC;
-- Query 7: Select customers with CustomerID less than 6---
SELECT * FROM SalesLT.Customer WHERE CustomerID < 6;
-- Query 8: Select customers with last name 'GUINESS'----
SELECT * FROM SalesLT.Customer WHERE LastName = 'Guiness';
-- Query 9: Select all customers ordered by first name----
SELECT * FROM SalesLT.Customer ORDER BY FirstName;
-- Query 10: Select all customers ordered by first name ascending and last name descending----
SELECT * FROM SalesLT.Customer ORDER BY FirstName ASC , LastName DESC;
-- Query 11: Select all customers ordered by third column ascending, second column descending----
SELECT * FROM SalesLT.Customer ORDER BY Title ASC , NameStyle DESC;
-- Query 12: Select customers where condition is always false---
SELECT * FROM SalesLT.Customer Where 1=2;
-- Query 13: Select customers where condition is always true--
SELECT * FROM SalesLT.Customer Where 1=1;
-- Query 14: Select customers where 1 equals 1 (always true)---
SELECT * FROM SalesLT.Customer Where 1=1;
-- Query 15: Select customers where 1 equals 2 (always false)---
SELECT * FROM SalesLT.Customer Where 1=2;
-- Query 16: Count all customers---
SELECT COUNT(*) FROM SalesLT.Customer;
-- Query 17: Select specific columns from SalesOrderHeader with aliases---
SELECT Status 'Order Status' FROM SalesLT.SalesOrderHeader ;
-- Query 18: Select all sales order headers--
SELECT SalesOrderID, OrderDate, DueDate, ShipDate,CustomerID, SubTotal, TaxAmt, Freight, TotalDue FROM SalesLT.SalesOrderHeader;
-- Query 19: Select constant values with aliases from SalesOrderHeader---
SELECT SalesOrderNumber AS OrderNumber
















