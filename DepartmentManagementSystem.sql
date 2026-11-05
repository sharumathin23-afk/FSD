show databases;
use faceprep;
create table Department( dept_id int primary key, dept_name varchar(50));
create table Student( student_id int primary key, student_name varchar(50), dept_id int, foreign key (dept_id) references Department(dept_id));
insert into Department values (101, 'Computer Science'), (102, 'Electronics'), (103, 'Mechanical');
insert into Student values (1, 'Arun', 101), (2, 'Priya', 102), (3, 'Karthik', 101), (4, 'Divya', 103);
insert into Student values(5, 'Rahul', 105);
select Student.student_name, Department.dept_name from Student inner join Department on Student.dept_id = Department.dept_id;
delete from Department where dept_id = 101;