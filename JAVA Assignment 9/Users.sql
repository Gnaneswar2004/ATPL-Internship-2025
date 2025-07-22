create table users_gnani (
	id int primary key,
    name varchar(50),
    email varchar(50)
);

insert into users_gnani (id, name, email) values
(21, 'Gnani', 'gnani@gmail.com'), (22, 'Sai', 'sai@gmail.com'), (23, 'Prasanth', 'prasanth@gmail.com');

select * from users_gnani;