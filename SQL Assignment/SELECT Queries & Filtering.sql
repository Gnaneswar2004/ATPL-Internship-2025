-- Fetch all students older than 21.
select student_name from students_gnani where age > 21;

-- List student names & DOBs ordered by age (youngest to oldest).
select student_name, dob from students_gnani order by age asc;

-- Retrieve the top 2 youngest students from the table.
select student_name from students_gnani order by age asc limit 2;