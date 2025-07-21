-- Add a new column to courses:
alter table courses_gnani add column course_code varchar(20);

-- Make course_code UNIQUE
alter table courses_gnani add constraint course_code unique (course_code);

-- Add CHECK constraint to courses table
alter table courses_gnani add column credits int;
alter table courses_gnani add constraint credits check (credits between 1 and 5);

-- Foreign Key Constraint on courses table
alter table courses_gnani add constraint fk_dept_id foreign key (dept_id) references departments_gnani(dept_id);

insert into courses_gnani (course_id, course_name, dept_id, duration_in_weeks, course_code, credits) values ('C1', 'DBMS', 'D1', 5, 'CS101', 4);
insert into courses_gnani (course_id, course_name, dept_id, duration_in_weeks, course_code, credits) values ('C2', 'Linear Algebra', 'D2', 5, 'MATH205', 3);
insert into courses_gnani (course_id, course_name, dept_id, duration_in_weeks, course_code, credits) values ('C3', 'Quantum Mechanics', 'D1', 5, 'PHY303', 5);

select * from courses_gnani;