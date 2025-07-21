-- Display student names along with their department names (INNER JOIN).
select student_id, dept_name
from students_gnani
inner join departments_gnani on students_gnani.dept_id = departments_gnani.dept_id;

-- List all departments even if they have no students (LEFT JOIN).
select * from departments_gnani 
left join students_gnani on departments_gnani.dept_id = students_gnani.dept_id;

-- Write a correlated subquery to list students older than their department’s average age.
select student_id, student_name from students_gnani s
where age > (select avg(age) from students_gnani where dept_id = s.dept_id);

-- Use a CTE (Common Table Expression) to get student count per department.
with count_student_per_dept as (
	select dept_id, count(student_id) as student_count
    from students_gnani group by dept_id
)
select * from count_student_per_dept;

-- Use SELF JOIN to show employee–manager pairs.
create table employees (
    id int primary key,
    name varchar(100),
    manager_id int,
    foreign key (manager_id) references employees(id)
);
insert into employees (id, name, manager_id) values
(1, 'Alice', null), (2, 'Bob', 1), (3, 'Charlie', 1), (4, 'David', 2), (5, 'Eve', 2);
select e1.name as employee, e2.name as manager
from employees e1
left join  employees e2 on e1.manager_id = e2.id;