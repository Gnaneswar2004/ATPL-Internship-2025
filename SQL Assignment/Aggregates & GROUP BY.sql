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

-- Using Join and Group By
select s.dept_id,
	-- Show student count per department.
	count(s.student_id) as Student_Count,
    -- Display average age of students in each department.
    avg(s.age) as Average_Age,
    -- Show the maximum and minimum student ages.
    max(s.age) as Maximum_Age,
    min(s.age) as Minimum_Age
from students_gnani s
join departments_gnani d on s.dept_id = d.dept_id
group by d.dept_id;