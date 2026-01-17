-- Startup Company – Employee Joining Records
-- A startup tracks employee joining dates.

Create database startup_db;
use startup_db;

drop table Employee;
Create table Employee(emp_id int, emp_name varchar(20), joining_date varchar(10));

insert into Employee(emp_id, emp_name, joining_date) Values
(2001, 'Sakshi', '24-10-2015'),
(2002, 'Neha', '20-11-2016'),
(2003, 'Aditi', '15-09-2020');

select emp_name, joining_date From Employee;




 