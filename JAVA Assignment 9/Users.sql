create table users_gnani (
	user_id int primary key,
    user_name varchar(50),
    user_email varchar(50)
);

insert into users_gnani (user_id, user_name, user_email) values
(101, 'Gnani', 'gnani@gmail.com'), (102, 'Sai', 'sai@gmail.com'), (103, 'Prasanth', 'prasanth@gmail.com');

select * from users_gnani;