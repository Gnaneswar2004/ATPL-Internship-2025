-- Create a view that shows student names along with their department names.
create view student_dept_view as 
select s.student_name, d. dept_name
from students_gnani s join departments_gnani d on s.dept_id = d. dept_id;

-- Query the view to display data.
select * from student_dept_view;
select * from students_gnani;
select * from departments_gnani;

-- Attempt to update data via the view (observe if it succeeds or fails and why).
update student_dept_view set dept_name = 'Science' where student_name = 'Ravi';