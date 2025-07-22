create table products_gnani (
	id int primary key,
    name  varchar(20),
    price float
);

insert into products_gnani (id, name, price) values
(101, 'Laptop', 50000), (102, 'Mobile', 25000), (103, 'TV', 40000);

select * from products_gnani;