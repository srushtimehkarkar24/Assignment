-- Q9. Software Company – Duplicate Data Prevention
-- Scenario
-- A software company wants to ensure no duplicate employee IDs.


Create database software_company;

use software_company;

Create table Employee( emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    designation VARCHAR(30),
    salary INT
);

INSERT INTO Employee 
VALUES (101, 'Rahul', 'Software Engineer', 45000);

INSERT INTO Employee 
VALUES (101, 'Anita', 'Tester', 40000);-- shows: ERROR 1062 (23000): Duplicate entry '101' for key 'employee.PRIMARY'




