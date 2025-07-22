create table users_gnani (
	user_id int primary key,
    user_name varchar(50),
    user_email varchar(50),
    phone_number varchar(10),
    dob date
);

insert into users_gnani (user_id, user_name, user_email, dob, phone_number) values
(101, 'Gnani', 'gnani@gmail.com', '2004-01-07', '9876543210'), (102, 'Sai', 'sai@gmail.com', '2003-02-10', '9638527410'), (103, 'Prasanth', 'prasanth@gmail.com', '2004-05-24', '8974563210');

select * from users_gnani;