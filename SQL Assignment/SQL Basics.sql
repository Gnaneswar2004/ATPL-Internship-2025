create table departments_gnani (
 	dept_id varchar(10) primary key, 
	dept_name varchar(50)
);

create table courses_gnani (
	course_id varchar(10), 
	course_name varchar(50), 
 	dept_id varchar(10) primary key
);

create table students_gnani (
 	student_id varchar(10) primary key, 
 	student_name varchar(50), 
 	dob date, 
	age int, 
  	dept_id varchar(10)
);

insert into departments_gnani values ('D1', "Computer Science");
insert into departments_gnani values ('D2', "Mathematics");
insert into departments_gnani values ('D3', "Physics");

select * from departments_gnani;

insert into courses_gnani values ('C1', "DBMS", 'D1');
insert into courses_gnani values ('C2', "Linear Algebra", 'D2');
insert into courses_gnani values ('C3', "Quantum Mechanics", 'D3');

select * from courses_gnani;

insert into students_gnani values ('S1', "Ravi", '2002-06-10', 22, 'D1');
insert into students_gnani values ('S2', "Sneha", '2001-03-15', 23, 'D2');
insert into students_gnani values ('S3', "Arjun", '2003-01-20', 21, 'D1');

select * from students_gnani;

-- Add a new column duration (in weeks) to the courses table.
alter table courses_gnani add column duration_in_weeks int;

-- Update student name from "Sneha" to "Sneha Reddy" in students table.
update students_gnani set student_name = 'Snaha Reddy' where student_id = 'S2';

-- Delete the course with course_id = 'C3' from courses table.
delete from courses_gnani where course_id = 'C3';

-- Fetch all students older than 21.
select student_name from students_gnani where age > 21;

-- List student names & DOBs ordered by age (youngest to oldest).
select student_name, dob from students_gnani order by age asc;

-- Retrieve the top 2 youngest students from the table.
select student_name from students_gnani order by age asc limit 2;

-- Show student count per department.
select count(*) from students_gnani where dept_id = 'D1';
select count(*) from students_gnani where dept_id = 'D2';
select count(*) from students_gnani where dept_id = 'D3';

-- Display average age of students in each department.
select avg(age) from students_gnani where dept_id = 'D1';
select avg(age) from students_gnani where dept_id = 'D2';
select avg(age) from students_gnani where dept_id = 'D3';

-- Show the maximum and minimum student ages.
select max(age) from students_gnani;
select min(age) from students_gnani;

-- Show student count per department.
select s.dept_id,
	count(s.student_id) as Student_Count,
    avg(s.age) as Average_Age,
    max(s.age) as Maximum_Age,
    min(s.age) as Minimum_Age
from students_gnani s
join departments_gnani d on s.dept_id = d.dept_id
group by d.dept_id;