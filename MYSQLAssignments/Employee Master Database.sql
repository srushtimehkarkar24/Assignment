-- create database
Create database hr_db;

-- Select database
use hr_db;

-- Use to create an table
create table Employee(emp_id int, emp_name varchar(10), department varchar(25), salary int);

-- Use to insert values in the table  
insert into Employee (emp_id, emp_name, department , salary)values
					(1,'Srushti','IT', 50000),
					(2,'Shatakshi','IT', 45000),
                    (3, 'Joy', 'Finance', 38000);

-- For shown table 
select*From Employee;