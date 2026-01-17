Create database training_company;

use training_company;

Create table Student (student_id int, name varchar(10), email varchar(25));

Create table Course (course_id int, course_name varchar(10), duration int);

insert into Student (student_id,name,email) VALUES
(1, 'Srushti', 'srushti24@gmail.com'),
(2, 'Shatakshi', 'shatakshi@gmail.com');

insert into course (course_id, course_name, duration) VALUES
(1, 'JAVA', 5),
(2, 'Hacking', 8);

select* From  Student;

select* From course;

