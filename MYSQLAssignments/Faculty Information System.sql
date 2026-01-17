-- College – Faculty Information System
-- Scenario
-- A college wants to store faculty information.

Create database college_db;
Create table Faculty (faculty_id int, faculty_name varchar(20), subject varchar(20), salary int);

insert Faculty(faculty_id, faculty_name, subject, salary) Values
(001, 'Prof.kshirsagar', 'DSP', 80000),
(002, 'Prof.Chinte', 'DLT', 80000),
(003, 'Prof.Mahalle', 'OOAD', 80000);

select subject from Faculty;
