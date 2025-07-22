create table users_gnani (
	user_id int primary key,
    user_name varchar(50),
    user_email varchar(50),
    dob date
);

insert into users_gnani (user_id, user_name, user_email, dob) values
(101, 'Gnani', 'gnani@gmail.com', '2004-01-07'), (102, 'Sai', 'sai@gmail.com', '2003-02-10'), (103, 'Prasanth', 'prasanth@gmail.com', '2004-05-24');

select * from users_gnani;