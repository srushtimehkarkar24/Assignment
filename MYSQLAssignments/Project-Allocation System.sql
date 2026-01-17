-- Use to create a database
Create database project_db;

-- Use to select database
use project_db;

-- Use create table
create table Employee(emp_id int, emp_name varchar(10));

-- create another table
create table Project(project_id int, project_name varchar(20), emp_id int);

-- Insert values in the table Employee
INSERT INTO Employee (emp_id, emp_name)
VALUES
(1, 'Amit'),
(2, 'Neha'),
(3, 'Ashwini');

-- Insert values in table Project
INSERT INTO Project (project_id, project_name, emp_id)
VALUES
(101, 'Website', 1),
(102, 'AppDev', 2),
(103, 'Testing', 1),
(104, 'Cloud', 3);

-- Display table - Employee
Select * From Employee;

-- Display table - Project
Select * From Project;








